package vorlesungen.Woche07Wiederholung

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
    // Team an Gegner
    val gegnerListe: MutableList<Pokemon> = mutableListOf(taubsi,rattfratz,habitak)

    // Beutel
    var beutel = Beutel()

    spielRunde(helden, gegnerListe, beutel)

}

fun spielRunde(helden: MutableList<Pokemon>, gegnerListe: MutableList<Pokemon>, beutel: Beutel) {
    // Game Loop Vorbereitung
    // Variable, anhand der wir pruefen, ob das spiel vorbei ist
    var gameOver: Boolean = false
    // Rundencounter
    var round: Int = 1
    // auch hier: beutelBenutzt ? wenn ja -> gar nicht erst anzeigen

    while (!gameOver){
        println("---Runde $round!---")
        // Logik, um den Gegner Helfer zu beschwören
        rufeHelfer(round, gegnerListe)

        // print alle helden in meinem team und ihre aktionen --> ueber liste der helden iterieren
        println("--Unser Team:--")
        // print alle helden in meinem team und ihre aktionen --> ueber liste der helden iterieren
        var lebendeHelden = helden.filter { !it.isDead }.toMutableList()
        lebendeHelden.forEach { println(it) }
        // print alle gegner --> ueber liste der gegner iterieren
        println("--Gegner Team:--")
        var lebendeGegner = gegnerListe.filter { !it.isDead }.toMutableList() // nur lebende Gegner werden rausgefiltert
        lebendeGegner.forEach { println(it) }


        lebendeGegner = aktionen(lebendeHelden, lebendeGegner, beutel)
        // gegner greifen an: exact das gleiche
        // hardcode, keine richtige Logik

        lebendeHelden = aktionen(lebendeGegner, lebendeHelden, beutel)
        lebendeHelden = helden.filter { !it.isDead }.toMutableList()

        println("Runde $round beendet!")
        println("ggf. Status von allen ausdrucken...")
        gameOver = gameOver(helden, lebendeGegner, gameOver)
        round++
    }
    println("Spiel beendet! Alle Gegner sind besiegt!") // Logik: helden oder gegner tot?

}

private fun rufeHelfer(round: Int, gegnerListe: MutableList<Pokemon>) {
    if (round == 2) {
        println("Das Gegner Team holt sich in der $round. Runde einen Helfer dazu.....")
        gegnerListe.add(Pokemon("Helfer-Pokemon Mauzi"))
    }
}

private fun gameOver(helden: MutableList<Pokemon>, lebendeGegner: MutableList<Pokemon>, gameOver: Boolean): Boolean {
    var gameOver1 = gameOver
    if (helden.isEmpty()) {
        println("Unsere Helden haben versagt... Game Over :(")
        gameOver1 = true
    } else if (lebendeGegner.isEmpty()){
        println("Geschafft! Unsere Helden haben gewonnen! Game Over :) ")
        gameOver1 = true
    }
    return gameOver1
}

private fun aktionen(helden: MutableList<Pokemon>, lebendeGegner: MutableList<Pokemon>, beutel: Beutel): MutableList<Pokemon> {
    var lebendeGegner1 = lebendeGegner
    var inputValid = false
    // schleife, bis alle helden angegriffen haben:
    // print: "1./2./3. held soll angreifen, welche attacke?"
    for (held in helden) {
        inputValid = false
        println("${held.name} soll angreifen. Wähle die Attacke per Zahleneingabe aus!")

        while (!inputValid){
            // wenn beutel benutzt: beutel gar nicht erst anzeigen
            println("[1] => Tackle, [2] => Heuler, [3] => Beutel")
            try {
                val choice = readln().toInt()
                when (choice) {
                    1 -> {
                        held.tackle(lebendeGegner1.first())
                        // angeben, dass ggf gegner bereits gestorben ist
                        lebendeGegner1 = lebendeGegner1.filter { !it.isDead }.toMutableList()
                        inputValid = true
                    }
                    // 2 -> held.heuler(gegner.random())
                    // etc weitere attacken
                    3 -> {
                        // wenn beutelBenutzt -> return / continue (mit println vllt noch, das bescheid sagt, dass der beutel bereits benutzt wurde)
                        var input = held.useBeutel(beutel)
                        if (input == 1 || input == 2 ){
                            inputValid = true
                            // wenn beutel noch nicht benutzt wurde: beutelBenutzt = true
                        }
                    }
                    else -> {
                        println("Falsche Zahl eingegeben, gib eine gültige Zahl ein!")
                        // inputValid bleibt hier false -> Schleife geht von vorne los
                    }

                }
            } catch (e: Exception) {
                println("Bitte eine Zahl eingeben... Probier's nochmal")
            }
        }
    }
    return lebendeGegner1
}
