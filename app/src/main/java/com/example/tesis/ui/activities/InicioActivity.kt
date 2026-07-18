package com.example.tesis.ui.activities

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.tesis.ui.components.IdiomaButton
import com.example.tesis.R
import com.example.tesis.ui.components.TutorialOverlay
import com.example.tesis.data.TutorialData
import com.example.tesis.viewmodel.GameViewModel

@Composable
fun inicioScreen(navController: NavController, gameViewModel: GameViewModel) {
    var mostrarTutorial by remember { mutableStateOf(!gameViewModel.tutorialVisto("inicio")) }
    Box(modifier = Modifier.fillMaxSize()) {

        Image(
            painter = painterResource(id = R.drawable.inicio),
            contentDescription = "Fondo inicio",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        Button(
            onClick = {
                navController.navigate("game")
            },
            modifier = Modifier.align(Alignment.Center)
        ) {
            Text("Jugar")
        }
        IdiomaButton(
            gameViewModel = gameViewModel,
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(end = 16.dp, bottom = 80.dp)
        )
    }

    if (mostrarTutorial) {
        TutorialOverlay(
            dialogos = TutorialData.dialogosInicio,
            onFinish = {
                gameViewModel.marcarTutorialVisto("inicio")
                mostrarTutorial = false
            }
        )
    }
}