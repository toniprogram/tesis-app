package com.example.tesis.ui.actividad

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.tesis.data.PreguntasData
import com.example.tesis.domain.Actividad
import com.example.tesis.ui.GameViewModel

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

    fun cargarActividad(competenciaId: Int, nivel: Int) {
        val pregunta = PreguntasData.obtenerPregunta(competenciaId, nivel)
        actividad = pregunta?.let { Actividad(it) }
        // ← ACTUALIZA LOS ESTADOS AL CARGAR
        _enunciado.value = actividad?.obtenerEnunciado() ?: ""
        _alternativas.value = actividad?.obtenerAlternativas() ?: emptyList()
        reiniciarEstado()
    }

    fun obtenerEnunciado(): String = _enunciado.value
    fun obtenerAlternativas(): List<String> = _alternativas.value
    fun obtenerImagen(): Int? = actividad?.obtenerImagen()

    fun seleccionarAlternativa(indice: Int, gameViewModel: GameViewModel? = null) {
        if (_mostrarResultado.value) return

        _alternativaSeleccionada.value = indice
        _esCorrecta.value = actividad?.evaluar(indice) ?: false
        _mostrarResultado.value = true

        // Si es correcta, sumar 2 monedas
        if (_esCorrecta.value) {
            gameViewModel?.agregarMonedas(2)
        }
    }

    fun reiniciarEstado() {
        _alternativaSeleccionada.value = null
        _mostrarResultado.value = false
        _esCorrecta.value = false
    }
}

