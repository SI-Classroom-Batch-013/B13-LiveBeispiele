val integerList = listOf(1,2,3,4,5,6,7,8,9,10)

fun main() {
    println("loopMap():")
    loopMap()
    println("lambdaMap():")
    lambdaMap()
}

fun loopMap() {
    val intList = integerList.toMutableList()
    for (i in intList.indices) {
        intList[i] = intList[i] * intList[i]
    }
    println(intList)
}

fun lambdaMap() {
    println(integerList.map { it * it })
}