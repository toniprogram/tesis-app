package com.example.tesis.domain

import com.example.tesis.data.model.Pregunta

class Actividad(private val pregunta: Pregunta) {

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
}
