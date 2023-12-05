package VORLESUNG.`W05-Schleifen`.d02

fun main(){

    val options: List<String> = listOf("Schere","Stein","Papier")

    /*
    1. liste an optionen
    while gameOver = false
        print waehle aus
        pc waehlt random aus
        vergleich: alle fälle abdecken
            printen wer jeweils gewinnt
     */


}











































val choices = listOf("Schere", "Stein", "Papier")

fun schereSteinPapier(){

    val choices = listOf("schere", "stein", "papier")
    var playAgain = true

    while (playAgain) {
        println("Schere, Stein oder Papier?")
        val playerChoice = readln().lowercase()

        if (playerChoice in choices) {
            val computerChoice = choices.random()
            println("Computer wählt: $computerChoice")

            if (playerChoice == computerChoice) {
                println("It's a tie!")
            } else if (
                (playerChoice == "stein" && computerChoice == "schere") ||
                (playerChoice == "papier" && computerChoice == "stein") ||
                (playerChoice == "schere" && computerChoice == "papier")
            ) {
                println("Du gewinnst mit $playerChoice gegen $computerChoice!")
            } else {
                println("Computer gewinnt mit $computerChoice gegen $playerChoice!")
            }
        } else {
            println("Schere, Stein oder Papier wählen.")
        }

        println("Nochmal spielen? (ja/no)")
        val playAgainInput = readln().lowercase()
        playAgain = playAgainInput == "ja"
    }

    println("Thanks for playing!")


}