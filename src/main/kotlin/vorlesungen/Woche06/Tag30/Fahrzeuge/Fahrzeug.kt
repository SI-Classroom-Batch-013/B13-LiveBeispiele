package VORLESUNG.W06.d05.Fahrzeuge

open class Fahrzeug(val bezeichner: String, protected val maxKmH: Int, var preis: Double, open val anzahlRaeder:Int) {

    var istVermietet = false

    // sekundärer konstruktor: bekommt bezeichner und anzahlräder, sonst nichts. rest wird per default im this(= hochreichen an primären konstruktor) angegeben
    constructor(bezeichner: String, anzahlRaeder: Int): this(bezeichner,130,5000.0,anzahlRaeder)

    // tertiärer konstruktor: bekommt nur bezeichner, rest default
    constructor(bezeichner: String): this(bezeichner,150,10000.00,4)

    open fun getMaxGeschwindigkeit(): Int {
        return this.maxKmH
    }

     open fun printDetails(){
        println("--Fahrzeug Details--")
        println("Name: $bezeichner")
        println("Maximalgeschwindkeit: $maxKmH km/h")
        println("Preis: $preis")
        println("Anzahl an Rädern: $anzahlRaeder")

    }

     open fun testDrive(){
        println("Fahrzeug $bezeichner wird Probe gefahren...")
    }

}

fun main(){

    var fahrzeugPrimKonst = Fahrzeug("VW Bus",100,8999.99,4)
    var fahrzeugTerKonst = Fahrzeug("Toyota Auto")

    // fahrzeugPrimKonst.maxKmH // nicht möglich, maxKmH ist protected
    var kmhFahrzeugPrimKonst = fahrzeugPrimKonst.getMaxGeschwindigkeit()
    println("Maximale Geschwindigkeit ${fahrzeugPrimKonst.bezeichner}: $kmhFahrzeugPrimKonst")

    fahrzeugPrimKonst.printDetails()
    fahrzeugPrimKonst.testDrive()

}