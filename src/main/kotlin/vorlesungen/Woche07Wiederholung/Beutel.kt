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
            // benutzen = ein Held bekommt 20% mehr HP
            user.hp *= 1.2
            // benutzten Heiltrank wegschmeißen
            anzahlHeiltränke--

        }

    }

    // Booster nutzen Methode
    fun boosterNutzen(user: Pokemon){
        // schauen, ob noch Booster da sind
        // benutzen = ein Held bekommt 20% mehr HP
        // benutzten Booster wegschmeißen

    }



}