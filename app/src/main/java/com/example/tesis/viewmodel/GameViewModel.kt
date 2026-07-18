package com.example.tesis.viewmodel

import android.app.Application
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.AndroidViewModel
import com.example.tesis.data.ProgresoManager

class GameViewModel(application: Application) : AndroidViewModel(application) {

    private val progresoManager = ProgresoManager(application)

    // === MONEDAS ===
    private val _monedas = mutableStateOf(progresoManager.obtenerMonedas())
    val monedas: State<Int> = _monedas

    private val _mostrarAnimacionMoneda = mutableStateOf(false)
    val mostrarAnimacionMoneda: State<Boolean> = _mostrarAnimacionMoneda

    fun agregarMonedas(cantidad: Int) {
        _monedas.value += cantidad
        _mostrarAnimacionMoneda.value = true
        progresoManager.guardarMonedas(_monedas.value)
    }

    fun finalizarAnimacion() {
        _mostrarAnimacionMoneda.value = false
    }

    fun usarPista(): Boolean {
        return if (_monedas.value >= 10) {
            _monedas.value -= 10
            progresoManager.guardarMonedas(_monedas.value)
            true
        } else {
            false
        }
    }

    // === MEDALLAS ===
    private val _medallasDesbloqueadas = mutableStateListOf<Int>()
    val medallasDesbloqueadas: List<Int> get() = _medallasDesbloqueadas

    private val _medallaReciente = mutableStateOf<Int?>(null)
    val medallaReciente: State<Int?> = _medallaReciente

    private val _colaMedallas = mutableListOf<Int>()

    private fun desbloquearMedalla(id: Int) {
        if (id !in _medallasDesbloqueadas) {
            _medallasDesbloqueadas.add(id)
            _colaMedallas.add(id)
            progresoManager.guardarMedallas(_medallasDesbloqueadas.toList())

            if (id != 7 && _medallasDesbloqueadas.containsAll(listOf(1, 2, 3, 4, 5, 6))) {
                if (7 !in _medallasDesbloqueadas) {
                    _medallasDesbloqueadas.add(7)
                    _colaMedallas.add(7)
                    progresoManager.guardarMedallas(_medallasDesbloqueadas.toList())
                }
            }

            if (_medallaReciente.value == null) {
                _medallaReciente.value = _colaMedallas.removeFirstOrNull()
            }
        }
    }

    fun cerrarAnimacionMedalla() {
        _medallaReciente.value = _colaMedallas.removeFirstOrNull()
    }

    // === PROGRESO ===
    private var _totalCorrectas = progresoManager.obtenerTotalCorrectas()
    private var _rachaConsecutiva = progresoManager.obtenerRacha()

    private val _nivelesCompletados = mutableMapOf<Int, MutableSet<Int>>()

    fun esNivelCompletado(competenciaId: Int, nivel: Int): Boolean {
        return _nivelesCompletados[competenciaId]?.contains(nivel) == true
    }

    fun esNivelDesbloqueado(competenciaId: Int, nivel: Int): Boolean {
        if (nivel == 1) return true
        return esNivelCompletado(competenciaId, nivel - 1)
    }

    fun registrarRespuesta(correcta: Boolean, competenciaId: Int, nivel: Int) {
        if (correcta) {
            _totalCorrectas++
            progresoManager.guardarTotalCorrectas(_totalCorrectas)

            if (_totalCorrectas == 1) {
                desbloquearMedalla(1)
            }

            _rachaConsecutiva++
            progresoManager.guardarRacha(_rachaConsecutiva)

            if (_rachaConsecutiva >= 5 && 2 !in _medallasDesbloqueadas) {
                desbloquearMedalla(2)
            }

            val niveles = _nivelesCompletados.getOrPut(competenciaId) { mutableSetOf() }
            niveles.add(nivel)
            progresoManager.guardarNivelesCompletados(competenciaId, niveles)

            if (_nivelesCompletados[1]?.size == 24) desbloquearMedalla(3)
            if (_nivelesCompletados[3]?.size == 24) desbloquearMedalla(4)
            if (_nivelesCompletados[4]?.size == 24) desbloquearMedalla(5)
            if (_nivelesCompletados[2]?.size == 24) desbloquearMedalla(6)
        } else {
            _rachaConsecutiva = 0
            progresoManager.guardarRacha(0)
        }
    }

    // === TUTORIALES ===
    private val _tutorialesVistos = mutableStateListOf<String>()

    fun tutorialVisto(clave: String): Boolean {
        return clave in _tutorialesVistos
    }

    fun marcarTutorialVisto(clave: String) {
        if (clave !in _tutorialesVistos) {
            _tutorialesVistos.add(clave)
            progresoManager.guardarTutorialesVistos(_tutorialesVistos.toList())
        }
    }

    // === IDIOMA ===
    private val _esAimara = mutableStateOf(progresoManager.obtenerIdioma())
    val esAimara: State<Boolean> = _esAimara

    fun cambiarIdioma() {
        _esAimara.value = !_esAimara.value
        progresoManager.guardarIdioma(_esAimara.value)
    }

    // === CARGAR PROGRESO AL INICIAR ===
    init {
        // Cargar medallas
        _medallasDesbloqueadas.addAll(progresoManager.obtenerMedallas())

        // Cargar niveles completados
        for (compId in 1..4) {
            val niveles = progresoManager.obtenerNivelesCompletados(compId)
            if (niveles.isNotEmpty()) {
                _nivelesCompletados[compId] = niveles.toMutableSet()
            }
        }

        // Cargar tutoriales
        _tutorialesVistos.addAll(progresoManager.obtenerTutorialesVistos())
    }
}