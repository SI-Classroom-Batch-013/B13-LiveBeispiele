package Aufgabe08

fun main() {
    val numbers: MutableList<Int> = mutableListOf(1, 2, 3, 4)

    //numbers[2] = 5
    numbers[0] = 1

    var summe = 0
    summe += numbers[0]
    summe += numbers[1]
    summe += numbers[2]
    summe += numbers[3]


    println("Die Summe ist: $summe")

    //TODO: Es taucht eine IndexOutOfBoundsException auf. Behebe sie.

    // TODO: Die Ausgabe sollte "Die Summe ist: 10" sein.
    //TODO:  Gehe mit dem Debugger Zeile für Zeile den Code durch, und finde mit dem Debugger aus, in welchen Zeilen was schief läuft und fixe die Fehler!
}
