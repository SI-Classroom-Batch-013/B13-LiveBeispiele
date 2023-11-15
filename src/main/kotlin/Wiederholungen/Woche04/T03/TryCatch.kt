fun main() {

    val numbers = listOf(1, 2, 3, 4)
    val name: String? = null

    // IndexOutOfBoundsException
    numbers[4]

    // NumberFormatException
    val input: String = readln()
    val equation = 10 / 0

    // NullPointerException
    name!!.length


    // Syntax
    try {
        val input: String = readln()
        val inputInt: Int = input.toInt()
        if(inputInt > 100) throw Exception("Zahl darf nicht größer als 100 sein!")

    } catch (e: NullPointerException) {
        println("Deine Eingabe darf nur Zahlen enthalten!")
    }
    catch (e: Exception) {
        println(e.message)
    }
}