package one.digitalinnovation.collections

fun main() {

    val func1 = Funcionario("João", 2000.0, "CLT")
    val func2 = Funcionario("Maria", 3000.0, "PJ")
    val func3 = Funcionario("Daniel", 1500.0, "PJ")
    val func4 = Funcionario("Renata", 2560.0, "CLT")

    val repositorio = Repositorio<Funcionario>()
    repositorio.create(func1.nome, func1)
    repositorio.create(func2.nome, func2)

    println(repositorio.groupById(func1.nome))

    println(" ----------------------------- ")
    repositorio.findAll().forEach { println(it) }

    repositorio.remove(func1.nome)
    println(" ----------------------------- ")
    repositorio.findAll().forEach { println(it) }

}