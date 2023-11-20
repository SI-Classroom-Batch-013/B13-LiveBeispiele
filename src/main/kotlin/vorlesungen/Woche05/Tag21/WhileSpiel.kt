package vorlesungen.Woche05.Tag21

val zielWorte = listOf(
    "apfel",
    "ananas",
    "banane",
    "birne",
    "kirsche",
    "kiwi",
    "mango",
    "melone",
)

fun main(){
    // Spiel Loop (zB Hangman)
    val zielWort = zielWorte.random()
    var userGuess: String
    var gewonnen = false
    var lives = 5

    println("Bestätige deinen Guess mit enter")
    while (!gewonnen && lives > 0){
        userGuess = readln().lowercase()
        if (userGuess == zielWort) {
            println("Richtig geraten")
            gewonnen = true
        }
        else {
            println("Falsch geraten du hast noch $lives Leben")
            lives --
        }
    }

    if (gewonnen)
        println("Hurra! Gratuliere zum Sieg!!")
    else
        println("Schade! Viel Erfolg beim nächsten mal ;)")

}