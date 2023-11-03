fun main() {

    val personPetMap: MutableMap<String, String> = mutableMapOf(
        "Berta" to "Hunde",
        "Frank" to "Katzen",
        "Luis" to "Mäuse",
        "Sylvia" to "Eulen",
        "Hans" to "Fau",
    )
    // TODO: Schreibe hier deinen Code zu Aufgabe 5a)

    personPetMap["Tim"] = "Schildkröte"
    personPetMap["Fabian"] = "Papagei"
    personPetMap["Jannik"] = "Schlange"

    println(personPetMap)


    // TODO: Schreibe hier deine Antwort zu Aufgabe 5b)

    /*
   Was passiert, wenn du der MutableMap das Paar "Bernd" -> "Igel" hinzufügst?
    Was passiert, wenn du der MutableMap das Paar "Luis" -> "Mäuse" hinzufügst?

   Antwort: "Bernd" -> "Igel" wird hinzugefügt. Wert von Luis wird überschrieben
    */

    // TODO: Schreibe hier deinen Code zu Aufgabe 5c)

    val number = 2.0
    val square: MutableMap<Int, Double> = mutableMapOf(
        0 to 1.0,
        1 to number,
        2 to number * number,
        3 to number * number * number,
        4 to number * number * number * number,
        5 to number * number * number * number * number,
        6 to number * number * number * number * number * number,
    )
    println(square)
}