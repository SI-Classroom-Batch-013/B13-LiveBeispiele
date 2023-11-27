fun main() {
    var numbers: MutableList<Int> = mutableListOf(3, 6, 4, 7, 42, 1, 26)

    repeat(numbers.size) {
        numbers[it] = numbers[it] + 5
    }

    println(numbers)
}