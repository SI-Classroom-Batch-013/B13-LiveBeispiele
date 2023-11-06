package VORLESUNG.Woche03.Tag11VoidFunktionen

fun main(){

    snackAutomat()

}

fun snackAutomat() {
    val snackMachine = mapOf(
        "A1" to "Schokoriegel",
        "A2" to "Chips",
        "A3" to "Gummibärchen",
        "B1" to "Nüsse",
        "B2" to "Popcorn",
        "B3" to "Kekse",
        "C1" to "Cola",
        "C2" to "Limonade",
        "C3" to "Wasser"
    )

    println("Bitte gib deine Wahl ein...")
    // 1. user gibt zahlenkombi ein
    val choice: String = readln().uppercase()

    // 2.automat spuckt (per println) auswahl aus
    // var x: String = liste[0] // das 1. Element in der Liste wird in x gespeichert, gleiches Prinzip gilt für Zugriff auf Map Values:
    var chosenSnack: String = snackMachine[choice]!!

    println("Viel Vergnügen mit $chosenSnack")
}






