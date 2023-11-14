package vorlesungen.Woche04.Tag17Bedingungen


fun passwortAbfrage(){
    // Passwort abfrage mit == Operator ("equals")
    println("Geben sie ihr Passwort ein:")
    var eingegebenesPasswort = readln()
    var echtesPasswort = "passwort321"

    if(eingegebenesPasswort == echtesPasswort){
        println("Erfolgreich eingeloggt")
    }
    else {
        println("Falsches Passwort. Versuche es nochmal.")
    }
}


fun main(){

    passwortAbfrage()

    var alter = (15..20).random()

    if (alter >= 18){
        println("Nutzer ist alt genug, um ein Auto zu kaufen")
    }
    else {
        println("Nutzer ist noch nicht alt genug")
    }

    // Variante A
    if (alter >= 18){
        println("Der Nutzer kann alle Getränke kaufen")
    } else if (alter >= 16){
        println("Der Nutzer kann Wein und Bier kaufen")
    } else
        println("Der Nutzer kann keine alk. Getränke kaufen")

    // Variante B
    if (alter < 16)
        println("Der Nutzer kann keine alk. Getränke kaufen")
    else if (alter < 18)
        println("Der Nutzer kann Wein und Bier kaufen")
    else
        println("Der Nutzer kann alk. Getränke kaufen")


    var pikachuLP = (40..50).random()
    val schaden = (20..30).random()
    pikachuLP -= schaden

    // Variante A
    if (pikachuLP > 0){
        println("Der Kampf geht weiter")
    } else
        println("Pikachu ist KO")

    // Variante B
    if (pikachuLP <= 0)
        println("Pikachu ist KO")
    else
        println("Der Kampf geht weiter")


    // Genug Geld auf dem Konto?
    var kontostand = 4000.0
    var autoPreis = 2300.0

    // Variante A: kleiner gleich = höchstens
    if (autoPreis <= kontostand){
        println("Ich kann mir das Auto leisten")
    } else
        println("Ich kann mir das Auto nicht leisten")

    // Variante B: größer gleich = mindestens
    if (kontostand >= autoPreis){
        println("Ich kann mir das Auto leisten")
    } else
        println("Ich kann mir das Auto nicht leisten")
}

