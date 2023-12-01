package VORLESUNG.W06.d05.Fahrzeuge


open class WasserFahrzeug(name: String, maxKmH: Int, price: Double): Fahrzeug(name, maxKmH, price, anzahlRaeder = 0) {

    constructor(name: String): this(name,90,554.99)

    override fun printDetails() {
        println("---WasserFahrzeug Details:---")
        super.printDetails()
    }

    override fun getMaxGeschwindigkeit(): Int {
        println("--WasserFahrzeug Maximalgeschwindigkeit--")
        return super.getMaxGeschwindigkeit()
    }

    override fun testDrive() {
        println("$bezeichner fährt aufs Wasser hinaus...")
    }

}
