/*

 a) Schreibe hier deine Antwort auf die Frage

Die drei Konstanten sunny, cloudy, rainy mit den Werten false, true, true werden angelegt.
Der Programmfluss springt, bei der ersten If-Abfrage, in den else-block, da sunny false ist.
Dann springt der Programmfluss, bei der nächsten If-Abfrage 'if (cloudy)', in den ersten Codeblock,
da cloudy true ist.
Anschließend springt der Programmfluss, bei der darauf nächsten If-Abfrage 'if (rainy)' in den ersten Codeblock,
da rainy true ist.
Schlussendlich wird "Heute regnet es" in der Konsole ausgegeben.

 b) Schreibe hier deine Antwort auf die Frage

Es wird "Leider scheint heute nicht die Sonne und es ist bewölkt." ausgegeben,
weil in der letzten Abfrag, im Unterschied zu Aufgabenteil a), rainy nicht true, sondern false ist.

 c) Schreibe hier deine Antwort auf die Frage

Es wird "Es scheint zwar nicht die Sonne aber es ist auch nicht zu wolkig." ausgegeben,
weil in der zweiten If-Abfrage, im Unterschied zu Aufgabenteil a), cloudy nicht true, sondern false ist.

*/

fun main() {
    val sunny = false
    val cloudy = true
    val rainy = true

    if (sunny) {
        println("Heute scheint die Sonne!")
    } else {
        if (cloudy) {
            if (rainy) {
                println("Heute regnet es!")
            } else {
                println("Leider scheint heute nicht die Sonne und es ist bewölkt.")
            }
        } else {
            println("Es scheint zwar nicht die Sonne aber es ist auch nicht zu wolkig.")
        }
    }
}