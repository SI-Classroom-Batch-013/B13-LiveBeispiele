package VORLESUNG.W06.d05.Fahrzeuge

class Yacht(bezeichner: String, maxKmH: Int, price: Double) : WasserFahrzeug(bezeichner, maxKmH, price) {

    constructor(name:String): this(name,50,500.0)

    override fun printDetails() {
        println("--Details über die Yacht:--")
        super.printDetails()
    }

    fun feiern() {
        println("Auf der Yacht ${this.bezeichner} wird eine Party gefeiert.")
    }
}