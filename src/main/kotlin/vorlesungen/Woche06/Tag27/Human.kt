package vorlesungen.Woche06.Tag27

class Human(var name: String, var alter: Int, var eyeColor: String = "braun") {

    // init = initialisieren, bedeutet: der init Block wird IMMER beim initialisieren aufgerufen.
    init {
        println("Human namens $name mit dem primaeren Konstruktor initialisiert...")
        // println(favColor) // geht nicht, weil wir favColor erst in der Zeile drunter initialisiert
    }


    // favColor kann niemals im Konstruktor uebergeben werden, muss von außen manuell in der main ueberschrieben werden
    var favColor: String = ""


    fun printInfo(){
        println("Name: " + name)
        println("Alter: " + alter)
        println("Augenfarbe: " + eyeColor)
        println("Lieblingsfarbe: " + favColor)
    }

    fun greeting(){
        println("Hi, mein Name ist $name und ich bin $alter Jahre alt!")
    }

    fun birthday() {
        alter++
    }

}

fun main() {
    var human1: Human = Human("Hans", 22,"blau")
    human1.favColor = "rot"
    var human2: Human = Human("Hanna", 21, "gruen")
    human2.favColor = "azurblau"
    var human3: Human = Human("Simon", 12)
    human3.favColor = "pink"

    human1.printInfo()
    human1.birthday()

    human2.printInfo()
    human3.printInfo()
}