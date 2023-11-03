fun main() {
    val numbers: MutableList<Int> = mutableListOf(2,5,3,9,8)
    val evenNumbers: List<Int> = listOf(2,8) // Ihr könnt diese Liste als Hilfsmittel benutzen
    // Unter diesem Kommentar deinen Code reinschreiben:

    numbers.retainAll(evenNumbers)
    println(numbers)
}