
fun main(){

    println("Das auto fährt und fährt..")

    var isRaining: Boolean = true // listOf(true, false).random()
    var scheibenWischer: Boolean = false

    if (isRaining){
        println("Es regnet...")
        println("...Scheibenwischer ist an.")
        scheibenWischer = true
    } else {
        println("Es regnet nicht mehr...")
        println("...Scheibenwischer geht aus")
        scheibenWischer = false
    }

    println("Das auto fährt und fährt..")


    // Bei einzelnen Anweisungen kann man die {} weglassen
    var isFoggy = listOf(true, false).random()
    if (isFoggy)
        println("Es ist neblig...Nebellichter an")
    else
        println("Kein Nebel heute")


    // Verschachtelte If Abfragen
    var isSunny = true // listOf(true, false).random()
    if (isRaining){
        println("Es regnet...")
        if (isSunny){
            println("..aber es scheint auch die Sonne...")
            println("Heute gibt es einen schönen Regenbogen 🌈")
        }
    }




    // .contains -> Boolean
    var email = "....text depp blablab spam..."

    if (email.contains("spam")) // == ("spam" in email)
    {
        println("Spam email detected")
        println("Email wird gelöscht")
    }

    // If-Statements ohne Else sind unabhängig
    if ("Spam" in email)    // in-Schlüsselwort ist kurz für .contains()
    {
        println("Spam email detected")
        println("Email wird gelöscht")
    }

    if ("depp" in email)
    {
        println("Spam email detected")
        println("Email wird gelöscht")
    } else
    {
        println(email)
    }

    // Beispiel mit Liste
    var artikelListe = listOf("Bier", "Milch", "Zitrone")

    if  ("Bier" in artikelListe)   //(artikelListe.contains("Bier"))
    {
        println("Sie müssen min. 16 Jahre alt sein um Bier zu kaufen...")
    }
    else {
        println("Weiter zum Bezahlen")
    }


    // remove -> Boolean
    var testListe = mutableListOf(1, 4, 6)

    println("Geben sie einen Wert ein, der gelöscht werden soll:")
    var eingabe = readln().toInt()

    var erfolgreich: Boolean = testListe.remove(eingabe)

    if (erfolgreich){
        println("Bestätigung")
    } else {
        println("Fehlgeschlagen")
    }



    // Altersüberprüfung

    var is18old = true // listOf(true, false).random()
    var is16old = true  //

    if (is18old)
        println("Kann alle Produkte kaufen")
    else if (is16old)
        println("Kann Bier & Wein kaufen, kein Schnaps")
    else
        println("Kann gar keinen Alkohol kaufen")

}