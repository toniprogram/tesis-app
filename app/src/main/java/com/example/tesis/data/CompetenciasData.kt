package com.example.tesis.data
import androidx.compose.ui.graphics.Color
import com.example.tesis.R

data class CompetenciaItem(
    val id: Int,
    val iconoResId: Int,
    val descripcionResId: Int,
    val colorNivel: Color
)

object CompetenciasData {
    val competencias = listOf(
        CompetenciaItem(
            id = 1,
            iconoResId = R.drawable.icono_competencia1,
            descripcionResId = R.string.desc_competencia1,
            colorNivel = Color(0xFF4CAF50) // Verde
        ),
        CompetenciaItem(
            id = 2,
            iconoResId = R.drawable.icono_competencia2,
            descripcionResId = R.string.desc_competencia2,
            colorNivel = Color(0xFF9C27B0) // Morado
        ),
        CompetenciaItem(
            id = 3,
            iconoResId = R.drawable.icono_competencia3,
            descripcionResId = R.string.desc_competencia3,
            colorNivel = Color(0xFFE53935) // Rojo
        ),
        CompetenciaItem(
            id = 4,
            iconoResId = R.drawable.icono_competencia4,
            descripcionResId = R.string.desc_competencia4,
            colorNivel = Color(0xFFFF9800) // Naranja
        )
    )
}