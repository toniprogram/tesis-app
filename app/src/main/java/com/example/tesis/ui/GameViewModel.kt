package com.example.tesis.ui

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class GameViewModel : ViewModel() {
    private val _monedas = mutableStateOf(0)
    val monedas: State<Int> = _monedas

    private val _mostrarAnimacionMoneda = mutableStateOf(false)
    val mostrarAnimacionMoneda: State<Boolean> = _mostrarAnimacionMoneda

    fun agregarMonedas(cantidad: Int) {
        _monedas.value += cantidad
        _mostrarAnimacionMoneda.value = true
    }

    fun finalizarAnimacion() {
        _mostrarAnimacionMoneda.value = false
    }
}

