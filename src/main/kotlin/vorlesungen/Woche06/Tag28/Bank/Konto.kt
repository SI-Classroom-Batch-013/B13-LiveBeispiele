package vorlesungen.Woche06.Tag28.Bank

class Konto(var name: String, var betrag: Double, var pin: Int) {

    init {
        println("Konto mit dem 1. Konstruktor mit allen Eigenschaften initialisiert!")
    }

    constructor(name:String) : this(name,500.0,1111) {
        println("Konto mit dem 2. Konstruktor und nur dem Namen $name initialisiert!")
    }

    constructor(name: String, betrag: Double): this(name,betrag,1111){
        println("Konto mit dem 3. Konstruktor und dem Namen $name und Betrag $betrag initialisiert!")

    }

    fun pinAendern(){
        println("Pin ändern Prozess beginnt...")
        do {
            println("Bitte die aktuelle (alte) Pin zum überprüfen eingeben...")
            val altePin: Int = readln().toInt()

            println("Bitte die neue WunschPin zum überprüfen eingeben...")
            val neuePin: Int = readln().toInt()

            if (altePin == this.pin){
                println("Alte Pin stimmt mit Pin überein!")
                this.pin = neuePin
                break
            } else{
                println("Alte Pin falsch eingegeben! Versuch's nochmal")

            }
        } while (altePin != this.pin)


    }
}

fun main() {
    val konto: Konto = Konto("Max Mustermann",500.0,1234)

    println("Aktuelle Pin: ${konto.pin}")

    konto.pinAendern()

    println("Neue Pin: ${konto.pin}")

}
