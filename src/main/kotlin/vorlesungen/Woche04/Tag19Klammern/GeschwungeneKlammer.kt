// Globale Variablen
val vorNamen = listOf(
    "Emilia",
    "Hanna/Hannah",
    "Sophia/Sofia",
    "Emma",
    "Mia",
    "Mila",
    "Lina",
    "Ella",
    "Klara/Clara",
    "Lea/Leah",
    "Noah",
    "Matteo",
    "Leon",
    "Finn",
    "Paul",
    "Luca/Luka",
    "Elias",
    "Emil",
    "Felix",
    "Louis/Luis"
)
val nachNamen = listOf(
    "Müller",
    "Schmidt",
    "Schneider",
    "Fischer",
    "Weber",
    "Meyer",
    "Wagner",
    "Becker",
    "Schulz",
    "Hoffmann",
    "Schäfer",
    "Bauer",
    "Koch",
    "Richter",
    "Klein",
    "Wolf",
    "Schröder",
    "Neumann",
    "Schwarz",
    "Braun",
    "Hofmann",
    "Zimmermann"
)

/* Scope:
    - alle Namen, die innerhalb von geschwungenen Klammern erstellt werden,
    existieren nur in diesem Kontext (=Scope)!

   Einklappbar:
    - IntelliJ erlaubt uns Code innerhalb von (geschwungenen) Klammern zu verstecken
 */
fun main() {
    val beispielName = zufallsNamen()

    var ergebnis = "${4 + 7}" // -> "11"
    var ergebnis2 = "${true || !false.toString().toBoolean()}" // -> "true"
    var ergebnis3 = "{true || !false.toString().toBoolean()}" //

    println("Ergebnis1: $ergebnis")
    println("Ergebnis1: $ergebnis2")
    println("Ergebnis1: $ergebnis3")

    fun beispielFunktion(){
        println("blablabla")
    }

    beispielFunktion()
    var beispielVariable = "dshfasdhf"


    println("Name: $beispielName")
    println("Alter: ${altersEingabe()}")    // geschwungene Klammer für Code Block innerhalb Strings
}

/*
Funktionen
   ! Vorsicht: RückgabeWerte müssen in allen Zweigen einer Funktion returned werden
*/
fun zufallsNamen(zweitname: Boolean = true): String
{   // Geschwungene Klammer für Funktionsrumpf
    if (zweitname)
    {       // geschwungene Klammer für If - Block
        val vorname1 = vorNamen.random()
        val vorname2 = vorNamen.random()
        return "$vorname1 $vorname2 ${nachNamen.random()}"  // geschwungene Klammer für Code Block innerhalb Strings
    } else
    {      // geschwungene Klammer für Else - Block
        return "${vorNamen.random()} ${nachNamen.random()}" // geschwungene Klammer für Code Block innerhalb Strings
    }

}

fun altersEingabe(): Int
{   // Geschwungene Klammer für Funktionsrumpf
//    beispielFunktion()    // nicht in diesem Scope
//    beispielVariable

    try {   // Geschwungene Klammer für Try-Block
        println("Bitte geben sie ihr Alter an: ")




        var alter = readln().toInt()
        return alter
    }
    catch (ex: Exception) { // Geschwungene Klammer für Catch-Block
        println("Alter wurde falsch eingegeben")
//        println("Deine Eingabe war : $alter") // alter nicht in diesem Scope
        return altersEingabe()
    }

}


// Erweiterungsfunktion
fun String.blablabla(){
    println("blablabla")
}

var test = "".uppercase()
//var test2 = 45.uppercase()
var test3 = "".blablabla()

