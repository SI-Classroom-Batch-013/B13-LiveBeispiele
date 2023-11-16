import java.time.LocalDate

fun main(){

    // Datentyp einer Liste
    // Hier könnte der Datentyp weggelassen werden
    var filmListe: List<String> = listOf("Nemo", "Shrek", "Monsters Inc.")

    // Bei leeren Listen ist er erforderlich!
//    var wunschZettel = listOf() // Fehlerfaft
    var preisListe: List<Double> = listOf()
    var einkaufsWagen = listOf<String>()

    // Datentyp kann auch weggelassen werden, wenn er vom Compiler erschließbar ist
    val artikel = listOf("Brot", "Croissant", "Semmel", "Breze")
    val anzahl = mutableListOf(3, 5, 14, 8)

    // Datentypen einer Map
    // Immer <Key, Value>
    val altersListe: MutableMap<String, Int> = mutableMapOf<String, Int>(
        //Datentypen können weggelassen werden, wenn sie erschließbar sind
        "Felix" to 49,
        "Manuel" to 51,
        "Jana" to 31,
        "Hannah" to 22
    )

    // Datentypen für Pairs und Triple
    var ehePaar: Pair<String, String> = "Jonny" to "Holly"
    var addressBuch: MutableMap<String, MutableMap<String, String>> = mutableMapOf(
        "Jan" to mutableMapOf("Email" to "hjdh@hd.de", "Tel" to "1783736711")
    )

    println(altersListe.entries.toList()[0])    // Erstes Paar einer Map anzeigen

    // leere Maps erfordern den Datentyp
    var pokedex: Map<Int, String> = mapOf()
    var engToGer = mutableMapOf<String, String>()
//    var gerToEng = mutableMapOf() // Fehlerhaft
}



/*
 // Long und Int
    var zahl: Int = 4000000000
    var zahl2: Long = 4000000000
    var zahl3 = 4L
 */