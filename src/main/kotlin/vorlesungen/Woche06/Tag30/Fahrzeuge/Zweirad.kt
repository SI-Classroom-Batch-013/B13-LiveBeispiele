package VORLESUNG.W06.d05.Fahrzeuge

class Zweirad(bezeichner: String, override val anzahlRaeder: Int = 2) : LandFahrzeug(bezeichner,80,800.50,anzahlRaeder) {

    override fun printDetails() {
        println("----Zweirad Details----")
        println("Mein Zweirad $bezeichner hat folgende Infos:")
        println("Name: $bezeichner")
        println("Maximalgeschwindkeit: $maxKmH km/h")
        println("Preis: $preis")
    }

}

fun main(){

    var motorrad: Zweirad = Zweirad("Motorrad")
    var roller = Zweirad("Roller")
    var fahrrad = Zweirad("Fahrrad")

    motorrad.printDetails()
}