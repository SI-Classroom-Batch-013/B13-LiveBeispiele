package vorlesungen.Woche02

fun main() {
    // nullable Variable anlegen: braucht ? (nullable bedeutet: es darf null in der Variable stehen)
    var firstName: String? = null
    println(firstName)
    var lastName: String
    // println(lastName) // geht nicht, nicht initialisiert
    firstName = "Harry"
    println(firstName)
    firstName = null
    println(firstName)

    // auch konstanten können null sein:
    val constInt: Int? = null

    var notNullable: Double = 2.0
    // notNullable = null // darf nicht null sein, ? fehlt.



    // NullPointerException
    var list: List<String>? = listOf("hi", "moin")
    list = null
    //println(list!!.get(0))


    // SAFE CALL: den benutzen wir best practice mässig immer, umgeht programm absturz, falls null drin steht, gibt einfach null zurück und läuft dann weiter
    var integer: Int? = 9
    var intToDouble: Double? = integer?.toDouble()
    println(intToDouble)
    integer = null
    var nullIntToDouble: Double? = integer?.toDouble()
    println(nullIntToDouble)


    // NON NULL ASSERTED CALL: garantiert dem Compiler: keine Sorge, hier steht kein null drin.
    // Gefahr: bringt Programm zum abstürzen, falls doch null in der Variable steht.
    // Zum gezielten Fehler suchen nutzbar
    var double: Double? = null
//    var doubleToInt: Int? = double!!.toInt()
 //   println(doubleToInt)



    // nullable Variablen können zu jedem Zeitpunkt wieder auf null gesetzt werden
//    doubleToInt = null
    integer = null


    // null in Listen
    // Strings
    var movieList: MutableList<String?> = mutableListOf("Inception", "Barbie", null, "Harry Potter", null, "The Nun 2")
    println(movieList)
    movieList[2] = "Indiana Jones"
    println(movieList)
    movieList[2] = movieList[2] + " ist ein guter Film."
    println(movieList)
    movieList[4] = movieList[4] + " ist auch ein guter Film."
    println(movieList)


    // Ints
    var numbersList: MutableList<Int?> = mutableListOf(1,2,null,4,5,null,7,8,9)
    numbersList[0] = numbersList[0]?.plus(10)
    println(numbersList)
    numbersList[2] = numbersList[2]?.plus(10)
    println(numbersList)

}