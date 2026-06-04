package com.example.tesis.data

import com.example.tesis.R
import com.example.tesis.data.model.Pregunta

object PreguntasData {

    private val preguntasCompetencia1 = listOf(

        // ── LOGRO 1 · Nivel 1 ──────────────────────────────────────────────
        // Fracción parte-todo con objeto concreto y número pequeño
        Pregunta(
            id = 1,
            competenciaId = 1,
            nivel = 1,
            enunciado = "En la chacra de la familia Mamani hay 8 sacos de papa. " +
                    "3 sacos se guardan para el consumo familiar. " +
                    "¿Qué fracción del total representa los sacos guardados?",
            alternativas = listOf("3/8", "8/3", "5/8", "1/3"),
            respuestaCorrecta = 0
        ),

        // ── LOGRO 1 · Nivel 2 ──────────────────────────────────────────────
        // Fracción parte-todo con un conjunto de animales
        Pregunta(
            id = 2,
            competenciaId = 1,
            nivel = 2,
            enunciado = "Don Rufino tiene 10 alpacas. " +
                    "4 de ellas están en el corral y el resto pasta en el cerro. " +
                    "¿Qué fracción de sus alpacas están en el corral?",
            alternativas = listOf("4/10", "10/4", "6/10", "4/6"),
            respuestaCorrecta = 0
        ),

        Pregunta(
            id = 3,
            competenciaId = 1,
            nivel = 3,
            enunciado = "En la escuela de la comunidad hay 15 niñas y 20 niños. " +
                    "¿Cuál es la razón de niñas a niños?",
            alternativas = listOf("3/4", "4/3", "15/35", "20/15"),
            respuestaCorrecta = 0
        ),

        Pregunta(
            id = 4,
            competenciaId = 1,
            nivel = 4,
            enunciado = "En la feria de Ilave, una familia llevó 18 quesos y vendió 12. " +
                    "¿Qué fracción del total de quesos vendió la familia? " +
                    "Escoge la fracción simplificada.",
            alternativas = listOf("2/3", "12/18", "1/3", "6/18"),
            respuestaCorrecta = 0
        ),

        Pregunta(
            id = 5,
            competenciaId = 1,
            nivel = 5,
            enunciado = "La familia Quispe cosechó 20 sacos de quinua. " +
                    "Decidió vender 1/4 de la cosecha en el mercado. " +
                    "¿Cuántos sacos de quinua venderá?",
            alternativas = listOf("5", "4", "10", "15"),
            respuestaCorrecta = 0
        ),

        // ── LOGRO 2 · Nivel 6 ──────────────────────────────────────────────
        // Fracción como operador – fracción no unitaria
        Pregunta(
            id = 6,
            competenciaId = 1,
            nivel = 6,
            enunciado = "Doña Lucía tiene S/ 40 de ganancia por la venta de lana de llama. " +
                    "Gasta 3/5 de ese dinero en semillas para la siguiente siembra. " +
                    "¿Cuánto dinero gastó en semillas?",
            alternativas = listOf("S/ 24", "S/ 16", "S/ 30", "S/ 12"),
            respuestaCorrecta = 0
        ),

        // ── LOGRO 2 · Nivel 7 ──────────────────────────────────────────────
        // Fracción como operador – implica hallar el todo a partir de la parte
        Pregunta(
            id = 7,
            competenciaId = 1,
            nivel = 7,
            enunciado = "En la cosecha de cañihua, 2/5 de los sacos cosechados son para la venta. " +
                    "Si esa parte equivale a 8 sacos, " +
                    "¿cuántos sacos cosechó la familia en total?",
            alternativas = listOf("20", "16", "10", "4"),
            respuestaCorrecta = 0
        ),

        // ── LOGRO 2 · Nivel 8 ──────────────────────────────────────────────
        // Fracción como operador – dos fracciones distintas sobre un mismo total
        Pregunta(
            id = 8,
            competenciaId = 1,
            nivel = 8,
            enunciado = "Don Agustín cosechó 24 sacos de papa. " +
                    "Guardó 1/3 para su familia y vendió 1/4 en la feria. " +
                    "¿Cuántos sacos en total guardó y vendió?",
            alternativas = listOf("14", "12", "10", "18"),
            respuestaCorrecta = 0
        ),

        // ── LOGRO 3 · Nivel 9 ──────────────────────────────────────────────
        // Suma simple con números naturales en contexto económico rural
        Pregunta(
            id = 9,
            competenciaId = 1,
            nivel = 9,
            enunciado = "En la feria comunal, la familia Apaza vendió lana por S/ 38, " +
                    "papa por S/ 55 y queso por S/ 27. " +
                    "¿Cuánto dinero recibió la familia en total?",
            alternativas = listOf("S/ 120", "S/ 110", "S/ 115", "S/ 130"),
            respuestaCorrecta = 0
        ),

        // ── LOGRO 3 · Nivel 10 ─────────────────────────────────────────────
        // Suma y resta secuencial con decimales – un paso más
        Pregunta(
            id = 10,
            competenciaId = 1,
            nivel = 10,
            enunciado = "En la feria de Yunguyo, mamá Corina ganó S/ 48.50 vendiendo tejidos. " +
                    "Gastó S/ 18.75 en alimentos y S/ 9.50 en semillas. " +
                    "¿Cuánto dinero le queda?",
            alternativas = listOf("S/ 20.25", "S/ 29.75", "S/ 21.50", "S/ 18.50"),
            respuestaCorrecta = 0
        ),

        // ── LOGRO 3 · Nivel 11 ─────────────────────────────────────────────
        // Suma de fracciones homogéneas en contexto de distribución de alimentos
        Pregunta(
            id = 11,
            competenciaId = 1,
            nivel = 11,
            enunciado = "Para el almuerzo comunal se preparó api de quinua. " +
                    "Por la mañana se usó 2/8 del saco de quinua " +
                    "y por la tarde se usó 3/8 del mismo saco. " +
                    "¿Qué fracción del saco se usó en total?",
            alternativas = listOf("5/8", "5/16", "1/8", "6/8"),
            respuestaCorrecta = 0
        ),

        // ── LOGRO 3 · Nivel 12 ─────────────────────────────────────────────
        // Problema de varios pasos: combina decimales, fracción operador y resta
        Pregunta(
            id = 12,
            competenciaId = 1,
            nivel = 12,
            enunciado = "La familia Condori vendió su lana de alpaca en S/ 120. " +
                    "Gastó 1/4 del total en herramientas de labranza " +
                    "y S/ 18.50 en víveres para la semana. " +
                    "¿Cuánto dinero le queda a la familia?",
            alternativas = listOf("S/ 71.50", "S/ 81.50", "S/ 60.00", "S/ 90.00"),
            respuestaCorrecta = 0
        )
    )

    private val preguntasCompetencia2 = listOf(
        Pregunta(
            id = 13,
            competenciaId = 2,
            nivel = 1,
            enunciado = "¿Cuál es el siguiente número en la secuencia?\n2, 4, 6, 8, ...",
            alternativas = listOf("10", "9", "12", "11"),
            respuestaCorrecta = 0
        ),
        Pregunta(
            id = 14,
            competenciaId = 2,
            nivel = 2,
            enunciado = "¿Cuál es el siguiente número en la secuencia?\n5, 10, 15, 20, ...",
            alternativas = listOf("25", "22", "30", "24"),
            respuestaCorrecta = 0
        ),
        Pregunta(
            id = 15,
            competenciaId = 2,
            nivel = 3,
            enunciado = "Completa la igualdad:\n5 + ? = 12",
            alternativas = listOf("7", "6", "8", "5"),
            respuestaCorrecta = 0
        ),
        Pregunta(
            id = 16,
            competenciaId = 2,
            nivel = 4,
            enunciado = "¿Cuál es el patrón en la secuencia?\n3, 6, 9, 12, 15, ...",
            alternativas = listOf("Se suma 3", "Se suma 6", "Se multiplica por 2", "Se suma 4"),
            respuestaCorrecta = 0
        ),
        Pregunta(
            id = 17,
            competenciaId = 2,
            nivel = 5,
            enunciado = "Completa la igualdad:\n? - 8 = 15",
            alternativas = listOf("23", "7", "20", "25"),
            respuestaCorrecta = 0
        ),
        Pregunta(
            id = 18,
            competenciaId = 2,
            nivel = 6,
            enunciado = "Si x + 4 = 13, ¿cuánto vale x?",
            alternativas = listOf("9", "17", "8", "10"),
            respuestaCorrecta = 0
        ),
        Pregunta(
            id = 19,
            competenciaId = 2,
            nivel = 7,
            enunciado = "Una pastora tiene ovejas. El lunes tenía 5, el martes 10, el miércoles 15. Si sigue el mismo patrón, ¿cuántas tendrá el viernes?",
            alternativas = listOf("25", "20", "30", "35"),
            respuestaCorrecta = 0
        ),
        Pregunta(
            id = 20,
            competenciaId = 2,
            nivel = 8,
            enunciado = "Si 2 × n = 16, ¿cuánto vale n?",
            alternativas = listOf("8", "14", "32", "6"),
            respuestaCorrecta = 0
        ),
        Pregunta(
            id = 21,
            competenciaId = 2,
            nivel = 9,
            enunciado = "Un agricultor planta papas en filas. En la primera fila planta 4, en la segunda 8, en la tercera 12. ¿Cuántas plantará en la quinta fila?",
            alternativas = listOf("20", "16", "24", "18"),
            respuestaCorrecta = 0
        ),
        Pregunta(
            id = 22,
            competenciaId = 2,
            nivel = 10,
            enunciado = "¿Cuál es el siguiente número en la secuencia?\n2, 4, 8, 16, ...",
            alternativas = listOf("32", "24", "20", "18"),
            respuestaCorrecta = 0
        ),
        Pregunta(
            id = 23,
            competenciaId = 2,
            nivel = 11,
            enunciado = "En la feria, doña María vende quesos. El lunes vendió 6, el martes 12, el miércoles 18. Si el patrón sigue, ¿cuántos venderá el sábado?",
            alternativas = listOf("36", "30", "42", "24"),
            respuestaCorrecta = 0
        ),
        Pregunta(
            id = 24,
            competenciaId = 2,
            nivel = 12,
            enunciado = "Don Pedro ahorra cada semana el doble de la anterior. Si la primera semana ahorró S/5 y la segunda S/10, ¿cuánto ahorrará la cuarta semana?",
            alternativas = listOf("S/40", "S/20", "S/30", "S/25"),
            respuestaCorrecta = 0
        )
    )

    private val preguntasCompetencia3 = listOf(
        Pregunta(
            id = 25,
            competenciaId = 3,
            nivel = 1,
            enunciado = "¿Cuántos lados tiene un rectángulo?",
            alternativas = listOf("4", "3", "5", "6"),
            respuestaCorrecta = 0
        ),
        Pregunta(
            id = 26,
            competenciaId = 3,
            nivel = 2,
            enunciado = "El mantel de don Juan tiene forma rectangular. Observa la imagen. ¿Cuál es su perímetro?",
            imagen = R.drawable.c3_nivel2,
            alternativas = listOf("30 m", "50 m", "15 m", "20 m"),
            respuestaCorrecta = 0
        ),
        Pregunta(
            id = 27,
            competenciaId = 3,
            nivel = 3,
            enunciado = "Observa el techo. Si sus 3 lados miden lo mismo, ¿qué tipo de triángulo es?",
            imagen = R.drawable.c3_nivel3,
            alternativas = listOf("Equilátero", "Isósceles", "Escaleno", "Rectángulo"),
            respuestaCorrecta = 0
        ),
        Pregunta(
            id = 28,
            competenciaId = 3,
            nivel = 4,
            enunciado = "Un terreno rectangular mide 8 metros de largo y 4 metros de ancho. ¿Cuál es su área?",
            alternativas = listOf("32 m²", "24 m²", "12 m²", "16 m²"),
            respuestaCorrecta = 0
        ),
        Pregunta(
            id = 29,
            competenciaId = 3,
            nivel = 5,
            enunciado = "Observa la imagen. ¿Cómo se llama este tipo de ángulo que forma el suelo con la cebada?",
            imagen = R.drawable.c3_nivel5,
            alternativas = listOf("Ángulo recto", "Ángulo agudo", "Ángulo obtuso", "Ángulo llano"),
            respuestaCorrecta = 0
        ),
        Pregunta(
            id = 30,
            competenciaId = 3,
            nivel = 6,
            enunciado = "Observa la luna. Si el radio mide 7 cm, ¿cuánto mide el diámetro?",
            imagen = R.drawable.c3_nivel6,
            alternativas = listOf("14 cm", "7 cm", "21 cm", "3.5 cm"),
            respuestaCorrecta = 0
        ),
        Pregunta(
            id = 31,
            competenciaId = 3,
            nivel = 7,
            enunciado = "Observa las dos andenes. ¿Cómo se llaman las rectas que forman y que nunca se cruzan?",
            imagen = R.drawable.c3_nivel7,
            alternativas = listOf("Paralelas", "Perpendiculares", "Secantes", "Oblicuas"),
            respuestaCorrecta = 0
        ),
        Pregunta(
            id = 32,
            competenciaId = 3,
            nivel = 8,
            enunciado = "Un triángulo tiene lados de 5 cm, 7 cm y 10 cm. ¿Cuál es su perímetro?",
            alternativas = listOf("22 cm", "20 cm", "35 cm", "12 cm"),
            respuestaCorrecta = 0
        ),
        Pregunta(
            id = 33,
            competenciaId = 3,
            nivel = 9,
            enunciado = "Observa la imagen. Si la chacra de don Juan se amplía al doble, ¿cuánto medirá el lado que falta?",
            imagen = R.drawable.c3_nivel9,
            alternativas = listOf("4 cm", "3 cm", "6 cm", "8 cm"),
            respuestaCorrecta = 0
        ),
        Pregunta(
            id = 34,
            competenciaId = 3,
            nivel = 10,
            enunciado = "Un triángulo tiene base de 6 cm y altura de 4 cm. ¿Cuál es su área?\n(Área = base × altura ÷ 2)",
            alternativas = listOf("12 cm²", "24 cm²", "10 cm²", "8 cm²"),
            respuestaCorrecta = 0
        ),
        Pregunta(
            id = 35,
            competenciaId = 3,
            nivel = 11,
            enunciado = "Observa esta casa. ¿Cuántas figuras geométricas diferentes puedes identificar?",
            imagen = R.drawable.c3_nivel11,
            alternativas = listOf("3", "2", "4", "1"),
            respuestaCorrecta = 0
        ),
        Pregunta(
            id = 36,
            competenciaId = 3,
            nivel = 12,
            enunciado = "La plaza del pueblo tiene forma cuadrada con lados de 15 metros. ¿Cuántos metros de cerco se necesitan para rodearla y cuál es su área?",
            alternativas = listOf("60 m de cerco y 225 m²", "30 m de cerco y 225 m²", "60 m de cerco y 150 m²", "45 m de cerco y 200 m²"),
            respuestaCorrecta = 0
        )
    )


    fun obtenerPregunta(competenciaId: Int, nivel: Int): Pregunta? {
        return when (competenciaId) {
            1 -> preguntasCompetencia1.find { it.nivel == nivel }
            2 -> preguntasCompetencia2.find { it.nivel == nivel }
            3 -> preguntasCompetencia3.find { it.nivel == nivel }
            else -> null
        }
    }
}

