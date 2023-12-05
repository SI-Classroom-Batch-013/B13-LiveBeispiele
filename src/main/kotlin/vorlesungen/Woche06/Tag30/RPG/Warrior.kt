package VORLESUNG.W06.d05.RPG

class Warrior(name: String) : Character(name,100,50) {

    override fun attack(target: Character, ap: Int) {
        println("Krieger $name greift ${target.name} an!")
        super.attack(target, ap)
    }

    override fun printCharacterInfo() {
        println("--Krieger: $name--")
        super.printCharacterInfo()
    }


}
