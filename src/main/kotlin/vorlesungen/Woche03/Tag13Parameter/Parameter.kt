package vorlesungen.Woche03.Tag13Parameter

fun main(){

    summe(5, 5)
    summe(3,4)
    summe(4,4)
    summe(10, 3)
    summe(10, 4)

    var zahl4 = 3
    var zahl2 = 5

    summe(zahl4, zahl2)
    summe(zahl2, zahl4)
    summe(1,2,3)

    var ergebnis: Double = 4.0 + 4

    println("Geben sie die erste Zahl ein:")
    var eingabe1 = readln().toInt()

    println("Geben sie zweite Zahl ein:")
    var eingabe2 = readln().toInt()

    summe(eingabe1, eingabe2)


//    summe(readln().toInt(), 1)



    feinwaesche()
    feinwaesche(60)
    feinwaesche(minuten = 120)
    feinwaesche(minuten = 120, temp = 30)
}

fun summe(zahl1: Int, zahl2: Int){

    // Die Parameter sind unveränderlich
//    zahl1 = readln().toInt()

    var ergebnis = zahl1 + zahl2
    println("$zahl1 + $zahl2 = $ergebnis")
}

fun summe(zahl1: Double, zahl2: Int): Int{
    var ergebnis: Double = zahl1 + zahl2
    println("$zahl1 + $zahl2 = $ergebnis")

    return ergebnis.toInt()
}

fun summe(zahl3: Int, zahl4: Double){}

fun summe(zahl1: Int, zahl2: Int, zahl3: Int){
    var ergebnis: Int = zahl1 + zahl2 + zahl3
    println("$zahl1 + $zahl2 + $zahl3 = $ergebnis")
}

fun feinwaesche(
    temp: Int = 40,
    umdrehungen: Int = 1200,
    minuten: Int = 90
){
    println(
        """
        Feinwäsche
            Temp: $temp
            Umdr: $umdrehungen
            Min : $minuten
        """.trimIndent()
    )
    Thread.sleep(1000)
    println("Wäsche ist fertig")


    """
        
    """.trimIndent()


}


