package Parameter


fun main(){
    // Funktionsaufruf gibt uns den Rückgabewert
    val name1 = getRandomName()
    val name2 = getRandomName()
    println("Name 1: $name1")
    println("Name 2: $name2")

    // in der Variable 1 steht, das Ergebnis! Die Funktion wird nicht neu aufgerufen!
    println("Name 1: $name1")

    // Ohne Variable get das Ergebnis verloren
    getRandomName()

    // Ergebnis ausdrucken, ohne abzuspeichern
    println(getRandomName())
    println("Zufälliger Name: ${getRandomName()}")

    var name3 = getRandomName()
    name3 = name3.uppercase()
    println(name3)


    var product1 = getProduct()
    var product2 = getProduct()

    println("Produkt 1: ${product1.first}")
    println("Preis davon: ${product1.second}")

}

// Globale Variablen
val vornamen = listOf(
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
val nachnamen = listOf(
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
val spielerName = getRandomName()   // Funktionsaufrufe als Variable möglich

// Funktionsaufrufe ohne kontext nicht möglich
//    getRandomName()
//    println("Die Liste aller Vornamen: $vornamen")
//    println("Der Spieler heißt '$spielerName'")


fun getRandomName(): String {
    return vornamen.random() + " " + nachnamen.random()
}

fun getTenNames(): List<String>{
    return listOf(
        getRandomName(),
        getRandomName(),
        getRandomName(),
        getRandomName(),
        getRandomName(),
        getRandomName(),
        getRandomName(),
        getRandomName(),
        getRandomName(),
        getRandomName(),
        getRandomName(),
    )
}


/*
    Mars: 0.45
    Twix: 0.45
    Haribo: 1.00
 */

var productListe: MutableList<Pair<String, Double>> = mutableListOf(
    Pair("Mars", 0.45),
    Pair("Bounty", 0.45),
    Pair("Haribo Goldbären", 1.0),
    Pair("Cola 0.5l", 1.99)
)


var productMap: MutableMap<String, Double> = mutableMapOf(
    "Mars" to 0.45,
    "Haribo Goldbären" to 1.0
    //..
)

fun getProduct(): Pair<String, Double>{
    return productListe.random()
}