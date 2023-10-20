package vorlesungen.Woche01

fun main() {
    // Variable anlegen: Schluesselwort var - variablenname - : Datenyp - = - inhalt
    var firstName: String = "Harry"
    println(firstName)
    println("Hallo, wie geht es dir $firstName") // $ = escapen/interpolieren, sodass innerhalb eines Strings Variablen als solche erkannt werden
    println("Hallo, wie geht es dir\nfirstName") // \n = zeilenumbruch

    // Variable aktualisieren
    firstName = "Ron"
    println(firstName)

    // firstName = "Hermine"
    println(firstName)


    // weshalb wir CamelCase benutzen: Besser lesbar 🐫
    var istHeuteEinGuterTag: Boolean
    istHeuteEinGuterTag = true
    var istheuteeingutertag: Boolean = true


    // Konstante: Schluesselwort val, nicht veraenderbar.
    val daysOfTheWeek: Int // Variable deklarieren ohne Inhalt: nur mit Datentyp moeglich
    daysOfTheWeek = 7
    println(daysOfTheWeek)
    // daysOfTheWeek = 10 // einkommentieren zum ausprobieren, nicht erlaubt da vals nicht aktualisiert werden duerfen.

    // readln() benutzen, in Variable speichern
    println("Bitte deinen Namen eingeben...")
    val name: String = readln() // readln() gibt einen String zurück
    println("Bitte deine Liebingsstadt eingeben...")
    val city: String = readln()
    println("Der eingegebene Name ist: $name \nDie eingegebene Stadt ist: $city")


    // Datentyp Integer

    var number: Int = 10
    var number2: Int = 20
    println("Aus der Variable number gelesene Zahl nr1 ist: $number")
    println(number2)

    var result: Int = number + number2 // 10 + 20 = 30
    println("Ergebnis der Rechnung von $number + $number2 = $result")

    var result2: Int = 99 - 1

    println("Bitte Zahl eingeben...")
    var inputNumber: Int = readln().toInt()

    var x = 10 + inputNumber
    println("Ergebnis: $x")


    // Datentyp Double:
    var doubleNr: Double = 10.0
    var doubleNo: Double = 9.5
    var doubleResult: Double = doubleNo * doubleNr

    var intNumber: Int = 5
    var intDoubleResult: Double = doubleNo + intNumber

    // Datentyp Boolean:
    var isSunShining: Boolean = true
    println("es ist $isSunShining, dass heute die Sonne scheint.")
    isSunShining = false
    println("es ist $isSunShining, dass heute die Sonne scheint.")


}