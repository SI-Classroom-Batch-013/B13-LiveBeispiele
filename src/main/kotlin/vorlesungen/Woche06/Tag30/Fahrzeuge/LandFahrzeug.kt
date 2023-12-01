package VORLESUNG.W06.d05.Fahrzeuge

open class LandFahrzeug(bezeichner: String, maxKmh: Int, price: Double, override val anzahlRaeder: Int=4 ) : Fahrzeug(bezeichner,maxKmh,price,anzahlRaeder) {


    constructor(bezeichner: String): this(bezeichner,100,3000.0)

    override fun testDrive(){
        println("--Landfahrzeug Test Fahren---")
       // super.testDrive() <= Zugriff auf Mutter-Funktion desselben Namens
        println("Landfahrzeug $bezeichner wird Probe gefahren... es ist holprig.")

    }

    override fun printDetails() {
        println("---Landfahrzeug Details---")
        super.printDetails()

    }


}

fun main(){
    var stadtBus = LandFahrzeug("Stadtbus",100,50000.0,8)
    var suv = LandFahrzeug("SUV",180,30000.0)

    var fahrzeugSekKonst = Fahrzeug("Motorrad",2)

    stadtBus.testDrive()
    stadtBus.printDetails()
    println("---------")
    fahrzeugSekKonst.printDetails()

    stadtBus.getMaxGeschwindigkeit()
    stadtBus.istVermietet // false


}