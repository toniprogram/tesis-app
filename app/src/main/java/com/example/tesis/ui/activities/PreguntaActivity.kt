package com.example.tesis.ui.activities

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.tesis.ui.components.AnimacionMedallaObtenida
import com.example.tesis.ui.components.MonedaDisplay
import com.example.tesis.R
import com.example.tesis.ui.components.TutorialOverlay
import com.example.tesis.viewmodel.GameViewModel
import com.example.tesis.viewmodel.ActividadViewModel
import com.example.tesis.data.MedallasData
import com.example.tesis.data.TextosAimara
import com.example.tesis.data.TutorialData
import com.example.tesis.ui.components.IdiomaButton
import androidx.compose.animation.AnimatedVisibility as AnimatedVisibilityBox

@Composable
fun PreguntaScreen(
    navController: NavController,
    competenciaId: Int,
    nivel: Int,
    gameViewModel: GameViewModel,
    viewModel: ActividadViewModel = viewModel()
) {
    LaunchedEffect(competenciaId, nivel) {
        viewModel.cargarActividad(competenciaId, nivel)
    }

    val alternativaSeleccionada by viewModel.alternativaSeleccionada
    val mostrarResultado by viewModel.mostrarResultado
    val esCorrecta by viewModel.esCorrecta
    val enunciado by viewModel.enunciado
    val alternativas by viewModel.alternativas

    // ← AGREGA AQUÍ
    var mostrarSolucion by remember { mutableStateOf(false) }
    var pistaUsada by remember { mutableStateOf(false) }
    val pista by viewModel.pista

    var mostrarTutorial by remember { mutableStateOf(!gameViewModel.tutorialVisto("pregunta")) }

    val enunciadoAy by viewModel.enunciadoAy
    val pistaAy by viewModel.pistaAy
    val esAimara by gameViewModel.esAimara

    Box(modifier = Modifier.fillMaxSize()) {
        // Fondo
        val fondoId = when (competenciaId) {
            1 -> R.drawable.fondo_pregunta1
            2 -> R.drawable.fondo_pregunta2
            3 -> R.drawable.fondo_pregunta3
            4 -> R.drawable.fondo_pregunta4
            else -> R.drawable.fondo_pregunta1
        }

        Image(
            painter = painterResource(id = fondoId),
            contentDescription = "Fondo pregunta",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        // Contenido principal
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp)
                .padding(top = 36.dp, bottom = 70.dp)
        ) {
            // Monedas arriba a la derecha
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {
                MonedaDisplay(
                    gameViewModel = gameViewModel
                )
            }

            Spacer(modifier = Modifier.height(8.dp))

            // Enunciado
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        color = Color(0xFFF5F5DC).copy(alpha = 0.95f),
                        shape = RoundedCornerShape(8.dp)
                    )
                    .padding(16.dp)
            ) {
                Text(
                    text = if (esAimara && enunciadoAy.isNotEmpty()) enunciadoAy else enunciado,
                    fontSize = 14.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Medium
                )
            }

            Spacer(modifier = Modifier.height(8.dp))

            // Imagen opcional (pequeña si existe)
            viewModel.obtenerImagen()?.let { imagenRes ->
                Image(
                    painter = painterResource(id = imagenRes),
                    contentDescription = "Imagen pregunta",
                    modifier = Modifier
                        .fillMaxWidth(0.85f)
                        .heightIn(min = 150.dp, max = 220.dp)
                        .align(Alignment.CenterHorizontally)
                )
                Spacer(modifier = Modifier.height(8.dp))
            }

            // Espacio flexible (empuja alternativas hacia abajo pero no tanto)
            if (viewModel.obtenerImagen() != null) {
                Spacer(modifier = Modifier.weight(1f))
            } else {
                Spacer(modifier = Modifier.height(16.dp))
            }

            // Alternativas
            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                alternativas.forEachIndexed { index, alternativa ->
                    AlternativaBoton(
                        texto = alternativa,
                        seleccionada = alternativaSeleccionada == index,
                        mostrarResultado = mostrarResultado,
                        esCorrecta = esCorrecta && alternativaSeleccionada == index,
                        onClick = { viewModel.seleccionarAlternativa(index, gameViewModel) }
                    )
                }
            }

            Spacer(modifier = Modifier.height(12.dp))

            // Resultado
            // Resultado + Botón Solución
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
            ) {
                androidx.compose.animation.AnimatedVisibility(visible = mostrarResultado) {
                    if (esCorrecta) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Box(
                                modifier = Modifier
                                    .background(
                                        color = Color(0xFF4CAF50),
                                        shape = RoundedCornerShape(8.dp)
                                    )
                                    .padding(horizontal = 16.dp, vertical = 12.dp)
                            ) {
                                Text(
                                    text = if (esAimara) TextosAimara.bienHecho else "¡Bien hecho!",
                                    color = Color.White,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 16.sp
                                )
                            }

                            IconButton(
                                onClick = {
                                    if (nivel < 24) {
                                        navController.navigate("pregunta/$competenciaId/${nivel + 1}") {
                                            popUpTo("pregunta/$competenciaId/$nivel") { inclusive = true }
                                        }
                                    } else {
                                        navController.popBackStack()
                                    }
                                },
                                modifier = Modifier
                                    .background(
                                        color = Color(0xFF4CAF50),
                                        shape = RoundedCornerShape(50)
                                    )
                            ) {
                                Icon(
                                    imageVector = Icons.Default.ArrowForward,
                                    contentDescription = "Siguiente",
                                    tint = Color.White
                                )
                            }
                        }
                    } else {
                        Box(
                            modifier = Modifier
                                .background(
                                    color = Color(0xFF66BB6A),
                                    shape = RoundedCornerShape(8.dp)
                                )
                                .clickable { viewModel.reiniciarEstado() }
                                .padding(horizontal = 16.dp, vertical = 12.dp)
                        ) {
                            Text(
                                text = if (esAimara) TextosAimara.volverIntentar else "Vuelve a intentar",
                                color = Color.White,
                                fontWeight = FontWeight.Bold,
                                fontSize = 16.sp
                            )
                        }
                    }
                }

                // Botón Solución (a la derecha, misma altura que Bien hecho)
                if (!mostrarResultado && !pistaUsada) {
                    val tieneMonedas = gameViewModel.monedas.value >= 10
                    Box(
                        modifier = Modifier
                            .align(Alignment.CenterEnd)
                            .background(
                                color = if (tieneMonedas) Color(0xFFFF9800) else Color.Gray,
                                shape = RoundedCornerShape(12.dp)
                            )
                            .then(
                                if (tieneMonedas) Modifier.clickable {
                                    if (gameViewModel.usarPista()) {
                                        mostrarSolucion = true
                                        pistaUsada = true
                                    }
                                } else Modifier
                            )
                            .padding(horizontal = 10.dp, vertical = 8.dp)
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Image(
                                painter = painterResource(id = R.drawable.moneda),
                                contentDescription = "Moneda",
                                modifier = Modifier.size(18.dp)
                            )
                            Spacer(modifier = Modifier.width(3.dp))
                            Text(
                                text = "10",
                                color = Color.White,
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Spacer(modifier = Modifier.width(3.dp))
                            Text(
                                text = "?",
                                color = Color.White,
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }
                }
            }
        }

        // Esto solo muestra la animación si se gana una medalla
        val medallaReciente by gameViewModel.medallaReciente
        if (medallaReciente != null) {
            val medalla = MedallasData.medallas.find { it.id == medallaReciente }
            if (medalla != null) {
                AnimacionMedallaObtenida(
                    medalla = medalla,
                    gameViewModel = gameViewModel,
                    onDismiss = { gameViewModel.cerrarAnimacionMedalla() }
                )
            }
        }

        // Botón Volver (fuera del Column, fijo abajo)
        IconButton(
            onClick = { navController.popBackStack() },
            modifier = Modifier
                .align(Alignment.BottomStart)
                .padding(end = 16.dp, bottom = 80.dp)
        ) {
            Icon(
                imageVector = Icons.Default.ArrowBack,
                contentDescription = "Volver",
                tint = Color.Black,
                modifier = Modifier.size(32.dp)
            )
        }
        if (mostrarTutorial) {
            TutorialOverlay(
                dialogos = TutorialData.dialogosPregunta,
                onFinish = {
                    gameViewModel.marcarTutorialVisto("pregunta")
                    mostrarTutorial = false
                }
            )
        }

        IdiomaButton(
            gameViewModel = gameViewModel,
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(end = 16.dp, bottom = 80.dp)
        )
    }

    if (mostrarSolucion) {
        Dialog(onDismissRequest = { mostrarSolucion = false }) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFF2C2C2C).copy(alpha = 0.95f), RoundedCornerShape(16.dp))
                    .padding(20.dp)
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(
                        text = if (esAimara) TextosAimara.solucion else "Solución",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFFFFD700)
                    )
                    Spacer(modifier = Modifier.height(12.dp))
                    Text(
                        text = if (esAimara && pistaAy.isNotEmpty()) pistaAy else pista,
                        fontSize = 14.sp,
                        color = Color.White,
                        lineHeight = 20.sp
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    Box(
                        modifier = Modifier
                            .background(Color(0xFFFF9800), RoundedCornerShape(8.dp))
                            .clickable { mostrarSolucion = false }
                            .padding(horizontal = 24.dp, vertical = 10.dp)
                    ) {
                        Text("Entendido", color = Color.White, fontWeight = FontWeight.Bold)
                    }
                }
            }
        }
    }

}

@Composable
fun AlternativaBoton(
    texto: String,
    seleccionada: Boolean,
    mostrarResultado: Boolean,
    esCorrecta: Boolean,
    onClick: () -> Unit
) {
    val colorFondo = when {
        mostrarResultado && seleccionada && esCorrecta -> Color(0xFF4CAF50)
        mostrarResultado && seleccionada && !esCorrecta -> Color(0xFFE53935)
        else -> Color(0xFF424242)
    }

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = colorFondo, shape = RoundedCornerShape(8.dp))
            .clickable { onClick() }
            .padding(vertical = 14.dp, horizontal = 16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = texto,
                color = Color.White,
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                modifier = Modifier.weight(1f)
            )

            if (mostrarResultado && seleccionada) {
                Icon(
                    imageVector = if (esCorrecta) Icons.Default.Check else Icons.Default.Close,
                    contentDescription = null,
                    tint = Color.White
                )
            }
        }
    }
}