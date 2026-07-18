package com.example.tesis.ui.activities

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.tesis.data.CompetenciasData
import com.example.tesis.viewmodel.GameViewModel
import androidx.compose.material.icons.filled.Lock
import com.example.tesis.ui.components.IdiomaButton
import com.example.tesis.ui.components.MedalleroDisplay
import com.example.tesis.ui.components.MonedaDisplay
import com.example.tesis.R
import com.example.tesis.ui.components.TutorialOverlay
import com.example.tesis.data.TutorialData

@Composable
fun NivelesScreen(
    navController: NavController,
    competenciaId: Int,
    gameViewModel: GameViewModel
) {
    val competencia = CompetenciasData.competencias.find { it.id == competenciaId }
        ?: return

    var nivelSeleccionado by remember { mutableStateOf<Int?>(null) }
    var paginaActual by remember { mutableStateOf(0) } // 0 = niveles 1-12, 1 = niveles 13-24

    val nivelInicio = paginaActual * 12 + 1
    val nivelFin = nivelInicio + 11

    // Al inicio de NivelesScreen, junto a otros estados:
    val claveGeneral = "niveles_general"
    val claveCompetencia = "competencia_$competenciaId"
    var mostrarTutorialGeneral by remember { mutableStateOf(!gameViewModel.tutorialVisto(claveGeneral)) }
    var mostrarTutorialCompetencia by remember { mutableStateOf(!gameViewModel.tutorialVisto(claveCompetencia)) }


    Box(modifier = Modifier.fillMaxSize()) {
        // Fondo
        Image(
            painter = painterResource(id = R.drawable.menu),
            contentDescription = "Fondo niveles",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        // Medallero y Monedas
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 36.dp, start = 12.dp, end = 12.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            MedalleroDisplay(gameViewModel = gameViewModel)
            MonedaDisplay(gameViewModel = gameViewModel)
        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 140.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Logo de la competencia
            Box(
                modifier = Modifier
                    .size(120.dp)
                    .background(
                        color = Color.White.copy(alpha = 0.9f),
                        shape = RoundedCornerShape(12.dp)
                    )
                    .padding(16.dp),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = competencia.iconoResId),
                    contentDescription = "Icono competencia",
                    modifier = Modifier.fillMaxSize()
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Grid de niveles 4x3 (12 niveles por página)
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 32.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                repeat(4) { fila ->
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        repeat(3) { columna ->
                            val numeroNivel = nivelInicio + fila * 3 + columna
                            CirculoNivel(
                                numero = numeroNivel,
                                color = competencia.colorNivel,
                                isSelected = nivelSeleccionado == numeroNivel,
                                desbloqueado = gameViewModel.esNivelDesbloqueado(competenciaId, numeroNivel),
                                onClick = { nivelSeleccionado = numeroNivel }
                            )
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(12.dp))

            // Flechas de navegación entre páginas
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 32.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                // Flecha izquierda (página anterior)
                if (paginaActual > 0) {
                    IconButton(
                        onClick = {
                            paginaActual = 0
                            nivelSeleccionado = null
                        },
                        modifier = Modifier
                            .size(44.dp)
                            .background(
                                color = competencia.colorNivel,
                                shape = CircleShape
                            )
                    ) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Niveles 1-12",
                            tint = Color.White
                        )
                    }
                } else {
                    Spacer(modifier = Modifier.size(44.dp))
                }

                // Indicador de página
                Text(
                    text = "${nivelInicio} - ${nivelFin}",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )

                // Flecha derecha (página siguiente)
                if (paginaActual < 1) {
                    IconButton(
                        onClick = {
                            paginaActual = 1
                            nivelSeleccionado = null
                        },
                        modifier = Modifier
                            .size(44.dp)
                            .background(
                                color = competencia.colorNivel,
                                shape = CircleShape
                            )
                    ) {
                        Icon(
                            imageVector = Icons.Default.ArrowForward,
                            contentDescription = "Niveles 13-24",
                            tint = Color.White
                        )
                    }
                } else {
                    Spacer(modifier = Modifier.size(44.dp))
                }
            }

            Spacer(modifier = Modifier.weight(1f))

            // Botón Jugar
            if (nivelSeleccionado != null) {
                Button(
                    onClick = {
                        navController.navigate("pregunta/${competenciaId}/${nivelSeleccionado!!}")
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFFE53935)
                    ),
                    modifier = Modifier
                        .fillMaxWidth(0.6f)
                        .height(50.dp)
                        .padding(bottom = 8.dp)
                ) {
                    Text(
                        text = "Jugar",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                }
            }

            Spacer(modifier = Modifier.height(60.dp))
        }

        // Botón Volver
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
        if (mostrarTutorialGeneral) {
            TutorialOverlay(
                dialogos = TutorialData.dialogosNivelesGeneral,
                onFinish = {
                    gameViewModel.marcarTutorialVisto(claveGeneral)
                    mostrarTutorialGeneral = false
                }
            )
        } else if (mostrarTutorialCompetencia) {
            val descripcion = TutorialData.dialogosCompetencia[competenciaId] ?: ""
            TutorialOverlay(
                dialogos = listOf(descripcion),
                onFinish = {
                    gameViewModel.marcarTutorialVisto(claveCompetencia)
                    mostrarTutorialCompetencia = false
                }
            )
        }
        // Botón idioma (abajo derecha)
        IdiomaButton(
            gameViewModel = gameViewModel,
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(end = 16.dp, bottom = 80.dp)
        )
    }
}

@Composable
fun CirculoNivel(
    numero: Int,
    color: Color,
    isSelected: Boolean,
    desbloqueado: Boolean,
    onClick: () -> Unit
) {
    val escala by animateFloatAsState(
        targetValue = if (isSelected && desbloqueado) 1.2f else 1f,
        animationSpec = tween(durationMillis = 200),
        label = "escalaCirculo"
    )

    Box(
        modifier = Modifier
            .size(65.dp)
            .scale(escala)
            .background(
                color = if (desbloqueado) color else color.copy(alpha = 0.3f),
                shape = CircleShape
            )
            .clickable { if (desbloqueado) onClick() },
        contentAlignment = Alignment.Center
    ) {
        // Número (difuminado si bloqueado)
        Text(
            text = numero.toString(),
            color = if (desbloqueado) Color.White else Color.White.copy(alpha = 0.3f),
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold
        )

        // Candado encima si está bloqueado
        if (!desbloqueado) {
            Icon(
                imageVector = Icons.Default.Lock,
                contentDescription = "Bloqueado",
                tint = Color.White.copy(alpha = 0.8f),
                modifier = Modifier.size(28.dp)
            )
        }
    }
}