package com.example.tesis.data

import android.content.Context
import android.content.SharedPreferences

class ProgresoManager(context: Context) {

    private val prefs: SharedPreferences =
        context.getSharedPreferences("tesis_progreso", Context.MODE_PRIVATE)

    // Monedas
    fun guardarMonedas(cantidad: Int) {
        prefs.edit().putInt("monedas", cantidad).apply()
    }

    fun obtenerMonedas(): Int = prefs.getInt("monedas", 0)

    // Medallas desbloqueadas
    fun guardarMedallas(medallas: List<Int>) {
        prefs.edit().putStringSet("medallas", medallas.map { it.toString() }.toSet()).apply()
    }

    fun obtenerMedallas(): List<Int> {
        return prefs.getStringSet("medallas", emptySet())?.map { it.toInt() } ?: emptyList()
    }

    // Niveles completados por competencia
    fun guardarNivelesCompletados(competenciaId: Int, niveles: Set<Int>) {
        prefs.edit().putStringSet(
            "niveles_$competenciaId",
            niveles.map { it.toString() }.toSet()
        ).apply()
    }

    fun obtenerNivelesCompletados(competenciaId: Int): Set<Int> {
        return prefs.getStringSet("niveles_$competenciaId", emptySet())
            ?.map { it.toInt() }?.toSet() ?: emptySet()
    }

    // Tutoriales vistos
    fun guardarTutorialesVistos(tutoriales: List<String>) {
        prefs.edit().putStringSet("tutoriales", tutoriales.toSet()).apply()
    }

    fun obtenerTutorialesVistos(): List<String> {
        return prefs.getStringSet("tutoriales", emptySet())?.toList() ?: emptyList()
    }

    // Racha consecutiva
    fun guardarRacha(racha: Int) {
        prefs.edit().putInt("racha", racha).apply()
    }

    fun obtenerRacha(): Int = prefs.getInt("racha", 0)

    // Total correctas
    fun guardarTotalCorrectas(total: Int) {
        prefs.edit().putInt("total_correctas", total).apply()
    }

    fun obtenerTotalCorrectas(): Int = prefs.getInt("total_correctas", 0)

    // Idioma
    fun guardarIdioma(esAimara: Boolean) {
        prefs.edit().putBoolean("es_aimara", esAimara).apply()
    }

    fun obtenerIdioma(): Boolean = prefs.getBoolean("es_aimara", false)
}