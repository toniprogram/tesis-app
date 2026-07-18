package com.example.tesis.data

object TutorialData {

    val dialogosInicio = listOf(
        "¡Hola! Mi nombre es José y te ayudaré a empezar este desafío.",
        "Para comenzar, presiona el botón Jugar.",
        "En la esquina inferior derecha encontrarás el botón de Ajustes, donde podrás cambiar el idioma."
    )

    val dialogosMenu = listOf(
        "Aquí puedes elegir la competencia que deseas realizar.",
        "Una vez seleccionada, presiona el botón Seleccionar para comenzar.",
        "En la esquina superior izquierda encontrarás tu Medallero. Completa los ejercicios de cada competencia para llenarlo."
    )

    val dialogosNivelesGeneral = listOf(
        "En esta sección encontrarás todos los niveles del juego.",
        "Para desbloquear nuevos niveles, deberás completar los anteriores.",
        "¡Hay 24 ejercicios en total! ¡Mucha suerte!"
    )

    val dialogosCompetencia = mapOf(
        1 to "Esta competencia consiste en aprender a trabajar con números, fracciones y operaciones para resolver situaciones cotidianas, como repartir productos agrícolas, calcular partes de una cosecha o manejar el dinero de la venta y compra de productos.",
        2 to "Esta competencia consiste en identificar patrones y relaciones entre cantidades que cambian, como el crecimiento de una producción día a día, y en aprender a expresar esas relaciones usando el lenguaje y los símbolos matemáticos.",
        3 to "Esta competencia consiste en reconocer y construir figuras geométricas (triángulos, polígonos, ángulos) presentes en objetos y estructuras del entorno, como viviendas, cercos o herramientas, y en comprender conceptos como la proporcionalidad y la ampliación de figuras.",
        4 to "Esta competencia consiste en leer e interpretar gráficos y tablas (de barras, circulares, pictogramas) con información de la comunidad, como cosechas o asistencia escolar, y en calcular medidas como el promedio o la moda."
    )

    val dialogosPregunta = listOf(
        "En este nivel deberás elegir la respuesta correcta.",
        "Si tienes dificultades, puedes usar una pista presionando el botón de la esquina inferior derecha.",
        "Cada ayuda cuesta 10 monedas. Al completar un nivel ganarás 2 monedas."
    )

    val dialogosPrimeraMedalla = listOf(
        "¡Muy bien! Has conseguido tu primera medalla.",
        "Sigue resolviendo ejercicios para obtener más medallas y completar tu colección.",
        "¡Continúa así y mucha suerte!"
    )

    val dialogosMedallero = listOf(
        "Este es tu medallero.",
        "Aquí podrás ver todas las medallas que has obtenido y las que aún te faltan.",
        "Cada medalla tiene un requisito especial. Sigue avanzando para conseguirlas todas. ¡Mucha suerte!"
    )
}