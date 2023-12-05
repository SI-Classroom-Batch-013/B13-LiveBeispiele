package vorlesungen.Woche05.Tag25

fun main() {

  //TODO Muenzwurf simulieren

    var anzahlGewinne: Int = 0
    var anzahlNiederlagen: Int = 0


    do {
        // wetten, welche seite auftaucht
        // kopf = true, zahl = false
        println("Wette! Kommt gleich Kopf oder Zahl? Kopf = true, Zahl = false")
        var wette: Boolean = readln().toBoolean()
        // random element aus liste mit true und false: kopf oder zahl werfen
        var muenzWurf: Boolean = listOf(true,false).random()
        println("Die Münze zeigt ${if (muenzWurf) "Kopf" else "Zahl"}")
        // wette gewonnen?
        if (wette == muenzWurf){
            println("Richtig geraten! Gewonnen!")
            anzahlGewinne++
        } else{
            println("Falsch geraten! Verloren.")
            anzahlNiederlagen++
        }
        // nochmal spielen?
        println("Du hast bereits $anzahlGewinne Runden gewonnen!")
        println("Du hast bereits $anzahlNiederlagen Runden verloren!")
        println("Nochmal spielen? (ja/nein)")
        var gameOver = readln().lowercase()

        if (gameOver == "ja"){
            println("Willst du komplett neu starten (Anzahl Gewinne/Niederlagen löschen? (ja/nein)")
            var neustart: String = readln().lowercase()
            if (neustart == "ja") {
                anzahlGewinne = 0
                anzahlNiederlagen = 0
            }

        }

    } while (gameOver == "ja")

}
