package one.digitalinnovation.collections

fun main() {

    val valueArray = IntArray(5)

    valueArray[0] = 1
    valueArray[1] = 7
    valueArray[2] = 6
    valueArray[3] = 3
    valueArray[4] = 2

    for(value in valueArray)
        println(value)

    println("------------------")

    valueArray.forEach {
        println(it)
    }

    println("------------------")

    valueArray.sort()
    for(index in valueArray.indices)
        println(valueArray[index])

}