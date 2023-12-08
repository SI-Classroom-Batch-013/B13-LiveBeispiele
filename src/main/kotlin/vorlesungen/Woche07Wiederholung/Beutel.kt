package vorlesungen.Woche07Wiederholung

import Pokemon

class Beutel {

    // Beutel soll
    // 3 Heiltränke
    var anzahlHeiltränke: Int = 3
    // 2 Booster
    var anzahlBooster: Int = 2
    // haben.

    // Beutel nur 1x pro Runde nutzbar:
    // var beutelBenutzt = false



    // Heiltrank nutzen Methode

    fun heiltrankNutzen(user: Pokemon){
        // schauen ob noch Heiltränke da sind
        if (anzahlHeiltränke > 0) {
            println("${user.name} hat ${user.hp} HP und heilt sich mit dem Trank...")
            // benutzen = ein Held bekommt 20% mehr HP
            user.hp *= 1.2 // x.xxxxx
            user.hp = roundDouble(user.hp) // x.xx
            // benutzten Heiltrank wegschmeißen
            anzahlHeiltränke--
            println("${user.name} hat sich geheilt und jetzt ${user.hp} HP!")
        } else {
            println("Es sind keine Heiltränke mehr übrig!")
            println("Wähle erneut!")
            user.useBeutel(this)
        }

    }

    // Booster nutzen Methode
    fun boosterNutzen(user: Pokemon){
        if (anzahlBooster > 0) {
            println("${user.name} hat ${user.ap} AP und boostet sich mit dem Trank...")
            // benutzen = ein Held bekommt 20% mehr AP
            user.ap *= 1.2 // x.xxxxx
            user.ap = roundDouble(user.ap) // x.xx
            // benutzten Heiltrank wegschmeißen
            anzahlBooster--
            println("${user.name} hat sich geheilt und jetzt ${user.ap} AP!")
        } else {
            println("Es sind keine Booster mehr übrig!")
            println("Wähle erneut!")
            user.useBeutel(this)
        }

    }



}