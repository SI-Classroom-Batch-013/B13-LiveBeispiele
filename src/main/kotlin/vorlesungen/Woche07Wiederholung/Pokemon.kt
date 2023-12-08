import vorlesungen.Woche07Wiederholung.Beutel
import vorlesungen.Woche07Wiederholung.roundDouble


// Primärer Konstruktor: direkt beim Erstellen der Klasse
class Pokemon(var name: String, var type: String, var level: Int = 1, var isDead: Boolean = false) {

    var hp: Double // Health Points = Lebenspunkte
    var ep: Double // Experience Points
    var ap: Double // Attack Points
    // var istVerflucht: Boolean = false

    // init Block: da der Primäre Konstruktor keinen eigenen Körper hat (der Körper ist ja einfach die gesamte Klasse), brauchen wir den init Block. Der wird, wie die Körper der sekundären Konstruktoren, immer beim Initialisieren = Erstellen eines konkreten Pokemons aufgerufen
    init {
        this.hp = 9.0
        this.ep = 0.0
        this.ap = level * 3.0

//        println("----Primärer Konstruktor Call im init-Block----")
//        println("Pokemon $name wurde auf Level $level initialisiert.")
//        //Thread.sleep(500)
//        println("$name hat $ap AP und folgende Attacken:")
//        // Thread.sleep(500)
//        println("Tackle (${level + ap} Schaden)")
//        // Thread.sleep(500)
//        println("--Primäre Konstruktion beendet--")

    }


    // sekundärer Konstruktor: Pokemon ist automatisch vom Typ Normal
    constructor(name: String) : this(name, "Normal") {
//        println("---Sekundärer Konstruktor Call---")
//        // Thread.sleep(500)
//        println("Ein Pokemon namens $name mit Default den Typ 'Normal' wurde angelegt.")
//        // Thread.sleep(500)
//        println("---Sekundäre Konstruktion beendet---")
    }

    // erste Funktion: Tackle

    fun tackle(gegner: Pokemon){
        println("$name verwendet Tackle mit einer Angriffskraft von $ap AP!")
        println("${gegner.name} hat vorher ${gegner.hp} HP...")
        println("$name's Angriff triggt ${gegner.name}!")
        gegner.hp -= this.ap // x.xxxxxx
        gegner.hp = roundDouble(gegner.hp) // x.xx
        println("${gegner.name} verliert $ap HP und hat noch ${gegner.hp} HP!")
        // Abfangen, dass Gegner direkt stirbt:
        if (gegner.hp <= 0){
            println("${gegner.name} ist besiegt!")
            gegner.isDead = true
            // kommen hier aber nicht an Gegner Liste ran
        }
    }

    // Fahrplan: verfluchen
    // opfer.istVerflucht = true

    // Fahrplan: der Fluch wirkt
    // checken: bin ich verflucht?
    // wenn ja -> 10% der HP abziehen (eigene Funktion dazu?)


    override fun toString(): String{
        return """
            Pokemon: $name
            HP: $hp
        """.trimIndent()
    }

    fun useBeutel(beutel: Beutel) : Int {
        println("Du willst also den Beutel nutzen...")
        println("Heiltränke: ${beutel.anzahlHeiltränke}")
        println("Booster: ${beutel.anzahlBooster}")
        println("[1] => Heiltrank, [2] => Booster, [3] => Beutel verlassen")
        try {
            val input = readln().toInt()
            when (input) {
                1 -> {
                    beutel.heiltrankNutzen(this)
                    return 1
                }

                2 -> {
                    beutel.boosterNutzen(this)
                    return 2
                }
                3 -> {
                    return 3
                }
                else -> {
                    println("Keine gültige Zahl eingegeben! Probier's nochmal...")
                    useBeutel(beutel)
                }
            }
        } catch (e: Exception){
            println("Du musst eine gültige Zahl, keinen Buchstaben eingeben!")
            useBeutel(beutel)
        }

    return 3
    }
}
