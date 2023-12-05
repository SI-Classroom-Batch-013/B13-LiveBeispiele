package VORLESUNG.Woche05.Tag23
fun main() {
    // Break mit Liste
    val animals: List<String> = listOf("Tiger", "Löwe", "Gepard", "Maus", "Leopard", "weißer Tiger")

    // findMouseInList mit for Schleife in Funktion
    findMouseList(animals)


    // Break mit Map: selbes Prinzip, aber gesteigerte Komplexität
    val animalMap = mapOf(
        "Gepard" to false,
        "Tiger" to true,
        "Maus" to false,
        "Löwe" to true,
        "Leopard" to true,
    )
    println("-------")

    findMouseMap(animalMap)

    val numbers = listOf(1,2,3,4,5,6,7,8,9)
    // Sieben Finden, danach Schleife abbrechen
    findSeven(numbers)



    println("-------")


    // Schachbrett mit geschachtelter Schleife

}

fun findSeven(numbers: List<Int>) {
    for (i in numbers) {
        if (i == 7) {
            println("7 gefunden!")
            break
        } else {
            println("7 noch nicht gefunden, Zahl ist $i")
        }
    }
}

fun findMouseMap(animalMap: Map<String, Boolean>) {
    // findMouseInMap
    // wiederhole: durch map durchgehen, sowohl key als auch value ansprechen
        // statt for (tier in animal) brauchen wir den key und den value, also tier und status
        for ((tier, status) in animalMap) {
            if (!status && tier == "Maus") { // !status ist das gleiche wie status == false
                println("$tier (Maus) gefunden!")
                println("Schleife wird abgebrochen...")
                break
            } else {
                println("$tier gefunden, ist keine Maus, Schleife geht weiter...")
            }
        }
}

fun findMouseList(animals: List<String>) {
    // animals durchgehen, wenn maus gefunden ist, abbrechen (=break)
    for (animal in animals){
        if (animal == "Maus"){
            println("Maus gefunden! Schleife abbrechen...")
            break
        } else {
            println("Tier $animal gefunden, das keine Maus ist...")
        }
    }


}


