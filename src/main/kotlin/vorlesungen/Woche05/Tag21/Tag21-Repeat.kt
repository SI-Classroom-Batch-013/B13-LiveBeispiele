package VORLESUNG.Woche05.Tag21

fun main() {
    // repeat mit Int
    // it = von Kotlin bereitgestellte implizierte Indexvariable,
    // enthält automatisch erst den Index 0, zählt dann automatisch hoch
    repeat(10){
        println("Hallo Welt!")
        println("Dies ist die ${it+1}. Wiederholung!")
    }


    // repeat über Liste mit it.
    // it = von Kotlin bereitgestellte implizierte Indexvariable,
    // enthält automatisch erst den Index 0, zählt dann automatisch hoch
    var winterKleidung: MutableList<String> = mutableListOf("Wollsocken", "Kapuzenpulli", "Mütze", "Schal")
    repeat(winterKleidung.size){
        println("${it+1}. Element in der Liste mit Index $it: ${winterKleidung[it]}")
    }


    // repeat mit Variable und Counter
    var counter: Int = 1
    val weekDays: Int = 7
    repeat(weekDays){
        println("Inhalt von Weekdays: $weekDays")
        println("Heute ist der ${it+1}. Wochentag!")
        println("Heute ist der $counter. Wochentag")
        // counter inkrementieren
        counter++
    }


    // 20-mal zufällig 1-5 mal angreifen
    repeat(20) { it ->
        println("\nTest Nr. ${it+1}")
        repeat((1..5).random()) {
            println("Attacke Nr. ${it+1}")
        }
    }


}