import vorlesungen.Woche07Wiederholung.roundDouble

// Primärer Konstruktor: direkt beim Erstellen der Klasse
class Pokemon(var name: String, var type: String, var level: Int = 1, var isDead: Boolean = false) {

    var hp: Double // Health Points = Lebenspunkte
    var ep: Double // Experience Points
    var ap: Double // Attack Points

    // init Block: da der Primäre Konstruktor keinen eigenen Körper hat (der Körper ist ja einfach die gesamte Klasse), brauchen wir den init Block. Der wird, wie die Körper der sekundären Konstruktoren, immer beim Initialisieren = Erstellen eines konkreten Pokemons aufgerufen
    init {
        this.hp = 10.0
        this.ep = 0.0
        this.ap = level * 3.0

        println("----Primärer Konstruktor Call im init-Block----")
        println("Pokemon $name wurde auf Level $level initialisiert.")
        //Thread.sleep(500)
        println("$name hat $ap AP und folgende Attacken:")
        // Thread.sleep(500)
        println("Tackle (${level * ap} Schaden)")
        // Thread.sleep(500)
        println("--Primäre Konstruktion beendet--")

    }


    // sekundärer Konstruktor: Pokemon ist automatisch vom Typ Normal
    constructor(name: String): this(name, "Normal") {
        println("---Sekundärer Konstruktor Call---")
        // Thread.sleep(500)
        println("Ein Pokemon namens $name mit Default den Typ 'Normal' wurde angelegt.")
        // Thread.sleep(500)
        println("---Sekundäre Konstruktion beendet---")
    }

    // erste Funktion: Tackle

    fun tackle(gegner: Pokemon){
        println("$name verwendet Tackle mit einer Angriffskraft von $ap AP!")
        println("${gegner.name} hat vorher ${gegner.hp} HP...")
        println("$name's Angriff triggt ${gegner.name}!")
        gegner.hp -= this.ap
        gegner.hp = roundDouble(gegner.hp)
        println("${gegner.name} verliert $ap HP und hat noch ${gegner.hp} HP!")
        // Abfangen, dass Gegner direkt stirbt:
        if (gegner.hp <= 0){
            println("${gegner.name} ist besiegt!")
            gegner.isDead = true
            // kommen hier aber nicht an Gegner Liste ran
        }
    }

    override fun toString(): String{
        return """
            Pokemon: $name
            HP: $hp
        """.trimIndent()
    }

    fun useBeutel(beutel: Beutel): Int {
        var inputValid = false
        var input = 0
        println(beutel)
        println("Was willst du nutzen?")
        println("[1] Heiltrank (${beutel.anzahlHeilTränke} übrig)")
        println("[2] Booster (${beutel.anzahlBooster} übrig)")
        println("[3] Beutel verlassen")
        while (!inputValid) {
            try {
                input = readln().toInt()
                when (input){
                    1 -> {
                        if (beutel.anzahlHeilTränke > 0){
                            beutel.useHeilTrank(this)
                        } else {
                            println("Du hast keine Heiltränke übrig!")
                            useBeutel(beutel)
                        }
                    }
                    2 -> {
                        if (beutel.anzahlBooster > 0){
                            beutel.useBooster(this)
                        } else {
                            println("Du hast keine Booster übrig!")
                            useBeutel(beutel)
                        }
                    }
                    else -> {
                        println("Ungültige Zahl eingegeben... Versuch's nochmal!")
                        useBeutel(beutel)
                    }
                }
                inputValid = true
                return input
            } catch (e: Exception){
                println("Ungültige Eingabe, bitte Zahl eingeben!")
            }
        }
        return input
    }
}

class Beutel(){
    var anzahlHeilTränke = 3
    var anzahlBooster = 2

    fun useHeilTrank(user: Pokemon){
        println("${user.name} (${user.hp} HP) trinkt Trank...")
        anzahlHeilTränke--
        user.hp *= 1.3
        user.hp = roundDouble(user.hp)
        println("${user.name} hat jetzt ${user.hp}!")
    }

    fun useBooster(user: Pokemon){
        println("${user.name} (${user.ap} AP) trinkt Booster...")
        anzahlBooster--
        user.ap *= 1.3
        user.ap = roundDouble(user.ap)
        println("${user.name}'s AP wurden um 30% erhöht!")
    }

    override fun toString():String{
       return """
            Beutelinhalt:
            Tränke: $anzahlHeilTränke
            Booster: $anzahlBooster
        """.trimIndent()
    }
}