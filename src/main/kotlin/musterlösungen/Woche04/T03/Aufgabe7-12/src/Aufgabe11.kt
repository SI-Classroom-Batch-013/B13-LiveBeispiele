/*
    Schreibe hier deine Antwort rein
    Bruce bekommt einen Gutschein im Wert von 20€
    Tony bekommt keinen Gutschein
    Wanda bekommt einen Gutschein im Wert von 10€
 */

fun main() {
    // Kunde 1
    val kunde1Name = "Bruce"
    val kunde1Preis = 346
    gutscheinBekommen(kunde1Preis, kunde1Name)
    // Kunde2ㅤㅤ
    val kunde2Name = "Tony"
    val kunde2Preis = 42
    gutscheinBekommen(kunde2Preis, kunde2Name)
    // Kunde3
    val kunde3Name = "Wanda"
    val kunde3Preis = 188
    gutscheinBekommen(kunde3Preis, kunde3Name)
}

fun gutscheinBekommen(preis: Int, name: String) {
    if (preis > 200) {
        println("$name bekommt einen Gutschein im Wert von 20€")
    } else if (preis > 100) {
        println("$name bekommt einen Gutschein im Wert von 10€")
    } else if (preis > 50) {
        println("$name bekommt einen Gutschein im Wert von 5€")
    } else {
        println("$name bekommt keinen Gutschein")
    }
}