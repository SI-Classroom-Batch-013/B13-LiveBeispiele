package vorlesungen.Woche06.Tag26

class House {
    val bewohner: MutableList<Person> = mutableListOf()
    val adresse: String = "Schlossallee 12"

    fun printBewohner(){
        bewohner.forEach { println(it.name) }
    }
}