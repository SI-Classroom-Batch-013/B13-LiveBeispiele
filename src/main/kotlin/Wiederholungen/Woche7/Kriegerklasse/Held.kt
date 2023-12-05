open class Held(val name: String = "", var lebenspunkte: Int = 0) {
    open fun waehleAktion() {
        println("Wähle eine Aktion für $name:")
    }
}