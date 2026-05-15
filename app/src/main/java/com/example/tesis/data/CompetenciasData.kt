package com.example.tesis.data
import com.example.tesis.R

data class CompetenciaItem(
    val id: Int,
    val iconoResId: Int,
    val descripcionResId: Int
)

object CompetenciasData {
    val competencias = listOf(
        CompetenciaItem(
            id = 1,
            iconoResId = R.drawable.icono_competencia1,
            descripcionResId = R.string.desc_competencia1
        ),
        CompetenciaItem(
            id = 2,
            iconoResId = R.drawable.icono_competencia2,
            descripcionResId = R.string.desc_competencia2
        ),
        CompetenciaItem(
            id = 3,
            iconoResId = R.drawable.icono_competencia3,
            descripcionResId = R.string.desc_competencia3
        ),
        CompetenciaItem(
            id = 4,
            iconoResId = R.drawable.icono_competencia4,
            descripcionResId = R.string.desc_competencia4
        )
    )
}