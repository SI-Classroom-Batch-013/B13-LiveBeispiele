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
    val datumsFormat = DateTimeFormatter.ofPattern("dd.MM. ")
    val uhrzeitFormat = DateTimeFormatter.ofPattern("HH:mm:ss")

    val formatiertesDatum = aktuelleUhrzeit.format(datumsFormat)

    print(formatiertesDatum)

    while(true){
        print(aktuelleUhrzeit.format(uhrzeitFormat))

        Thread.sleep(1000)
        aktuelleUhrzeit = LocalDateTime.now()

        print("\b\b\b\b\b\b\b\b")

        print("\nTest")
        print("\b\b\b\b\b")
    }


}