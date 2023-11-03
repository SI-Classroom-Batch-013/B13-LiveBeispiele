package Aufgabe04

fun main() {
    val numbers: MutableList<Int> = mutableListOf(1,2,3,4,4,3,2,1,2,3,1,4)

    val numberSet: Set<Int> = numbers.toSet()

    val numberList: List<Int> = numberSet.toList()
    println(numberList)

}
