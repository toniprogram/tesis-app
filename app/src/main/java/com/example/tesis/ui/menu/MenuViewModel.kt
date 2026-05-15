package com.example.tesis.ui.menu

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.State
import androidx.lifecycle.ViewModel
import com.example.tesis.data.CompetenciasData

class MenuViewModel : ViewModel() {
    private val _competenciaSeleccionada = mutableStateOf<Int?>(null)
    val competenciaSeleccionada: State<Int?> = _competenciaSeleccionada

    private val _mostrarDialog = mutableStateOf(false)
    val mostrarDialog: State<Boolean> = _mostrarDialog

    val competencias = CompetenciasData.competencias

    fun seleccionarCompetencia(id: Int) {
        _competenciaSeleccionada.value = id
        _mostrarDialog.value = true
    }

    fun cerrarDialog() {
        _mostrarDialog.value = false
    }

    fun confirmarSeleccion() {
        _mostrarDialog.value = false
        // Aquí puedes navegar a niveles o hacer lo que necesites
    }
}