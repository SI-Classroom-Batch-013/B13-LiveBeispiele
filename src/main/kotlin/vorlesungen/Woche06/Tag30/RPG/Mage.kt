package VORLESUNG.W06.d05.RPG

class Mage(name: String) : Character(name,45,30) {

    override fun attack(target: Character, ap: Int) {
        println("Magier $name greift ${target.name} mit einer Feuerattacke an!")
        super.attack(target,this.ap)
    }

    override fun printCharacterInfo() {
        println("--Magier: $name--")
        super.printCharacterInfo()
    }

}
