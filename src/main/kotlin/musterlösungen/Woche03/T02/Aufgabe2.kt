fun main() {
    isDoubleUnequal(5.0, 10.0)
    isDoubleUnequal(10.0, 10.0)
    isBooleanUnequal(false, true)
    isBooleanUnequal(true, true)
}

fun isDoubleUnequal(number1: Double, number2: Double) {
    // Schreibe hier deinen Code.
    if (number1 != number2) {
        println("Zahlen sind nicht gleich")
    } else {
        println("Zahlen sind gleich")
    }
}

fun isBooleanUnequal(boolean1: Boolean, boolean2: Boolean) {
    // Schreibe hier deinen Code.
    if (boolean1 != boolean2) {
        println("Boolean sind nicht gleich")
    } else {
        println("Boolean sind gleich")
    }
}