package one.digitalinnovation.collections

data class Funcionario(
    val nome:String,
    val salario:Double,
    val tipoContratacao:String
){
    override fun toString(): String =
        """
            Nome: $nome - Salario: $salario
        """.trimIndent()
}

fun main() {

    val func1 = Funcionario("João", 2000.0, "CLT")
    val func2 = Funcionario("Maria", 3000.0,"PJ")
    val func3 = Funcionario("Daniel", 1500.0,"PJ")
    val func4 = Funcionario("Renata", 2560.0,"CLT")

    val funcionarios = listOf(func1, func2, func3, func4)

    funcionarios.forEach{
        println(it)
    }

    println("--------------------------")
    println(funcionarios.find { it.nome == "Maria" })

    println("--------------------------")
    funcionarios.sortedBy { it.salario }.forEach { println(it) }

    println("--------------------------")
    funcionarios.groupBy { it.tipoContratacao }.forEach{ println(it)}

}