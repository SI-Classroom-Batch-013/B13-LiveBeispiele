val movieMap = mapOf(
    "Avatar" to listOf(10, 3, 6, 2, 8, 5, 9),
    "James Bond" to listOf(5, 3, 5, 7, 3, 1, 3),
    "One Piece" to listOf(8, 9, 10, 5, 7, 2, 3),
    "Der Schacht" to listOf(3, 3, 6, 9, 5, 4, 2),
    "Dragon Ball" to listOf(7, 8, 4, 5, 3, 8, 1),
    "Van Helsing" to listOf(8, 5, 1, 6, 8, 4, 5),
)

fun main() {
    println(
        movieMap.toList().sortedByDescending { it.second.count { innerIt -> innerIt in 3..7 } }.map { it.first }
    )
}