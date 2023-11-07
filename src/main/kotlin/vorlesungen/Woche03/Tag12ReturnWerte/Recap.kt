// Globale Konstanten werden in SNAKE_CASE geschrieben
val VORNAMEN = mutableListOf(
    "Johannes",
    "Michael",
    "Thomas",
    "Andreas",
    "Daniel",
    "Stefan",
    "Markus",
    "Alexander",
    "Christian",
    "Martin",
    "Anna",
    "Maria",
    "Lisa",
    "Sarah",
    "Julia",
    "Christina",
    "Laura",
    "Jessica",
    "Melanie",
    "Sandra"
)
val NACHNAMEN = listOf(
    "Müller",
    "Schmidt",
    "Schneider",
    "Fischer",
    "Weber",
    "Wagner",
    "Becker",
    "Hoffmann",
    "Schäfer",
    "Koch",
    "Bauer",
    "Richter",
    "Klein",
    "Wolf",
    "Schröder",
    "Neumann",
    "Schwarz",
    "Braun",
    "Zimmermann",
    "Krüger"
)

fun main(){

    namensGenerator()
    namensGenerator()
    namensGenerator()
    namensGenerator()
    namensGenerator()
    zufallsZahl()
    zufallsZahl()
    zufallsZahl()


    // Void Funktionen gehören nicht in ein Println
//    println(namensGenerator())
//    println(zufallsZahl())


    // Unterschied zwischen sort und sorted
    /*VORNAMEN.sort()     // kein Rückgabewert
    VORNAMEN.sorted()   // Rückgabewert: sortierte Kopie der Liste
    NACHNAMEN.sort()    // statische Liste kann man nicht sortieren
    NACHNAMEN.sorted()*/
}


