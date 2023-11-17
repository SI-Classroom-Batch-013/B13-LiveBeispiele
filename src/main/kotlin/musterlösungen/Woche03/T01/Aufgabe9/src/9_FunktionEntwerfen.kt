fun waitForSeconds() {
    println("Bitte gib die Wartezeit in Sekunden an: ")
    val seconds = readln().toInt()
    val milliseconds = seconds * 1000L
    println("Programm wartet $seconds Sekunden...")
    Thread.sleep(milliseconds)
    println("...Fertig!")
}

fun main() {
    waitForSeconds()
}
