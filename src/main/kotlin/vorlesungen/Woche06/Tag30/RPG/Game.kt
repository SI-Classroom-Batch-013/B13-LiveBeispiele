package VORLESUNG.W06.d05.RPG

class Game {

    val characters: MutableList<Character> = mutableListOf()
    val villains: MutableList<Character> = mutableListOf()

    var roundCounter: Int = 1

    init {
        characters.addAll(
            listOf(
                Warrior("Alistair"),
                Mage("Merlin"),
                Rogue("Tristan")
            )
        )

        villains.addAll(
            listOf(
                Villain("Dunkle Brut"),
                Villain("Ork"),
                Villain("Dunkler Magier")
            )
        )
    }

    fun play(){
        while (roundCounter <= 3) {
            println("---Runde $roundCounter---")
            printCharacters()
            println("Es wird eine Münze geworfen, wer angreifen darf...")
            Thread.sleep(1000)
            var coin = listOf(true, false).random()
            if (coin) {
                println("Kopf! Die Helden greifen an.")
                println("Zufälligen Helden wählen, der zufälligen Bösen angreift...")
                var hero = characters.filter { it.hp>0}.random()
                var villain = villains.filter { it.hp>0}.random()
                hero.attack(villain, hero.ap)

            } else {
                println("Zahl! Die Bösen greifen an.")
                var hero = characters.filter { it.hp>0}.random()
                println("Zufälliger Böser greift zufälligen Held an...")
                var villain = villains.filter { it.hp>0}.random()
                villain.attack(hero, villain.ap)

            }
            roundCounter++
        }
        whoWon()

    }

    fun printCharacters(){
        println("---Unsere Helden---")
        characters.forEach {
            it.printCharacterInfo()
        }
        println("---Unsere Bösewichte---")
        villains.forEach {
            it.printCharacterInfo()
        }
    }

    fun whoWon(){
        var heroPoints = 0
        var villainPoints = 0
        characters.forEach { heroPoints+=it.hp }
        villains.forEach { villainPoints+=it.hp }
        println("Helden: $heroPoints : $villainPoints Bösewichte")
        if (heroPoints > villainPoints) {
            println("Die Helden gewinnen!")
        }
        else println("Die Bösen gewinnen!")

    }

}


fun main(){
    var game: Game = Game()

    game.play()


}