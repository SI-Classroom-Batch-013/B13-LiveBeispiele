fun main() {
    // TODO: Ruf die Funktion divideByZero() mit einer Zahl deiner Wahl auf.
    // TODO: Fange den Laufzeitfehler mit einem Try-Catch-Block ab und gib eine sinnvolle Fehlermeldung über die println()-Funktion in der Konsole aus.
    try {
        divideByZero(12)
    } catch (e: Exception) {
        println("Ein Fehler ist aufgetreten:")
        println(e)
    }
}

fun divideByZero(number: Int): Int {
    return number / 0
}
