fun main() {
    var numbers: List<Int> = listOf(1, 2, 3, 4)
    var number: Int

    try {
        number = numbers[10]
    } catch (e: Exception) {
        println("Ein Fehler ist aufgetreten:")
        println(e)
        number = -1
        println("Die Variable wurde auf $number gesetzt")
    }

}
