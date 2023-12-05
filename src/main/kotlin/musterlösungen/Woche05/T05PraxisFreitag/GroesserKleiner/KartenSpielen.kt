val kartendeck: List<String> = listOf(
    "Pik Ass", "Pik Koenig", "Pik Dame", "Pik Bube", "Pik 10", "Pik 9",
    "Pik 8", "Pik 7", "Pik 6", "Pik 5", "Pik 4", "Pik 3", "Pik 2",
    "Kreuz Ass", "Kreuz Koenig", "Kreuz Dame", "Kreuz Bube", "Kreuz 10", "Kreuz 9",
    "Kreuz 8", "Kreuz 7", "Kreuz 6", "Kreuz 5", "Kreuz 4", "Kreuz 3", "Kreuz 2",
    "Herz Ass", "Herz Koenig", "Herz Dame", "Herz Bube", "Herz 10", "Herz 9",
    "Herz 8", "Herz 7", "Herz 6", "Herz 5", "Herz 4", "Herz 3", "Herz 2",
    "Karo Ass", "Karo Koenig", "Karo Dame", "Karo Bube", "Karo 10", "Karo 9",
    "Karo 8", "Karo 7", "Karo 6", "Karo 5", "Karo 4", "Karo 3", "Karo 2",
)

fun main() {

    //Ein Beispiel zur Anwendung der Funktionen und des Kartendecks
    val meinDeck = kartendeck.toMutableList()

    mischen(meinDeck)
    val karte = eineKarteZiehen(meinDeck)
    val beispielWert = kartenWert(karte)
    val beispielFarbe = kartenFarbe(karte)
    println("Die gezogene Karte hat den Wert $beispielWert und die Farbe $beispielFarbe")

}

// mischt das als Parameter uebergebene Deck
fun mischen(deck: MutableList<String>) {
    deck.shuffle()
}

// gibt die oberste Karte aus dem Kartendeck als Rueckgabewer zurück und entfernt sie auch aus diesem
fun eineKarteZiehen(deck: MutableList<String>): String {
    val karte = deck.first()
    deck.remove(deck.first())
    return karte
}

// gibt die Farbe der uerbergebenen Kart zurueck
fun kartenFarbe(karte: String): String {
    val kartenSymbol = karte.split(" ")[0]

    return when (kartenSymbol) {
        in listOf("Pik", "Kreuz") -> "Schwarz"
        in listOf("Herz", "Karo") -> "Rot"
        else -> ""
    }
}

//gibt den Wert der Kart als Parameter uebergebenen Kartezurueck.
// z.B.: "Kreuz 7" -> 7  | "Herz König" -> 10 | ...
fun kartenWert(karte: String): Int {
    val kartenWert = karte.split(" ")[1]

    return when (kartenWert) {
        "Ass" -> 1
        "2" -> 2
        "3" -> 3
        "4" -> 4
        "5" -> 5
        "6" -> 6
        "7" -> 7
        "8" -> 8
        "9" -> 9
        "10" -> 10
        "Bube" -> 11
        "Dame" -> 12
        "Koenig" -> 13
        else -> 0
    }
}
