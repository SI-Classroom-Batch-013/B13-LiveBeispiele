package vorlesungen.Woche02

fun main(){

// Set: unsortierte Kollektion einzigartiger Elemente. D.h. Doppelungen desselben Werts werden nicht geprinted oder gezählt

    var ogMutableAnimalList: MutableList<String> = mutableListOf("Tiger", "Affe", "Rabe", "Gorilla", "Tiger")
    println("Alle Elemente in der AnimalList:")
    println(ogMutableAnimalList)
    ogMutableAnimalList.add("Affe")
    ogMutableAnimalList.add("Gorilla")
    ogMutableAnimalList.add("Rabe")
    ogMutableAnimalList.add("Papagei")
    println(ogMutableAnimalList)

    // set anlegen
    println("Alle Elemente im AnimalSet:")
    var animalSet: Set<String> = setOf("Tiger", "Affe", "Rabe", "Gorilla", "Tiger")
    println(animalSet)


    // mutable machen
    var mutableAnimalSet: MutableSet<String> = animalSet.toMutableSet()

    // mehr duplikate hinzufügen
    mutableAnimalSet.add("Affe")
    mutableAnimalSet.add("Gorilla")
    mutableAnimalSet.add("Rabe")
    mutableAnimalSet.add("Papagei")
    // nur nicht bereits vorhandene Elemente werden aufgenommen: hier nur die Antilope
    mutableAnimalSet.addAll(listOf("Affe", "Gorilla", "Rabe", "Antilope"))
    // mutableAnimalSet.addAll(mapOf("Affe" to 1, "Zebra" to 2)) -> funktioniert nicht, Set kann keine Paare abbilden

    println("Nach dem adden mit addAll und einer Liste: $mutableAnimalSet")


    // set zur mutable liste konvertieren
    var mutableAnimalsFromSet: MutableList<String> = mutableAnimalSet.toMutableList()


    // liste mit duplikaten zu set konvertieren: ogMutableAnimalList zum Set machen
    var setFromOGs: Set<String> = ogMutableAnimalList.toSet()
    println("--Orginale AnimalListe mit Duplikaten zum Set konvertiert---")
    println(setFromOGs)


    // size: enthält bei set die duplikate nicht
    var setSize: Int = mutableAnimalSet.size
    println("Size des Orginalen MutableAnimal Sets: $setSize")


    // Sinn von Sets
    // Daten aus verschiedenen Quellen, in denen Doppelungen vorkommen
    val source1 = listOf("A", "B", "C", "D", "E")
    val source2 = listOf("C", "D", "E", "F", "G")
    val source3 = listOf("E", "F", "G", "H", "I")

    // Eine leere Menge (Set) erstellen, um eindeutige Datensätze zu speichern
    var uniqueData: MutableSet<String> = mutableSetOf()

    // Daten aus verschiedenen Quellen zusammenführen, Doppelungen werden nicht hinzugefügt
    uniqueData.addAll(source1)
    uniqueData.addAll(source2)
    uniqueData.addAll(source3)


    // Eindeutige Datensätze anzeigen
    println("Eindeutiger Datensatz:")
    println(uniqueData)

    // auf Element im Set zugreifen
    println("1. Element in der og Animal list: ${ogMutableAnimalList[0]}")
    println("1. Element im Set: ${uniqueData.elementAt(0)}")

    var reversedSet: List<String> = uniqueData.reversed()
    println("Umgedrehtes Set (reversed macht daraus eine Kopie als Liste")
    println(reversedSet)

    println("J hinzufuegen")
    uniqueData.add("J")
    println(uniqueData)
    println("A entfernen")
    uniqueData.remove("A")
    println(uniqueData)
    uniqueData.clear()
    println("Set komplett ausleeren:")
    println(uniqueData)


}