/*

 Schreibe hier deine Antwort auf die Frage

Das Programm legt die Konstante sunny mit dem Wert false an.
In der If-Abfrage springt der Programmfluss in den zweiten Codeblock, dem else-block,
da sunny false ist.
Schlussendlich gibt das Programm "Leider sieht es heute nicht nach Sonne aus." in der Konsole aus.

*/

fun main() {
    val sunny = false

    if (sunny) {
        println("Heute scheint die Sonne!")
    } else {
        println("Leider sieht es heute nicht nach Sonne aus.")
    }
}