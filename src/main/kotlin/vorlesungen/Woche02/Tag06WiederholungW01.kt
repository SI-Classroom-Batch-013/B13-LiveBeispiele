package vorlesungen.Woche02

fun main() {

    var firstName: String = "Herbert"
    firstName = " Maria"

    println(firstName) // Maria

    val newName = "Eva"
    firstName = newName
    println(firstName) // Eva


    // Type Conversion
    println("Bitte Kommzahl (Double) anlegen...")
    val zahlString: String = readln()
    val zahl: Double = zahlString.toDouble() // toDouble verändert nicht den originalen Wert, sondern gibt einen neuen Wert zurück
    println("Die eingegebene Double-Zahl ist $zahl ")



}