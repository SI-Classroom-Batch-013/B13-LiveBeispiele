package VORLESUNG.W06.d05.Konzert

// Kind BlasInstrument
open class BlasInstrument(name: String, sound: String) : MusikInstrument(name, sound) {
    override val mitMundSpielbar = true

    constructor(name:String): this(name,"ein blecherner Klang")

    override fun play() {
        clean()
        super.play()
        println("Blasinstrument $name ertönt!")
    }

    fun clean() {
        println("Mundstück des Blasinstruments $name wird gereinigt...")
    }

}
