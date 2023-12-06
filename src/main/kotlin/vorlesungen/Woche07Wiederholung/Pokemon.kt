

// Primärer Konstruktor: direkt beim Erstellen der Klasse
class Pokemon(var name: String, var type: String, var level: Int = 1, var isDead: Boolean = false) {

    var hp: Double // Health Points = Lebenspunkte
    var ep: Double // Experience Points
    var ap: Double // Attack Points

    // init Block: da der Primäre Konstruktor keinen eigenen Körper hat (der Körper ist ja einfach die gesamte Klasse), brauchen wir den init Block. Der wird, wie die Körper der sekundären Konstruktoren, immer beim Initialisieren = Erstellen eines konkreten Pokemons aufgerufen
    init {
        this.hp = 3.0
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
}


fun main() {
    // Helden
    var bisasam = Pokemon("Bisasam","Pflanze")
    var schiggy = Pokemon("Schiggy","Wasser")
    val glumanda = Pokemon("Glumanda", "Feuer")

    // Gegner
    val taubsi = Pokemon("Taubsi")
    val rattfratz = Pokemon("Rattfratz")
    val habitak = Pokemon("Habitak")

    // spielRunde(helden: List<Pokemon>, gegner: List<Pokemon>)


    // Game Loop Vorbereitung
    // Variable, anhand der wir pruefen, ob das spiel vorbei ist
    var gameOver: Boolean = false
    // Rundencounter
    var round: Int = 1
    // Team an Helden
    val helden: MutableList<Pokemon> = mutableListOf(bisasam,schiggy,glumanda)
    // Team an Gegner
    val gegnerListe: MutableList<Pokemon> = mutableListOf(taubsi,rattfratz,habitak)

    while (!gameOver){
        println("---Runde $round!---")
        // print alle helden in meinem team und ihre aktionen --> ueber liste der helden iterieren
        println("--Unser Team:--")
        // print alle helden in meinem team und ihre aktionen --> ueber liste der helden iterieren
        helden.forEach { println(it) }
        // print alle gegner --> ueber liste der gegner iterieren
        println("--Gegner Team:--")
        var lebendeGegner = gegnerListe.filter { !it.isDead } // nur lebende Gegner werden rausgefiltert

        // schleife, bis alle helden angegriffen haben:
        // print: "1./2./3. held soll angreifen, welche attacke?"
        for (held in helden) {
            println("${held.name} soll angreifen. Wähle die Attacke per Zahleneingabe aus!")
            println("[1] => Tackle, [2] => Heuler, etc")
            val choice = readln().toInt()
            when (choice){
                1 -> {
                    held.tackle(lebendeGegner.first())
                    // angeben, dass ggf gegner bereits gestorben ist
                    lebendeGegner = lebendeGegner.filter { !it.isDead }
                }
               // 2 -> held.heuler(gegner.random())
                // etc weitere attacken
            }
        }
        // gegner greifen an: exact das gleiche
        // hardcode, keine richtige Logik
        println("Taubsi greift an! Bisasam verliert x hp....")

        println("Runde $round beendet!")
        println("ggf. Status von allen ausdrucken...")

        // helden/gegner die gestorben sind, aus liste entfernen:

//            for (gegner in lebendeGegner) { // ConcurrentModificationException: Taubsi fehlt, die Iteration diesr For Schleife wird gestórt.
//                if (gegner.hp <= 0) {
//                    gegnerListe.remove(gegner)
//                }
//            }
             // tote pokemon erst nachtraeglich rausnehmen?
            // pokemon boolean eigenschaft isDead geben?
            // pokemon bei der attacke direkt "toeten" wenn die hp unter 0 fallen --> wir nehmen diese Variante

        // pruefen, ob noch helden oder gegner uebrig sind
        if (helden.isEmpty() || lebendeGegner.isEmpty()){
            gameOver = true
        }
        round++
    }
    println("Spiel beendet! Alle Gegner sind besiegt!") // Logik: helden oder gegner tot?









}