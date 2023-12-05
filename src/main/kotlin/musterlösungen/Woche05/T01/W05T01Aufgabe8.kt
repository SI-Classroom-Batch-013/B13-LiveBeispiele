fun main() {
    val nameList: List<String> = listOf("Paul","Dieter", "Jannes", "Lukas", "Hans")
    val sortedList: MutableList<String> = mutableListOf("","", "", "", "")
    /*
        Schreibe hier deinen Code:
    */

    repeat(nameList.size) {
        sortedList[it] = nameList[nameList.size - it - 1]
    }

    // Den Code hier drunter nicht ändern!!!

    val finishedlist: List<String> = listOf("Hans", "Lukas","Jannes", "Dieter", "Paul")
    if(sortedList == finishedlist) {
        println("Du hast die Aufgabe gelöst")
    } else {
        println("Leider noch nicht richtig, versuchs weiter!")
    }
}