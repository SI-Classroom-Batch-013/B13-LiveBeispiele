/*

 a) Schreibe hier deine Antwort auf die Frage

Es wird eine Konstante mit dem Wert 2011 angelegt.
In der ersten If-Abfrage springt der Programmfluss in den ersten If-Else-teil,
da der Wert 2011 ist und gibt in der Konsole "Kind ist in Gruppe B" aus.

 b) Schreibe hier deine Antwort auf die Frage

Dieser Code verwendet anstelle einer mehrfachen If-Else-Abfrage eine When-Abfrage.
Beide Varianten geben das Gleiche in der Konsole aus.
Die When-Variante ist aber lesbarer und daher die allgemein bevorzugte Variante.

 c) Schreibe hier deine Antwort auf die Frage

Beide Varianten würden "Kind ist in Gruppe D" in der Konsole ausgeben.

 d) Schreibe hier deine Antwort auf die Frage

Beide Varianten würden "Für dieses Geburtsjahr gibt es keine Gruppe" in der Konsole ausgeben.

*/

fun main() {
    foo()
    bar()
}

fun foo() {
    val birthyear: Int = 2011

    if (birthyear == 2010) {
        println("Kind ist in Gruppe A")
    } else if (birthyear == 2011) {
        println("Kind ist in Gruppe B")
    } else if (birthyear == 2012) {
        println("Kind ist in Gruppe C")
    } else if (birthyear == 2013) {
        println("Kind ist in Gruppe D")
    } else if (birthyear == 2014) {
        println("Kind ist in Gruppe E")
    } else {
        println("Für dieses Geburtsjahr gibt es keine Gruppe")
    }
}

fun bar() {
    val birthyear: Int = 2011

    when (birthyear) {
        2010 -> println("Kind ist in Gruppe A")
        2011 -> println("Kind ist in Gruppe B")
        2012 -> println("Kind ist in Gruppe C")
        2013 -> println("Kind ist in Gruppe D")
        2014 -> println("Kind ist in Gruppe E")
        else -> println("Für dieses Geburtsjahr gibt es keine Gruppe")
    }
}