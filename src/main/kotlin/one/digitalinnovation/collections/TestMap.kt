package one.digitalinnovation.collections

fun main() {

    val pair: Pair<String, Double> = Pair("João", 1000.0)
    val map1 = mapOf(pair)

    map1.forEach { k, v ->  println("Chave: $k - Valor: $v") }

    val map2 = mapOf("Mario" to 3000.0)
    println("---------------")
    map2.forEach { k, v -> println("Nome: $k - Valor: $v") }
}