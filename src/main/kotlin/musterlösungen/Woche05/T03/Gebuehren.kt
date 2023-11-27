fun main() {
    val fees = listOf(363.34, 235.45, 753.45, 234.56, 658.33, 22.65, 2623.46, 475.54)

    println(sum(fees))
}

fun sum(fees: List<Double>): Double {
    var sum = 0.0
    for (fee in fees) {
        sum += fee
    }
    return sum
}