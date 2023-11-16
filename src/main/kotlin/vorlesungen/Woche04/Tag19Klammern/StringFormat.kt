package vorlesungen.Woche04.Tag19Klammern

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter


fun main(){

    var preis = 4.68773427656253

    val zahl = 10.0/3

    var stringFormat = "%.2f"


    println(stringFormat.format(preis))
    println(stringFormat.format(zahl))
    println(stringFormat)


    var aktuelleUhrzeit = LocalDateTime.now()
//    println("%t".format(aktuelleUhrzeit))

    // wir brauchen ein "Formatierer" Objekt
    val formatter = DateTimeFormatter.ofPattern("dd.MM. HH:mm:ss")
    val formatiertesDatum = aktuelleUhrzeit.format(formatter)

    println(formatiertesDatum)


}