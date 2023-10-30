package vorlesungen.Woche02

fun main() {

    // LIST: NUR LESENDE OPERATIONEN

    // zur Erinnering: Primitven Datentypen anlegen
    val firstName: String = "Harry"

    // Syntax: leere Liste anlegen
    val emptyList: List<String> = listOf()
    println(emptyList)
    println(emptyList.isEmpty()) //

    // Syntax: Liste an primiten Datentypen anlegen
    val firstNameList: List<String> = listOf("harry", "tom", "regina", "michael", "lisa", "hermine", "lara", "janis")
    println(firstNameList)

    // Arbeiten mit dem Index []
    var ersterName: String = firstNameList[0]
    println("Erste Name in der Liste: $ersterName")
    println("Zweiter Name in der Liste: ${firstNameList[1]}")
    var integer: Int = 3
    println("Dritter Name in der Liste: ${firstNameList[integer]}")

    // Alternative zum Index: get()
    var harryWithGet: String = firstNameList.get(0) // ist exakt das gleiche wie firstNameList[0]


    // .size gibt die Länge einer Liste zurück, analog zu string.length
    println("Länge (size) der Liste: " + firstNameList.size) // size ist 8, letzter Index ist aber 7!!

    // IndexOutOfBoundsException: wenn ein Index angegeben wird, der nicht in der Liste enthalten ist.
    //var letzterName: String = firstNameList[firstNameList.size] // firstnameList.size ist 8, aber size-1 ist 7 = der letzte Index
    //println(letzterName)

    // isEmpty: gibt true oder false zurück je nachdem, ob liste leer ist
    println("Ist die firstNameList leer? -> ${firstNameList.isEmpty()}")
    println("Ist die firstNameList befüllt/nicht leer? -> ${firstNameList.isNotEmpty()}")


    // contains: true, wenn das exakt gleiche (also auch gleich geschriebene) Element vorhanden ist
    // wie kann man die gross und kleinschreibung umgehen? --> lowercase()
    var thomasInList: Boolean = firstNameList.contains("Thomas".lowercase()) // false
    var reggieInList: Boolean = firstNameList.contains("Regina".lowercase()) // false
    println("Thomas in Liste? " + thomasInList)
    println("Regina in Liste? " + reggieInList)

    // first und last
    var firstWFunction: String = firstNameList.first
    println(firstWFunction)

    var lastWFunction: String = firstNameList.last
    var lastIndex: Int = firstNameList.size-1 // immer, wenn man size-1 macht kommt man ez auf den letzten Index
    var last: String = firstNameList[lastIndex]
    println(lastWFunction)

    // (equals mit ignoreCase, gehört zum Thema Listen)
    var janisEqualsJanis: Boolean = lastWFunction.equals("Janis",true)
    println("It Janis = janis? -> $janisEqualsJanis, denn wir haben ignoreCase auf true gesetzt.")


    // subList: gibt uns eine Liste mit Elementen von fromIndex bis AUSschliesslich dem toIndex zurück.
    var subList: List<String> = firstNameList.subList(0,4) // index 0, 1, 2, 3, exklusive 4.
    println(subList)

    // reversed: originale Liste wird nicht verändert, sondern ergebnis ausgegeben
    var reversedNames: List<String> = firstNameList.reversed()
    println(reversedNames)

    // jedes 2. Element in neue Liste
    println("Namen eingeben:")
    var everySndName: List<String> = listOf(firstNameList.first, firstNameList[2], firstNameList.get(4), "Ron", readln())
    println(everySndName)


    // sorted
    var sortedNames: List<String> = firstNameList.sorted()
    println("Sortierte Namen: $sortedNames")











}