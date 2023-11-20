
fun main(){

    automaten()

//    println("Geben sie den Monat ein: (als Zahl)")

    var monatsEingabe = zahlEinlesen()

    // if (monatsEingabe in 1..12)

    when (monatsEingabe){
        1 -> {
            println("Januar")
            println("Gratuliere zum neuem Jahr")
        }
        // bei einzelnen Anweisungen können {} weggelassen werden
        2 -> println("Februar")
        // Es können mehrere Fälle aufgelistet werden
        3, 4, 5 -> println("Frühling")
        in 6..9 -> println("Sommer")
        in listOf(10, 11, 12) -> println("Herbst")
        else -> {
            println("Ungültige Monatseingabe")
        }
    }

}

fun hauptmenu(){
    println("Wählen sie 1-3")
    when (readln()){
        "1", "01", " 1", "eins" -> {
            println("Continue")
        }
        "2", "zwei", "02" -> {
            println("App beenden")
        }
        "3" -> println("Einstellungen")
        else -> {
            println("Falsche Eingabe")
            hauptmenu()
        }
    }
}

fun automaten(){

    val sortiment = mutableMapOf<String, Double>(
        "Mars" to 2.0,
        "Snickers" to 2.0,
        "Haribo" to 3.0,
        "Chips" to 3.5
    )

    println("""
        Wählen sie ein Produkt:
         1 für Mars
         2 für Snickers
         3 für Haribo
         4 für Chips
    """.trimMargin())


    val product: String = when(readln()){
        "1" -> "Mars"
        "2" -> "Snickers"
        "3" -> "Haribo"
        "4" -> "Chips"
        else -> ""
    }

    val preis = sortiment[product] ?: 0.0       // Elvis Operator

    val preis2: Double = if (sortiment[product] == null)
        0.0
    else
        sortiment[product]!!


    println("Sie haben $product gewählt, bitte $preis € einwerfen")

}

fun zahlEinlesen(): Int{
    println("Geben sie eine Zahl ein:")

    var eingabe: String = readln()
    var monatsEingabe: Int

    if (eingabe.isNumeric()) {
        monatsEingabe = eingabe.toInt()
        return monatsEingabe
    }
    else {
        println("Ungültige Eingabe, probieren sie es erneut")
        return zahlEinlesen()
    }
}






fun String.isNumeric(): Boolean{
    return this.all { it.isDigit()  }       // is Digit überprüft, ob ein Zeichen eine Zahl ist
}