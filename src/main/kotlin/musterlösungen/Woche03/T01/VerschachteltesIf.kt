fun main() {
    var isGoingOut = false
    var isRaining = false

    if (isGoingOut) {
        if (isRaining) {
            println("Regenschirm nehmen")
        } else {
            println("Sonnenschirm nehmen")
        }
    } else {
        if (isRaining) {
            println("Fenster schließen")
        }
    }
}