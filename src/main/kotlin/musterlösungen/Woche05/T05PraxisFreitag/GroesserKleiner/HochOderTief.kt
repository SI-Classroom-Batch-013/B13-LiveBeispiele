fun main() {
    println("Spiel - Höher oder tiefer?")

    val myDeck = kartendeck.toMutableList()
    mischen(myDeck)

    var wrongCounter = 0

    var lastCard: String? = null
    while (myDeck.isNotEmpty() && wrongCounter < 3) {

        if (lastCard == null) {
            lastCard = eineKarteZiehen(myDeck)
        }

        lastCard = hochOderTief(myDeck, lastCard)

        if (lastCard != null) {
            println("richtig geraten!")
            wrongCounter = 0
        } else {
            println("falsch geraten!")
            wrongCounter++
        }
    }

    if (myDeck.isEmpty()) {
        println("Gewonnen! 🥳")
    } else {
        println("Verloren!")
    }
}

fun hochOderTief(deck: MutableList<String>, card: String): String? {

    val cardValue = kartenWert(card)

    println()
    println("Die vorliegende Karte ist: $card mit Wert $cardValue")
    println("Ist die nächste Karte höher oder tiefer?")

    val guess = readln()
    val nextCard = eineKarteZiehen(deck)
    val valueNextCard = kartenWert(nextCard)

    Thread.sleep(500)
    println("Es wurde die Karte $nextCard gezogen")
    Thread.sleep(500)

    if (valueNextCard > cardValue) {
        if (guess.lowercase() == "höher") {
            return nextCard
        }
    }
    if (valueNextCard < cardValue) {
        if (guess.lowercase() == "tiefer") {
            return nextCard
        }
    }

    return null
}