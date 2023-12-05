package VORLESUNG.W06.d05.RPG

class Rogue(name: String) : Character(name,50,25) {

    override fun attack(target: Character, ap: Int) {
        println("Schurke $name greift hinterlistig ${target.name} an!")
        super.attack(target, ap)
    }

    override fun printCharacterInfo() {
        println("--Schurke: $name--")
        super.printCharacterInfo()
    }

}
