fun main() {
    val numbers = listOf(
        35, 35, 37, 246, 246, 357, 234, 4237, 476, 2346, 24, 24, 347, 357, 67,
        52315, 346, 3567, 346, 235, 26, 357, 486, 457, 246, 246, 3247,
        35, 247, 2437, 274, 374, 35, 634, 35, 37, 2436, 43
    )
    println(min(numbers))
}

fun min(numbers: List<Int>): Int {
    var min = numbers[0]
    for (i in 1..numbers.size - 1) {
        if (numbers[i] < min) {
            min = numbers[i]
        }
    }
    return min
}