val digits = mutableListOf<Int>()
var anzahlVersuche = 0
val anzahlZiffern = 3

fun main(){
    generateDigits(anzahlZiffern)


    var gewonnen: Boolean = makeGuess()

    if (gewonnen)
        println("Gratuliere, du hast richtig geraten!!")
    else
        println("Schade :( Das war nicht richtig.\nViel Glück beim nächsten mal.")


    println("Das waren die 3 Ziffern: $digits")

}


fun makeGuess(): Boolean{
    println("Kannst du einer meiner $anzahlZiffern Zahlen erraten?")
    val guess = readln().toInt()
    anzahlVersuche++

    return if (guess in digits)
        true
    else if (anzahlVersuche < 3)    // Abbruchbedingung
    {
        println("Das war nicht richtig, aber du hast noch einen Versuch")
        makeGuess()         // rekursive Funktion
    }
    else
        false

}

/**
 *  Generiert eine zufällige Ganzzahl zw. 1-9
 */
fun generateRandomDigit(): Int{
    return (0..9).random()
}


/**
 *  Füllt die Liste [digits] mit unterschiedlichen Zahlen.
 *  Dafür ruft sich die Funktion, solange selbst auf, bis genügend Ziffern erstellt wurden.
 *
 *  @param n Gibt an, wie viele unterschiedliche Ziffern generiert werden sollen.
 *  @throws Exception Wenn 0 oder weniger, bzw. mehr als 10 Ziffern angefragt werden.
 */
fun generateDigits(n: Int){

    if (n > 10 || n < 1){
//        println("Es kann maximal 10 Ziffern geben, und die Zahl der Ziffern muss positiv sein.")
        throw Exception("Es kann maximal 10 Ziffern geben, und die Zahl der Ziffern muss positiv sein.")
    }

    // Generiere eine zufällige Zahl
    val zahl = generateRandomDigit()

    // Falls die Ziffer noch nicht in der Liste ist, fügen wir sie hinzu
    if (zahl !in digits)
        digits.add(zahl)

    if (digits.size < n)        // Abbruch Bedingung
        generateDigits(n)       // Rekursive Funktion
}