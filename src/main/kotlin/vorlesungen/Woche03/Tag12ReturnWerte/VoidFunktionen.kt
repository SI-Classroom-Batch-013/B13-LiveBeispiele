package Returns

// Funktionen ohne Ergebnis nennt man "Void-Funktionen"
fun namensGenerator(){

    val name = VORNAMEN.random() + " " + NACHNAMEN.random()
//    val name = "${VORNAMEN.random()} ${NACHNAMEN.random()}"
    println("Zufallsname: '$name'")
}

fun zufallsZahl(){
    println("""
        Geben sie ein, in welchem Bereich die Zahl generiert werden soll:
            Format: min..max
    """.trimIndent())

    val inputs: List<String> = readln().split("..")
    val min = inputs[0].toInt()
    val max = inputs[1].toInt()

    val zufallsZahl = (min..max).random()

    println("Die Zufallszahl ist: $zufallsZahl")
}

