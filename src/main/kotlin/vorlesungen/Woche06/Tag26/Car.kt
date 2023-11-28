package vorlesungen.Woche06.Tag26

// farbe ohne Var: anonymes Attribut, von aussen nicht anfassbar
class Car(var marke: String, var baujahr: Int, var anzahlTueren: Int, farbe: String) {

    init {
        println("Auto der Marke $marke erstellt!")
        println("Die Farbe ist $farbe")
    }

    // sekundärer Konstruktor: weniger Attribute
    // kein var vor marke oder farbe, da sie bereits im primaäre Konstrutor existieren und wir darauf bezug nehmen wollen
    constructor(marke: String, farbe: String) : this(marke, 2000,4,farbe){
        // inhalt dieser klammern: das gleiche wie der init block
        println("Auto der Makre $marke mit dem sekundaeren Konstruktor initialisiert...")
    }

    // sekundärer Konstruktor: mehr Attribute, ps wird nicht an this weitergegeben, da es dort nicht verlangt wird

    constructor(marke: String,baujahr: Int, anzahlTueren: Int, farbe: String, ps: Double) : this(marke,baujahr,anzahlTueren,farbe)

    fun printInfo(){
        println("Marke: $marke")
//        println("Marke: $marke")
//        println("Marke: $marke")
//        println("Marke: $marke")
//        println("Marke: $marke")
    }
}

fun main() {
    // auto mit primärem konstruktor erstellen
    var car1: Car = Car("VW",1999,4,"gelb")
    car1.printInfo()
    // println(car1.farbe) // geht nicht, farbe ist anonym ohne var davor im 1. Konstruktor

    var carSekConst: Car = Car("VW", "rot")
    carSekConst.printInfo()

    var car3: Car = Car("Toyota",2001,2,"schwarz", 120.0)
    car3.printInfo()
    // car3.ps // auch nicht von aussen erreichbar, kein var davor

}