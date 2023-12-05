package VORLESUNG.W06.d05.RPG

open class Character(val name: String, var hp: Int, var ap: Int) {


    open fun attack(target: Character, ap: Int){
        target.hp -= ap
        if (target.hp > 0) {
            println("${target.name} verliert $ap HP!")
            println("${target.name} hat noch ${target.hp} HP übrig.")
        } else {
            target.hp = 0
            println("${target.name} hat keine HP mehr übrig und scheidet aus!")
        }
    }

    open fun flee(): Boolean {
        println("$name versucht zu fliehen. Kommt $name davon?")
        Thread.sleep(2000)
        var fleeSuccessful: Boolean = listOf(true,false).random()
        if (fleeSuccessful) {
            println("Puh, gerade nochmal so davon gekommen...")
            return true
        }
        else {
            println("$name schafft es nicht, zu fliehen und muss im Kampf bleiben.")
        }
        return false
    }

    open fun usePotion(){
        println("$name hat $hp und benutzt einen Heiltrank...")
        this.hp+=20
        println("$name's HP nach dem Heiltrank: $hp")
    }

    open fun printCharacterInfo() {
        println("HP: $hp ; AP: $ap")
    }
}