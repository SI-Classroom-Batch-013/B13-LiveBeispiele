package VORLESUNG.W06.d05.Konzert

// Elternklasse MusikInstrument
open class MusikInstrument(val name: String, val sound: String) {


    open val mitMundSpielbar: Boolean = false


    open fun play() {
        println("$name spielt $sound")
    }
}
