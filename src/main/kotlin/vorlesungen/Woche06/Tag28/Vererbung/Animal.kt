package vorlesungen.Woche06.Tag28.Vererbung

open class Animal(var name: String, var canFly: Boolean, var canSwim: Boolean) {

    init {
        println("Animal namens $name initialisiert!")
        this.toString()
    }

    open fun essen(){
        println("Das Tier $name frisst.... lecker")
    }

    override fun toString(): String {
        return """
            Name: $name
            Kann Fliegen? $canFly
            Kann Schwimmen? $canSwim
        """.trimIndent()

    }


}

fun main() {
    var tiger: Animal = Animal("Tiger",false,false)
    println(tiger) // einfach nur den tiger drucken, druckt jetzt automatsich toString() aus.
    tiger.essen()

    println("-----")
    var fisch1: Fisch = Fisch("Nemo")
    // fisch hat seine eigene essens funktion
    fisch1.essen()
    println(fisch1)

    var hai: Hai = Hai("Sharky")
    hai.essen()

}