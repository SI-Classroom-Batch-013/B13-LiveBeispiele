package VORLESUNG.Woche03.Tag11VoidFunktionen

fun main(){
    printGreeting()
    println("Es folgt der Funktionsaufruf von calculateAge()")
    calculateAge()
    println("Funktionsaufruf beendet.")
    radiusToSurface()

}


// greeting
fun printGreeting() {
    println("Hi, wie ist dein Name?")
    val name: String = readln()
    println("Soso, dein name ist also $name. Hallo!")
}



