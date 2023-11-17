fun main() {
    val würfel1 = (1..6).random()
    val würfel2 = (1..6).random()
    if (würfel1 > würfel2) {
        println("Spieler1 hat mit einer $würfel1 gegen Spieler2 mit einer $würfel2 gewonnen")
    } else if (würfel1 == würfel2) {
        println("Unentschieden: Beide Spieler haben eine $würfel1 geworfen")
    } else {
        println("Spieler2 hat mit einer $würfel2 gegen Spieler1 mit einer $würfel1 gewonnen")
    }
}