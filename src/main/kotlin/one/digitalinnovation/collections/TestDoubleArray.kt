package one.digitalinnovation.collections

fun main() {

    val salario = DoubleArray(3)
    salario[0] = 1000.00
    salario[1] = 3000.00
    salario[2] = 500.00

    salario.forEach { println(it) }

    salario.sort()

    println("-----------------")
    salario.forEach { println(it) }

    println("-----------------")
    salario.forEachIndexed{index,salario ->
        println("INDEX: "+index+" - SALARIO: "+salario+" - AUMENTO:"+salario*0.5)
    }


}
