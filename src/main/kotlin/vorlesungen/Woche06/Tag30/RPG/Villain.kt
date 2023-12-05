package VORLESUNG.W06.d05.RPG

class Villain(name: String): Character(name,40,20) {

    override fun attack(target: Character, ap: Int) {
        println("Gegner $name greift an!")
        super.attack(target, this.ap)
    }

    override fun printCharacterInfo() {
        println("--Bösewicht: $name--")
        super.printCharacterInfo()
    }
}