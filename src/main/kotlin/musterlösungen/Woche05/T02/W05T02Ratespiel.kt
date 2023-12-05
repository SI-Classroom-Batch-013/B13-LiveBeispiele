import kotlin.random.Random

fun main() {
    val computerGuess = Random.nextInt(1, 100)
    var guesses = 0
    do {
        var playerGuess: Int
        try {
            playerGuess = readln().toInt()
            if (playerGuess < computerGuess) {
                println("Zu klein!")
            }
            if (playerGuess > computerGuess) {
                println("Zu groß!")
            }
            guesses++
        } catch (e: NumberFormatException) {
            println("Bitte gib einen Integer ein!")
            playerGuess = -1
        }
    } while (playerGuess == -1 || playerGuess != computerGuess)

    println("Du hast gewonnen!")
    println("Du hast $guesses mal geraten.")
}