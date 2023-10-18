package vorlesungen

fun main() {

    // OPERATIONEN

    // +, -, *, / und % -> gehen alle sowohl auf Int als auch auf Double
    val summeAusZweiInts: Int = 30+99 // 129
    val summeAusZweiDoubles: Double = 100.0 + 80.0
    println(summeAusZweiInts)
    val doubleDiff: Double = 100.5-50.5
    println(doubleDiff)

    val divident: Double = 15.0/3.0 // 5.0
    println(divident)

    val rest: Int = 90%20
    println("Ergebnis von 90%20 = $rest")

    println("----RECHNUNG----")
    // rechenErgebnis ist ein Int, kann nicht nachtraeglich zum Double werden
    var rechenErgebnis: Int = summeAusZweiInts + 90 // 219
    println(rechenErgebnis)
    // rechenErgebnis wird in Z. 67 eigentlich zum Double, wurde aber als Int initialisiert, deshalb wird die Nachkommastelle abgehackt.
    rechenErgebnis = rechenErgebnis/2 // 109

    var rechenErgebnisAlsDouble: Double = rechenErgebnis/2.toDouble() // 109/2 = 54.5
    println(rechenErgebnis)
    println(rechenErgebnisAlsDouble)
    println("----RECHNUNG ENDE----")



    val result: Double = summeAusZweiInts * divident
    println("Ergebnis von $summeAusZweiInts * $divident = $result")

    // String Konkatenation: mit + verschiedene Variablen verbinden

    var string1: String = "Hallo "
    println(string1)
    var string2: String = "Leute, wie geht's "
    println(string2)
    var string3: String = "euch heute?"
    println(string3)

    var konkatString: String = string1 + string2 + string3 // "Hallo Leute, wie geht's euch heute?"
    println(konkatString)

    // + Symbol: bei Ints normalerweise Rechnung, sobald ein String im Spiel ist: Konkatenation
    var stringIntKonkat: String = string1 + summeAusZweiInts + " ist eine Summe." // Hallo 129 ist eine Summe.
    println(stringIntKonkat)

    // Punkt vor Strich wird beachtet
    var rechnung = 1+2*2 // 5
    println(rechnung)
    // Punkt vor Strich kann mit Klammern umgangen Werden
    var rechnungKlammer = (1+2)*2 // 6

    // Strings werden konkateniert, auch, wenn Zahlen drin stehen
    var zahl: String = "13"
    var zahl2: Int = 13
    // Konkatenation kann auch direkt in println gemacht werden, muss nicht in eine Variable gespeichert werden
    println(zahl+zahl2)












}