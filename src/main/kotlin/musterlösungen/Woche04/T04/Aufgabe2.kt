package musterlösungen.Woche04.T04
// Die LebensPunkte der 3 Spieler
var lebenspunkteSpieler1: Int = (1..50).random()
var lebenspunkteSpieler2: Int = (1..50).random()
var lebenspunkteSpieler3: Int = (1..50).random()

fun main() {
    // Ein Feuerball trifft alle Spieler:
    var schaden = (20..35).random()
    lebenspunkteSpieler1 -= schaden
    lebenspunkteSpieler2 -= schaden
    lebenspunkteSpieler3 -= schaden

    gameOver()
}

fun playerDown(lp: Int): Boolean {
    return if (lp <= 0) {
        println("Ein spieler ist down.")
        true
    } else {
        false
    }
}

fun gameOver(): Boolean {
    return if (playerDown(lebenspunkteSpieler1)
        && playerDown(lebenspunkteSpieler2)
        && playerDown(lebenspunkteSpieler3)) {
        println("Das Spiel ist vorbei!")
        true
    } else {
        println("Das Spiel geht weiter!")
        false
    }
}