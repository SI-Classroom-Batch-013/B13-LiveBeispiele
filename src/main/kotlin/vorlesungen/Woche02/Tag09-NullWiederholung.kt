package vorlesungen.Woche02

fun main() {
    // WIEDERHOLUNG: NULL

    // nullable Variable (nullable bedeutet: kann null enthalten. Das ? macht's hinterm Datentyp möglich)
    var integer: Int? = 10
    integer = null
    integer = 12
    integer = null



    // mit einer nullable Variable weiterarbeiten: wir brauchen einen SAFE CALL (?) oder einen NON NULL ASSERTED CALL (!!)

        // Safe Call: falls in nullableNumber null steht, wird einfach null statt dem gewollten Double zurück gegeben und das Programm läuft weiter
        var intToDouble: Double? = integer?.toDouble()
        println(intToDouble)


        integer = 13
        // Non Null Asserted Call: wir garantierem dem Compiler, dass hier nicht null drin steht. Ist die Variable dann doch null, stürzt das Programm ab.
        var intToString1: String = integer!!.toString()
        println(intToString1)


        // integer ist jetzt null, Programm wird auf jeden Fall abstuerzen wegen dem !!
        integer = null
//        var intToString: String = integer!!.toString()
//        println(intToString)





}