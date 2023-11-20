package VORLESUNG.Woche05.Tag21


fun main() {

    var input: String
    // do Block wird IMMER ausgefuehrt, auch, wenn Bedingung direkt beim 1. Mal nicht stimmt.
    do {
        println("Bitte Namen eingeben...")
        input = readln()

    } while (input.isEmpty())

    println("Hallo, $input!")


    // Elvis Operator bei nullable Variablen:
    var name: String? = null
    println(name) // null

    // ?: -> wenn name null ist, schreib als Default-Wert "Gast" rein
    var displayName: String = name ?: "Gast"

    println("DisplayName: $displayName")




    // Elemente aus der Liste entfernen, bis nur noch 1 Element übrig ist
    val movies = mutableListOf("Inception", "Tenet", "Dunkirk", "Memento", "The Dark Knight")
    var i = movies.size-1
    do {
        println("Zu entfernendes Element: ${movies.last}")
        movies.removeLast()
        println("Länge der Liste nach dem Entfernen: ${movies.size}")
        i--
    } while (i > 0)
    println(movies)



    // positive Zahl eingeben und prüfen, ob sie positiv ist. wenn nicht nochmal eingeben
    var number: Int
    do {
        println("Bitte positive Zahl über 0 eingeben....")
        number = readln().toInt()

    } while (number <= 0)
    println("Prima, du hast die $number eingegeben und sie ist > 0")
}