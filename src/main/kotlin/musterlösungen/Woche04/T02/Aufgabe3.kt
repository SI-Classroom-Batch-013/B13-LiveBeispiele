fun main() {
    compareNumbers(5, 2)
    compareNumbers(5, 7)
    compareNumbers(5, 5)
}

fun compareNumbers(number1: Int, number2: Int) {
    if (number1 > number2) {
        println("Die erste Zahl ist größer.")
    } else if(number1 < number2) {
        println("Die erste Zahl ist kleiner.")
    } else {
        println("Beide Zahlen sind gleich.")
    }
}