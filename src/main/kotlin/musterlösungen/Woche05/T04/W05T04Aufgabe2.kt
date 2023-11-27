val countNumbersList = listOf(
    2, 42, 932, 41,
    13, 93, 64, 74,
    4, 16, 22, 453
)

fun main() {
    println("loopCounter():")
    loopCounter()
    println("lambdaCounter():")
    lambdaCounter()
}

fun loopCounter() {
    var counter = 0
    for (number in countNumbersList) {
        if (number < 50) {
            counter++
        }
    }
    println(counter)
}

fun lambdaCounter() {
    var counter = countNumbersList.count { it < 50 }
    println(counter)
}