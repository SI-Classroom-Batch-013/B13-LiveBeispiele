/*
Schreibe hier deine Antwort auf:
Es wird überprüft, ob noch 8 Sitzeplätze verfügbar sind...
Es sind leider nicht mehr genug Sitzplätze verfügbar.
 */
var availableSeats = 6

fun main() {
    try {
        reserveSeats(8)
    } catch (e: Exception) {
        println("Es sind leider nicht mehr genug Sitzplätze verfügbar.")
    }
}

fun reserveSeats(numberOfSeats: Int) {
    println("Es wird überprüft, ob noch " + numberOfSeats + " Sitzeplätze verfügbar sind...")
    if (numberOfSeats > availableSeats) {
        throw Exception("not enough available seats left")
    } else {
        availableSeats = availableSeats - numberOfSeats
        println("Die Sitzplätze wurden erfolgreich gebucht!")
    }
}