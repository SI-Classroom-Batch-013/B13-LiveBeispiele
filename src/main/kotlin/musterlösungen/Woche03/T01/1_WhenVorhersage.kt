/*

 Schreibe hier deine Antwort auf die Fragen

Es wird eine Konstante mit dem Wert "japanese" angelegt.
Anschließend sprint der Programmfluss in der When-Abfrage in die Zeile mit dem Schlüssel "japanese"
und gibt "Nationalität: Japanisch" in der Konsole aus.

Wenn die Konstante den Wert "canadian" hat, würde der Programmfluss bei der When-Abfrage in den else-teil springen
und "Nationalität nicht in Datenbank" ausgeben.

*/

fun main() {
    val nationality: String = "japanese"

    when (nationality) {
        "german" -> println("Nationalität: Deutsch")
        "italian" -> println("Nationalität: Italienisch")
        "japanese" -> println("Nationalität: Japanisch")
        "namibian" -> println("Nationalität: Namibisch")
        "brazilian" -> println("Nationalität: Brasilianisch")
        else -> println("Nationalität nicht in Datenbank")
    }
}