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
            enunciadoAy = "Familia Mamani-n chajrapanxa 8 sacos papa utji." +
                    "3 sacos ukaxa familia manq’añataki imatäxiwa." +
                    "¿Kuna fracción ukawa taqpacha saconakatxa imatäki uk uñacht’ayi?",
            alternativas = listOf("3/8", "8/3", "5/8", "1/3"),
            respuestaCorrecta = 0,
            pista = "Guardados (3) entre total (8). La fracción es 3/8.",
            pistaAy = "Imatäki ukaxa (3) taqpacha (8) taypinkiwa. Fracción ukaxa 3/8 satawa."
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
            enunciadoAy = "Don Rufino-nxa 10 alpacas utji." +
                    "4 alpacas ukaxa corralan jikxatasi, mayninakasti qhurunakanwa manq’asisipki." +
                    "¿Kuna fracción alpacas-nakapataxa corralan jikxatasi?",
            alternativas = listOf("4/10", "10/4", "6/10", "4/6"),
            respuestaCorrecta = 0,
            pista = "En el corral hay 4 de 10 alpacas. La fracción es 4/10.",
            pistaAy = "Corralanxa 4 alpacas 10 alpacat utji. Fracción ukaxa 4/10 satawa."
        ),

        Pregunta(
            id = 3,
            competenciaId = 1,
            nivel = 3,
            enunciado = "En la escuela de la comunidad hay 15 niñas y 20 niños. " +
                    "¿Cuál es la razón de niñas a niños?",
            enunciadoAy = "Comunidad yatiqañ utanxa 15 imill wawanaka ukhamaraki 20 yuqall wawanaka utji." +
                    "¿Kuna razón ukawa imill wawanakat yuqall wawanakaru?",
            alternativas = listOf("3/4", "4/3", "15/35", "20/15"),
            respuestaCorrecta = 0,
            pista = "Razón = niñas/niños = 15/20. Simplifica dividiendo ambos entre 5: 3/4.",
            pistaAy = "Razón = imill wawanaka/yuqall wawanaka = 15/20. Panpachani 5 ukamp jaljasina simplifica: 3/4."
        ),

        Pregunta(
            id = 4,
            competenciaId = 1,
            nivel = 4,
            enunciado = "En la feria de Ilave, una familia llevó 18 quesos y vendió 12. " +
                    "¿Qué fracción del total de quesos vendió la familia? " +
                    "Escoge la fracción simplificada.",
            enunciadoAy = "Ilave markan ferianxa mä familiaxa 18 quesos apawayi ukatxa 12 aljawayi." +
                    "¿Kuna fracción taqpacha quesonakatxa familiaxa aljawayi?" + "" +
                    "Fracción simplificada ajlli.",
            alternativas = listOf("2/3", "12/18", "1/3", "6/18"),
            respuestaCorrecta = 0,
            pista = "Vendió 12 de 18. Fracción: 12/18. Simplifica dividiendo ambos entre 6: 2/3.",
            pistaAy = "12 quesos 18 quesot aljatawa. Fracción: 12/18. Panpachani 6 ukamp jaljasina simplifica: 2/3."
        ),

        Pregunta(
            id = 5,
            competenciaId = 1,
            nivel = 5,
            enunciado = "La familia Quispe cosechó 20 sacos de quinua. " +
                    "Decidió vender 1/4 de la cosecha en el mercado. " +
                    "¿Cuántos sacos de quinua venderá?",
            enunciadoAy = "Familia Quispe-nxa 20 sacos quinua apthapiwayi." +
                    "Jupanakaxa 1/4 cosecha mercado-n aljañataki amtapxäna." +
                    "¿Qhawqha sacos quinua aljapxani?",
            alternativas = listOf("5", "4", "10", "15"),
            respuestaCorrecta = 0,
            pista = "1/4 de 20 = 20 ÷ 4 = 5 sacos.",
            pistaAy = "1/4 ukaxa 20-nxa = 20 ÷ 4 = 5 sacos."
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
            enunciadoAy = "Doña Lucía-nxa llama t’arwat aljatapatxa S/ 40 ganancia utji. Jupaxa uka qullqit 3/5 jathanaka alasina jutir satañataki apnaqawayi. ¿Qhawqha qullqi jathanakan gastawayi?",
            alternativas = listOf("S/ 24", "S/ 16", "S/ 30", "S/ 12"),
            respuestaCorrecta = 0,
            pista = "3/5 de S/40: primero 40 ÷ 5 = 8, luego 8 × 3 = S/24.",
            pistaAy = "3/5 de S/40: nayraqata 40 ÷ 5 = 8, ukatxa 8 × 3 = S/24."
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
            enunciadoAy = "Cañihua apthapiwinxa, 2/5 saconakaxa aljañatakiwa. Uka chiqaxa 8 sacos ukhamächi ukhaxa, ¿qhawqha sacos familiaxa taqpach apthapiwayi?",
            alternativas = listOf("20", "16", "10", "4"),
            respuestaCorrecta = 0,
            pista = "Si 2/5 = 8 sacos, entonces 1/5 = 4 sacos. Total = 5 × 4 = 20 sacos.",
            pistaAy = "2/5 = 8 sacos ukhaxa, 1/5 = 4 sacos. Total = 5 × 4 = 20 sacos."
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
            enunciadoAy = "Don Agustín-nxa 24 sacos papa apthapiwayi. 1/3 familiaapataki imawayi ukatxa 1/4 feria-n aljawayi. ¿Qhawqha sacos taqpach imawayi ukhamarak aljawayi?",
            alternativas = listOf("14", "12", "10", "18"),
            respuestaCorrecta = 0,
            pista = "1/3 de 24 = 8 sacos. 1/4 de 24 = 6 sacos. Total: 8 + 6 = 14 sacos.",
            pistaAy = "1/3 de 24 = 8 sacos. 1/4 de 24 = 6 sacos. Total: 8 + 6 = 14 sacos."
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
            enunciadoAy = "Feria comunalanxa, familia Apaza-nxa t’arwa S/ 38 ukaru, papa S/ 55 ukaru ukhamaraki queso S/ 27 ukaru aljawayi. ¿Qhawqha qullqi familiaxa taqpach katuqawayi?",
            alternativas = listOf("S/ 120", "S/ 110", "S/ 115", "S/ 130"),
            respuestaCorrecta = 0,
            pista = "Suma todo: 38 + 55 + 27 = S/120.",
            pistaAy = "Taqpach yapxataña: 38 + 55 + 27 = S/120."
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
            enunciadoAy = "Yunguyo markan ferianxa, mamá Corina-nxa tejidos aljasina S/ 48.50 jikxatasiwayi. Jupaxa S/ 18.75 manq’añanakan ukhamaraki S/ 9.50 jathanakan gastawayi. ¿Qhawqha qullqi jilt’i?",
            alternativas = listOf("S/ 20.25", "S/ 29.75", "S/ 21.50", "S/ 18.50"),
            respuestaCorrecta = 0,
            pista = "48.50 - 18.75 = 29.75. Luego 29.75 - 9.50 = S/20.25.",
            pistaAy = "48.50 - 18.75 = 29.75. Ukatxa 29.75 - 9.50 = S/20.25."
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
            enunciadoAy = "Almuerzo comunalatakixa api de quinua wakichatawa. Alwaxa 2/8 saco quinua apnaqasiwayi ukatxa jayp’uxa 3/8 uka pachpa sacot apnaqasirakiwa. ¿Kuna fracción sacotxa taqpach apnaqasiwayi?",
            alternativas = listOf("5/8", "5/16", "1/8", "6/8"),
            respuestaCorrecta = 0,
            pista = "Mismo denominador: 2/8 + 3/8 = (2+3)/8 = 5/8.",
            pistaAy = "Pachpa denominadorampi: 2/8 + 3/8 = (2+3)/8 = 5/8."
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
            enunciadoAy = "Familia Condori-nxa alpaca t’arwapa S/ 120 ukaru aljawayi. 1/4 taqpacha qullqitxa herramientas de labranza alasina gastawayi ukatxa S/ 18.50 víveres semanataki alaraki gastawayi. ¿Qhawqha qullqi familiaxaruxa jilt’i?",
            alternativas = listOf("S/ 71.50", "S/ 81.50", "S/ 60.00", "S/ 90.00"),
            respuestaCorrecta = 0,
            pista = "1/4 de 120 = 30 (herramientas). Queda 120 - 30 = 90. Luego 90 - 18.50 = S/71.50.",
            pistaAy = "1/4 de 120 = 30. Jilt’i: 120 - 30 = 90. Ukatxa 90 - 18.50 = S/71.50."
        ),

        // ════════════════════════════════════════════════════════════════
        // NIVELES 13-24 · Segunda vuelta (mayor dificultad progresiva)
        // ════════════════════════════════════════════════════════════════

        // ── LOGRO 1 · Nivel 13 ─────────────────────────────────────────────
        // Razón con representación gráfica, exige simplificar
        // IMAGEN c1_nivel13: corral con 9 ovejas y 6 llamas dibujadas y
        // claramente contables (íconos simples).
        Pregunta(
            id = 49,
            competenciaId = 1,
            nivel = 13,
            enunciado = "Observa el corral de la familia Choque. " +
                    "¿Cuál es la razón de ovejas a llamas, expresada en su forma simplificada?",
            enunciadoAy = "Familia Choque-n corralapa uñakipt’ma. ¿Kuna razón ovejanakat llamanakaru ukaxa forma simplificada-nxa?",
            imagen = R.drawable.c1_nivel13,
            alternativas = listOf("3/2", "2/3", "9/6", "6/9"),
            respuestaCorrecta = 0,
            pista = "Cuenta: 9 ovejas y 6 llamas. Razón = 9/6. Simplifica ÷3: 3/2.",
            pistaAy = "Jakhuña: 9 ovejas ukhamaraki 6 llamas. Razón = 9/6. Simplifica ÷3: 3/2."
        ),

        // ── LOGRO 1 · Nivel 14 ─────────────────────────────────────────────
        // Fracción parte-todo desde una imagen, exige simplificar
        // IMAGEN c1_nivel14: terreno cuadriculado en 12 partes iguales:
        // 5 partes de un color (papa), 4 de otro (quinua) y 3 sin sembrar (descanso).
        Pregunta(
            id = 50,
            competenciaId = 1,
            nivel = 14,
            enunciado = "Observa el terreno de la familia Mamani dividido en 12 partes iguales. " +
                    "¿Qué fracción del terreno está en descanso (sin sembrar), en su forma simplificada?",
            enunciadoAy = "Familia Mamani-n uraqipa uñakipt’ma, 12 kikpa chiqanakaru jaljata. ¿Kuna fracción uraqitxa samart’ayatawa (jani sataña), forma simplificada-nxa?",
            imagen = R.drawable.c1_nivel14,
            alternativas = listOf("1/4", "3/12", "4/12", "5/12"),
            respuestaCorrecta = 0,
            pista = "3 partes sin sembrar de 12. Fracción: 3/12. Simplifica ÷3: 1/4.",
            pistaAy = "3 chiqanaka jani satañampi 12 taypita. Fracción: 3/12. Simplifica ÷3: 1/4."
        ),

        // ── LOGRO 1 · Nivel 15 ─────────────────────────────────────────────
        // Comparación de fracciones (mismo numerador, distinto denominador)
        // IMAGEN c1_nivel15: Corral A con 8 alpacas (3 marcadas como crías) y
        // Corral B con 12 alpacas (3 marcadas como crías).
        Pregunta(
            id = 51,
            competenciaId = 1,
            nivel = 15,
            enunciado = "Observa los dos corrales de alpacas. " +
                    "En el Corral A hay 8 alpacas, 3 de ellas son crías. " +
                    "En el Corral B hay 12 alpacas, también 3 son crías. " +
                    "¿En qué corral la fracción de crías respecto al total es mayor?",
            enunciadoAy = "Pä corral alpaca uñakipt’ma. Corral A-nxa 8 alpacas utji, 3 ukatxa wawakiwa. Corral B-nxa 12 alpacas utjarakiwa, 3 ukatxa wawakiwa. ¿Kawki corralanxa fracción waw alpacanakaxa juk’amp jach’a?",
            imagen = R.drawable.c1_nivel15,
            alternativas = listOf("Corral A", "Corral B", "Son iguales", "No se puede determinar"),
            respuestaCorrecta = 0,
            pista = "Corral A: 3/8. Corral B: 3/12 = 1/4. Como 3/8 > 1/4, el Corral A tiene mayor fracción.",
            pistaAy = "Corral A: 3/8. Corral B: 3/12 = 1/4. Kunatixa 3/8 > 1/4 ukhama, Corral A-nxa juk’ampiwa."
        ),

        // ── LOGRO 2 · Nivel 16 ─────────────────────────────────────────────
        // Fracción como operador aplicada dos veces de forma sucesiva
        Pregunta(
            id = 52,
            competenciaId = 1,
            nivel = 16,
            enunciado = "Don Mariano ganó S/ 180 vendiendo su cosecha de habas. " +
                    "Invirtió 2/3 de ese dinero en un nuevo arado y, del dinero que le quedó, " +
                    "gastó 1/2 en semillas para la próxima siembra. " +
                    "¿Cuánto dinero le queda finalmente?",
            enunciadoAy = "Don Mariano-nxa habas cosechapat aljasina S/ 180 jikxatasiwayi. Uka qullqit 2/3 machaq arado alasina apnaqawayi ukatxa jilt’ki uka qullqit 1/2 jatha alasina jutir satañataki gastawayi. ¿Qhawqha qullqi qhiparxi?",
            alternativas = listOf("S/ 30", "S/ 60", "S/ 90", "S/ 120"),
            respuestaCorrecta = 0,
            pista = "2/3 de 180 = 120 (arado). Queda 60. 1/2 de 60 = 30 (semillas). Queda S/30.",
            pistaAy = "2/3 de 180 = 120. Jilt’i 60. 1/2 de 60 = 30. Jilt’i S/30."
        ),

        // ── LOGRO 2 · Nivel 17 ─────────────────────────────────────────────
        // Hallar el todo a partir de la parte, con dos fracciones combinadas
        Pregunta(
            id = 53,
            competenciaId = 1,
            nivel = 17,
            enunciado = "En la cosecha de quinua de la comunidad, 3/7 de los sacos se destinan a la venta " +
                    "y 2/7 al consumo familiar. El resto, que equivale a 16 sacos, se guarda como semilla. " +
                    "¿Cuántos sacos se cosecharon en total?",
            enunciadoAy = "Comunidad-n quinua cosechapanxa, 3/7 saconakaxa aljañatakiwa ukatxa 2/7 familia manq’añatakiwa. Qhiparirixa, 16 sacos ukhamawa, jathataki imatawa. ¿Qhawqha sacos taqpach apthapita?",
            alternativas = listOf("56", "48", "40", "64"),
            respuestaCorrecta = 0,
            pista = "Venta: 3/7, consumo: 2/7, semilla: 2/7. Si 2/7 = 16, entonces 1/7 = 8. Total = 7 × 8 = 56.",
            pistaAy = "Aljañataki: 3/7, manq’añataki: 2/7, jathataki: 2/7. 2/7 = 16 ukhaxa, 1/7 = 8. Total = 7 × 8 = 56."
        ),

        // ── LOGRO 2 · Nivel 18 ─────────────────────────────────────────────
        // Dos fracciones distintas sobre un mismo total, hallar el resto
        Pregunta(
            id = 54,
            competenciaId = 1,
            nivel = 18,
            enunciado = "Doña Eulalia cosechó 60 sacos de papa. " +
                    "Vendió 2/5 en la feria de Ilave, regaló 1/6 a sus vecinos " +
                    "y guardó el resto para el consumo familiar. " +
                    "¿Cuántos sacos guardó para su familia?",
            enunciadoAy = "Doña Eulalia-nxa 60 sacos papa apthapiwayi. 2/5 Ilave ferian aljawayi, 1/6 jak’a jaqinakapar churawayi ukatxa qhiparirixa familia manq’añataki imawayi. ¿Qhawqha sacos familiaapataki imawayi?",
            alternativas = listOf("26", "24", "34", "36"),
            respuestaCorrecta = 0,
            pista = "2/5 de 60 = 24 (venta). 1/6 de 60 = 10 (regalo). Guardó: 60 - 24 - 10 = 26.",
            pistaAy = "2/5 de 60 = 24. 1/6 de 60 = 10. Imata: 60 - 24 - 10 = 26."
        ),

        // ── LOGRO 2 · Nivel 19 ─────────────────────────────────────────────
        // Fracción como operador con resultado decimal (mayor exigencia)
        Pregunta(
            id = 55,
            competenciaId = 1,
            nivel = 19,
            enunciado = "La familia Yupanqui obtuvo S/ 250 por la venta de su lana de alpaca. " +
                    "Gastaron 3/10 del dinero en herramientas y, del resto, " +
                    "usaron 1/4 para pagar el transporte hacia el mercado. " +
                    "¿Cuánto dinero les queda después de estos gastos?",
            enunciadoAy = "Familia Yupanqui-nxa alpaca t’arwapa aljasina S/ 250 katuqapxäna. Uka qullqit 3/10 herramientas-n gastapxäna ukatxa qhiparir qullqit 1/4 mercado-r sarañ transporte-patak apnaqapxäna. ¿Qhawqha qullqi qhiparxi?",
            alternativas = listOf("S/ 131.25", "S/ 125.00", "S/ 137.50", "S/ 118.75"),
            respuestaCorrecta = 0,
            pista = "3/10 de 250 = 75. Queda 175. 1/4 de 175 = 43.75. Queda 175 - 43.75 = S/131.25.",
            pistaAy = "3/10 de 250 = 75. Jilt’i 175. 1/4 de 175 = 43.75. Jilt’i 131.25."
        ),

        // ── LOGRO 3 · Nivel 20 ─────────────────────────────────────────────
        // Problema aditivo con decimales y dos productos distintos
        Pregunta(
            id = 56,
            competenciaId = 1,
            nivel = 20,
            enunciado = "En la feria de Juliaca, la familia Apaza vendió 15 kg de queso a S/ 12.50 cada kilo " +
                    "y 8 sacos de chuño a S/ 9.80 cada saco. " +
                    "Si gastaron S/ 45.30 en el pasaje de ida y vuelta, " +
                    "¿cuánto dinero les quedó en total?",
            enunciadoAy = "Juliaca markan ferianxa, familia Apaza-nxa 15 kg queso S/ 12.50 sapa kilo aljawayi ukatxa 8 sacos chuño S/ 9.80 sapa saco aljarakiwayi. S/ 45.30 saraña ukhamaraki kutt’aña pasajen gastapxäna ukhaxa, ¿qhawqha qullqi qhiparxi?",
            alternativas = listOf("S/ 220.60", "S/ 233.10", "S/ 210.80", "S/ 265.90"),
            respuestaCorrecta = 0,
            pista = "Queso: 15 × 12.50 = 187.50. Chuño: 8 × 9.80 = 78.40. Total: 265.90 - 45.30 = S/220.60.",
            pistaAy = "Queso: 15 × 12.50 = 187.50. Chuño: 8 × 9.80 = 78.40. Total: 265.90 - 45.30 = S/220.60."
        ),

        // ── LOGRO 3 · Nivel 21 ─────────────────────────────────────────────
        // Problema de varias etapas: dos fracciones del total y reparto final
        Pregunta(
            id = 57,
            competenciaId = 1,
            nivel = 21,
            enunciado = "Don Felipe cosechó 90 sacos de papa entre sus dos chacras. " +
                    "Vendió 1/3 del total en el mercado de Puno, donó 1/6 del total a la escuela comunal " +
                    "y el resto lo repartió en partes iguales entre sus tres hijos. " +
                    "¿Cuántos sacos recibió cada hijo?",
            enunciadoAy = "Don Felipe-nxa pä chajrapat 90 sacos papa apthapiwayi. 1/3 mercado de Puno-n aljawayi, 1/6 escuela comunalaru churawayi ukatxa qhiparirixa kimsa wawanakapar kikpak jaljawayi. ¿Qhawqha sacos sapa wawaxa katuqawayi?",
            alternativas = listOf("15", "20", "10", "30"),
            respuestaCorrecta = 0,
            pista = "1/3 de 90 = 30 (venta). 1/6 de 90 = 15 (escuela). Resto: 90-30-15 = 45. Entre 3 hijos: 45÷3 = 15.",
            pistaAy = "1/3 de 90 = 30. 1/6 de 90 = 15. Qhipariri: 45. Kimsa wawaru: 45 ÷ 3 = 15."
        ),

        // ── LOGRO 3 · Nivel 22 ─────────────────────────────────────────────
        // Problema de varias etapas: fracción del total, venta con descuento por kilo
        Pregunta(
            id = 58,
            competenciaId = 1,
            nivel = 22,
            enunciado = "En la feria de Azángaro, la señora Rosalía llevó 40 kg de habas para vender a S/ 3.50 el kilo. " +
                    "Logró vender 3/4 de lo que llevó y, por el resto, le ofrecieron comprarlo todo " +
                    "con un descuento de S/ 1.00 por kilo. " +
                    "¿Cuánto dinero ganó en total con la venta de todas las habas?",
            enunciadoAy = "Azángaro markan ferianxa, señora Rosalía-nxa 40 kg habas aljañataki apawayi, S/ 3.50 sapa kilo. 3/4 apawayki uk aljawayi ukatxa qhiparirixa taqpach alasiñ muniñampi S/ 1.00 descuento sapa kilo mayipxäna. ¿Qhawqha qullqi taqpach jikxatasiwayi?",
            alternativas = listOf("S/ 130.00", "S/ 140.00", "S/ 125.00", "S/ 135.00"),
            respuestaCorrecta = 0,
            pista = "3/4 de 40 = 30 kg a S/3.50 = S/105. Resto: 10 kg a S/2.50 = S/25. Total: 105 + 25 = S/130.",
            pistaAy = "3/4 de 40 = 30 kg a S/3.50 = S/105. Qhipariri: 10 kg a S/2.50 = S/25. Total: 105 + 25 = S/130."
        ),

        // ── LOGRO 3 · Nivel 23 ─────────────────────────────────────────────
        // Problema de varias etapas: dos fracciones sucesivas y un gasto adicional
        Pregunta(
            id = 59,
            competenciaId = 1,
            nivel = 23,
            enunciado = "La familia Mamani recibió S/ 420 por la venta de su cosecha de quinua. " +
                    "Destinaron 2/7 del dinero a comprar herramientas, 1/4 del resto a semillas para la próxima siembra " +
                    "y guardaron el resto como ahorro. " +
                    "Si además gastaron S/ 15.50 en transporte (tomado del ahorro), " +
                    "¿cuánto dinero les queda finalmente como ahorro?",
            enunciadoAy = "Familia Mamani-nxa quinua cosechapa aljasina S/ 420 katuqawayi. 2/7 qullqit herramientas alasina apnaqapxäna, qhipariritxa 1/4 jatha alasina apnaqapxäna ukatxa mayni qhiparirixa ahorro-ru imapxäna. Ukhamarus S/ 15.50 transporte-n gastapxäna. ¿Qhawqha qullqi ahorro-ruxa qhiparxi?",
            alternativas = listOf("S/ 209.50", "S/ 225.00", "S/ 195.00", "S/ 214.50"),
            respuestaCorrecta = 0,
            pista = "2/7 de 420 = 120 (herramientas). Resta 300. 1/4 de 300 = 75 (semillas). Ahorro: 300-75 = 225. Menos transporte: 225-15.50 = S/209.50.",
            pistaAy = "2/7 de 420 = 120. Qhipari 300. 1/4 de 300 = 75. Ahorro: 225. Menos transporte: 209.50."
        ),

        // ── LOGRO 3 · Nivel 24 ─────────────────────────────────────────────
        // Problema integrador: dos ventas, tres fracciones del total y reparto final
        Pregunta(
            id = 60,
            competenciaId = 1,
            nivel = 24,
            enunciado = "La comunidad de Capachica organizó una feria. " +
                    "La familia Huanca vendió 24 kg de trucha a S/ 8 el kilo " +
                    "y la familia Quispe vendió 18 kg de queso a S/ 12 el kilo. " +
                    "Acordaron juntar todo el dinero y repartirlo así: 1/2 para gastos comunes, " +
                    "1/4 para la escuela y el resto en partes iguales entre las 2 familias. " +
                    "¿Cuánto dinero recibió cada familia en la repartición final?",
            enunciadoAy = "Capachica comunidadanxa mä feria wakichapxäna. Familia Huanca-nxa 24 kg trucha S/ 8 sapa kilo aljawayi ukatxa familia Quispe-nxa 18 kg queso S/ 12 sapa kilo aljarakiwayi. Taqpach qullqi mayacht’asina akham jaljañ amtapxäna: 1/2 gastos comunes-ru, 1/4 escuela-ru ukatxa qhiparirixa pä familianakaru kikpak. ¿Qhawqha qullqi sapa familiaxa katuqawayi?",
            alternativas = listOf("S/ 51", "S/ 102", "S/ 204", "S/ 76"),
            respuestaCorrecta = 0,
            pista = "Trucha: 24×8 = 192. Queso: 18×12 = 216. Total: 408. 1/2 = 204 (gastos). 1/4 = 102 (escuela). Resto: 102 ÷ 2 = S/51 cada familia.",
            pistaAy = "Trucha: 24×8 = 192. Queso: 18×12 = 216. Total: 408. 1/2 = 204. 1/4 = 102. Qhipariri: 102 ÷ 2 = S/51 sapa familia."
        )
    )

    private val preguntasCompetencia2 = listOf(
        Pregunta(
            id = 13,
            competenciaId = 2,
            nivel = 1,
            enunciado = "¿Cuál es el siguiente número en la secuencia?\n2, 4, 6, 8, ...",
            enunciadoAy = "¿Kawkïri jutiñ numerowa secuencia-nxa?\n2, 4, 6, 8, ...",
            alternativas = listOf("10", "9", "12", "11"),
            respuestaCorrecta = 0,
            pista = "El patrón suma 2 cada vez: 2, 4, 6, 8... el siguiente es 10.",
            pistaAy = "Patrón ukaxa sapa kuti 2 yapxati: 2, 4, 6, 8... jutiñ numeroxa 10 satawa."
        ),
        Pregunta(
            id = 14,
            competenciaId = 2,
            nivel = 2,
            enunciado = "¿Cuál es el siguiente número en la secuencia?\n5, 10, 15, 20, ...",
            enunciadoAy = "¿Kawkïri jutiñ numerowa secuencia-nxa?\n5, 10, 15, 20, ...",
            alternativas = listOf("25", "22", "30", "24"),
            respuestaCorrecta = 0,
            pista = "El patrón suma 5 cada vez: 5, 10, 15, 20... el siguiente es 25.",
            pistaAy = "Patrón ukaxa sapa kuti 5 yapxati: 5, 10, 15, 20... jutiñ numeroxa 25 satawa."
        ),
        Pregunta(
            id = 15,
            competenciaId = 2,
            nivel = 3,
            enunciado = "Completa la igualdad:\n5 + ? = 12",
            enunciadoAy = "Igualdad phuqhachaña:\n5 + ? = 12",
            alternativas = listOf("7", "6", "8", "5"),
            respuestaCorrecta = 0,
            pista = "5 + ? = 12. Despeja: ? = 12 - 5 = 7.",
            pistaAy = "5 + ? = 12. Despeja: ? = 12 - 5 = 7."
        ),
        Pregunta(
            id = 16,
            competenciaId = 2,
            nivel = 4,
            enunciado = "¿Cuál es el patrón en la secuencia?\n3, 6, 9, 12, 15, ...",
            enunciadoAy = "¿Kuna patrón ukawa secuencia-nxa?\n3, 6, 9, 12, 15, ...",
            alternativas = listOf("Se suma 3", "Se suma 6", "Se multiplica por 2", "Se suma 4"),
            respuestaCorrecta = 0,
            pista = "De 3 a 6 hay +3, de 6 a 9 hay +3, de 9 a 12 hay +3. El patrón es sumar 3.",
            pistaAy = "3 ukhat 6 ukharuxa +3, 6 ukhat 9 ukharuxa +3, 9 ukhat 12 ukharuxa +3. Patrón ukaxa 3 yapxatañawa."
        ),
        Pregunta(
            id = 17,
            competenciaId = 2,
            nivel = 5,
            enunciado = "Completa la igualdad:\n? - 8 = 15",
            enunciadoAy = "Igualdad phuqhachaña:\n? - 8 = 15",
            alternativas = listOf("23", "7", "20", "25"),
            respuestaCorrecta = 0,
            pista = "? - 8 = 15. Despeja: ? = 15 + 8 = 23.",
            pistaAy = "? - 8 = 15. Despeja: ? = 15 + 8 = 23."
        ),
        Pregunta(
            id = 18,
            competenciaId = 2,
            nivel = 6,
            enunciado = "Si x + 4 = 13, ¿cuánto vale x?",
            enunciadoAy = "Xani x + 4 = 13 ukhaxa, ¿qhawqharakiwa x vale?",
            alternativas = listOf("9", "17", "8", "10"),
            respuestaCorrecta = 0,
            pista = "x + 4 = 13. Despeja: x = 13 - 4 = 9.",
            pistaAy = "x + 4 = 13. Despeja: x = 13 - 4 = 9."
        ),
        Pregunta(
            id = 19,
            competenciaId = 2,
            nivel = 7,
            enunciado = "Una pastora tiene ovejas. El lunes tenía 5, el martes 10, el miércoles 15. Si sigue el mismo patrón, ¿cuántas tendrá el viernes?",
            enunciadoAy = "Mä awatir warmixa ovejanakaniwa. Lunis urunxa 5 ovejanakanïnwa, martis urunxa 10, mirkulis urunxa 15. Patrón ukaxa sarantaskchi ukhaxa, ¿qhawqha ovejanakanisa wirnis urunxa?",
            alternativas = listOf("25", "20", "30", "35"),
            respuestaCorrecta = 0,
            pista = "Patrón: +5 cada día. Lun=5, Mar=10, Mié=15, Jue=20, Vie=25.",
            pistaAy = "Patrón: +5 sapa uru. Lun=5, Mar=10, Mié=15, Jue=20, Vie=25."
        ),
        Pregunta(
            id = 20,
            competenciaId = 2,
            nivel = 8,
            enunciado = "Si 2 × n = 16, ¿cuánto vale n?",
            enunciadoAy = "Xani 2 × n = 16 ukhaxa, ¿qhawqharakiwa n vale?",
            alternativas = listOf("8", "14", "32", "6"),
            respuestaCorrecta = 0,
            pista = "2 × n = 16. Despeja: n = 16 ÷ 2 = 8.",
            pistaAy = "2 × n = 16. Despeja: n = 16 ÷ 2 = 8."
        ),
        Pregunta(
            id = 21,
            competenciaId = 2,
            nivel = 9,
            enunciado = "Un agricultor planta papas en filas. En la primera fila planta 4, en la segunda 8, en la tercera 12. ¿Cuántas plantará en la quinta fila?",
            enunciadoAy = "Mä yapuchirixa papanaka filanakan sataski. Nayrïr filanxa 4 sataski, payïr filanxa 8, kimsïr filanxa 12. ¿Qhawqha papanaka phisqïr filan satani?",
            alternativas = listOf("20", "16", "24", "18"),
            respuestaCorrecta = 0,
            pista = "Patrón: +4 cada fila. Fila 1=4, 2=8, 3=12, 4=16, 5=20.",
            pistaAy = "Patrón: +4 sapa fila. Fila 1=4, 2=8, 3=12, 4=16, 5=20."
        ),
        Pregunta(
            id = 22,
            competenciaId = 2,
            nivel = 10,
            enunciado = "¿Cuál es el siguiente número en la secuencia?\n2, 4, 8, 16, ...",
            enunciadoAy = "¿Kawkïri jutiñ numerowa secuencia-nxa?\n2, 4, 8, 16, ...",
            alternativas = listOf("32", "24", "20", "18"),
            respuestaCorrecta = 0,
            pista = "Cada número se multiplica por 2: 2, 4, 8, 16... siguiente: 16 × 2 = 32.",
            pistaAy = "Sapa numeroxa 2 ukampiwa multiplicasi: 2, 4, 8, 16... jutiñ numeroxa 16 × 2 = 32."
        ),
        Pregunta(
            id = 23,
            competenciaId = 2,
            nivel = 11,
            enunciado = "En la feria, doña María vende quesos. El lunes vendió 6, el martes 12, el miércoles 18. Si el patrón sigue, ¿cuántos venderá el sábado?",
            enunciadoAy = "Ferianxa, doña María-xa quesonaka alji. Lunis urunxa 6 aljawayi, martis urunxa 12, mirkulis urunxa 18. Patrón ukaxa sarantaskchi ukhaxa, ¿qhawqha aljani sabadu urunxa?",
            alternativas = listOf("36", "30", "42", "24"),
            respuestaCorrecta = 0,
            pista = "Patrón: +6 cada día. Lun=6, Mar=12, Mié=18, Jue=24, Vie=30, Sáb=36.",
            pistaAy = "Patrón: +6 sapa uru. Lun=6, Mar=12, Mié=18, Jue=24, Vie=30, Sáb=36."
        ),
        Pregunta(
            id = 24,
            competenciaId = 2,
            nivel = 12,
            enunciado = "Don Pedro ahorra cada semana el doble de la anterior. Si la primera semana ahorró S/5 y la segunda S/10, ¿cuánto ahorrará la cuarta semana?",
            enunciadoAy = "Don Pedro-xa sapa semanan nayrïr semanata sipansa pä kuti juk’ampi imaqi. Nayrïr semananxa S/5 imawaychi ukat payïr semananxa S/10, ¿qhawqha imani pusïr semananxa?",
            alternativas = listOf("S/40", "S/20", "S/30", "S/25"),
            respuestaCorrecta = 0,
            pista = "Se duplica cada semana: 5, 10, 20, 40. La cuarta semana ahorra S/40.",
            pistaAy = "Sapa semanan pä kuti jilxati: 5, 10, 20, 40. Pusïr semananxa S/40 imani."
        ),

        // ════════════════════════════════════════════════════════════════
        // NIVELES 13-24 · Segunda vuelta (mayor dificultad progresiva)
        // ════════════════════════════════════════════════════════════════

        // ── LOGRO 1 · Nivel 13 ─────────────────────────────────────────────
        // Patrón con dos variables (tabla de valores), relación de multiplicación
        Pregunta(
            id = 61,
            competenciaId = 2,
            nivel = 13,
            enunciado = "Observa la tabla que relaciona la cantidad de ovejas (x) con el número de patas (y):\n" +
                    "x: 1, 2, 3, 4\ny: 4, 8, 12, ?\n¿Cuál es el valor que falta?",
            enunciadoAy = "Ovejanakan cantidadapa (x) ukhamaraki kayunakapana numeropa (y) uñt’ayiri tabla uñakipt’ma:\nx: 1, 2, 3, 4\ny: 4, 8, 12, ?\n¿Kawkïri valorasa faltaski?",
            alternativas = listOf("16", "14", "20", "18"),
            respuestaCorrecta = 0,
            pista = "Cada oveja tiene 4 patas. y = 4 × x. Para x=4: y = 4 × 4 = 16.",
            pistaAy = "Sapa ovejaxa 4 kayuniwa. y = 4 × x. Xani x=4 ukhaxa: y = 4 × 4 = 16."
        ),

        // ── LOGRO 1 · Nivel 14 ─────────────────────────────────────────────
        // Patrón con dos variables: relación y = 2x + 3
        Pregunta(
            id = 62,
            competenciaId = 2,
            nivel = 14,
            enunciado = "Observa la tabla que relaciona el número de semanas (x) con el total de corderos en el rebaño (y), " +
                    "sabiendo que el rebaño ya tenía algunos corderos antes de iniciar el conteo:\n" +
                    "x: 1, 2, 3, 4\ny: 5, 7, 9, ?\n¿Cuál es el valor que falta?",
            enunciadoAy = "Semananakana numeropa (x) ukhamaraki rebaño-n corderonakapana taqpacha cantidadapa (y) uñt’ayiri tabla uñakipt’ma. Rebaño-nxa conteo qalltañat nayraqata yaqha corderonakax utjarakïnwa:\nx: 1, 2, 3, 4\ny: 5, 7, 9, ?\n¿Kawkïri valorasa faltaski?",
            alternativas = listOf("11", "10", "13", "12"),
            respuestaCorrecta = 0,
            pista = "De 5 a 7 hay +2, de 7 a 9 hay +2. Patrón: +2. Para x=4: 9 + 2 = 11.",
            pistaAy = "5 ukhat 7 ukharuxa +2, 7 ukhat 9 ukharuxa +2. Patrón: +2. Xani x=4 ukhaxa: 9 + 2 = 11."
        ),

        // ── LOGRO 1 · Nivel 15 ─────────────────────────────────────────────
        // Identificar la regla que relaciona x con y (generalización)
        Pregunta(
            id = 63,
            competenciaId = 2,
            nivel = 15,
            enunciado = "Observa la tabla:\nx: 1, 2, 3, 4\ny: 3, 6, 9, 12\n" +
                    "¿Cuál es la regla que relaciona x con y?",
            enunciadoAy = "Tabla uñakipt’ma:\nx: 1, 2, 3, 4\ny: 3, 6, 9, 12\n¿Kuna regla ukawa x ukampi y ukampi mayachaski?",
            alternativas = listOf("y = 3 × x", "y = x + 3", "y = 2 × x", "y = x × x"),
            respuestaCorrecta = 0,
            pista = "x=1→y=3, x=2→y=6, x=3→y=9. Cada y es 3 veces x. Regla: y = 3 × x.",
            pistaAy = "x=1→y=3, x=2→y=6, x=3→y=9. Sapa y ukaxa x ukat 3 kutiwa. Regla: y = 3 × x."
        ),

        // ── LOGRO 1 · Nivel 16 ─────────────────────────────────────────────
        // Generalizar el patrón hasta un término lejano (y = 4x + 1)
        Pregunta(
            id = 64,
            competenciaId = 2,
            nivel = 16,
            enunciado = "En un sembrío en hileras, el número de plantas de papa en cada hilera sigue esta tabla:\n" +
                    "Hilera (x): 1, 2, 3, 4\nPlantas (y): 5, 9, 13, 17\n" +
                    "Si el patrón continúa, ¿cuántas plantas de papa habrá en la hilera 8?",
            enunciadoAy = "Mä yapu filanakan satatawa. Papa alinakan numeropaxa sapa filanxa aka tabla arktaski:\nHilera (x): 1, 2, 3, 4\nPlantas (y): 5, 9, 13, 17\nPatrón ukaxa sarantaskchi ukhaxa, ¿qhawqha papa alinakas 8 hilera-n utjani?",
            alternativas = listOf("33", "29", "37", "32"),
            respuestaCorrecta = 0,
            pista = "Patrón: +4 cada hilera. Regla: y = 4x + 1. Para x=8: 4×8+1 = 33.",
            pistaAy = "Patrón: +4 sapa hilera. Regla: y = 4x + 1. Xani x=8 ukhaxa: 4×8+1 = 33."
        ),

        // ── LOGRO 1 · Nivel 17 ─────────────────────────────────────────────
        // Usar el patrón en sentido inverso: hallar x dado y
        Pregunta(
            id = 65,
            competenciaId = 2,
            nivel = 17,
            enunciado = "La tabla relaciona el número de canastas de fruta (x) con el costo total en soles (y):\n" +
                    "x: 2, 3, 5\ny: 16, 24, 40\n" +
                    "Siguiendo el mismo patrón, ¿cuántas canastas se pueden comprar con S/ 64?",
            enunciadoAy = "Tabla ukaxa fruta canastanakan numeropa (x) ukhamaraki soles-n taqpacha chanipa (y) uñt’ayi:\nx: 2, 3, 5\ny: 16, 24, 40\nPatrón ukarjama, ¿qhawqha canastanakas S/64 ukamp alasispaxa?",
            alternativas = listOf("8", "9", "7", "6"),
            respuestaCorrecta = 0,
            pista = "y = 8x. Si y = 64, entonces x = 64 ÷ 8 = 8 canastas.",
            pistaAy = "y = 8x. Xani y = 64 ukhaxa, x = 64 ÷ 8 = 8 canastas."
        ),

        // ── LOGRO 1 · Nivel 18 ─────────────────────────────────────────────
        // Patrón no lineal (cuadrático): mayor exigencia de generalización
        Pregunta(
            id = 66,
            competenciaId = 2,
            nivel = 18,
            enunciado = "Observa la tabla que relaciona los años (x) con la cantidad de árboles sembrados por la comunidad (y):\n" +
                    "x: 1, 2, 3, 4\ny: 1, 4, 9, 16\n" +
                    "¿Cuántos árboles se habrán sembrado en el año 6, si el patrón continúa?",
            enunciadoAy = "Maranakan numeropa (x) ukhamaraki comunidadan satata quqanakana cantidadapa (y) uñt’ayiri tabla uñakipt’ma:\nx: 1, 2, 3, 4\ny: 1, 4, 9, 16\n¿Qhawqha quqanakasa mara 6-n satatäxani, patrón ukaxa sarantaskchi ukhaxa?",
            alternativas = listOf("36", "30", "25", "42"),
            respuestaCorrecta = 0,
            pista = "El patrón es y = x². Para x=6: y = 6² = 36 árboles.",
            pistaAy = "Patrón ukaxa y = x² satawa. Xani x=6 ukhaxa: y = 6² = 36 quqanaka."
        ),

        // ── LOGRO 2 · Nivel 19 ─────────────────────────────────────────────
        // Ecuación de dos pasos
        Pregunta(
            id = 67,
            competenciaId = 2,
            nivel = 19,
            enunciado = "Si 3x + 5 = 20, ¿cuánto vale x?",
            enunciadoAy = "Xani 3x + 5 = 20 ukhaxa, ¿qhawqharakiwa x vale?",
            alternativas = listOf("5", "6", "4", "7"),
            respuestaCorrecta = 0,
            pista = "3x + 5 = 20. Resta 5: 3x = 15. Divide entre 3: x = 5.",
            pistaAy = "3x + 5 = 20. 5 apaqaña: 3x = 15. 3 ukamp jaljaña: x = 5."
        ),

        // ── LOGRO 2 · Nivel 20 ─────────────────────────────────────────────
        // Ecuación con paréntesis
        Pregunta(
            id = 68,
            competenciaId = 2,
            nivel = 20,
            enunciado = "Si 2 × (x + 3) = 16, ¿cuánto vale x?",
            enunciadoAy = "Xani 2 × (x + 3) = 16 ukhaxa, ¿qhawqharakiwa x vale?",
            alternativas = listOf("5", "8", "3", "10"),
            respuestaCorrecta = 0,
            pista = "2(x+3) = 16. Divide entre 2: x+3 = 8. Resta 3: x = 5.",
            pistaAy = "2(x+3) = 16. 2 ukamp jaljaña: x+3 = 8. 3 apaqaña: x = 5."
        ),

        // ── LOGRO 2 · Nivel 21 ─────────────────────────────────────────────
        // Traducir un problema a una ecuación y resolverla
        Pregunta(
            id = 69,
            competenciaId = 2,
            nivel = 21,
            enunciado = "Doña Marcelina tiene cierta cantidad de ovejas. " +
                    "Si triplica esa cantidad y luego le agrega 4, obtiene 31 ovejas. " +
                    "¿Cuántas ovejas tenía al inicio?",
            enunciadoAy = "Doña Marcelina-nxa mä cantidad ovejanakawa utji. Uka cantidad kimsa kuti jach’anchasina ukat 4 yapxatasina 31 ovejanakaruwa puri. ¿Qhawqha ovejanakanïnsa qalltanxa?",
            alternativas = listOf("9", "10", "8", "11"),
            respuestaCorrecta = 0,
            pista = "3x + 4 = 31. Resta 4: 3x = 27. Divide entre 3: x = 9.",
            pistaAy = "3x + 4 = 31. 4 apaqaña: 3x = 27. 3 ukamp jaljaña: x = 9."
        ),

        // ── LOGRO 2 · Nivel 22 ─────────────────────────────────────────────
        // Comunicar con propiedad una expresión algebraica
        Pregunta(
            id = 70,
            competenciaId = 2,
            nivel = 22,
            enunciado = "Un comerciante compra x sacos de papa a S/ 15 cada uno y paga además S/ 10 de flete. " +
                    "¿Qué expresión representa el costo total?",
            enunciadoAy = "Mä aljirixa x sacos papa S/15 sapa mayni alasi ukatxa S/10 flete pagarakiraki. ¿Kuna expresión ukawa taqpacha costo uñacht’ayi?",
            alternativas = listOf("15x + 10", "15 + 10x", "10x + 15x", "x(15 + 10)"),
            respuestaCorrecta = 0,
            pista = "Costo = precio por saco × cantidad + flete = 15x + 10.",
            pistaAy = "Costo = precio por saco × cantidad + flete = 15x + 10."
        ),

        // ── LOGRO 2 · Nivel 23 ─────────────────────────────────────────────
        // Ecuación con coeficiente fraccionario
        Pregunta(
            id = 71,
            competenciaId = 2,
            nivel = 23,
            enunciado = "Si x/4 + 6 = 11, ¿cuánto vale x?",
            enunciadoAy = "Xani x/4 + 6 = 11 ukhaxa, ¿qhawqharakiwa x vale?",
            alternativas = listOf("20", "5", "44", "9"),
            respuestaCorrecta = 0,
            pista = "x/4 + 6 = 11. Resta 6: x/4 = 5. Multiplica por 4: x = 20.",
            pistaAy = "x/4 + 6 = 11. 6 apaqaña: x/4 = 5. 4 ukamp multiplicaña: x = 20."
        ),

        // ── LOGRO 2 · Nivel 24 ─────────────────────────────────────────────
        // Plantear y resolver una ecuación a partir de una relación entre dos cantidades
        Pregunta(
            id = 72,
            competenciaId = 2,
            nivel = 24,
            enunciado = "Una pastora tiene ovejas y llamas. " +
                    "El número de llamas es igual a la mitad del número de ovejas, menos 2. " +
                    "Si tiene 10 llamas, ¿cuántas ovejas tiene?",
            enunciadoAy = "Mä awatir warmixa ovejanakani ukhamarak llamanakaniwa. Llamanakan numeropaxa ovejanakan chikatañapawa, ukat 2 apaqatarakiwa. Xani 10 llamanakanïchi ukhaxa, ¿qhawqha ovejanakanisa?",
            alternativas = listOf("24", "20", "22", "26"),
            respuestaCorrecta = 0,
            pista = "Llamas = ovejas/2 - 2. Si llamas = 10: 10 = ovejas/2 - 2. Entonces ovejas/2 = 12, ovejas = 24.",
            pistaAy = "Llamas = ovejas/2 - 2. Xani llamas = 10 ukhaxa: 10 = ovejas/2 - 2. Ukhamasti ovejas/2 = 12, ovejas = 24."
        )
    )

    private val preguntasCompetencia3 = listOf(
        Pregunta(
            id = 25,
            competenciaId = 3,
            nivel = 1,
            enunciado = "¿Cuántos lados tiene un rectángulo?",
            enunciadoAy = "¿Qhawqha ladonisa mä rectángulo ukaxa?",
            alternativas = listOf("4", "3", "5", "6"),
            respuestaCorrecta = 0,
            pista = "Un rectángulo tiene 4 lados: 2 largos y 2 anchos.",
            pistaAy = "Mä rectángulo ukaxa 4 ladonïnawa: 2 jach’anaka ukatxa 2 qhiphankirinaka."
        ),
        Pregunta(
            id = 26,
            competenciaId = 3,
            nivel = 2,
            enunciado = "El mantel de don Juan tiene forma rectangular. Observa la imagen. ¿Cuál es su perímetro?",
            enunciadoAy = "Tata Juanan mantelanakapaxa rectangular uñtaniwa. Uñxatt’ma uka jamuqata. ¿Qhawqhasa perímetro ukaxa?",
            imagen = R.drawable.c3_nivel2,
            alternativas = listOf("30 m", "50 m", "15 m", "20 m"),
            respuestaCorrecta = 0,
            pista = "Perímetro = 2 × (largo + ancho) = 2 × (10 + 5) = 30 m.",
            pistaAy = "Perímetro = 2 × (largo + ancho) = 2 × (10 + 5) = 30 m."
        ),
        Pregunta(
            id = 27,
            competenciaId = 3,
            nivel = 3,
            enunciado = "Observa el techo. Si sus 3 lados miden lo mismo, ¿qué tipo de triángulo es?",
            enunciadoAy = "Uñxatt’ma uta pataru. Kunapachatixa 3 ladonakapaxa kikpaki tupuñani ukhaxa, ¿kuna kasta triángulo ukasa?",
            imagen = R.drawable.c3_nivel3,
            alternativas = listOf("Equilátero", "Isósceles", "Escaleno", "Rectángulo"),
            respuestaCorrecta = 0,
            pista = "Si los 3 lados miden lo mismo (6 cm cada uno), es un triángulo equilátero.",
            pistaAy = "Kunapachatixa 3 ladonakapaxa kikpaki tupuñani (6 cm sapa mayni), ukaxa triángulo equilátero satawa."
        ),
        Pregunta(
            id = 28,
            competenciaId = 3,
            nivel = 4,
            enunciado = "Un terreno rectangular mide 8 metros de largo y 4 metros de ancho. ¿Cuál es su área?",
            enunciadoAy = "Mä rectangular uraqixa 8 metros largo ukatxa 4 metros ancho ukaniwa. ¿Qhawqhasa área ukaxa?",
            alternativas = listOf("32 m²", "24 m²", "12 m²", "16 m²"),
            respuestaCorrecta = 0,
            pista = "Área = largo × ancho = 8 × 4 = 32 m².",
            pistaAy = "Área = largo × ancho = 8 × 4 = 32 m²."
        ),
        Pregunta(
            id = 29,
            competenciaId = 3,
            nivel = 5,
            enunciado = "Observa la imagen. ¿Cómo se llama este tipo de ángulo que forma el suelo con la cebada?",
            enunciadoAy = "Uñxatt’ma uka jamuqata. ¿Kunjamsa sata uka kasta ángulo ukaxa, uraqimpi cebadampi lurata?",
            imagen = R.drawable.c3_nivel5,
            alternativas = listOf("Ángulo recto", "Ángulo agudo", "Ángulo obtuso", "Ángulo llano"),
            respuestaCorrecta = 0,
            pista = "Un ángulo de 90° se llama ángulo recto. Forma una L perfecta.",
            pistaAy = "Mä ángulo de 90° ukaxa ángulo recto satawa. Mä L chiqapa uñtatawa."
        ),
        Pregunta(
            id = 30,
            competenciaId = 3,
            nivel = 6,
            enunciado = "Observa la luna. Si el radio mide 7 cm, ¿cuánto mide el diámetro?",
            enunciadoAy = "Uñxatt’ma phaxsiraru. Radio ukaxa 7 cm ukhamawa, ¿qhawqhasa diámetro ukaxa?",
            imagen = R.drawable.c3_nivel6,
            alternativas = listOf("14 cm", "7 cm", "21 cm", "3.5 cm"),
            respuestaCorrecta = 0,
            pista = "Diámetro = 2 × radio = 2 × 7 = 14 cm.",
            pistaAy = "Diámetro = 2 × radio = 2 × 7 = 14 cm."
        ),
        Pregunta(
            id = 31,
            competenciaId = 3,
            nivel = 7,
            enunciado = "Observa las dos andenes. ¿Cómo se llaman las rectas que forman y que nunca se cruzan?",
            enunciadoAy = "Uñxatt’ma paya andenenakaru. ¿Kunjamsa sutichapxi uka chiqanakaru, jupanakaxa lurapxi ukatxa janipuniwa jikisipkiti?",
            imagen = R.drawable.c3_nivel7,
            alternativas = listOf("Paralelas", "Perpendiculares", "Secantes", "Oblicuas"),
            respuestaCorrecta = 0,
            pista = "Las rectas que nunca se cruzan se llaman rectas paralelas.",
            pistaAy = "Uka chiqanakaxa janipuniwa jikisipkiti, ukaxa rectas paralelas satawa."
        ),
        Pregunta(
            id = 32,
            competenciaId = 3,
            nivel = 8,
            enunciado = "Un triángulo tiene lados de 5 cm, 7 cm y 10 cm. ¿Cuál es su perímetro?",
            enunciadoAy = "Mä triángulo ukaxa 5 cm, 7 cm ukatxa 10 cm ladonakaniwa. ¿Qhawqhasa perímetro ukaxa?",
            alternativas = listOf("22 cm", "20 cm", "35 cm", "12 cm"),
            respuestaCorrecta = 0,
            pista = "Perímetro = suma de todos los lados = 5 + 7 + 10 = 22 cm.",
            pistaAy = "Perímetro = taqpacha ladonaka yapthapiña = 5 + 7 + 10 = 22 cm."
        ),
        Pregunta(
            id = 33,
            competenciaId = 3,
            nivel = 9,
            enunciado = "Observa la imagen. Si la chacra de don Juan se amplía al doble, ¿cuánto medirá el lado que falta?",
            enunciadoAy = "Uñxatt’ma uka jamuqata. Tata Juanan chacrapaxa pä kuti jach’aptaspa ukhaxa, ¿qhawqhasa faltki uka lado ukaxa?",
            imagen = R.drawable.c3_nivel9,
            alternativas = listOf("4 cm", "3 cm", "6 cm", "8 cm"),
            respuestaCorrecta = 0,
            pista = "Al duplicar, todos los lados se multiplican por 2. El lado de 2 cm pasa a ser 4 cm.",
            pistaAy = "Pä kuti jach’aptayasaxa, taqpacha ladonakaxa 2 ukampi multiplicatawa. 2 cm lado ukaxa 4 cm ukhamäxiwa."
        ),
        Pregunta(
            id = 34,
            competenciaId = 3,
            nivel = 10,
            enunciado = "Un triángulo tiene base de 6 cm y altura de 4 cm. ¿Cuál es su área?\n(Área = base × altura ÷ 2)",
            enunciadoAy = "Mä triángulo ukaxa 6 cm base ukatxa 4 cm altura ukaniwa. ¿Qhawqhasa área ukaxa?\n(Área = base × altura ÷ 2)",
            alternativas = listOf("12 cm²", "24 cm²", "10 cm²", "8 cm²"),
            respuestaCorrecta = 0,
            pista = "Área del triángulo = base × altura ÷ 2 = 6 × 4 ÷ 2 = 12 cm².",
            pistaAy = "Área del triángulo = base × altura ÷ 2 = 6 × 4 ÷ 2 = 12 cm²."
        ),
        Pregunta(
            id = 35,
            competenciaId = 3,
            nivel = 11,
            enunciado = "Observa esta casa. ¿Cuántas figuras geométricas diferentes puedes identificar?",
            enunciadoAy = "Uñxatt’ma aka uta. ¿Qhawqha kunaymana figuras geométricas uñt’asma?",
            imagen = R.drawable.c3_nivel11,
            alternativas = listOf("3", "2", "4", "1"),
            respuestaCorrecta = 0,
            pista = "Observa bien: hay un triángulo, un rectángulo y un círculo. Son 3 figuras.",
            pistaAy = "Suma uñxatt’ma: mä triángulo, mä rectángulo ukatxa mä círculo utji. Taqpachaxa 3 figuras ukhamawa."
        ),
        Pregunta(
            id = 36,
            competenciaId = 3,
            nivel = 12,
            enunciado = "La plaza del pueblo tiene forma cuadrada con lados de 15 metros. ¿Cuántos metros de cerco se necesitan para rodearla y cuál es su área?",
            enunciadoAy = "Marka plaza ukaxa cuadrado uñtaniwa, ladonakapaxa 15 metros ukhamawa. ¿Qhawqha metros cerco ukaxa muyuntañatakixa wakisini ukatxa qhawqhasa área ukaxa?",
            alternativas = listOf("60 m de cerco y 225 m²", "30 m de cerco y 225 m²", "60 m de cerco y 150 m²", "45 m de cerco y 200 m²"),
            respuestaCorrecta = 0,
            pista = "Perímetro = 4 × 15 = 60 m. Área = 15 × 15 = 225 m².",
            pistaAy = "Perímetro = 4 × 15 = 60 m. Área = 15 × 15 = 225 m²."
        ),

        // ════════════════════════════════════════════════════════════════
        // NIVELES 13-24 · Segunda vuelta (mayor dificultad progresiva)
        // ════════════════════════════════════════════════════════════════

        // ── LOGRO 1 · Nivel 13 ─────────────────────────────────────────────
        // Triángulo según lados, dentro de un cuadrilátero "no usual"
        // IMAGEN c3_nivel13: techo a dos aguas dibujado como un trapecio con su
        // diagonal trazada, formando dos triángulos; uno de ellos con sus tres
        // lados visiblemente de diferente longitud (escaleno).
        Pregunta(
            id = 73,
            competenciaId = 3,
            nivel = 13,
            enunciado = "Observa el techo de la casa comunal. La diagonal del techo forma dos triángulos. " +
                    "Si uno de ellos tiene sus tres lados de diferente medida, ¿qué tipo de triángulo es?",
            enunciadoAy = "Uñxatt’ma comunidad utan pataparu. Uka techo diagonal ukaxa pä triángulo lurasi. Maynixa kimsa ladonakapaxa jan kikpaki tupuñani ukhaxa, ¿kuna kasta triángulo ukasa?",
            imagen = R.drawable.c3_nivel13,
            alternativas = listOf("Escaleno", "Equilátero", "Isósceles", "Rectángulo"),
            respuestaCorrecta = 0,
            pista = "Si los tres lados tienen medidas diferentes, el triángulo se clasifica como escaleno.",
            pistaAy = "Kimsa ladonakapaxa kunaymana tupunakanïchi ukhaxa, uka triángulo ukaxa escaleno satawa."
        ),

        // ── LOGRO 1 · Nivel 14 ─────────────────────────────────────────────
        // Triángulo según su ángulo, formando parte de un rombo
        // IMAGEN c3_nivel14: terreno en forma de rombo con su diagonal trazada,
        // formando dos triángulos; marcar con el símbolo de ángulo recto (90°)
        // uno de los ángulos de un triángulo.
        Pregunta(
            id = 74,
            competenciaId = 3,
            nivel = 14,
            enunciado = "Observa el terreno en forma de rombo. Al trazar su diagonal se forman dos triángulos. " +
                    "Si uno de sus ángulos mide 90°, ¿cómo se clasifica ese triángulo según su ángulo?",
            enunciadoAy = "Uñxatt’ma rombo uñtani uraqiru. Diagonalaparu trazasaxa pä triángulo lurasi. Mayni ángulopaxa 90° tupuñani ukhaxa, ¿kuna kasta triángulo ukasa ángulo ukarjamaxa?",
            imagen = R.drawable.c3_nivel14,
            alternativas = listOf("Rectángulo", "Acutángulo", "Obtusángulo", "Equilátero"),
            respuestaCorrecta = 0,
            pista = "Un triángulo con un ángulo de 90° se clasifica como triángulo rectángulo.",
            pistaAy = "Mä ángulo de 90° ukani triángulo ukaxa triángulo rectángulo satawa."
        ),

        // ── LOGRO 1 · Nivel 15 ─────────────────────────────────────────────
        // Identificar triángulos isósceles dentro de un cuadrilátero con ambas diagonales
        // IMAGEN c3_nivel15: terreno trapezoidal con AMBAS diagonales trazadas
        // (4 triángulos en total); usar marcas de igualdad (rayitas) en los lados
        // de modo que exactamente 2 de los 4 triángulos formados sean isósceles.
        Pregunta(
            id = 75,
            competenciaId = 3,
            nivel = 15,
            enunciado = "Observa el terreno trapezoidal de la familia Ccoyo. " +
                    "Las marcas indican lados de igual medida. " +
                    "¿Cuántos triángulos isósceles se forman al trazar ambas diagonales?",
            enunciadoAy = "Uñxatt’ma familia Ccoyon trapezoidal uraqiparu. Uka chimpuanakaxa kikpaki tupuña ladonaka uñacht’ayi. Pä diagonalana trazapaxa, ¿qhawqha triángulos isósceles lurasi?",
            imagen = R.drawable.c3_nivel15,
            alternativas = listOf("2", "1", "3", "4"),
            respuestaCorrecta = 0,
            pista = "Isósceles = tiene dos lados iguales. Busca las marcas de igualdad. Hay 2 triángulos isósceles.",
            pistaAy = "Isósceles = pä ladoniwa kikpa tupuñani. Kikipa tupuña chimpuanakaru thaqham. 2 triángulos isósceles utji."
        ),

        // ── LOGRO 2 · Nivel 16 ─────────────────────────────────────────────
        // Propiedad de lados: polígono regular, hallar la medida de un lado
        Pregunta(
            id = 76,
            competenciaId = 3,
            nivel = 16,
            enunciado = "Un corral tiene forma de hexágono regular (sus 6 lados son iguales). " +
                    "Si su perímetro es 48 metros, ¿cuánto mide cada lado?",
            enunciadoAy = "Mä corral ukaxa hexágono regular uñtaniwa (6 ladonakapaxa taqpachasa kikpakiwa). Perímetro ukaxa 48 metros ukhamawa, ¿qhawqhasa sapa lado ukaxa tupu?",
            alternativas = listOf("8 m", "6 m", "12 m", "9.6 m"),
            respuestaCorrecta = 0,
            pista = "Perímetro = 6 × lado. Si perímetro = 48: lado = 48 ÷ 6 = 8 m.",
            pistaAy = "Perímetro = 6 × lado. Si perímetro = 48: lado = 48 ÷ 6 = 8 m."
        ),

        // ── LOGRO 2 · Nivel 17 ─────────────────────────────────────────────
        // Área de una figura compuesta (rectángulo + triángulo)
        // IMAGEN c3_nivel17: fachada de un depósito en forma de "casa": un
        // rectángulo de 8 m de base por 5 m de altura, con un triángulo de
        // base 8 m y altura 3 m encima (techo a dos aguas). Rotular las medidas.
        Pregunta(
            id = 77,
            competenciaId = 3,
            nivel = 17,
            enunciado = "Observa la figura que representa la fachada de un depósito comunal. " +
                    "Calcula su área total combinando el rectángulo y el triángulo.",
            enunciadoAy = "Uñxatt’ma uka figura ukaxa mä depósito comunal utan fachada uñacht’ayi. Rectángulo ukatxa triángulo mayachasa taqpacha área apsma.",
            imagen = R.drawable.c3_nivel17,
            alternativas = listOf("52 m²", "46 m²", "58 m²", "40 m²"),
            respuestaCorrecta = 0,
            pista = "Rectángulo: 8 × 5 = 40 m². Triángulo: 8 × 3 ÷ 2 = 12 m². Total: 40 + 12 = 52 m².",
            pistaAy = "Rectángulo: 8 × 5 = 40 m². Triángulo: 8 × 3 ÷ 2 = 12 m². Taqpacha: 40 + 12 = 52 m²."
        ),

        // ── LOGRO 2 · Nivel 18 ─────────────────────────────────────────────
        // Propiedad de ángulos: suma de ángulos internos de un polígono
        Pregunta(
            id = 78,
            competenciaId = 3,
            nivel = 18,
            enunciado = "¿Cuánto suman los ángulos internos de un pentágono regular?",
            enunciadoAy = "¿Qhawqhasa mä pentágono regular ukana ángulos internos ukanakan suma yapthapita?",
            alternativas = listOf("540°", "360°", "720°", "450°"),
            respuestaCorrecta = 0,
            pista = "Suma de ángulos internos = (n-2) × 180°. Pentágono: (5-2) × 180 = 3 × 180 = 540°.",
            pistaAy = "Suma de ángulos internos = (n-2) × 180°. Pentágono: (5-2) × 180 = 3 × 180 = 540°."
        ),

        // ── LOGRO 3 · Nivel 19 ─────────────────────────────────────────────
        // Ampliación: hallar la medida que falta usando el factor de escala
        // IMAGEN c3_nivel19: dos terrenos rectangulares semejantes; el pequeño
        // rotulado 4 m de ancho × 6 m de largo, y el ampliado rotulado con
        // 10 m de ancho y el largo como incógnita "?".
        Pregunta(
            id = 79,
            competenciaId = 3,
            nivel = 19,
            enunciado = "Observa los dos terrenos semejantes. El terreno pequeño mide 4 m de ancho y 6 m de largo. " +
                    "El terreno ampliado mantiene la misma proporción y su ancho es 10 m. " +
                    "¿Cuánto mide su largo?",
            enunciadoAy = "Uñxatt’ma pä terrenos semejantes ukaru. Jisk’a terreno ukaxa 4 m ancho ukatxa 6 m largo ukaniwa. Jach’aptayata terreno ukaxa pachpa proporción uñjaskakiwa ukatxa ancho ukaxa 10 m ukhamawa. ¿Qhawqhasa largo ukaxa?",
            imagen = R.drawable.c3_nivel19,
            alternativas = listOf("15 m", "12 m", "20 m", "18 m"),
            respuestaCorrecta = 0,
            pista = "Factor de escala: 10 ÷ 4 = 2.5. Largo ampliado: 6 × 2.5 = 15 m.",
            pistaAy = "Factor de escala: 10 ÷ 4 = 2.5. Largo ampliado: 6 × 2.5 = 15 m."
        ),

        // ── LOGRO 3 · Nivel 20 ─────────────────────────────────────────────
        // Proporcionalidad con escala de un mapa
        Pregunta(
            id = 80,
            competenciaId = 3,
            nivel = 20,
            enunciado = "Un mapa de la comunidad está hecho a escala. Un canal de riego que en la realidad mide 150 metros " +
                    "aparece representado en el mapa con 3 cm. " +
                    "Si otro canal aparece en el mapa con 5 cm, ¿cuánto mide en la realidad?",
            enunciadoAy = "Comunidadan mapa ukaxa escala ukarjama luratawa. Mä riego canal ukaxa chiqapanxa 150 metros ukhamawa, ukatxa mapanxa 3 cm ukham uñacht’ayatawa. Yaqha canal ukaxa mapanxa 5 cm ukham uñacht’ayata ukhaxa, ¿chiqapanxa qhawqhasa tupu?",
            alternativas = listOf("250 m", "200 m", "300 m", "150 m"),
            respuestaCorrecta = 0,
            pista = "Escala: 3 cm = 150 m, entonces 1 cm = 50 m. Para 5 cm: 5 × 50 = 250 m.",
            pistaAy = "Escala: 3 cm = 150 m, ukhamaxa 1 cm = 50 m. 5 cm ukatakixa: 5 × 50 = 250 m."
        ),

        // ── LOGRO 3 · Nivel 21 ─────────────────────────────────────────────
        // Proporcionalidad: hallar el factor de escala y aplicarlo a otro lado
        Pregunta(
            id = 81,
            competenciaId = 3,
            nivel = 21,
            enunciado = "Dos chacras tienen la misma forma, pero diferente tamaño. " +
                    "La primera tiene un lado de 6 m que corresponde a un lado de 15 m en la segunda. " +
                    "Si la primera chacra tiene otro lado de 9 m, " +
                    "¿cuánto mide el lado correspondiente en la segunda chacra?",
            enunciadoAy = "Pä chacranakaxa pachpa forma ukaniwa, ukampisa tamaños ukaxa mayjawa. Nayrïri chacra ukaxa mä lado 6 m ukaniwa, ukaxa payïri chacranxa 15 m lado ukarjama wakisi. Nayrïri chacranxa yaqha lado ukaxa 9 m ukhamawa, ¿payïri chacranxa uka correspondiente lado ukaxa qhawqhasa?",
            alternativas = listOf("22.5 m", "20 m", "18 m", "25 m"),
            respuestaCorrecta = 0,
            pista = "Factor: 15 ÷ 6 = 2.5. Lado correspondiente: 9 × 2.5 = 22.5 m.",
            pistaAy = "Factor: 15 ÷ 6 = 2.5. Lado correspondiente: 9 × 2.5 = 22.5 m."
        ),

        // ── LOGRO 4 · Nivel 22 ─────────────────────────────────────────────
        // Ángulos formados por rectas paralelas cortadas por una transversal
        // IMAGEN c3_nivel22: dos calles paralelas cruzadas por un camino
        // transversal; marcar un ángulo de 70° en una intersección y el
        // ángulo correspondiente "x" en la otra intersección.
        Pregunta(
            id = 82,
            competenciaId = 3,
            nivel = 22,
            enunciado = "Observa el plano del pueblo. Las dos calles son paralelas y están cruzadas por un camino. " +
                    "Si el ángulo marcado mide 70°, ¿cuánto mide el ángulo x, que es su correspondiente en la otra intersección?",
            enunciadoAy = "Uñxatt’ma marka plano ukaru. Pä callenakaxa paralelas ukhamawa ukatxa mä camino ukampiwa cruzata. Uka chimputaxa 70° tupuñani ukhaxa, ¿qhawqhasa ángulo x ukaxa, yaqha intersección ukan correspondiente ukaxa?",
            imagen = R.drawable.c3_nivel22,
            alternativas = listOf("70°", "110°", "20°", "180°"),
            respuestaCorrecta = 0,
            pista = "Ángulos correspondientes entre paralelas son iguales. Si uno mide 70°, el otro también mide 70°.",
            pistaAy = "Ángulos correspondientes entre paralelas ukaxa kikpakiwa. Maynixa 70° ukhamächi ukhaxa, maynixa ukhamarakiwa 70°."
        ),

        // ── LOGRO 4 · Nivel 23 ─────────────────────────────────────────────
        // Circunferencia: cálculo de la longitud (perímetro) usando el radio
        Pregunta(
            id = 83,
            competenciaId = 3,
            nivel = 23,
            enunciado = "La rueda de un carretón tiene un radio de 35 cm. Aproximando π a 22/7, " +
                    "¿cuál es la longitud aproximada de la circunferencia de la rueda? " +
                    "(Longitud = 2 × π × radio)",
            enunciadoAy = "Mä carretón rueda ukaxa 35 cm radio ukaniwa. π ukaru 22/7 ukhamaru jak’achasa, ¿qhawqhasa rueda circunferencia ukana jak’ata longitud ukaxa? (Longitud = 2 × π × radio)",
            alternativas = listOf("220 cm", "110 cm", "154 cm", "440 cm"),
            respuestaCorrecta = 0,
            pista = "Longitud = 2 × π × r = 2 × 22/7 × 35 = 2 × 110 = 220 cm.",
            pistaAy = "Longitud = 2 × π × r = 2 × 22/7 × 35 = 2 × 110 = 220 cm."
        ),

        // ── LOGRO 4 · Nivel 24 ─────────────────────────────────────────────
        // Problema integrador: rectas paralelas, transversales y suma de ángulos internos
        // IMAGEN c3_nivel24: techo de la casa comunal formado por dos vigas que
        // cortan dos andenes paralelos, formando un triángulo visible; marcar
        // dos de sus ángulos internos con 55° y 65°, dejando el tercero como "?".
        Pregunta(
            id = 84,
            competenciaId = 3,
            nivel = 24,
            enunciado = "Observa el techo de la casa comunal, formado por dos vigas que cortan dos andenes paralelos, " +
                    "formando un triángulo. Si dos de sus ángulos internos miden 55° y 65°, " +
                    "¿cuánto mide el tercer ángulo?",
            enunciadoAy = "Uñxatt’ma comunidad utan techo ukaru, pä vigas ukampi luratawa, uka vigas ukaxa pä andenes paralelos ukaruw khuchuraki ukatxa mä triángulo lurasi. Pä ángulos internos ukaxa 55° ukatxa 65° ukhamawa, ¿qhawqhasa kimsïri ángulo ukaxa?",
            imagen = R.drawable.c3_nivel24,
            alternativas = listOf("60°", "70°", "50°", "65°"),
            respuestaCorrecta = 0,
            pista = "La suma de ángulos internos de un triángulo es 180°. 55 + 65 + ? = 180. Entonces ? = 60°.",
            pistaAy = "Mä triángulo ukan ángulos internos ukanakan suma yapthapitapaxa 180° ukhamawa. 55 + 65 + ? = 180. Ukhamaxa ? = 60°."
        )
    )

    private val preguntasCompetencia4 = listOf(
        Pregunta(
            id = 37,
            competenciaId = 4,
            nivel = 1,
            enunciado = "Las edades de 5 niños son: 10, 11, 10, 12, 10. ¿Cuál es la moda?",
            enunciadoAy = "5 wawanakan edades ukaxa akhamawa: 10, 11, 10, 12, 10. ¿Kawkirisa moda ukaxa?",
            alternativas = listOf("10", "11", "12", "43"),
            respuestaCorrecta = 0,
            pista = "La moda es el valor que más se repite. El 10 aparece 3 veces. Moda = 10.",
            pistaAy = "Moda ukaxa juk’ampi kutin kutin uñstiri valorawa. 10 ukaxa 3 kutiwa uñsti. Moda = 10."
        ),
        Pregunta(
            id = 38,
            competenciaId = 4,
            nivel = 2,
            enunciado = "Las notas de María en sus 4 exámenes fueron: 12, 14, 10, 16. ¿Cuál es su promedio (media aritmética)?",
            enunciadoAy = "María kullakan 4 exámenes ukanakan notanakapaxa akhamawa: 12, 14, 10, 16. ¿Kawkirisa promedio (media aritmética) ukaxa?",
            alternativas = listOf("13", "14", "12", "15"),
            respuestaCorrecta = 0,
            pista = "Promedio = suma ÷ cantidad = (12+14+10+16) ÷ 4 = 52 ÷ 4 = 13.",
            pistaAy = "Promedio = suma ÷ cantidad = (12+14+10+16) ÷ 4 = 52 ÷ 4 = 13."
        ),
        Pregunta(
            id = 39,
            competenciaId = 4,
            nivel = 3,
            enunciado = "Observa el gráfico de barras. ¿Cuántos animales más tiene la granja de gallinas que de llamas?",
            enunciadoAy = "Uñxatt’ma gráfico de barras ukaru. ¿Qhawqha uywanakampisa gallinas ukaxa llamas ukat sipansa juk’ampi utji?",
            imagen = R.drawable.c4_nivel3_barras_animales,
            alternativas = listOf("7", "5", "4", "8"),
            respuestaCorrecta = 0,
            pista = "Gallinas = 12, Llamas = 5. Diferencia: 12 - 5 = 7.",
            pistaAy = "Gallinas = 12, Llamas = 5. Diferencia: 12 - 5 = 7."
        ),
        Pregunta(
            id = 40,
            competenciaId = 4,
            nivel = 4,
            enunciado = "En la feria, doña Rosa vendió estos productos: papa, queso, papa, chuño, papa, queso, papa. ¿Cuál es el producto que más se vendió (moda)?",
            enunciadoAy = "Feria ukanxa doña Rosa warmixa aka yänaka aljasi: papa, queso, papa, chuño, papa, queso, papa. ¿Kawkiri yäsa juk’ampi aljata (moda)?",
            alternativas = listOf("Papa", "Queso", "Chuño", "Todos igual"),
            respuestaCorrecta = 0,
            pista = "Cuenta cada producto: papa aparece 4 veces, queso 2, chuño 1. Moda = Papa.",
            pistaAy = "Sapa yä qhawqha kutisa uñsti ukaru jakhuñamawa: papa ukaxa 4 kutiwa, queso 2 kutiwa, chuño 1 kutiwa. Moda = Papa."
        ),
        Pregunta(
            id = 41,
            competenciaId = 4,
            nivel = 5,
            enunciado = "Observa el gráfico. ¿En qué mes se cosecharon más sacos de papa?",
            enunciadoAy = "Uñxatt’ma gráfico ukaru. ¿Kuna phaxsinwa juk’ampi saco papa apthapipxäna?",
            imagen = R.drawable.c4_nivel5_barras_cosecha,
            alternativas = listOf("Abril", "Marzo", "Mayo", "Junio"),
            respuestaCorrecta = 0,
            pista = "Observa la barra más alta del gráfico. Abril tiene 35 sacos, la mayor cantidad.",
            pistaAy = "Gráfico ukan barra juk’ampi jach’a uñxatt’ma. Abril phaxsinxa 35 sacos ukawa, ukaxa juk’ampi waljawa."
        ),
        Pregunta(
            id = 42,
            competenciaId = 4,
            nivel = 6,
            enunciado = "Don Pedro cosechó estas cantidades de papa en 5 días: 8, 12, 6, 10, 14. ¿Cuál es el promedio diario de sacos cosechados?",
            enunciadoAy = "Don Pedro tataxa 5 urunakan aka cantidad papa apthapi: 8, 12, 6, 10, 14. ¿Sapa uru apthapita saconakan promedio ukaxa qhawqhasa?",
            alternativas = listOf("10", "12", "8", "14"),
            respuestaCorrecta = 0,
            pista = "Promedio = (8+12+6+10+14) ÷ 5 = 50 ÷ 5 = 10.",
            pistaAy = "Promedio = (8+12+6+10+14) ÷ 5 = 50 ÷ 5 = 10."
        ),
        Pregunta(
            id = 43,
            competenciaId = 4,
            nivel = 7,
            enunciado = "Observa el gráfico circular. ¿Cuál es el producto que más se vendió en la feria?",
            enunciadoAy = "Uñxatt’ma gráfico circular ukaru. ¿Kawkiri yäsa feria ukanxa juk’ampi aljata?",
            imagen = R.drawable.c4_nivel7_circular_feria,
            alternativas = listOf("Papas", "Queso", "Chuño", "Lana"),
            respuestaCorrecta = 0,
            pista = "En el gráfico circular, la porción más grande corresponde a Papas.",
            pistaAy = "Gráfico circular ukanxa, juk’ampi jach’a parte ukaxa Papas ukaruw wakisi."
        ),
        Pregunta(
            id = 44,
            competenciaId = 4,
            nivel = 8,
            enunciado = "En una clase de 20 alumnos, sus comidas favoritas son: 8 prefieren sopa, 5 prefieren quinua, 4 prefieren chuño y 3 prefieren trucha. ¿Cuál es la moda?",
            enunciadoAy = "Mä clase 20 yatiqirinakaniwa, jupanakan manq’anakapaxa akhamawa: 8 ukaxa sopa munapxi, 5 ukaxa quinua munapxi, 4 ukaxa chuño munapxi, ukatxa 3 ukaxa trucha munapxi. ¿Kawkirisa moda ukaxa?",
            alternativas = listOf("Sopa", "Quinua", "Chuño", "Trucha"),
            respuestaCorrecta = 0,
            pista = "La moda es la categoría con más alumnos. Sopa tiene 8 alumnos, es la mayor. Moda = Sopa.",
            pistaAy = "Moda ukaxa juk’ampi yatiqirinakani categoría ukawa. Sopa ukaxa 8 yatiqirinakaniwa, ukaxa juk’ampiwa. Moda = Sopa."
        ),
        Pregunta(
            id = 45,
            competenciaId = 4,
            nivel = 9,
            enunciado = "Observa el gráfico circular de comidas favoritas. ¿Qué comida tiene la porción más pequeña?",
            enunciadoAy = "Uñxatt’ma gráfico circular manq’anakan ajllitanakaparu. ¿Kuna manq’asa jisk’a parte ukani?",
            imagen = R.drawable.c4_nivel9_circular_comidas,
            alternativas = listOf("Chuño", "Trucha", "Sopa", "Quinua"),
            respuestaCorrecta = 0,
            pista = "La porción más pequeña del gráfico circular es Chuño (15%).",
            pistaAy = "Gráfico circular ukanxa jisk’a parte ukaxa Chuño ukawa (15%)."
        ),
        Pregunta(
            id = 46,
            competenciaId = 4,
            nivel = 10,
            enunciado = "Si lanzo una moneda al aire, ¿cuál es la probabilidad de que caiga cara?",
            enunciadoAy = "Mä moneda alayaruw jaquntta ukhaxa, ¿kuna probabilidad ukasa cara ukaru puriñapataki?",
            alternativas = listOf("1 de 2", "1 de 4", "1 de 3", "2 de 2"),
            respuestaCorrecta = 0,
            pista = "Una moneda tiene 2 caras. Probabilidad de cara = 1 de 2.",
            pistaAy = "Mä moneda ukaxa 2 ajanuniwa. Probabilidad de cara = 1 de 2."
        ),
        Pregunta(
            id = 47,
            competenciaId = 4,
            nivel = 11,
            enunciado = "Observa el gráfico de asistencia. ¿Qué día asistieron más niños que niñas a la escuela?",
            enunciadoAy = "Uñxatt’ma asistencia gráfico ukaru. ¿Kuna urusa yatiqiri wawanakaxa yatiqiri warminakat sipansa juk’ampi sarañäna?",
            imagen = R.drawable.c4_nivel11_barras_doble,
            alternativas = listOf("Jueves", "Lunes", "Martes", "Miércoles"),
            respuestaCorrecta = 0,
            pista = "Compara barras azules (niños) vs rosadas (niñas). El jueves: 9 niños > 6 niñas.",
            pistaAy = "Compara barras azules (niños) vs rosadas (niñas). Jueves urunxa: 9 niños > 6 niñas."
        ),
        Pregunta(
            id = 48,
            competenciaId = 4,
            nivel = 12,
            enunciado = "En la escuela, las alturas de 6 estudiantes en cm son: 130, 125, 140, 130, 135, 130. ¿Cuál es la moda y el promedio?",
            enunciadoAy = "Yatiqaña utanxa, 6 yatiqirinakan alturas ukaxa cm ukhamawa: 130, 125, 140, 130, 135, 130. ¿Kawkirisa moda ukatxa promedio ukaxa?",
            alternativas = listOf("Moda: 130, Promedio: 131.6", "Moda: 135, Promedio: 130", "Moda: 130, Promedio: 140", "Moda: 125, Promedio: 132"),
            respuestaCorrecta = 0,
            pista = "Moda: 130 (aparece 3 veces). Promedio: (130+125+140+130+135+130) ÷ 6 = 790 ÷ 6 ≈ 131.6.",
            pistaAy = "Moda: 130 (3 kutiwa uñsti). Promedio: (130+125+140+130+135+130) ÷ 6 = 790 ÷ 6 ≈ 131.6."
        ),

        // ════════════════════════════════════════════════════════════════
        // NIVELES 13-24 · Segunda vuelta (mayor dificultad progresiva)
        // ════════════════════════════════════════════════════════════════

        // ── LOGRO 1 · Nivel 13 ─────────────────────────────────────────────
        // Elaborar información nueva (total) a partir de un gráfico de barras
        // IMAGEN c4_nivel13: gráfico de barras de producción de papa (sacos)
        // en 4 comunidades: A=15, B=22, C=18, D=25.
        Pregunta(
            id = 85,
            competenciaId = 4,
            nivel = 13,
            enunciado = "Observa el gráfico de barras de la producción de papa en 4 comunidades. " +
                    "¿Cuál es la producción total de las cuatro comunidades juntas?",
            enunciadoAy = "Uñxatt’ma gráfico de barras papa achuyawita 4 comunidades ukanakana. ¿Qhawqhasa taqpacha achuyawixa uka pusi comunidadesanxa mayachata?",
            imagen = R.drawable.c4_nivel13,
            alternativas = listOf("80 sacos", "75 sacos", "85 sacos", "90 sacos"),
            respuestaCorrecta = 0,
            pista = "Suma todas las barras: 15 + 22 + 18 + 25 = 80 sacos.",
            pistaAy = "Taqpacha barras ukaxa yapxatañawa: 15 + 22 + 18 + 25 = 80 sacos."
        ),

        // ── LOGRO 1 · Nivel 14 ─────────────────────────────────────────────
        // Elaborar información (diferencia de totales) a partir de un gráfico de barras dobles
        // IMAGEN c4_nivel14: gráfico de barras dobles comparando ventas de queso
        // por trimestre en 2024 (trimestres: 30, 35, 40, 35 = total 140) y
        // 2025 (trimestres: 40, 45, 50, 45 = total 180).
        Pregunta(
            id = 86,
            competenciaId = 4,
            nivel = 14,
            enunciado = "Observa el gráfico que compara las ventas de queso en 2024 y 2025 por trimestre. " +
                    "¿En cuánto aumentaron las ventas totales del año 2025 respecto al 2024?",
            enunciadoAy = "Uñxatt’ma gráfico ukaru, uka gráfico ukaxa queso aljata 2024 ukatxa 2025 maranakan trimestre ukat trimestre uñacht’ayi. ¿Qhawqharusa maran 2025 taqpacha aljataxaxa 2024 marat sipansa jilxattawayi?",
            imagen = R.drawable.c4_nivel14,
            alternativas = listOf("40", "35", "45", "30"),
            respuestaCorrecta = 0,
            pista = "Total 2024: 30+35+40+35 = 140. Total 2025: 40+45+50+45 = 180. Aumento: 180-140 = 40.",
            pistaAy = "Total 2024: 30+35+40+35 = 140. Total 2025: 40+45+50+45 = 180. Aumento: 180-140 = 40."
        ),

        // ── LOGRO 1 · Nivel 15 ─────────────────────────────────────────────
        // Elaborar información (mayor variación) a partir de un gráfico de líneas
        // IMAGEN c4_nivel15: gráfico de líneas de producción mensual de quinua
        // (sacos): Ene=10, Feb=14, Mar=12, Abr=20, May=18.
        Pregunta(
            id = 87,
            competenciaId = 4,
            nivel = 15,
            enunciado = "Observa el gráfico de líneas de la producción mensual de quinua. " +
                    "¿Entre qué dos meses se registró el mayor aumento de producción?",
            enunciadoAy = "Uñxatt’ma gráfico de líneas quinua phaxsita phaxsiru achuyawipa. ¿Kuna pä phaxsinakanwa juk’ampi achuyawi jilxattawixa utjäna?",
            imagen = R.drawable.c4_nivel15,
            alternativas = listOf("Marzo y Abril", "Enero y Febrero", "Abril y Mayo", "Febrero y Marzo"),
            respuestaCorrecta = 0,
            pista = "Variaciones: Ene→Feb = +4, Feb→Mar = -2, Mar→Abr = +8, Abr→May = -2. Mayor aumento: Mar a Abr (+8).",
            pistaAy = "Variaciones: Ene→Feb = +4, Feb→Mar = -2, Mar→Abr = +8, Abr→May = -2. Juk’ampi jilxattawi: Mar a Abr (+8)."
        ),

        // ── LOGRO 2 · Nivel 16 ─────────────────────────────────────────────
        // Correspondencia entre un gráfico y una tabla con un dato que no coincide
        // IMAGEN c4_nivel16: gráfico de barras de animales: vacas=5, ovejas=12,
        // llamas=8, alpacas=10.
        Pregunta(
            id = 88,
            competenciaId = 4,
            nivel = 16,
            enunciado = "Observa el gráfico y la tabla.\n" +
                    "Animal: Vacas, Ovejas, Llamas, Alpacas\nCantidad: 5, 12, 9, 10\n" +
                    "¿Qué animal no coincide entre el gráfico y la tabla?",
            enunciadoAy = "Uñxatt’ma gráfico ukatxa tabla ukaru.\nUywa: Vacas, Ovejas, Llamas, Alpacas\nCantidad: 5, 12, 9, 10\n¿Kuna uywasa gráfico ukatxa tabla ukampi jan kikpaki?",
            imagen = R.drawable.c4_nivel16,
            alternativas = listOf("Llamas", "Vacas", "Ovejas", "Alpacas"),
            respuestaCorrecta = 0,
            pista = "El gráfico muestra Llamas = 8, pero la tabla dice 9. El animal que no coincide es Llamas.",
            pistaAy = "Gráfico ukaxa Llamas = 8 ukham uñacht’ayi, ukampisa tabla ukaxa 9 siwa. Jan kikpaki uywaxa Llamas ukawa."
        ),

        // ── LOGRO 2 · Nivel 17 ─────────────────────────────────────────────
        // Correspondencia entre un gráfico circular (con porcentajes) y un cálculo
        // IMAGEN c4_nivel17: gráfico circular de gastos familiares: Alimentación
        // 40%, Educación 25%, Salud 15%, Otros 20%.
        Pregunta(
            id = 89,
            competenciaId = 4,
            nivel = 17,
            enunciado = "Observa el gráfico circular de gastos familiares. " +
                    "Según el gráfico, ¿qué porcentaje del gasto total corresponde a Educación y Salud juntos?",
            enunciadoAy = "Uñxatt’ma gráfico circular gastos familiares ukaru. Gráfico ukarjama, ¿qhawqha porcentaje ukasa Educación ukatxa Salud mayacht’ataxa taqpacha gastotxa?",
            imagen = R.drawable.c4_nivel17,
            alternativas = listOf("40%", "35%", "45%", "30%"),
            respuestaCorrecta = 0,
            pista = "Educación = 25% y Salud = 15%. Juntos: 25 + 15 = 40%.",
            pistaAy = "Educación = 25% ukatxa Salud = 15%. Mayacht’ata: 25 + 15 = 40%."
        ),

        // ── LOGRO 2 · Nivel 18 ─────────────────────────────────────────────
        // Correspondencia entre gráfico y dato total: hallar el valor faltante
        // IMAGEN c4_nivel18: gráfico de barras de ingresos semanales de una
        // tienda comunal: Semana 1=80, Semana 2=95, Semana 3=70, Semana 4
        // dibujada incompleta/sin etiqueta numérica.
        Pregunta(
            id = 90,
            competenciaId = 4,
            nivel = 18,
            enunciado = "Observa el gráfico de ingresos semanales de la tienda comunal. " +
                    "Si el ingreso total del mes fue S/ 335, " +
                    "¿cuánto fue el ingreso de la semana 4, que no se muestra completo en el gráfico?",
            enunciadoAy = "Uñxatt’ma tienda comunal semanal ingresos gráfico ukaru. Yaqhuru phaxsina taqpacha ingreso ukaxa S/ 335 ukhamäna, ¿qhawqhasa semana 4 ukana ingreso ukaxa, jani phuqata gráfico ukan uñstki?",
            imagen = R.drawable.c4_nivel18,
            alternativas = listOf("S/ 90", "S/ 85", "S/ 95", "S/ 100"),
            respuestaCorrecta = 0,
            pista = "Semanas 1+2+3 = 80+95+70 = 245. Total mes = 335. Semana 4 = 335-245 = S/90.",
            pistaAy = "Semanas 1+2+3 = 80+95+70 = 245. Total mes = 335. Semana 4 = 335-245 = S/90."
        ),

        // ── LOGRO 3 · Nivel 19 ─────────────────────────────────────────────
        // Tabla correspondiente a un gráfico circular SIN datos numéricos
        // IMAGEN c4_nivel19: gráfico circular sin números ni leyenda de valores,
        // con 4 porciones para papa, quinua, haba y cebada: papa = mitad del
        // círculo, quinua = un cuarto, haba y cebada = un octavo cada una.
        Pregunta(
            id = 91,
            competenciaId = 4,
            nivel = 19,
            enunciado = "Observa el gráfico de cultivos. Según el tamaño de las porciones, ¿cuál es correcta?",
            enunciadoAy = "Uñxatt’ma cultivos gráfico ukaru. Porciones ukanakan jach’ataparjama, ¿kawkiri ajlliwisa chiqapawa?",
            imagen = R.drawable.c4_nivel19,
            alternativas = listOf(
                "Papa: 50%, Quinua: 25%, Haba: 12.5%, Cebada: 12.5%",
                "Papa: 25%, Quinua: 50%, Haba: 12.5%, Cebada: 12.5%",
                "Papa: 50%, Quinua: 12.5%, Haba: 25%, Cebada: 12.5%",
                "Papa: 25%, Quinua: 25%, Haba: 25%, Cebada: 25%"
            ),
            respuestaCorrecta = 0,
            pista = "Papa ocupa la mitad (50%), quinua un cuarto (25%), haba y cebada un octavo cada una (12.5%).",
            pistaAy = "Papa ukaxa chikatapawa (50%), quinua ukaxa mä cuarto (25%), haba ukatxa cebada ukaxa sapa mayni mä octavo (12.5%)."
        ),

        // ── LOGRO 3 · Nivel 20 ─────────────────────────────────────────────
        // Tabla/orden correspondiente a un gráfico circular sin números (orden relativo)
        // IMAGEN c4_nivel20: gráfico circular sin números con 4 porciones de
        // animales (ovejas, alpacas, llamas, vacas) dibujadas de mayor a menor
        // en este orden: ovejas > alpacas > llamas > vacas.
        Pregunta(
            id = 92,
            competenciaId = 4,
            nivel = 20,
            enunciado = "Observa el gráfico de animales en la comunidad (sin números): " +
                    "alpacas, ovejas, llamas y vacas. " +
                    "Según el tamaño de las porciones, ¿cuál opción ordena correctamente las cantidades de mayor a menor?",
            enunciadoAy = "Uñxatt’ma comunidadan uywanakan gráfico ukaru (jani números ukani): alpacas, ovejas, llamas ukatxa vacas. Porciones ukanakan jach’ataparjama, ¿kuna ajlliwisa jach’atapata jisk’ataparu chiqaparjama ordena?",
            imagen = R.drawable.c4_nivel20,
            alternativas = listOf(
                "Ovejas > Alpacas > Llamas > Vacas",
                "Alpacas > Ovejas > Vacas > Llamas",
                "Vacas > Llamas > Ovejas > Alpacas",
                "Llamas > Vacas > Alpacas > Ovejas"
            ),
            respuestaCorrecta = 0,
            pista = "Ordena las porciones de mayor a menor: Ovejas > Alpacas > Llamas > Vacas.",
            pistaAy = "Porciones ukanaka jach’atapata jisk’ataparu ordenama: Ovejas > Alpacas > Llamas > Vacas."
        ),

        // ── LOGRO 3 · Nivel 21 ─────────────────────────────────────────────
        // Tabla correspondiente a un gráfico circular sin números, con un dato ancla (el total)
        // IMAGEN c4_nivel21: gráfico circular sin números de fuentes de ingreso:
        // agricultura = mitad del círculo, ganadería = un cuarto, artesanía = un cuarto.
        Pregunta(
            id = 93,
            competenciaId = 4,
            nivel = 21,
            enunciado = "Observa el gráfico de ingresos. Si ganaron S/800 al mes, ¿cuál corresponde al gráfico?",
            enunciadoAy = "Uñxatt’ma ingresos gráfico ukaru. Phaxsina S/800 qullqi ganapxäna ukhaxa, ¿kawkirisa gráfico ukarjama wakisi?",
            imagen = R.drawable.c4_nivel21,
            alternativas = listOf(
                "Agricultura: S/ 400, Ganadería: S/ 200, Artesanía: S/ 200",
                "Agricultura: S/ 200, Ganadería: S/ 400, Artesanía: S/ 200",
                "Agricultura: S/ 400, Ganadería: S/ 300, Artesanía: S/ 100",
                "Agricultura: S/ 300, Ganadería: S/ 300, Artesanía: S/ 200"
            ),
            respuestaCorrecta = 0,
            pista = "Agricultura = mitad = S/400. Ganadería = un cuarto = S/200. Artesanía = un cuarto = S/200.",
            pistaAy = "Agricultura = chikatapawa = S/400. Ganadería = mä cuarto = S/200. Artesanía = mä cuarto = S/200."
        ),

        // ── LOGRO 4 · Nivel 22 ─────────────────────────────────────────────
        // Razonamiento sobre qué medida (media o moda) representa mejor un dato con valor atípico
        Pregunta(
            id = 94,
            competenciaId = 4,
            nivel = 22,
            enunciado = "Los ingresos semanales (en soles) de 7 familias artesanas son: 80, 85, 80, 200, 82, 78, 80. " +
                    "¿Qué medida representa mejor el ingreso típico de estas familias, considerando el valor atípico de 200?",
            enunciadoAy = "7 artesanas familias ukanakan semanan ingresos (soles ukjama) ukaxa akhamawa: 80, 85, 80, 200, 82, 78, 80. ¿Kuna medida ukasa aka familiasan típico ingreso ukarux juk’ampi uñacht’ayi, 200 valor atípico ukarjama uñjasina?",
            alternativas = listOf(
                "La moda (80), porque el dato 200 distorsiona la media",
                "La media, porque siempre es más precisa",
                "Ambas representan igual de bien los datos",
                "Ninguna de las dos es válida en este caso"
            ),
            respuestaCorrecta = 0,
            pista = "El valor 200 es muy diferente al resto (≈80). La moda (80) representa mejor el ingreso típico.",
            pistaAy = "200 valor ukaxa yaqhanakatxa wali mayjawa (≈80). Moda (80) ukaxa típico ingreso ukarux juk’ampi uñacht’ayi."
        ),

        // ── LOGRO 4 · Nivel 23 ─────────────────────────────────────────────
        // Cálculo de la media con resultado decimal (mayor exigencia de cálculo)
        Pregunta(
            id = 95,
            competenciaId = 4,
            nivel = 23,
            enunciado = "Las temperaturas registradas durante una semana en la comunidad fueron (en °C): " +
                    "8, 10, 9, 7, 11, 9, 8. " +
                    "¿Cuál es la temperatura promedio aproximada de la semana (redondeada a un decimal)?",
            enunciadoAy = "Mä semana taypina comunidadan yatiyata temperaturas ukaxa (en °C): 8, 10, 9, 7, 11, 9, 8. ¿Kawkirisa semana ukana promedio temperatura ukaxa (mä decimal ukaru muyuyata)?",
            alternativas = listOf("8.9 °C", "8.5 °C", "9.0 °C", "8.0 °C"),
            respuestaCorrecta = 0,
            pista = "Suma: 8+10+9+7+11+9+8 = 62. Promedio: 62 ÷ 7 ≈ 8.857 ≈ 8.9 °C.",
            pistaAy = "Suma: 8+10+9+7+11+9+8 = 62. Promedio: 62 ÷ 7 ≈ 8.857 ≈ 8.9 °C."
        ),

        // ── LOGRO 4 · Nivel 24 ─────────────────────────────────────────────
        // Problema integrador: moda y media a partir de una tabla de frecuencias
        Pregunta(
            id = 96,
            competenciaId = 4,
            nivel = 24,
            enunciado = "En una encuesta a 15 estudiantes sobre cuántos hermanos tienen, se obtuvo esta tabla de frecuencias:\n" +
                    "N° de hermanos: 0, 1, 2, 3\nN° de estudiantes: 3, 6, 4, 2\n" +
                    "¿Cuál es la moda y el promedio (media) de hermanos por estudiante?",
            enunciadoAy = "15 yatiqirinakaru mä encuesta luratawa, qhawqha jilanakanisa ukata, aka tabla de frecuencias ukawa apsuta:\nN° de hermanos: 0, 1, 2, 3\nN° de estudiantes: 3, 6, 4, 2\n¿Kawkirisa moda ukatxa promedio (media) jilanakan sapa yatiqirina?",
            alternativas = listOf(
                "Moda: 1, Media: 1.33",
                "Moda: 2, Media: 1.5",
                "Moda: 1, Media: 1.5",
                "Moda: 3, Media: 1.33"
            ),
            respuestaCorrecta = 0,
            pista = "Moda: 1 hermano (6 estudiantes, la mayor frecuencia). Media: (0×3+1×6+2×4+3×2)÷15 = 20÷15 ≈ 1.33.",
            pistaAy = "Moda: 1 hermano (6 estudiantes, juk’ampi frecuencia ukani). Media: (0×3+1×6+2×4+3×2)÷15 = 20÷15 ≈ 1.33."
        )
    )


    fun obtenerPregunta(competenciaId: Int, nivel: Int): Pregunta? {
        return when (competenciaId) {
            1 -> preguntasCompetencia1.find { it.nivel == nivel }
            2 -> preguntasCompetencia2.find { it.nivel == nivel }
            3 -> preguntasCompetencia3.find { it.nivel == nivel }
            4 -> preguntasCompetencia4.find { it.nivel == nivel }
            else -> null
        }
    }
}