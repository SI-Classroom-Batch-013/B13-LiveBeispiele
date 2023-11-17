/*
Schreibe hier deine Antwort auf:
Es wird überprüft, ob die Schuhe noch vorrätig sind.
Diese Schuhe sind leider ausverkauft
 */
var numberOfShoes = 0

fun main() {
    try {
        orderShoes()
    } catch (e: Exception) {
        println("Diese Schuhe sind leider ausverkauft")
    }
}

fun orderShoes() {
    println("Es wird überprüft ob die Schuhe noch vorrätig sind...")
    if (numberOfShoes > 0) {
        println("Die Schuhe wurden bestellt")
        numberOfShoes = numberOfShoes - 1
    } else {
        throw Exception("no shoes available")
    }
}