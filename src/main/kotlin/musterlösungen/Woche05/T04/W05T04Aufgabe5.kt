val anyAndAllList = listOf(
    2, 4, 62, 142, 124,
    42, 32, 84, 34, 22,
    94, 54, 32, 43, 88,
    144, 424, 534, 232,
    66, 194, 874, 8, 6,
)

fun main() {
    println("loopAny():")
    loopAny()
    println("lambdaAny():")
    lambdaAny()
    println("lambdaAll():")
    lambdaAll()
}

fun loopAny() {
    var check = false
    for (num in anyAndAllList) {
        if(num % 17 == 0) {
            check = true
            break
        }
    }
    println(check)
}

fun lambdaAny() {
    println(anyAndAllList.any { it > 500 })
}

fun lambdaAll() {
    println(anyAndAllList.all { it % 2 == 0 })
}