package vorlesungen.Woche06.Tag29.Supermarkt

// Kinderklasse Obst, erbt von Lebensmittel
class Obst(name: String, preis: Double, val vitaminGehalt: String = "sehr vitaminreich") : Lebensmittel(name,preis) {

    // sekundärer konstruktor: Obst-Objekt mit nur Namen erstellen
    constructor(name: String): this(name,0.99,"etwas vitaminreich")

    // tertiäre konstruktor, bei dem preis default sein soll
    constructor(name: String, vitaminGehalt: String) : this(name,10.0,vitaminGehalt)

    protected fun printVitamine(){
        println("Vitamingehalt: $vitaminGehalt")
    }

    override fun printInfo() {
        println("Informationen über das Obst:")
        //super.printInfo()
        println("Name: $name, Preis: $preis")
        printVitamine()
    }

    fun schnippeln(){
        println("$name wird geschnippelt... Lecker.")
    }


}

