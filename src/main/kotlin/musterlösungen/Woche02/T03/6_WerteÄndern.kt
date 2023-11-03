fun main() {

    val personPetMap: MutableMap<String, String> = mutableMapOf(
        "Berta" to "Hunde",
        "Frank" to "Katzen",
        "Luis" to "Mäuse",
        "Sylvia" to "Eulen",
        "Hans" to "Fau",
    )

    //TODO: Schreibe hier deinen Code:
    personPetMap["Berta"] = "Esel"
    personPetMap["Sylvia"] = "Pferde"
    personPetMap["Frank"] = "Spechte"
    personPetMap["Luis"] = "Spechte"


    //TODO: Schreibe hier deine Antwort zu Aufgabenteil b):

    // Nein. Man müsste den Schlüssel ändern, da dieser nicht doppelt vergeben werden darf.
}