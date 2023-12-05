package VORLESUNG.Woche05.Tag22

fun main() {

    // repeat
    //useRepeat(100)


    // Unterschied do while / while
    // while: Bedingung muss stimmen, sonst kommen wir niemals in die Schleife
    var i: Int = 0
    while (i > 10){
        println("$i > 10")
    }

    // do while: wird immer mind 1x ausgefuehrt, auch wenn die Bedingung nicht true ist
//    do {
//        println("$i > 10 ")
//    } while (i > 10)
//

    // while in Funktion
    //whileSchleife()

    // do While
    doWhilePasswort()




}

fun doWhilePasswort() {
    // user will sich einloggen, darf 3x versuchen, das passwort einzugeben, wird danach ausgesperrt
    // variable für passwort
    var gesuchtesPw: String = "1234"
    var anzahlVersuche: Int = 1
    var passwortRichtig: Boolean = false

    do {
        println("passwort eingeben...")
        var input: String = readln()
        // Logik zur pw prüfung
        if (input == gesuchtesPw) {
            println("Passwort korrekt! Willkommen, du bist eingeloggt.")
            passwortRichtig = true
        } else {
            if (anzahlVersuche >= 3) {
                println("Passwort falsch, keine Versuche übrig. Du wirst gesperrt.")
                anzahlVersuche++
            } else {
                println("Passwort falsch, versuch es nochmal")
                anzahlVersuche++
            }

        }

    } while (anzahlVersuche <= 3 && passwortRichtig == false)

}

fun whileSchleife() {
    var i: Int = 0
    while (i <=10){
        println("$i gefunden, wird verdoppelt...")
        i *= 2 // das gleiche wie: i = i*2
        println("Verdoppeltes Ergebnis: $i")
        i++
    }
}

fun useRepeat(repetitions: Int) {
    repeat(repetitions){
        println("${it+1}. Wiederholung: $it")
        // mehr anweisungen...
    }

}






