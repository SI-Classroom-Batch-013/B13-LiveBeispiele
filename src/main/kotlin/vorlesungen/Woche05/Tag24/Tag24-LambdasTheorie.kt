package VORLESUNG.Woche05.Tag24

fun greaterFive(nr: Int): Boolean{
    return nr > 5
}

fun main() {
    // Aufruf von greaterFive
    var nineGreaterFive: Boolean = greaterFive(9)
    println(nineGreaterFive) // true


    // Gegenüberstellung: greaterFour als Lambda
    // Lambda kann in einer Variable gespeichert werden:
    var greaterFour = { nr:Int -> ( nr>4)}
    println(greaterFour(9)) // true

    // Lambda mit println: kein Einzeiler mehr
    var greaterSix: (Int) -> Boolean = { nr: Int ->
        val isGreater: Boolean = nr > 6
        println("Ist die Zahl $nr > 6? -> $isGreater")
        isGreater// quasi return isGreater
    }

    greaterSix(9)


    // Lambda, das Int zurück gibt
    var addNrWithTwo: (Int) -> Int = { nr: Int -> nr+2 }


    val planets = listOf("Mein ", "Vater ", "erklaert ", "mir ", "jeden ", "Sonntag ", "unsere ", "neun ", "Planeten")
    // Planeten Liste mit for-Schleife durchgehen
    for (planet in planets){
        println(planet)
    }

    println("---- Lambda aufruf in Higher Order Function: ----")
    // Gegenüberstellung
    // Planeten Liste mit ForEach Lambda:
    planets.forEach {
        println(it)
    }

    // lange Variante:
    planets.forEach { planet ->
        println(planet)
    }







}