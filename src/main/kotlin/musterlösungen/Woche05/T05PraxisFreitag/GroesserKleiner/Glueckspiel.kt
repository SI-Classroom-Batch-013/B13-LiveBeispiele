fun main() {

    println("Spiel - Glücksspiel")

    val myDeck = kartendeck.toMutableList()
    mischen(myDeck)

    var balance = 100

    var currentCard: String? = null

    while (myDeck.isNotEmpty() && balance != 0) {

        var bet: Int
        do {
            println("Setze einen Betrag! Kontostand: $balance")
            bet = readln().toInt()
        } while (bet > balance)

        if (currentCard.isNullOrEmpty()) {
            currentCard = eineKarteZiehen(myDeck)
        }

        println("Aktuelle Karte: $currentCard")
        println()
        println("Spiel 1: Rot oder Schwarz?")

        currentCard = rotOderSchwarz(myDeck)

        if (currentCard == null) {
            balance -= bet
            println("falsch geraten! Neuer Kontostand: $balance")
            Thread.sleep(500)

            println("Nächste Runde? ja / nein")
            if (readln().lowercase() == "nein") {
                break
            }
            continue
        }

        println("Richtig geraten!")
        Thread.sleep(500)

        println("Spiel 2: Höher oder tiefer?")

        currentCard = hochOderTief(myDeck, currentCard)

        if (currentCard == null) {
            balance -= bet
            println("falsch geraten! Neuer Kontostand: $balance")
            Thread.sleep(500)

            println("Nächste Runde? ja / nein")
            if (readln().lowercase() == "nein") {
                break
            }
            continue
        }

        balance += bet * 2

        println("Richtig geraten! Neuer Kontostand: $balance")

        println("Nächste Runde? ja / nein")
        if (readln().lowercase() == "nein") {
            break
        }
    }
}