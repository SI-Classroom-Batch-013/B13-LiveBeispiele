package vorlesungen.Woche06.Tag28

class Rakete(val name: String, val farbe: String, val gewicht: Double) {
    fun starten() {
        println("$name startet in den Himmel!")
    }
}

fun main() {
    // Erstellen von Instanzen der Raketenklasse
    val falcon9 = Rakete("Falcon 9", "Weiß", 54905.0)
    val saturnV = Rakete("Saturn V", "Schwarz", 2979345.0)
    val soyuz = Rakete("Soyuz", "Rot", 31300.0)

    // Zugriff auf die Eigenschaften und Methoden der Raketen über den Punktoperator
    println("Rakete: ${falcon9.name}, Farbe: ${falcon9.farbe}, Gewicht: ${falcon9.gewicht} kg")
    falcon9.starten()

    println("Rakete: ${saturnV.name}, Farbe: ${saturnV.farbe}, Gewicht: ${saturnV.gewicht} kg")
    saturnV.starten()

    println("Rakete: ${soyuz.name}, Farbe: ${soyuz.farbe}, Gewicht: ${soyuz.gewicht} kg")
    soyuz.starten()
}
