package com.example.tesis.ui.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModelProvider
import com.example.tesis.ui.theme.TesisTheme
import com.example.tesis.viewmodel.GameViewModel
import androidx.navigation.compose.*
import androidx.navigation.NavType
import androidx.navigation.navArgument
import androidx.lifecycle.viewmodel.compose.viewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TesisTheme {
                val navController = rememberNavController()
                val gameViewModel: GameViewModel = viewModel(
                    factory = ViewModelProvider.AndroidViewModelFactory.getInstance(application)
                )

                NavHost(
                    navController = navController,
                    startDestination = "home"
                ) {
                    composable("home") {
                        inicioScreen(navController, gameViewModel)
                    }
                    composable("game") {
                        MenuScreen(navController, gameViewModel = gameViewModel)
                    }
                    composable(
                        route = "niveles/{competenciaId}",
                        arguments = listOf(
                            navArgument("competenciaId") { type = NavType.IntType }
                        )
                    ) { backStackEntry ->
                        val competenciaId = backStackEntry.arguments?.getInt("competenciaId") ?: 1
                        NivelesScreen(navController, competenciaId, gameViewModel = gameViewModel)
                    }
                    composable(
                        route = "pregunta/{competenciaId}/{nivel}",
                        arguments = listOf(
                            navArgument("competenciaId") { type = NavType.IntType },
                            navArgument("nivel") { type = NavType.IntType }
                        )
                    ) { backStackEntry ->
                        val competenciaId = backStackEntry.arguments?.getInt("competenciaId") ?: 1
                        val nivel = backStackEntry.arguments?.getInt("nivel") ?: 1
                        PreguntaScreen(
                            navController,
                            competenciaId,
                            nivel,
                            gameViewModel = gameViewModel
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(text = "Hello $name!", modifier = modifier)
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TesisTheme { Greeting("Android") }
}