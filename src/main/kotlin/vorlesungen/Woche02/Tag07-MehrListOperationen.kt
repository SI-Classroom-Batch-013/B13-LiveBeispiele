package vorlesungen.Woche02

fun main() {

     // liste anlegen: ShoppingList
     val shoppingList: List<String> = listOf("Apfel", "Banane", "Brokkoli", "Kuchen", "Kekse", "Kaffee", "Tee")
     // shoppingList.add()


     // letztes Element: 3 Varianten
     // alternative zum Inhalt des letzten index: last()
     var lastElement: String = shoppingList.last() // shoppingList.last = ohne Klammern, last ist eine Eigenschaft. mit Klammern: Funktion
     var last1: String = shoppingList[shoppingList.size-1]
     var letztesElement: String = shoppingList[shoppingList.lastIndex]
     var lastElem: String = shoppingList.get(shoppingList.lastIndex) // shoppingList.size-1

     var lastIndex: Int = shoppingList.size-1 // 6

     // liste in mutable (veränderbare) liste umwandeln, in neuer variable speichern:
     val mutableShoppingList: MutableList<String> = shoppingList.toMutableList()
     //shoppingList.add() // geht immernoch nicht, shoppingList wird nicht bearbeitet, es wird nur eine mutable Kopie davon zurueckgegeben.
     mutableShoppingList.add("Kaugummi")



    // LESENDE OPERATIONEN: AUF LISTS UND MUTABLE LISTS
     println("---Schreibende Operationen: auf List und MutableList---")
     println("(hier keine printlns, am Besten mit dem Debugger durchgehen)")


    // size, also Länge der Liste, in variable speichern
    var shoppingSize: Int = shoppingList.size

    // index vs size:
    // size in lastIndex speichern
    var lastIndex2: Int = shoppingSize-1


    // alternative zu shoppingList[0]: first()
    var firstElement: String = shoppingList.first()
    var firstElem2: String = shoppingList[0]


    // min: gibt "kleinstes" Element raus
    var min: String = shoppingList.min()

    // max gibt "größtes" Element raus
    var max: String = shoppingList.max()

     var intList: List<Int> = listOf(2,4,66,33,898,1)
     // min: gibt "kleinstes" Element raus
    var minInt: Int = intList.min()

    // max gibt "größtes" Element raus
    var maxInt: Int = intList.max()



    // indexOf() - erstes Vorkommen eines Elements in der Liste
    // Vorbereitung: Ein Element doppelt in die Liste fügen
    println("IndexOf:")
    mutableShoppingList.add("Banane")
    var bananaIndex: Int = mutableShoppingList.indexOf("Banane")


    // lastIndexOf() - letztes Vorkommen eines Elements in der Liste
    var lastBananaIndex: Int = mutableShoppingList.lastIndexOf("Banane")

    // contains: gibt true zurück, wenn das gesuchte Element in der Liste ist
    var containsGum: Boolean = mutableShoppingList.contains("Kaugummi") // true


    // containsAll : siehe contains, aber: nicht ein einzelnes Element, sondern ganze Liste
    var containsBananaApple: Boolean = mutableShoppingList.containsAll(listOf("Banane","Apfel")) // true

    // subList: gibt liste vom 1. index in den Klammern bis AUSschliesslich den 2. Index aus
    println("Sublist: ")
    val lastThreeItems: List<String> = mutableShoppingList.subList(mutableShoppingList.size-3,mutableShoppingList.size) // ist EXklusive dem 2. Wert
    println(lastThreeItems)


    // slice: kann eine Int Range (x..y) oder eine Liste übergeben bekommen, das obere Ende der Range ist INklusive EINbegriffen (nicht wie bei subList)
    println("Slice mit IntRange:")
    // Beispiel für eine IntRange: hier sind die Zahlen 1 bis inklusive 100 enthalten
    var intRange: IntRange = 1..100
    //println(intRange)
    var sliced: List<String> = mutableShoppingList.slice(0..3)
    println(sliced)


    // reversed: erstellt eine Kopie der shoppingList, kehrt darin die Reihenfolge um
    println("Reversed:")
    var reversedShoppingList: List<String> = shoppingList.reversed()

    // shuffled: erstellt eine Kopie der shoppingList, mischt sie durch
    println("Shuffled:")
    var shuffledShoppingList: List<String> = shoppingList.shuffled()

    println("Sorted: ")
    var sortedShoppingList: List<String> = shoppingList.sorted()



// SCHREIBENDE OPERATIONEN: NUR MIT MUTABLE LISTS
   println("---Schreibende Operationen: nur mit MutableList---")

    var mutableMovies: MutableList<String> = mutableListOf("Inception", "Barbie", "Oppenheimer", "Harry Potter", "Saw X", "The Nun 2")

    // remove: entfernt das 1. vorkommende, passende Element (nicht mehrere, falls mehrere passen)
    println("Remove:")
    println("Vorher: $mutableMovies")
    // Element entfernen
    mutableMovies.remove("Saw X")
    println("Nachher, Saw wurde entfernt: $mutableMovies")

    // addAll: fügt ganze Liste an Elementen hinzu
    mutableMovies.addAll(listOf("Barbie", "Barbie", "Barbie", "Herr der Ringe", "Twilight"))

    println(mutableMovies)


    // removeAll: nimmt eine Liste an Elementen, die entfernt werden sollen, als Parameter. hiermit können doppelt vorkommende Elemente entfernt werden.
    println("RemoveAll:")
    mutableMovies.removeAll(listOf("Barbie", "The Nun 2"))
    println(mutableMovies)

    // add: ohne Index, fügt ein Element am Ende der Liste hinzu
    println("Add:")
    mutableMovies.add("Bones and All")
    mutableMovies.add("John Wick 4")
    mutableMovies.add("Matrix 4")
    mutableMovies.add("The Equalizer")
    println(mutableMovies)


    // add: mit Index: fügt ein Element am gegebenem Index  hinzu
    println("Add mit Index:")
    // Scream wird an die 4. Stelle geschrieben:
    mutableMovies.add(3,"Scream VI")
    println(mutableMovies)


    // clear: leert Liste komplett aus
    println("Clear:")
    mutableMovies.clear()
    println(mutableMovies)

    // addAll: fügt neue Liste in Liste ein
    var newShoppingList: List<String> = listOf("Mehl", "Eier", "Zucker", "Gelee", "Schokodrops", "Glasur", "Vanillezucker", "Zimt", "Rosinen", "Puderzucker")
    println("AddAll:")
    mutableShoppingList.addAll(newShoppingList)
    println(mutableShoppingList)


    println("RemoveAt 0")
    // removeAt: entfernt Element an spezifischen Index
    println(mutableShoppingList)
    mutableShoppingList.removeAt(0)
    println("RemoveAt last Index")
    mutableShoppingList.removeAt(mutableShoppingList.lastIndex)
    mutableShoppingList.removeAt(mutableShoppingList.size-1) // beide Zeilen machen das gleiche.
    println(mutableShoppingList)



    // removeLast: entfernt das letzte Element aus der Liste, gibt es zurück = es kann in eine Variable gespeichert werden
    println("Remove Last:")
    var last: String = mutableShoppingList.removeLast()
    println(last)



    // removeFirst: entfernt das 1. Element (index 0) aus der Liste, gibt es zurück = es kann in eine Variable gespeichert werden
    println("Remove First:")
    var firstElem: String = mutableShoppingList.removeFirst()
    println(firstElem)



    // sort: sortiert ORGINALE liste aufsteigend, es wird keine Kopie erstellt, die urspruengliche liste wird sortiert
    println("Sort:")
    mutableShoppingList.sort()
    println(mutableShoppingList)


    // shuffle: mischt liste durch
    println("Shuffle:")
    mutableShoppingList.shuffle()
    println(mutableShoppingList)

}