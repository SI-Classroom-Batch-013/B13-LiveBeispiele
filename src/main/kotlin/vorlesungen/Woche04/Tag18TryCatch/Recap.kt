// Die gespeicherten User mit deren PW
val USER1 = "Gordon"
val PW1 = "guest"

val USER2 = "Felix"
val PW2 = "felix123"

fun main(){
    var user1LoggedIn = false
    var user2LoggedIn = false

    println("Geben sie ihren Usernamen ein")
    val username = readln()
    println("Geben sie ihr Passwort ein")
    val passwort = readln()

    // Equals
    if (username == USER1){
        if (passwort == PW1){
            println("Willkommen $USER1")
            user1LoggedIn = true
        } else {
            println("Falsches Passwort für $USER1")
        }
    }

    // Verknüpft mit UND
    user2LoggedIn = username == USER2 && passwort == PW2
    if (user2LoggedIn) {
        println("Willkommen $USER2")
    }

    // Not Equals
    if (username != USER1 && username != USER2){
        println("Unbekannter User, bitte registrieren sie sich")
    }

    // Größer als
    val alter = 27
    if (alter > 17){
        println("Zeige alle 18+ Serien an")
    }

    // Größer oder gleich (mindestens)
    if (alter >= 18){
        println("Zeige alle 18+ Serien an")
    }

    // ODER
    if (user1LoggedIn || user2LoggedIn){
        println("Einer der User ist angemeldet")
    }

    // NICHT
    // Wir überprüfen, ob beide User nicht eingelogt sind.
    if (!(user1LoggedIn || user2LoggedIn)){ // nicht (nutzer1 oder nutzer2 eingeloggt)
        println("Neuer LoginScreen")
    }

    // Identisch:         !(A || B) == !A && !B
    if (!user1LoggedIn && !user2LoggedIn){  // nicht nutzer1 und nicht nutzer2 eingelogt
        println("Neuer LoginScreen")
    }

    // Boolean kombiniert mit Integer:
    if (user1LoggedIn && alter >= 18){
        println("Zeige Erwachsenen Content an.")
    }

}

