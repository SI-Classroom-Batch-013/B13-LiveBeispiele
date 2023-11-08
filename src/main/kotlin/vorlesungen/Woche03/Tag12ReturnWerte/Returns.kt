package Returns

fun main(){

    var summe: Double = calculateSum()

    /*calculateSum()
    readln()*/

    println(getRandomName())
    println(getRandomName())
    println(getRandomName())
    println(getRandomName())
    println(getRandomName())

    val name: String = getRandomName()
    println("Name: $name")

    val name2 = getRandomName()
    println("$name hat $name2 geheiratet.")

    var namensListe: List<String> = listOf(
        getRandomName(),
        getRandomName(),
        getRandomName(),
        getRandomName(),
        getRandomName(),
        getRandomName(),
        getRandomName(),
        getRandomName(),
        getRandomName(),
        getRandomName(),
    )



    // Generiere eine zufällige Anzahl
    val anzahl = getRandomNumber()

    // Erstelle eine Liste aus zufälligen Namen
    val personen = mutableListOf<String>()

    repeat(anzahl){
        personen.add(getRandomName())
    }

    println(personen)

}

fun calculateSum(): Double{
    var sum: Double = 10.0 + 3
//    var sum2: Double = 16.0 - 3

    return sum
}


fun getRandomName(): String{
    return VORNAMEN.random() + " " + NACHNAMEN.random()
}

fun getRandomNumber(): Int{
    println("""
        Geben sie ein, in welchem Bereich die Zahl generiert werden soll:
            Format: min..max
    """.trimIndent())

    val inputs = readln().split("..")
    val min = inputs[0].toInt()
    val max = inputs[1].toInt()

    val zufallsZahl = (min..max).random()
    return zufallsZahl

    // !! Unreachable Code = nicht erreichbar
    println("Die Zufallszahl ist: $zufallsZahl")
}

fun getTwoRandomNumbers(): List<Int>{
    val numbers: List<Int> = listOf(
        getRandomNumber(),
        getRandomNumber()
    )
    return numbers
}
