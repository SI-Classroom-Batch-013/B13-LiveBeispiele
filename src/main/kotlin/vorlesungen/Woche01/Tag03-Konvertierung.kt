package vorlesungen.Woche01

fun main() {

    // toDouble()
    var doubleNummer: Double = 10.0
    var stringNummer: String = "10.0"
    var intNumber: Int = 9


    var stringDoubleNummer = stringNummer + doubleNummer

    // die beiden Variablen werden konkateniert
    println(stringNummer + doubleNummer)
    println(stringDoubleNummer)

    // ich will stringNummer rechenbar machen, also in ein Double konvertieren.
    var strNrToDouble: Double = stringNummer.toDouble() // 10.0, nicht mehr "10.0"
    println(strNrToDouble+doubleNummer) // jetzt kann gerechnet statt konkateniert werden.
    var intNrToDouble: Double = intNumber.toDouble() // 9.0


    // kleines Programm, wo nutzer eine Zahl eingeben soll
    println("Bitte gib eine Zahl ein...")
    var inputNumber: Double = readln().toDouble()
    readln()
    println("Dein Zahl $inputNumber wird * 10 gerechnet...")

    // ${} = alles in den {} wird als Code, der ausgefuehrt wird, betrachtet.
    println("Ergebnis: ${inputNumber*10}")

    // toInt(): verändert nicht s selbst, sondern gibt ein Ergebnis zurueck, das in einer Variable gespeichert werden muss
    val stringDerKonvertiertWerdenSoll: String = "1"
    var sToInt: Int = stringDerKonvertiertWerdenSoll.toInt() // 1, nicht "1" drin stehen, koennen damit rechnen

    // die Operation wird ausgefuehrt, das ergebnis davon wird aber nicht in einer variable gespeichert.
    stringDerKonvertiertWerdenSoll.toInt()
    // nicht in variable gespeichert, wird sofort wieder vergessen


    // wenn ich einen Double .toInt() mache, wird die Nachkommastelle einfach abgehackt.
    println(100.5.toInt()) // 100

    // bei toInt wird die nachkommastelle abgehakt
    var doubleToInt = 11.9.toInt()
    println(doubleToInt)

    var stringMitIntDrin = "13"
    println(stringMitIntDrin+100)

    var stringToInt: Int = stringMitIntDrin.toInt() // 13 als Int steht in stringToInt drin
    println(stringToInt+100)


    // toString()
    var doubleNr: Double = 18.8
    println(doubleNr+10)
    var doubleNrAlsString: String = doubleNr.toString()
    println(doubleNrAlsString+10)

    var intStringKonv: String = 9.toString()

    // toBoolean(): geht nur mit Strings
    var boolString = "false"
    var boolStringToBool = boolString.toBoolean()

    var boolToString = true.toString()

}

fun blabla(){
    var s: String = "1"
}