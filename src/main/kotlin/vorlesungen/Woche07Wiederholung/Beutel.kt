package vorlesungen.Woche07Wiederholung

import Pokemon

class Beutel {

    // Beutel soll
    // 3 Heiltränke
    var anzahlHeiltränke: Int = 3
    // 2 Booster
    var anzahlBooster: Int = 2
    // haben.


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
        }

    }

    // Booster nutzen Methode
    fun boosterNutzen(user: Pokemon){
        // schauen, ob noch Booster da sind
        // benutzen = ein Held bekommt 20% mehr HP
        // benutzten Booster wegschmeißen

    }



}