fun main() {
    /*Función Recursiva que divida dos números enteros por medio de restas sucesivas.
    Ejemplo: 12/3 es lo mismo que decir: 12 - 3 = 9, 9 - 3 = 6, 6 - 3 = 3, 3 - 3 = 0.
    Hubo 4 restas hasta que dio 0, por lo tanto 12/3 = 4.
     */

    println("El resultado de la división es: ${dividirNumeros(12, 3)}")
}

fun dividirNumeros(a: Int = 1, b: Int = 1): Int {
    var resta : Int = a - b
    return if (resta == 0) 1 else 1 + dividirNumeros(resta, b)
}