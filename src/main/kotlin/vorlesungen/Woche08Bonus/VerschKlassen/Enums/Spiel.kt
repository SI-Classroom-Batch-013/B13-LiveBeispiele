package Enums

enum class Schwierigkeit {
    ANFAENGER, FORTGESCHRITTEN, PROFI;
}

fun schwierigkeitFromIndex(index: Int): Schwierigkeit{
    return when (index){
        1 -> Schwierigkeit.ANFAENGER
        2 -> Schwierigkeit.FORTGESCHRITTEN
        3 -> Schwierigkeit.PROFI
        else -> throw Exception("Ungültige Schwierigkeit")
    }
}

fun main(){
    println("Wählen sie Ihre Schwierigkeit:")

    var schwierigkeit: Schwierigkeit = schwierigkeitFromIndex(readln().toInt())
    println("Sie haben die Schwierigkeit $schwierigkeit gewählt.")

}