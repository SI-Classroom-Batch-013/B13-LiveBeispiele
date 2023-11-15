fun main() {
    println(firstNumberlowereq(2, 5))
    println(firstNumberlowereq(5, 5))
    println(firstNumberlowereq(6, 5))
    println(firstNumberhighereq(7, 5))
    println(firstNumberhighereq(5, 5))
    println(firstNumberhighereq(2, 5))
}

fun firstNumberlowereq(number1: Int, number2: Int): Boolean {
    return number1 <= number2
}

fun firstNumberhighereq(number1: Int, number2: Int): Boolean {
    return number1 >= number2
}