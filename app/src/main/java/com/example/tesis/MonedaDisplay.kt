package com.example.tesis

import androidx.compose.animation.core.*
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tesis.ui.GameViewModel

@Composable
fun MonedaDisplay(
    gameViewModel: GameViewModel,
    modifier: Modifier = Modifier
) {
    val monedas by gameViewModel.monedas
    val mostrarAnimacion by gameViewModel.mostrarAnimacionMoneda

    Box(modifier = modifier) {
        // Contador de monedas (siempre visible)
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.moneda),
                contentDescription = "Moneda",
                modifier = Modifier.size(36.dp)
            )
            Spacer(modifier = Modifier.width(4.dp))
            Text(
                text = monedas.toString(),
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
        }

        // Animación de moneda subiendo
        if (mostrarAnimacion) {
            AnimacionMoneda(
                onFinish = { gameViewModel.finalizarAnimacion() }
            )
        }
    }
}

@Composable
fun AnimacionMoneda(
    onFinish: () -> Unit
) {
    var animacionIniciada by remember { mutableStateOf(false) }

    val offsetY by animateFloatAsState(
        targetValue = if (animacionIniciada) 0f else 300f,
        animationSpec = tween(durationMillis = 800, easing = FastOutSlowInEasing),
        finishedListener = { onFinish() },
        label = "monedaSubiendo"
    )

    val alpha by animateFloatAsState(
        targetValue = if (animacionIniciada) 0f else 1f,
        animationSpec = tween(durationMillis = 800),
        label = "monedaAlpha"
    )

    LaunchedEffect(Unit) {
        animacionIniciada = true
    }

    Box(
        modifier = Modifier
            .graphicsLayer {
                translationY = offsetY
                this.alpha = alpha
            }
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.moneda),
                contentDescription = "Moneda animación",
                modifier = Modifier.size(30.dp)
            )
            Text(
                text = "+2",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFFFFD700)
            )
        }
    }
}

