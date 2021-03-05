package one.digitalinnovation.collections

fun main() {

    val func1 = Funcionario("João", 2000.0, "CLT")
    val func2 = Funcionario("Maria", 3000.0,"PJ")
    val func3 = Funcionario("Daniel", 1500.0,"PJ")
    val func4 = Funcionario("Renata", 2560.0,"CLT")

    println("------------ LIST --------------")
    val funcionariosMult = mutableListOf(func1, func2,func1)

    funcionariosMult.forEach { println(it) }

    println("---------------------------")
    funcionariosMult.add(func3)
    funcionariosMult.forEach { println(it) }

    println("---------------------------")
    funcionariosMult.remove(func1)
    funcionariosMult.forEach { println(it) }

    println("------------- SET --------------")
    val funcionariosSet = mutableSetOf(func1, func1, func2)
    funcionariosSet.forEach { println(it) }

    println("---------------------------")
    funcionariosSet.add(func3)
    funcionariosSet.forEach { println(it) }

    println("---------------------------")
    funcionariosSet.remove(func2)
    funcionariosSet.forEach { println(it) }


}