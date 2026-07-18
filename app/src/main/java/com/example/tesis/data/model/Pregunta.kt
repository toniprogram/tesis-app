package com.example.tesis.data.model


data class Pregunta(
    val id: Int,
    val competenciaId: Int,
    val nivel: Int,
    val enunciado: String,

    val enunciadoAy: String = "",
    val imagen: Int? = null,
    val alternativas: List<String>,
    val respuestaCorrecta: Int,
    val pista: String,
    val pistaAy: String = ""  // ← Aimara
)