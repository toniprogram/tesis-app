package com.example.tesis.data


import com.example.tesis.R

data class MedallaItem(
    val id: Int,
    val nombre: String,
    val logro: String,
    val criterio: String,
    val iconoResId: Int
)

object MedallasData {
    val medallas = listOf(
        MedallaItem(
            id = 1,
            nombre = "La Primera Semilla",
            logro = "Primer Problema Resuelto",
            criterio = "Completa con éxito tu primera pregunta de cualquier tema.",
            iconoResId = R.drawable.primera_semilla
        ),
        MedallaItem(
            id = 2,
            nombre = "Quinteto de Oro",
            logro = "5 al hilo",
            criterio = "Responde correctamente 5 preguntas consecutivas sin cometer ningún error.",
            iconoResId = R.drawable.quinteto_oro
        ),
        MedallaItem(
            id = 3,
            nombre = "Maestro del Trueque",
            logro = "Comerciante Rural",
            criterio = "Resuelve todos los problemas del tema Cantidad.",
            iconoResId = R.drawable.maestro_trueque
        ),
        MedallaItem(
            id = 4,
            nombre = "Arquitecto de Pircas",
            logro = "Constructor Andino",
            criterio = "Resuelve todos los problemas del tema Forma, movimiento y localización.",
            iconoResId = R.drawable.arquitecto_pircas
        ),
        MedallaItem(
            id = 5,
            nombre = "Guardián de los Quipus",
            logro = "Organizador del campo",
            criterio = "Resuelve todos los problemas del tema Gestión de datos e incertidumbre.",
            iconoResId = R.drawable.guardian_quipus
        ),
        MedallaItem(
            id = 6,
            nombre = "Patrón de los Ciclos",
            logro = "Medidor de Cosechas",
            criterio = "Resuelve todos los problemas del tema Regularidad, equivalencia y cambio.",
            iconoResId = R.drawable.patron_ciclos
        ),
        MedallaItem(
            id = 7,
            nombre = "Amauta del Sol",
            logro = "Aventurero Matemático",
            criterio = "Desbloquea todas las medallas anteriores.",
            iconoResId = R.drawable.amauta_sol
        )
    )
}