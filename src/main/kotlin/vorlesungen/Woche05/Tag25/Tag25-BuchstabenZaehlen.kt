package vorlesungen.Woche05.Tag25

fun main() {
    val lyrics: String = "Every night, I live and die \n" +
            "Feel the party to my bones \n" +
            "Watch the wasters blow the speakers \n" +
            "Spill my guts beneath the outdoor light \n" +
            "It's just another graceless night \n" +
            "I hate the headlines and the weather \n" +
            "I'm nineteen and I'm on fire \n" +
            "But when we're dancing, I'm alright \n" +
            "It's just another graceless night \n" +
            "\n" +
            "Are you lost enough? \n" +
            "Have another drink, get lost in us \n" +
            "This is how we get notorious, oh \n" +
            "'Cause I don't know \n" +
            "If they keep tellin' me where to go \n" +
            "I'll blow my brains out to the radio, oh-oh-oh (Tch-tch) \n" +
            "\n" +
            "All of the things we're taking \n" +
            "'Cause we are young and we're ashamed \n" +
            "Send us to perfect places \n" +
            "All of our heroes fading \n" +
            "Now I can't stand to be alone \n" +
            "Let's go to perfect places \n".lowercase()


    // vorkommen des buchstabens 'a' zählen

    var aCounter = lyrics.count { it == 'a' }
    println("Der Buchstabe 'a' kommt $aCounter mal im Songtext vor.")

    countLetter(lyrics,'a')
    countLetter(lyrics,'b')


    // vorkommen aller buchstaben zählen
    //countAllLetters(lyrics)

    // TODO Anzahl aller Buchstaben ohne Leerzeichen, ohne Sonderzeichen

    // TODO worte zählen

    // TODO längstes wort im text finden


    // TODO mehrere längste worte im text finden, wenn welche gleich lang sind

    // Schachbrett Beispiel

    var abc: CharRange = 'a'..'h'
    for (i in abc){
        for (j in 1..8){
            print("$i$j")
        }
        println()
    }

}

private fun countAllLetters(lyrics: String) {
    var abc: CharRange = 'a'..'z'
    for (buchstabe in abc) {
        var counter = 0
        for (letter in lyrics) {
            if (buchstabe == letter) {
                counter++
            }
        }
        println("Buchstabe $buchstabe kommt $counter Male vor.")
    }
}

private fun countLetter(lyrics: String, searchedLetter: Char) {
    var aZaehler: Int = 0
    for (char in lyrics) {
        if (char == searchedLetter) {
            aZaehler++
        }
    }
    println("Der Buchstabe $searchedLetter kommt $aZaehler mal im Songtext vor.")
}

