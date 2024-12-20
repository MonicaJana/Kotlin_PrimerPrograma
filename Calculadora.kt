fun areaCuadrado(lado: Double): Double {
    return lado * lado
}

fun areaCirculo(radio: Double): Double {
    val PI = 3.1416
    return PI * radio * radio
}

fun areaTriangulo(base: Double, altura: Double): Double {
    return (base * altura) / 2
}

fun main() {
    println("Seleccione una opción para calcular el área:")
    println("1. Cuadrado")
    println("2. Círculo")
    println("3. Triángulo")
    println("4. Salir")

    val simulatedInputs = listOf("1", "4", "5", "2", "3", "6", "3", "5", "10", "4")
    var index = 0
    var opcion: Int

    do {
       
        val input = if (index < simulatedInputs.size) simulatedInputs[index++] else "4"
        println("\nIngrese su opción (1-4): $input")
        opcion = input.toIntOrNull() ?: -1 

        when (opcion) {
            1 -> {
                println("Ingrese el lado del cuadrado:")
                val lado = if (index < simulatedInputs.size) simulatedInputs[index++].toDoubleOrNull() ?: 0.0 else 0.0
                println("El área del cuadrado es: ${areaCuadrado(lado)}")
            }
            2 -> {
                println("Ingrese el radio del círculo:")
                val radio = if (index < simulatedInputs.size) simulatedInputs[index++].toDoubleOrNull() ?: 0.0 else 0.0
                println("El área del círculo es: ${areaCirculo(radio)}")
            }
            3 -> {
                println("Ingrese la base del triángulo:")
                val base = if (index < simulatedInputs.size) simulatedInputs[index++].toDoubleOrNull() ?: 0.0 else 0.0
                println("Ingrese la altura del triángulo:")
                val altura = if (index < simulatedInputs.size) simulatedInputs[index++].toDoubleOrNull() ?: 0.0 else 0.0
                println("El área del triángulo es: ${areaTriangulo(base, altura)}")
            }
            4 -> println("Saliendo del programa...")
            else -> println("Por favor, ingrese una opción válida.")
        }
    } while (opcion != 4)

    println("Programa terminado.")
}
