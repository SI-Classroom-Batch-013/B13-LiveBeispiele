import vorlesungen.Woche06.Tag29.Supermarkt.Lebensmittel


// Kinderklasse Gemüse, erbt von Lebensmittel
class Gemuese(name: String, preis: Double, val kochzeit: Int) : Lebensmittel(name, preis) {

    // Sekundärer Konstruktor, um Gemuese Instanzen nur mit namen erstellen zu können
    constructor(name: String): this(name, 0.49,5)


    // Override der getInfo()-Methode, um spezifische Informationen für Gemüse auszugeben
    override fun printInfo() {
        println("PrintInfo von Gemuese:")
        println("Name: $name, Preis: $preis Euro, Kochzeit: $kochzeit Minuten")
    }

    // Eine spezielle Methode nur für Gemüse
    fun duensten() {
        println("$name wird gekocht.")
    }
}