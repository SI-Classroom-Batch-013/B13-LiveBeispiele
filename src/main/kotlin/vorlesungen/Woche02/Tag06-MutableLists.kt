package vorlesungen.Woche02

fun main() {

    // mutable overrides val: auch vals können bearbeitet werden, wenn der inhalt mutable ist.
    val namesList: MutableList<String> = mutableListOf("harry", "tom", "regina", "michael", "lisa", "lara", "janis")
    println(namesList)
    namesList[0] = "Hermine" // ähnlich wie firstName = "Marie" siehe Tag06WiederholungW01, Harry wird vergessen und ersetzt durch Hermine
    println(namesList)

    // add: fuegt element ans ende der liste hinzu
    namesList.add("Margot")
    namesList.add("Margot")
    namesList.add("Margot")
    println(namesList)


    // add fuegt element im angegeeben index hinzu
    namesList.add(0,"James")
    namesList.add(5,"Lana")
    println(namesList)

    // remove: entfernt erstes vorkommen des elements aus der liste
    //var removeMargotSuccessful: Boolean = namesList.remove("Margot")
    //println("Entfernen von Margot erfolgreich? -> $removeMargotSuccessful")
   // println(namesList)

    // removeAll: entfernt alle in der übergebenen Liste enthaltenen elemente.
    namesList.removeAll(listOf("Margot", "janis"))
    println(namesList)

    // removeAt(): entfernt element an angegebenem index aus der liste
    //namesList.removeAt(namesList.size-1)
    //println(namesList)

    // IndexOf
    var indexHermine: Int = namesList.indexOf("Hermine")
    println("Hermine steht am $indexHermine. Index.")


}