package one.digitalinnovation.collections

fun main() {

    val salarios = doubleArrayOf(100.0, 300.0, 900.0, 3000.0, 3450.0, 200.0)

    salarios.forEach { println(it) }

    println("-------------------------")
    println("MAIOR salario: ${salarios.maxOrNull()}")
    println("MENOR salario:${salarios.minOrNull()}")
    println("MEDIA salarial:${salarios.average()}")

    println("-------------------------")
    val filtro = salarios.filter { it > 500 }

    filtro.forEach { println(it)}

    println("-------------------------")
    println(salarios.count{ it in 2000.0.. 5000.0})
}