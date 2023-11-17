import kotlin.random.Random

var spieler1Name = ""
var spieler2Name = ""

var spieler1Leben = 0
var spieler2Leben = 0

// Die Menge Schaden und Heilung jeder Spieler in einem Mal ausführen kann
val attacken = listOf(10, 20, 30, 40, 50, 60, 70, 80, 90, 100)
val heilungen = listOf(5, 10, 15, 20, 25, 30, 35, 40, 45, 50)

// Wird durch User-Input ausgewählt
val spezialAttacken = listOf(1, 1, 5, 5, 25, 25, 50, 50, 50, 50, 100, 120)

fun main() {

    // -------------------------------------------------------------
    //
    //                      Das Duell
    //
    //  Das Spiel:
    //
    //  Der Spieler sucht sich zu Begin des Spiels für die
    //  zwei Akteure zwei Namen aus. Dann kämpfen die Akteure
    //  jeweils 3 Runden gegeneinander, wobei beide Akteure
    //  sich abwechselnd angreifen und dann heilen.
    //  Am Ende jeder Runde kann der Spieler für jeden Akteur
    //  eine Spezialattacke auswählen. Der Akteur, der am Ende
    //  des Spiels die meisten Lebenspunkte hat, gewinnt.
    //
    // -------------------------------------------------------------

    // Wenn das Spiel startet, muss der Nutzer einen Namen für Spieler 1 und Spieler 2 eingeben
    println("Spieler 1, bitte gib deinen Namen ein...")
    spieler1Name = readln()
    println("Spieler 2, bitte gib deinen Namen ein...")
    spieler2Name = readln()
    println()

    // Spieler 1 und Spieler 2 bekommen zufällig zwischen 500 und 600 Lebenspunkte
    spieler1Leben = Random.nextInt(500, 600)
    spieler2Leben = Random.nextInt(500, 600)

    // Lebenspunkte der Spieler ausgeben
    printPlayerHealthpoints()

    // Start
    println("Es findet ein Duell zwischen $spieler1Name und $spieler2Name statt.")
    println()
    println("Möge der Bessere gewinnen!")

    // Runde 1
    runde()

    // Runde 2
    runde()

    // Runde 3
    runde()

    // Ende
    println("Spiel zu Ende!")
}

fun runde() {

    // Spieler attackieren
    printAttack()
    spieler2Leben = attack(spieler1Name, spieler2Name, spieler2Leben)
    printPlayerHealthpoints()
    printAttack()
    spieler1Leben = attack(spieler2Name, spieler1Name, spieler1Leben)
    printPlayerHealthpoints()

    // Spieler heilen sich
    printHeal()
    spieler1Leben = heilen(spieler1Name, spieler1Leben)
    spieler2Leben = heilen(spieler2Name, spieler2Leben)
    printPlayerHealthpoints()

    // Spieler führen Spezialattacken aus
    printSpezial()
    spieler2Leben = spezialAttacke(spieler1Name, spieler2Name, spieler2Leben)
    printPlayerHealthpoints()
    spieler1Leben = spezialAttacke(spieler2Name, spieler1Name, spieler1Leben)
    printPlayerHealthpoints()

}

fun attack(angreifer: String, ziel: String, zielLeben: Int): Int {
    var schaden = attacken.random()
    println("$angreifer greift $ziel an und verursacht $schaden Schadenspunkte.")
    println()
    return zielLeben - schaden
}

fun heilen(ziel: String, zielLeben: Int): Int {
    var heilen = heilungen.random()
    println("$ziel heilt sich um $heilen Lebenspunkte.")
    return zielLeben + heilen
}

fun spezialAttacke(angreifer: String, ziel: String, zielLeben: Int): Int {
    println("Welche Spezialattacke soll $angreifer ausführen?")
    println("Diese Spezialattacken sind noch verfügbar:")
    println(spezialAttacken)
    println("Bitte gib den Index für die Spezialattacke an.")
    var schaden = spezialAttacken[readln().toInt()]
    println("$angreifer fügt $ziel mit der Spezialattacke $schaden zu")
    return zielLeben - schaden
}

fun printAttack() {
    println("     ___   .___________.___________.    ___       ______  __  ___ \n" +
            "    /   \\  |           |           |   /   \\     /      ||  |/  / \n" +
            "   /  ^  \\ `---|  |----`---|  |----`  /  ^  \\   |  ,----'|  '  /  \n" +
            "  /  /_\\  \\    |  |        |  |      /  /_\\  \\  |  |     |    <   \n" +
            " /  _____  \\   |  |        |  |     /  _____  \\ |  `----.|  .  \\  \n" +
            "/__/     \\__\\  |__|        |__|    /__/     \\__\\ \\______||__|\\__\\ \n" +
            "\n")
}

fun printHeal() {
    println(" __    __   _______  __   __       _______ .__   __. \n" +
            "|  |  |  | |   ____||  | |  |     |   ____||  \\ |  | \n" +
            "|  |__|  | |  |__   |  | |  |     |  |__   |   \\|  | \n" +
            "|   __   | |   __|  |  | |  |     |   __|  |  . `  | \n" +
            "|  |  |  | |  |____ |  | |  `----.|  |____ |  |\\   | \n" +
            "|__|  |__| |_______||__| |_______||_______||__| \\__| \n" +
            "\n")
}

fun printSpezial() {
    println("     _______..______    _______  ________   __       ___       __      \n" +
            "    /       ||   _  \\  |   ____||       /  |  |     /   \\     |  |     \n" +
            "   |   (----`|  |_)  | |  |__   `---/  /   |  |    /  ^  \\    |  |     \n" +
            "    \\   \\    |   ___/  |   __|     /  /    |  |   /  /_\\  \\   |  |     \n" +
            ".----)   |   |  |      |  |____   /  /----.|  |  /  _____  \\  |  `----.\n" +
            "|_______/    | _|      |_______| /________||__| /__/     \\__\\ |_______|\n" +
            "\n")
}

fun printPlayerHealthpoints() {
    println("$spieler1Name hat noch $spieler1Leben Lebenspunkte.")
    println("$spieler2Name hat noch $spieler2Leben Lebenspunkte.")
    println()
}