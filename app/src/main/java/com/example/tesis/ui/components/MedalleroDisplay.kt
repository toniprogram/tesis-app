package com.example.tesis.ui.components

import androidx.compose.animation.core.*
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.example.tesis.data.MedallasData
import com.example.tesis.data.TutorialData
import com.example.tesis.viewmodel.GameViewModel
import androidx.compose.runtime.LaunchedEffect
import com.example.tesis.R
import com.example.tesis.data.MedallaItem
import com.example.tesis.data.TextosAimara

private data class MedalSlot(val xFrac: Float, val yFrac: Float)

@Composable
fun MedalleroDisplay(
    gameViewModel: GameViewModel,
    modifier: Modifier = Modifier
) {
    var mostrarPopup by remember { mutableStateOf(false) }
    val medallaReciente by gameViewModel.medallaReciente

    // Medallero clickeable (más grande, sin contador)
    // Centro de cada hueco hexagonal medido con precisión sobre el PNG real
    // (medallero_vacio.png, 2048x910px) usando detección de círculos.
    val posiciones = remember {
        listOf(
            MedalSlot(0.2574f, 0.3239f), // 1: arriba izquierda
            MedalSlot(0.4413f, 0.3206f), // 2: arriba centro
            MedalSlot(0.6276f, 0.3470f), // 3: arriba derecha
            MedalSlot(0.1659f, 0.6272f), // 4: abajo 1
            MedalSlot(0.3505f, 0.6354f), // 5: abajo 2
            MedalSlot(0.5373f, 0.6321f), // 6: abajo 3
            MedalSlot(0.7196f, 0.6420f), // 7: abajo 4
        )
    }

    BoxWithConstraints(
        modifier = modifier
            .width(200.dp)
            .aspectRatio(2048f / 910f) // ratio real exacto de medallero_vacio.png
            .clickable { mostrarPopup = true }
    ) {
        val anchoTotal = maxWidth
        val altoTotal = maxHeight
        val medalSize = anchoTotal * 0.11f // diámetro ajustado al hueco más chico, con margen

        Image(
            painter = painterResource(id = R.drawable.medallero_vacio),
            contentDescription = "Medallero",
            contentScale = ContentScale.FillBounds, // el aspectRatio ya calza, no hay letterboxing
            modifier = Modifier.fillMaxSize()
        )

        MedallasData.medallas.forEachIndexed { index, medalla ->
            if (medalla.id in gameViewModel.medallasDesbloqueadas && index < posiciones.size) {
                val slot = posiciones[index]
                Image(
                    painter = painterResource(id = medalla.iconoResId),
                    contentDescription = medalla.nombre,
                    modifier = Modifier
                        .size(medalSize)
                        .offset(
                            x = anchoTotal * slot.xFrac - medalSize / 2,
                            y = altoTotal * slot.yFrac - medalSize / 2
                        )
                        .clip(CircleShape)
                )
            }
        }
    }

    var mostrarTutorialMedallero by remember { mutableStateOf(false) }
    // Popup del medallero
    if (mostrarPopup) {
        if (!gameViewModel.tutorialVisto("medallero")) {
            // Primera vez: tutorial a pantalla completa
            LaunchedEffect(Unit) {
                mostrarTutorialMedallero = true
            }

            if (mostrarTutorialMedallero) {
                TutorialOverlay(
                    dialogos = TutorialData.dialogosMedallero,
                    onFinish = {
                        gameViewModel.marcarTutorialVisto("medallero")
                        mostrarTutorialMedallero = false
                    }
                )
            } else {
                // Después del tutorial, muestra el popup normal
                MedalleroPopup(
                    gameViewModel = gameViewModel,
                    onDismiss = { mostrarPopup = false }
                )
            }
        } else {
            // Ya vio el tutorial, directo al popup
            MedalleroPopup(
                gameViewModel = gameViewModel,
                onDismiss = { mostrarPopup = false }
            )
        }
    }

    // Animación de medalla obtenida
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

    var mostrarTutorialMedalla by remember { mutableStateOf(false) }

    LaunchedEffect(gameViewModel.medallasDesbloqueadas.size) {
        if (gameViewModel.medallasDesbloqueadas.size == 1 && !gameViewModel.tutorialVisto("primera_medalla")) {
            mostrarTutorialMedalla = true
        }
    }

    if (mostrarTutorialMedalla) {
        TutorialOverlay(
            dialogos = TutorialData.dialogosPrimeraMedalla,
            onFinish = {
                gameViewModel.marcarTutorialVisto("primera_medalla")
                mostrarTutorialMedalla = false
            }
        )
    }

}

@Composable
fun MedalleroPopup(
    gameViewModel: GameViewModel,
    onDismiss: () -> Unit
) {

    val esAimara by gameViewModel.esAimara
    Dialog(onDismissRequest = onDismiss) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFF2C2C2C).copy(alpha = 0.95f), RoundedCornerShape(16.dp))
                .padding(16.dp)
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = if (esAimara) TextosAimara.medallero else "Medallero",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFFFFD700)
                )

                Spacer(modifier = Modifier.height(12.dp))

                // Grid de medallas
                LazyVerticalGrid(
                    columns = GridCells.Fixed(3),
                    horizontalArrangement = Arrangement.spacedBy(12.dp),
                    verticalArrangement = Arrangement.spacedBy(16.dp),
                    modifier = Modifier.height(400.dp)
                ) {
                    items(MedallasData.medallas) { medalla ->
                        val desbloqueada = medalla.id in gameViewModel.medallasDesbloqueadas

                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Image(
                                painter = painterResource(id = medalla.iconoResId),
                                contentDescription = medalla.nombre,
                                modifier = Modifier.size(80.dp),
                                colorFilter = if (!desbloqueada) {
                                    ColorFilter.tint(Color.Gray.copy(alpha = 0.4f))
                                } else null
                            )
                            Spacer(modifier = Modifier.height(4.dp))
                            Text(
                                text = if (desbloqueada) medalla.nombre else "???",
                                fontSize = 12.sp,
                                color = if (desbloqueada) Color.White else Color.Gray,
                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.Bold,
                                maxLines = 2,
                                lineHeight = 14.sp
                            )
                            Text(
                                text = if (esAimara) TextosAimara.medallaCriterio[medalla.id] ?: medalla.criterio
                                        else medalla.criterio,
                                fontSize = 10.sp,
                                color = Color.LightGray,
                                textAlign = TextAlign.Center,
                                maxLines = 6,
                                lineHeight = 12.sp
                            )

                        }
                    }
                }

                Spacer(modifier = Modifier.height(12.dp))

                Box(
                    modifier = Modifier
                        .background(Color(0xFF4CAF50), RoundedCornerShape(8.dp))
                        .clickable { onDismiss() }
                        .padding(horizontal = 24.dp, vertical = 10.dp)
                ) {
                    Text(
                        "Cerrar",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp
                    )
                }
            }
        }
    }
}

@Composable
fun AnimacionMedallaObtenida(
    medalla: MedallaItem,
    gameViewModel: GameViewModel,
    onDismiss: () -> Unit
) {
    val escala by animateFloatAsState(
        targetValue = 1f,
        animationSpec = spring(dampingRatio = 0.4f, stiffness = 300f),
        label = "medallaEscala"
    )

    Dialog(onDismissRequest = onDismiss) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFF1A1A2E).copy(alpha = 0.95f), RoundedCornerShape(16.dp))
                .padding(24.dp)
                .scale(escala),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = if(gameViewModel.esAimara.value) TextosAimara.felicitaciones else "¡Felicitaciones!",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFFFFD700)
                )

                Spacer(modifier = Modifier.height(16.dp))

                Image(
                    painter = painterResource(id = medalla.iconoResId),
                    contentDescription = medalla.nombre,
                    modifier = Modifier.size(120.dp)
                )

                Spacer(modifier = Modifier.height(12.dp))

                Text(
                    text = if (gameViewModel.esAimara.value) TextosAimara.hasObtenidoMedalla else "Has obtenido la medalla",
                    fontSize = 16.sp,
                    color = Color.White
                )

                Text(
                    text = "\"${medalla.nombre}\"",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFFFFD700),
                    textAlign = TextAlign.Center
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = if (gameViewModel.esAimara.value) TextosAimara.medallaCriterio[medalla.id] ?: medalla.criterio else medalla.criterio,
                    fontSize = 14.sp,
                    color = Color.LightGray,
                    textAlign = TextAlign.Center
                )

                Spacer(modifier = Modifier.height(16.dp))

                Box(
                    modifier = Modifier
                        .background(Color(0xFFFFD700), RoundedCornerShape(8.dp))
                        .clickable { onDismiss() }
                        .padding(horizontal = 24.dp, vertical = 10.dp)
                ) {
                    Text(
                        text = if (gameViewModel.esAimara.value) "¡Wali suma!" else "¡Genial!",
                        color = Color.Black, fontWeight = FontWeight.Bold, fontSize = 16.sp
                    )
                }
            }
        }
    }
}