package one.digitalinnovation.collections

fun main() {

    val names = Array<String>(3){""}
    names[0] = "Jose"
    names[1] = "Maria"
    names[2] = "Joao"

    for(i in names)
        println(i)

    names.sort()

    println("-------------------------")
    names.forEach {
        println(it)
    }

}