package com.example.tesis.viewmodel

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.tesis.data.PreguntasData
import com.example.tesis.domain.Actividad

class ActividadViewModel : ViewModel() {

    private var actividad: Actividad? = null

    private val _alternativaSeleccionada = mutableStateOf<Int?>(null)
    val alternativaSeleccionada: State<Int?> = _alternativaSeleccionada

    private val _mostrarResultado = mutableStateOf(false)
    val mostrarResultado: State<Boolean> = _mostrarResultado

    private val _esCorrecta = mutableStateOf(false)
    val esCorrecta: State<Boolean> = _esCorrecta

    // ← AGREGA ESTOS DOS ESTADOS
    private val _enunciado = mutableStateOf("")
    val enunciado: State<String> = _enunciado

    private val _alternativas = mutableStateOf<List<String>>(emptyList())
    val alternativas: State<List<String>> = _alternativas

    private val _pista = mutableStateOf("")
    val pista: State<String> = _pista

    private var _indiceCorrectoBarajado = 0
    fun cargarActividad(competenciaId: Int, nivel: Int) {
        val pregunta = PreguntasData.obtenerPregunta(competenciaId, nivel)
        actividad = pregunta?.let { Actividad(it) }
        _enunciado.value = actividad?.obtenerEnunciado() ?: ""
        _pista.value = actividad?.obtenerPista() ?: ""

        _enunciadoAy.value = pregunta?.enunciadoAy ?: ""
        _pistaAy.value = pregunta?.pistaAy ?: ""

        // Barajar alternativas
        val alternativasOriginal = actividad?.obtenerAlternativas() ?: emptyList()
        val indices = alternativasOriginal.indices.shuffled()
        _alternativas.value = indices.map { alternativasOriginal[it] }
        _indiceCorrectoBarajado = indices.indexOf(0) // 0 porque respuestaCorrecta siempre es 0

        reiniciarEstado()
    }

    fun obtenerEnunciado(): String = _enunciado.value
    fun obtenerAlternativas(): List<String> = _alternativas.value
    fun obtenerImagen(): Int? = actividad?.obtenerImagen()

    fun seleccionarAlternativa(indice: Int, gameViewModel: GameViewModel? = null) {
        if (_mostrarResultado.value) return

        _alternativaSeleccionada.value = indice
        _esCorrecta.value = indice == _indiceCorrectoBarajado  // ← CAMBIA ESTA LÍNEA
        _mostrarResultado.value = true

        if (_esCorrecta.value) {
            gameViewModel?.agregarMonedas(2)
            gameViewModel?.registrarRespuesta(true, actividad?.obtenerCompetenciaId() ?: 0, actividad?.obtenerNivel() ?: 0)
        } else {
            gameViewModel?.registrarRespuesta(false, actividad?.obtenerCompetenciaId() ?: 0, actividad?.obtenerNivel() ?: 0)
        }
    }

    fun reiniciarEstado() {
        _alternativaSeleccionada.value = null
        _mostrarResultado.value = false
        _esCorrecta.value = false
    }

    private val _enunciadoAy = mutableStateOf("")
    val enunciadoAy: State<String> = _enunciadoAy

    private val _pistaAy = mutableStateOf("")
    val pistaAy: State<String> = _pistaAy
}

