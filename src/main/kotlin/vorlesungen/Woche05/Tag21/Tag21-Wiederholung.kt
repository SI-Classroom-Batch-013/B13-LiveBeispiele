package vorlesungen.Woche05.Tag21

fun main() {

    // when-Ergebnis direkt in Variable abspeichern
    println("Zahl eingeben...")
    val zahl = readln().toInt()

    val text = when (zahl) {
        1 -> "Eins"
        2 -> "Zwei"
        3 -> "Drei"
        else -> "Andere Zahl"
    }

    println("Das Ergebnis von 'when' ist: $text")

    val zahl2 = 3
    val text2 = decideText(zahl)

    println("Das Ergebnis von 'when' ist: $text")

}

// when-Ergebnis in Variable speichern: mit Funktionsaufruf, der String zurückgibt
fun decideText(zahl: Int): String {
    return when (zahl) {
        1 -> "Eins"
        2 -> "Zwei"
        3 -> "Drei"
        else -> "Andere Zahl"
    }
}
