fun main() {
    println("Spiel - Rot oder Schwarz?")

    val myDeck = kartendeck.toMutableList()
    mischen(myDeck)

    while (myDeck.isNotEmpty()) {
        if (rotOderSchwarz(myDeck) != null) {
            println("richtig geraten!")
        } else {
            println("falsch geraten!")
        }
    }

    println("Spiel vorbei!")
}

fun rotOderSchwarz(deck: MutableList<String>): String? {

    println()
    println("Ist die nächste Karte rot oder schwarz?")
    val guess = readln()

    Thread.sleep(500)
    val nextCard = eineKarteZiehen(deck)
    println("Es wurde die Karte $nextCard gezogen")
    Thread.sleep(500)

    return if (kartenFarbe(nextCard).lowercase() == guess.lowercase()) {
        nextCard
    } else {
        null
    }
}