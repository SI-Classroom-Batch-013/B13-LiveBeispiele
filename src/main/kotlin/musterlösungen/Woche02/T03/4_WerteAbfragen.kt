fun main() {
    //TODO: Schreibe hier deinen Code
    val favAnimals: Map<String, String> = mapOf(
        "Berta" to "Hunde",
        "Frank" to "Katzen",
        "Luis" to "Mäuse",
        "Sylvia" to "Eulen",
        "Hans" to "Fau"
    )

    val houseColors: Map<Int, String> = mapOf(
        12 to "Rot",
        45 to "Blau",
        23 to "Gelb",
        28 to "Grün",
        36 to "Lila",
        92 to "Rosa"
    )

    val colorFor28 = houseColors[28]
    val colorFor45 = houseColors[45]
    val colorFor81 = houseColors[81]

    println("Lieblingstier von Frank ist: ${favAnimals["Frank"]}")
    println("Lieblingstier von Sylvia ist: ${favAnimals["Sylvia"]}")
    println("Lieblingstier von Hans ist: ${favAnimals["Hans"]}")

    println("Welche Hausfarbe hat das Haus mit der Nummer 28? $colorFor28")
    println("Welche Hausfarbe hat das Haus mit der Nummer 45? $colorFor45")
    println("Welche Hausfarbe hat das Haus mit der Nummer 81? $colorFor81")


}

