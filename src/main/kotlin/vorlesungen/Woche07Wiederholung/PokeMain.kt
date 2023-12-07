package vorlesungen.Woche07Wiederholung

import Beutel
import Pokemon

fun main() {
    // Helden
    var bisasam = Pokemon("Bisasam","Pflanze")
    var schiggy = Pokemon("Schiggy","Wasser")
    val glumanda = Pokemon("Glumanda", "Feuer")

    // Gegner
    val taubsi = Pokemon("Taubsi")
    val rattfratz = Pokemon("Rattfratz")
    val habitak = Pokemon("Habitak")

    // Team an Helden
    val helden: MutableList<Pokemon> = mutableListOf(bisasam,schiggy,glumanda)
    // Team an Gegnern
    val gegnerListe: MutableList<Pokemon> = mutableListOf(taubsi,rattfratz,habitak)

    // Game Loop
    spielRunde(helden, gegnerListe)

}

fun spielRunde(helden: MutableList<Pokemon>, gegnerListe: MutableList<Pokemon>) {
    // Game Loop Vorbereitung
    // Variable, anhand der wir pruefen, ob das spiel vorbei ist
    var gameOver: Boolean = false
    // Rundencounter
    var round: Int = 1
    var teamBeutel = Beutel()


    while (!gameOver){
        println("---Runde $round!---")
        if (round == 2){
            println("Das Gegner Team spawnt in der 2. Runde einen Helfer...")
            gegnerListe.add(Pokemon("Helfer-Pokemon Nidoran"))
        }
        // print alle helden in meinem team und ihre aktionen --> ueber liste der helden iterieren
        println("--Unser Team:--")
        // print alle helden in meinem team und ihre aktionen --> ueber liste der helden iterieren
        helden.forEach { println(it) }
        // print alle gegner --> ueber liste der gegner iterieren
        println("--Gegner Team:--")
        var lebendeGegner = gegnerListe.filter { !it.isDead } // nur lebende Gegner werden rausgefiltert
        lebendeGegner.forEach { println(it) }

        // schleife, bis alle helden angegriffen haben:
        // print: "1./2./3. held soll angreifen, welche attacke?"
        lebendeGegner = heldenAngriff(helden, lebendeGegner,teamBeutel)
        // gegner greifen an: exact das gleiche
        // hardcode, keine richtige Logik
        println("Taubsi/Rattfratz/Habitak greift an! Bisasam/Glumanda/Schiggy verliert x hp....")

        println("Runde $round beendet!")
        println("ggf. nochmal Status von allen ausdrucken...")


        // pruefen, ob noch helden oder gegner uebrig sind
        gameOver = gameOver(helden, lebendeGegner, gameOver)
        round++
    }
    println("Game Loop beendet!") // Logik: helden oder gegner tot?


}

fun gameOver(helden: List<Pokemon>, lebendeGegner: List<Pokemon>,
    gameOver: Boolean
): Boolean {
    var gameOver1 = gameOver
    if (helden.isEmpty()) {
        gameOver1 = true
        println("Unsere Helden haben versagt... Game Over :(")
    } else if (lebendeGegner.isEmpty()){
        gameOver1 = true
        println("Geschafft! Unsere Helden haben gewonnen, Game Over :)")
    }
    return gameOver1
}

private fun heldenAngriff(
    helden: List<Pokemon>,
    lebendeGegner: List<Pokemon>, teamBeutel: Beutel
): List<Pokemon> {
    var lebendeGegner1 = lebendeGegner
    for (held in helden) {
        var validInput = false
        while (!validInput) {
            println("${held.name} soll angreifen. Wähle die Attacke per Zahleneingabe aus!")
            println("[1] => Tackle, [2] => Heuler, etc, [4] => Beutel nutzen")
            try {
                val choice = readln().toInt()
                when (choice) {
                    1 -> {
                        if (lebendeGegner1.isNotEmpty()) {
                            held.tackle(lebendeGegner1.first())
                            // angeben, dass ggf. der Gegner bereits gestorben ist
                            lebendeGegner1 = lebendeGegner1.filter { !it.isDead }
                        } else {
                            println("Es gibt keine lebenden Gegner mehr.")
                        }
                        validInput = true
                    }
                    // 2 -> held.heuler(gegner.random())
                    // etc weitere Attacken
                    4 -> {
                        println("Du willst also den Beutel nutzen.")
                        var beutelEingabe = held.useBeutel(teamBeutel)
                        if (beutelEingabe != 3) {
                            validInput = true
                        }
                    }
                    else -> {
                        println("Falsche Eingabe, versuche es nochmal...")
                    }
                }
            } catch (e: NumberFormatException) {
                println("Ungültige Eingabe! Gib eine Zahl ein...")
            }
        }
    }
    return lebendeGegner1
}
