fun main() {
    var kontoStand : Int = 650
    var einzelTicketPreis : Int = 125
    var gesamtPreis : Int = einzelTicketPreis*4

    println("Kontostand: $kontoStand €")
    println("Einzelticket: $einzelTicketPreis €")
    println("Gesamtpreis: $gesamtPreis €")

    // Kauf
    kontoStand = kontoStand - gesamtPreis
    println("Neuer Kontostand: $kontoStand €")
}