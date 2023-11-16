package musterlösungen.Woche04.T04

import java.lang.Exception
import java.lang.IllegalArgumentException

fun main() {
    try {
        println(getTitel(0x1A3F))
        println(getTitel(0x1A3FE))
    } catch (e: Exception) {
        println(e)
    }
    println(getPrice(0x1A3F))
    println(getPrice(0x1A3FE))
}

// Hier deine Funktion
fun getPrice(artikelNr: Int): Double? {
    var preis: Double? = null
    try {
        var titel = getTitel(artikelNr)
        preis = preisListe[titel]
    } catch (e: Exception) {
        println("$artikelNr hat keinen Eintrag.")
    }
    return preis
}

val filmArtikelNr = listOf<Int>(
    0x1A3F,
    0xF,
    0xAF,
    0xC15,
    0xCCF,
    0x44FE,
    0x3EA,
    0x33444AAA,
    0xFAFC,
    0x1243,
    0xEEA,
    0xFFFFA,
    0xDE12,
    0xF67
)

val filmListe = listOf<String>(
    "The Dark Knight",
    "Indiana Jones",
    "Die Hard",
    "John Wick 4",
    "The Shawshank Redemption",
    "Schindler's List",
    "The Godfather",
    "John Wick 3",
    "Star Wars",
    "The Matrix",
    "Shrek",
    "The Lord of the Rings",
    "WHO KILLED CAPTAIN ALEX",
    "Spiderman",
)
fun getTitel(artikelNr: Int): String {
    var result = when (artikelNr) {
        0x1A3F -> "John Wick 4"
        0xF -> "Schindler's List"
        0xAF -> "The Godfather"
        0xC15 -> "WHO KILLED CAPTAIN ALEX"
        0xCCF -> "Spiderman"
        0x44FE -> "The Shawshank Redemption"
        0x3EA -> "The Dark Knight"
        0xFAFC -> "Die Hard"
        0x1243 -> "Indiana Jones"
        0xEEA -> "Star Wars"
        0xDE12 -> "The Matrix"
        0xF67 -> "The Lord of the Rings"
        else -> throw IllegalArgumentException("Ungültige Eingabe!!! ERROR!!!!")
    }
    return result
}

val preisListe: Map<String, Double> = mapOf(
    "The Dark Knight" to 1.99,
    "Indiana Jones" to 5.02,
    "Die Hard" to 59.89,
    "John Wick 4" to 128.99,
    "The Shawshank Redemption" to 60.61,
    "Schindler's List" to 199.00,
    "The Godfather" to 6.91,
    "John Wick 3" to 8.12,
    "Star Wars" to 8.59,
    "The Matrix" to 9.01,
    "Shrek" to 6.71,
    "The Lord of the Rings" to 9.87,
    "WHO KILLED CAPTAIN ALEX" to 0.02,
    "Spiderman" to 10.99,
)