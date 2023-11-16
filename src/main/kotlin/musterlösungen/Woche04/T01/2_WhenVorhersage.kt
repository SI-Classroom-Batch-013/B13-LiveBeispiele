/*

 Schreibe hier deine Antwort auf die Fragen

Es wird eine Konstante mit dem Wert 5 angelegt.
Dann springt der Programmfluss in der When-Abfrage in den else-teil
und gibt "Nicht bestanden!" in der Konsole aus.

*/

fun main() {
    val note: Int = 5
    when (note)  {
        1 -> println("Bestanden!")
        2 -> println("Bestanden!")
        3 -> println("Bestanden!")
        4 -> println("Bestanden!")
        else -> println("Nicht bestanden!")
    }
}