package Wiederholungen.Woche7

class Pokemon(var name: String, var type: String, var level: Int = 1) {

    var hp: Double // Health Points = Lebenspunkte
    var ep: Double // Experience Points
    var ap: Double // Attack Points

    // init Block: da der Primäre Konstruktor keinen eigenen Körper hat (der Körper ist ja einfach die gesamte Klasse), brauchen wir den init Block. Der wird, wie die Körper der sekundären Konstruktoren, immer beim Initialisieren = Erstellen eines konkreten Pokemons aufgerufen
    init {
        this.hp = level * 10.0
        this.ep = 0.0
        this.ap = level * 3.0

        println("----Primärer Konstruktor Call im init-Block----")
        println("Pokemon $name wurde auf Level $level initialisiert.")
        //Thread.sleep(500)
        println("$name hat $ap AP und folgende Attacken:")
        // Thread.sleep(500)
        println("Tackle (${level + ap} Schaden)")
        // Thread.sleep(500)
        println("--Primäre Konstruktion beendet--")

    }


    // sekundärer Konstruktor: Pokemon ist automatisch vom Typ Normal
    constructor(name: String) : this(name, "Normal") {
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
        println("${gegner.name} verliert $ap HP und hat noch ${gegner.hp} HP!")
    }
}

fun main() {
    var bisasam = Pokemon("Bisasam","Pflanze")
    var schiggy = Pokemon("Schiggy","Wasser")
    var pikachu = Pokemon("Pikachu")
    bisasam.tackle(schiggy)

}