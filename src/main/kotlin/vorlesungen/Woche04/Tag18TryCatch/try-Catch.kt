

fun main(){

    println("Geben eine (Komma-)Zahl ein")

    val zahl1 = readDouble()        //readln().toDouble()

    val ergebnis = zahl1 * 2.0

    println("Das Ergebnis von der Zahl $zahl1 x2 ist $ergebnis")

}


fun readDouble(): Double{
    var input: String = readln()
//    input = input.replace(",",".")

    var zahl: Double

    try {
        zahl = input.toDouble()     // abbruchbedingung: kein Fehler passiert hier
    }
    catch (e: NumberFormatException){
        println("❗️Du hast die Zahl falsch eingegeben. ")
        println("Versuche es nochmal")
        return readDouble()     //rekursive Funktion
    }
    catch (e: Exception){
        // andere möglichkeiten mit dem Fehler um zu gehen
        println(e.message)
        e.printStackTrace()
        println("Du hast einen Fehler erzeugt, bekommst die Zahl 0.0")
        return 0.0
    }
    return zahl
}