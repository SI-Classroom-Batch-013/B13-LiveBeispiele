package VORLESUNG.Woche05.Tag22


fun main() {
    // Animal beispiel: for in schleife / for each schleife
    var animalList = mutableListOf("Tiger", "Löwe", "Bär", "Maus")
    val numbersList = mutableListOf(1,2,3,4,5,6,1,2,3,4)

    // WICHTIG: liste ist mit for in schleife nicht veränderbar!! man kommt an die Elemente, kann sie aber nicht bearbeiten
    for (animal in animalList){
        println(animal)
         // animal = "bla" // wirft fehler, animal ist val
    }

    for (number in numbersList){
        println(number)
        // number+=1 // nicht moeglich, number ist konstant, liste nicht bearbeitbar
    }

    // for i Schleife / Schleife mit Index: damit kann ich auf Elemente zugreifen und sie bearbeiten
    for (index in animalList.indices){
        print("Index $index: ")
        println(animalList[index])
        animalList[index] = animalList[index] + " ist ein Tier."
        println(animalList[index])

    }
    println(animalList)

    for (i in numbersList.indices){
        println(numbersList[i])
        numbersList[i] += 10
    }
    println(numbersList)

    // for Schleife mit Range bis zum letzten listenindex
    println("---For mit Range---")
    for (i in 0 .. animalList.size-1){ // auch moeglich: i in 0 until animalList.size
        println(animalList[i])
    }


    //pizza Aufgabe mit For Schleife: Funktion, die Liste mit Pizzen zurück gibt
    println("---PIZZA FOR----")
    var pizzaOrder: MutableList<String> = pizzaFor()
    println(pizzaOrder)


    // pizza sorten vorkommen zählen mit for in schleife
    var numberOfTonnos: Int = pizzaCounterForIn(pizzaOrder, "Tonno")
    println("Anzahl Tonno:")
    println(numberOfTonnos)
    println("Anzahl Salami:")
    println(pizzaCounterForIn(pizzaOrder,"Salami"))
    println("Anzahl Mozarella:")
    println(pizzaCounterForIn(pizzaOrder,"Mozarella"))
    println("Anzahl Hawaii:")
    println(pizzaCounterForIn(pizzaOrder,"Hawaii"))

    var numberForI: Int = pizzaCounterForI(pizzaOrder, "Tonno")
    println(numberForI)

}

fun pizzaCounterForI(pizzaOrder: MutableList<String>, searchedPizza: String): Int {
    var counter = 0
    for (index in pizzaOrder.indices){
        if (pizzaOrder[index] == searchedPizza){
            pizzaOrder[index] = "$index. ${pizzaOrder[index]}"
            counter++
        }
    }
    println(pizzaOrder)
    return counter

}

fun pizzaCounterForIn(pizzaOrder: MutableList<String>, gesuchtePizza: String): Int {
    // Anzahl an pizza in pizzaOrder zählen mit for in Schleife
    var counter = 0
    for (pizza in pizzaOrder){
        if (pizza == gesuchtePizza){
            counter++
            //println("$gesuchtePizza gefunden!")
        }
    }
    return counter
}

fun pizzaFor(): MutableList<String> {
    val order: MutableList<String> = mutableListOf()
    // Logik: 100 random pizzen in die order fuellen
    for (i in 1..100){
        order.add(PIZZAS.random())
    }
    return order
}


// for schleife, um pizza sorte zu zählen: ohne indizes, wir greifen direkt auf jedes Listenelement zu

// pizza sorten vorkommen zählen mit for in schleife


