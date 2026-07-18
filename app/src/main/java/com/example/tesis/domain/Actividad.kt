package com.example.tesis.domain

import com.example.tesis.data.model.Pregunta

class Actividad(private val pregunta: Pregunta) {

    private val indicesBarajados: List<Int>
    private val alternativasBarajadas: List<String>
    private val respuestaBarajada: Int

    init {
        // Barajar los índices
        indicesBarajados = pregunta.alternativas.indices.shuffled()
        alternativasBarajadas = indicesBarajados.map { pregunta.alternativas[it] }
        // Encontrar la nueva posición de la respuesta correcta
        respuestaBarajada = indicesBarajados.indexOf(pregunta.respuestaCorrecta)
    }


    fun obtenerEnunciado(): String = pregunta.enunciado

    fun obtenerAlternativas(): List<String> = pregunta.alternativas

    fun obtenerImagen(): Int? = pregunta.imagen

    /**
     * Evalúa la respuesta del usuario.
     * @param indiceRespuesta índice de la alternativa seleccionada
     * @return true si es correcta, false si es incorrecta
     */
    fun evaluar(indiceRespuesta: Int): Boolean {
        return indiceRespuesta == pregunta.respuestaCorrecta
    }

    fun obtenerNivel(): Int = pregunta.nivel

    fun obtenerCompetenciaId(): Int = pregunta.competenciaId

    fun obtenerPista(): String = pregunta.pista
}
