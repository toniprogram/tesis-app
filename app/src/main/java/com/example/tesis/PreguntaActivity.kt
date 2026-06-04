package com.example.tesis

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
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.tesis.ui.GameViewModel
import com.example.tesis.ui.actividad.ActividadViewModel

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

    Box(modifier = Modifier.fillMaxSize()) {
        // Fondo
        Image(
            painter = painterResource(id = R.drawable.fondo_pregunta1),
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
                    text = enunciado,
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
                        .size(120.dp)
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
                                    text = "¡Bien hecho!",
                                    color = Color.White,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 16.sp
                                )
                            }

                            IconButton(
                                onClick = {
                                    if (nivel < 12) {
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
                                text = "Vuelve a intentar",
                                color = Color.White,
                                fontWeight = FontWeight.Bold,
                                fontSize = 16.sp
                            )
                        }
                    }
                }
            }
        }

        // Botón Volver (fuera del Column, fijo abajo)
        IconButton(
            onClick = { navController.popBackStack() },
            modifier = Modifier
                .align(Alignment.BottomStart)
                .padding(16.dp)
        ) {
            Icon(
                imageVector = Icons.Default.ArrowBack,
                contentDescription = "Volver",
                tint = Color.Black,
                modifier = Modifier.size(32.dp)
            )
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