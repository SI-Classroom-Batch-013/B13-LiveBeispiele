fun main() {
    checkDoors(true)
    checkDoors(false)
}

fun start() {
    println("Software gestartet")
}

fun closeDoors() {
    println("Bitte alle Türen schließen")
}

fun checkDoors(areDoorsClosed: Boolean) {
    if (areDoorsClosed) {
        start()
    } else {
        closeDoors()
    }
}