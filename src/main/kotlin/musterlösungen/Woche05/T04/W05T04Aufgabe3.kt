val listOfScores = listOf(
    listOf(2, 4, 2, 5, 1, 3),
    listOf(1, 6, 7, 4, 4, 6),
    listOf(4, 2, 5, 5, 5, 4),
    listOf(3, 3, 6, 2, 7, 3),
    listOf(5, 4, 2, 2, 3, 5),
    listOf(4, 6, 3, 3, 7, 3),
)

fun main() {
    println("sortedByLoop():")
    sortedByLoop()
    println("sortedByLambda():")
    sortedByLambda()
    println("maxByLambda():")
    maxByLambda()
    println("minByLambda():")
    minByLambda()
}

// Beispiel wie kompliziert es sein könnte, hier mit Schleifen zu sortieren.
fun sortedByLoop() {
    var sortedList = mutableListOf<List<Int>>()
    var sortingList = listOfScores.toMutableList()
    while(sortingList.size != 0) {
        var smallest = Integer.MAX_VALUE
        var smallestList: List<Int> = mutableListOf()
        for (list in sortingList) {
            if (list[0] < smallest) {
                smallest = list[0]
                smallestList = list
            }
        }
        sortedList.add(smallestList)
        sortingList.remove(smallestList)
    }
    println(sortedList)
}

fun sortedByLambda() {
    println(listOfScores.sortedBy { it[2] })
}

fun maxByLambda() {
    println(listOfScores.maxBy { it[3] })
}

fun minByLambda() {
    println(listOfScores.minBy { it[4] })
}