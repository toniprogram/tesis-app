package com.example.tesis

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.tesis.data.CompetenciaItem
import com.example.tesis.ui.GameViewModel
import com.example.tesis.ui.menu.MenuViewModel

@Composable
fun MenuScreen(
    navController: NavController,
    viewModel: MenuViewModel = viewModel(),
    gameViewModel: GameViewModel
) {
    val competenciaSeleccionada by viewModel.competenciaSeleccionada

    Box(modifier = Modifier.fillMaxSize()) {
        // Fondo
        Image(
            painter = painterResource(id = R.drawable.menu),
            contentDescription = "Fondo menu",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        // Monedas arriba a la derecha
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

            // Grid de 2x2 CENTRADO
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                repeat(2) { fila ->
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 32.dp),
                        horizontalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterHorizontally),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        repeat(2) { columna ->
                            val index = fila * 2 + columna
                            val competencia = viewModel.competencias[index]

                            CompetenciaBoton(
                                competencia = competencia,
                                isSelected = competenciaSeleccionada == competencia.id,
                                onClick = { viewModel.seleccionarCompetencia(competencia.id) },
                                modifier = Modifier
                                    .width(100.dp)
                                    .height(100.dp)
                            )
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            // CUADRO CON DESCRIPCIÓN
            Box(
                modifier = Modifier
                    .fillMaxWidth(0.85f)
                    .height(220.dp),
                contentAlignment = Alignment.Center
            ) {
                // Imagen del cuadro de fondo
                Image(
                    painter = painterResource(id = R.drawable.cuadro_texto),
                    contentDescription = "Cuadro de texto",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight()
                )

                // Solo texto dentro del cuadro
                if (competenciaSeleccionada != null) {
                    val competencia = viewModel.competencias.find { it.id == competenciaSeleccionada }
                    if (competencia != null) {
                        Text(
                            text = stringResource(id = competencia.descripcionResId),
                            fontSize = 15.sp,
                            textAlign = TextAlign.Center,
                            color = Color.Black,
                            fontWeight = FontWeight.Medium,
                            lineHeight = 18.sp,
                            modifier = Modifier.padding(horizontal = 54.dp),
                            maxLines = 4,
                            overflow = androidx.compose.ui.text.style.TextOverflow.Ellipsis
                        )
                    }
                } else {
                    Text(
                        text = stringResource(R.string.selecciona_competencia),
                        fontSize = 15.sp,
                        textAlign = TextAlign.Center,
                        color = Color.Black,
                        fontWeight = FontWeight.Medium,
                        lineHeight = 18.sp,
                        modifier = Modifier.padding(horizontal = 54.dp),
                        maxLines = 4,
                        overflow = androidx.compose.ui.text.style.TextOverflow.Ellipsis
                    )
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            // ÚNICO botón Seleccionar (fuera del cuadro)
            if (competenciaSeleccionada != null) {
                Button(
                    onClick = {
                        navController.navigate("niveles/${competenciaSeleccionada}")
                    },
                    modifier = Modifier
                        .fillMaxWidth(0.6f)
                        .height(48.dp)
                ) {
                    Text(stringResource(R.string.seleccionar), fontSize = 16.sp)
                }
            }

            Spacer(modifier = Modifier.weight(1f))
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
                contentDescription = stringResource(R.string.volver),
                tint = Color.Black,
                modifier = Modifier.size(32.dp)
            )
        }
    }
}

@Composable
fun CompetenciaBoton(
    competencia: CompetenciaItem,
    isSelected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .background(
                color = if (isSelected) Color(0xFFA5D6A7) else Color(0xFFE8F5E9),
                shape = RoundedCornerShape(12.dp)
            )
            .clickable { onClick() },
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = competencia.iconoResId),
            contentDescription = "Icono competencia ${competencia.id}",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        )
    }
}