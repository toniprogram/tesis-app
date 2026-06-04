package com.example.tesis


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
import com.example.tesis.ui.GameViewModel

@Composable
fun NivelesScreen(
    navController: NavController,
    competenciaId: Int,
    gameViewModel: GameViewModel
) {
    // Obtenemos la competencia seleccionada
    val competencia = CompetenciasData.competencias.find { it.id == competenciaId }
        ?: return

    var nivelSeleccionado by remember { mutableStateOf<Int?>(null) }

    Box(modifier = Modifier.fillMaxSize()) {
        // Fondo
        Image(
            painter = painterResource(id = R.drawable.menu),
            contentDescription = "Fondo niveles",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        MonedaDisplay(
            gameViewModel = gameViewModel,
            modifier = Modifier
                .align(Alignment.TopEnd)
                .padding(top = 40.dp, end = 16.dp)
        )

        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(40.dp))

            // Logo de la competencia en la parte superior
            Box(
                modifier = Modifier
                    .size(140.dp)
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

            Spacer(modifier = Modifier.height(24.dp))

            // Grid de niveles 4x3 (12 niveles)
            Column(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .padding(horizontal = 32.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                repeat(4) { fila ->
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        repeat(3) { columna ->
                            val numeroNivel = fila * 3 + columna + 1
                            CirculoNivel(
                                numero = numeroNivel,
                                color = competencia.colorNivel,
                                isSelected = nivelSeleccionado == numeroNivel,
                                onClick = { nivelSeleccionado = numeroNivel }
                            )
                        }
                    }
                }
            }

            // Botón Jugar (solo si hay nivel seleccionado)
            if (nivelSeleccionado != null) {
                Button(
                    onClick = {
                        // Aquí navegarías a la pantalla de actividad
                        navController.navigate("pregunta/${competenciaId}/${nivelSeleccionado!!}")
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFFE53935) // Rojo
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
fun CirculoNivel(
    numero: Int,
    color: Color,
    isSelected: Boolean,
    onClick: () -> Unit
) {
    // Animación de escala (hover effect)
    val escala by animateFloatAsState(
        targetValue = if (isSelected) 1.2f else 1f,
        animationSpec = tween(durationMillis = 200),
        label = "escalaCirculo"
    )

    Box(
        modifier = Modifier
            .size(70.dp)
            .scale(escala)
            .background(
                color = color,
                shape = CircleShape
            )
            .clickable { onClick() },
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = numero.toString(),
            color = Color.White,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )
    }
}