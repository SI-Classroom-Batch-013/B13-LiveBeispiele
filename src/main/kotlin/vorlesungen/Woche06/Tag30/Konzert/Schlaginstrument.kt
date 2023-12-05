package VORLESUNG.W06.d05.Konzert


// Kind SchlagInstrument
class SchlagInstrument(name: String, sound: String) : MusikInstrument(name, sound) {

    override fun play() {
        println("$name wird getrommelt!")
        super.play()
    }
    fun schlag(): String {
        return "$name wird getrommelt!"
    }
}