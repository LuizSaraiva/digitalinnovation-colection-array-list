package one.digitalinnovation.collections

fun main() {

    val func1 = Funcionario("João", 2000.0, "CLT")
    val func2 = Funcionario("Maria", 3000.0, "PJ")
    val func3 = Funcionario("Daniel", 1500.0, "PJ")
    val func4 = Funcionario("Renata", 2560.0, "CLT")

    val funcionarios1 = setOf(func1, func2)
    val funcionarios2 = setOf(func3, func4)

    val resultUnion = funcionarios1.union(funcionarios2)

    resultUnion.forEach { println(it) }

    println("-----------------------")
    val funcionarios3 = setOf(func1, func2, func3, func4)
    val resultsub = funcionarios3.subtract(funcionarios1)
    resultsub.forEach { println(it) }

    println("-----------------------")
    val funcionarios4 = setOf(func1, func2, func3, func4)
    val resultinter = funcionarios4.intersect(funcionarios1)
    resultinter.forEach { println(it) }


}