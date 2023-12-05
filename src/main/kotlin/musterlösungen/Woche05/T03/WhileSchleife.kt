fun main() {
    val numbers: MutableList<Double> = mutableListOf(25.0, 33.3, 50.0, 100.0)

    var i = 0
    while(i < numbers.size) {
        numbers[i] *= 3.0
        i++
    }

    println(numbers)
    println(foo(numbers, 2.0))
}

fun foo(numbers: MutableList<Double>, a: Double): MutableList<Double> {
    var i = -1
    while (++i < numbers.size) {
        numbers[i] *= a
    }
    return numbers
}