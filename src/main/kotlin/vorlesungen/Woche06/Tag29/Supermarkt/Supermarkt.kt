package vorlesungen.Woche06.Tag29.Supermarkt

import Fleisch
import Gemuese

class Supermarkt(val lebensmittelListe: MutableList<Lebensmittel> = mutableListOf()) {

    init {
        println("----Init Block Logic----")
        addLebensmittelList(listOf(
            Fleisch("Rind",8.99,"Kuh"),
            Lebensmittel("Joghurt",1.49),
            Fleisch("Hühnerbrust","Huhn"),
            Gemuese("Brokkoli"),
            Gemuese("Karotten",1.99,30),
            Obst("Kirsche"),
            Obst("Mandarine"),
            Gemuese("Paprika"),
            Obst("Kiwi"),
        )
        )

        printLebensmittel()
        println("----Ende Init Block Logic----")
    }

    fun printLebensmittel(){
       //println(lebensmittelListe) // reicht nicht aus, ganze Objekte werden gedruckt

        for (food in lebensmittelListe){
            println(food)
            println("---")
        }
    }

    fun printFleisch(){
        println("--Print Fleisch--")
        for (food in lebensmittelListe){
            // filtern, dass nur fleisch gedruckt wird
            if (food is Fleisch){
                println(food)
            }
        }
    }

    private fun addLebensmittelList(foods: List<Lebensmittel>) {
        // foods liste durchlaufen,
        // jedes element darin zu lebensmittelListe hinzufuegen

        // Variante mit Lambda
        foods.forEach { lebensmittelListe.add(it) }

        // Variante mit for Schleife
        // for (food in foods) lebensmittelListe.add(food)



    }
}

fun main() {
    var supermarkt = Supermarkt()

    println()
    supermarkt.printFleisch()

}