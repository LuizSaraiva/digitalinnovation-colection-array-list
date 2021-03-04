package one.digitalinnovation.collections

fun main() {

    val salarios = doubleArrayOf(100.0, 300.0, 900.0, 3000.0, 3450.0, 200.0)

    salarios.forEach { println(it) }

    println("-------------------------")
    println("MAIOR salario: ${salarios.max()}")
    println("MENOR salario:${salarios.min()}")
    println("MEDIA salarial:${salarios.average()}")

    println("-------------------------")
    val filtro = salarios.filter { it > 500 }

    filtro.forEach { println(it)}



}