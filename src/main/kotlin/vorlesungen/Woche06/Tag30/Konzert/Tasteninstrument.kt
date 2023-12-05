package VORLESUNG.W06.d05.Konzert

// Child class TastenInstrument
class TastenInstrument(name: String, sound: String) : MusikInstrument(name, sound) {

    fun tastenDruecken(): String {
        return "Es wird in die $name-Tasten gehauen!"
    }
}
