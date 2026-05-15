package com.example.tesis

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController

@Composable
fun inicioScreen(navController: NavController) {
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
    }
}