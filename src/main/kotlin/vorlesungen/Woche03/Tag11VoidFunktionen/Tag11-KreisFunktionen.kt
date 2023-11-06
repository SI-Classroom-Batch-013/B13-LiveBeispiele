package VORLESUNG.Woche03.Tag11VoidFunktionen

import kotlin.math.PI
import kotlin.math.pow
import kotlin.math.roundToInt

// Fläche eines Kreises. Formel: radius * radius * pi
fun radiusToSurface(){
    println("Bitte gib den Radius deines Kreises ein:")
    // user gibt radius ein
    val radius: Double = readln().toDouble()
    // flaeche daraus berechnen
    var flaeche: Double = radius.pow(2)* PI // oder: radius*radius*PI
    // flaeche runden
    // Variante 1:
    flaeche = (flaeche*100).roundToInt() / 100.0
    // Variante 2:
    // var stringFlaeche: String = String.format("%.2f",flaeche)
    // println(stringFlaeche)
    // ergebnis ausdrucken
    println("Die Fläche deines Kreises mit einem Radius von $radius beträgt $flaeche")

}



// Umfang eines Kreises. Formel: 2 * radius * pi

fun umfang(){
    println("Bitte Radius deines Kreises eingeben...")
    val radius: Double = readln().toDouble()
    var result: Double = 2*radius* PI
    // result runden:
    result = (result*100).roundToInt() / 100.0
    println("Der Umfang des Kreises ist: $result ")
}
