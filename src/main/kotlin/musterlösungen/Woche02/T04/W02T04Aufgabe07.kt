package Aufgabe07

fun main() {
    val fruits: MutableMap<String, String?> = mutableMapOf(
        "A" to "Apfel",
        "B" to "Birne",
        "D" to "Dattel",
        "F" to "Feige"
    )

    // Variante 1: Key wählen, der exisitert
    val fruit: String = fruits["F"]!!

    // Variante 2: Safe Call mit ? benutzen
    val safeFruit: String? = fruits["C"]

    println(fruit.lowercase())


}
