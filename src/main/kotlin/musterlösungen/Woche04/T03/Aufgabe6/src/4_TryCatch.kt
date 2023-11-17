import java.lang.Exception

fun main() {
    println("Bitte gib dein Alter ein:")

    try {
        var alterInput = readln().toInt()
        if(alterInput >= 18) {
            println("Willkommen, hier ist dein Bier, let's party!")
        } else {
            println("Sorry, kein Einlass zur Party. Ist ab 18.")
        }

    } catch(e: Exception) {

            println("Ein Fehler ist aufgetreten:")
            println(e)
    }

}