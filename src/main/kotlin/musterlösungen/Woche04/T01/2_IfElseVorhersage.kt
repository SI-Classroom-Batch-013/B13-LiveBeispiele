
/*

 Schreibe hier deine Antwort auf die Frage

Es werden die zwei Variablen sunny und cloud mit den Werten false und true angelegt.
In der ersten If-Abfrage springt der Programmfluss in den zweiten Codeblock, dem else-block, da sunny false ist.
Im else-block in der nächsten If-Abfrage springt der Programmfluss in den ersten Codeblock, da cloudy true ist.
Schlussendlich gibt das Programm in der Konsole "Leider scheint heute nicht die Sonne und es ist bewölkt." aus.

*/

fun main() {
    val sunny = false
    val cloudy = true

    if (sunny) {
        println("Heute scheint die Sonne!")
    } else {
        if (cloudy) {
            println("Leider scheint heute nicht die Sonne und es ist bewölkt.")
        } else {
            println("Es scheint zwar nicht die Sonne aber es ist auch nicht zu wolkig.")
        }
    }
}