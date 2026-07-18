package com.example.tesis.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.example.tesis.viewmodel.GameViewModel

@Composable
fun IdiomaButton(
    gameViewModel: GameViewModel,
    modifier: Modifier = Modifier
) {
    var mostrarPopup by remember { mutableStateOf(false) }
    val esAimara by gameViewModel.esAimara

    // Botón con ícono de idioma
    Box(
        modifier = modifier
            .size(48.dp)
            .background(Color.White.copy(alpha = 0.8f), CircleShape)
            .clickable { mostrarPopup = true },
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = if (esAimara) "AY" else "ES",
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )
    }

    if (mostrarPopup) {
        Dialog(onDismissRequest = { mostrarPopup = false }) {
            Box(
                modifier = Modifier
                    .width(250.dp)
                    .background(Color(0xFF2C2C2C).copy(alpha = 0.95f), RoundedCornerShape(16.dp))
                    .padding(20.dp)
            ) {
                // X para cerrar (arriba derecha)
                Icon(
                    imageVector = Icons.Default.Close,
                    contentDescription = "Cerrar",
                    tint = Color.White,
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .size(24.dp)
                        .clickable { mostrarPopup = false }
                )

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Lenguaje",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )

                    Spacer(modifier = Modifier.height(24.dp))

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "ES",
                            fontSize = 16.sp,
                            fontWeight = if (!esAimara) FontWeight.Bold else FontWeight.Normal,
                            color = if (!esAimara) Color(0xFFFFD700) else Color.Gray
                        )

                        Spacer(modifier = Modifier.width(12.dp))

                        Switch(
                            checked = esAimara,
                            onCheckedChange = { gameViewModel.cambiarIdioma() },
                            colors = SwitchDefaults.colors(
                                checkedThumbColor = Color(0xFFFF9800),
                                checkedTrackColor = Color(0xFFFFE0B2),
                                uncheckedThumbColor = Color(0xFF4CAF50),
                                uncheckedTrackColor = Color(0xFFC8E6C9)
                            )
                        )

                        Spacer(modifier = Modifier.width(12.dp))

                        Text(
                            text = "AY",
                            fontSize = 16.sp,
                            fontWeight = if (esAimara) FontWeight.Bold else FontWeight.Normal,
                            color = if (esAimara) Color(0xFFFFD700) else Color.Gray
                        )
                    }
                }
            }
        }
    }
}