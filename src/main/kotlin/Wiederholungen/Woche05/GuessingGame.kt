import kotlin.random.*

fun main() {

    println("--- Guess the right number ---")
    val random = (1..100).random()
    var isCorrectGuess = false

    do {
        println("Please enter a number between 1 - 100")
        var guess: Int = -1

        try {
            guess = readln().toInt()
            if(guess < 1 || guess > 100)
                throw Exception("The number is out of range")

        } catch (e: NumberFormatException) {
            println("Please enter a valid number")
        }
        catch (e: Exception) {
            println(e.message)
        }

        if(guess < random)
            println("The number you entered is higher than the actual number >>>")
        else if(guess > random)
            println("The number you entered is lower than the actual number <<<")
        else {
            isCorrectGuess = true
            println("You won the game!")
        }

    } while (!isCorrectGuess)

}
