package VORLESUNG.W06.d05.Fahrzeuge


class Segelboot(bezeichner: String, maxKmH: Int, price: Double, val ladung: Double) : WasserFahrzeug(bezeichner) {

    constructor(bezeichner: String): this(bezeichner,89,300.0,3.0)

    fun entladen() {
        println("$bezeichner wird entladen. Ladung: $ladung Tonnen.")
    }

    override fun printDetails() {
        println("Details über das Schiff:")
        super.printDetails()

    }
}