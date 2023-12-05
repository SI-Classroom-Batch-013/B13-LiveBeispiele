package VORLESUNG.W06.d05.Konzert

// Kind StreichInstrument
class StreichInstrument(name: String, sound: String) : MusikInstrument(name, sound) {
    override fun play() {
        println("Streichinstrument $name lässt die Saiten erklingen!")
    }
    fun saitenWechseln() {
        println("Saiten von $name werden ausgetauscht...")
    }
}