fun main() {
    val flugPlaetze : Int = 130
    val anzahlFamilien : Int = (flugPlaetze / 4)
    println("Anzahl an Familien: $anzahlFamilien")

    var freiePlaetze : Int = flugPlaetze - 25 * 4
    println("Freie Sitzplaetze: $freiePlaetze")

    var flugKostenProKM : Int = 16
    val anzahlKM : Double = 1034.93
    val flugTicket : Int = 125

    val einnahmen : Int = flugTicket * flugPlaetze
    val kosten : Double = flugKostenProKM * anzahlKM
    println("Einnahmen: $einnahmen")
    println("Kosten: $kosten")
    println("Gewinn: ${einnahmen-kosten}")

}