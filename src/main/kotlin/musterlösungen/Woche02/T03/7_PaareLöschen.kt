fun main() {

    var favouritePetsMap = mutableMapOf<String, String>(
        "Berta" to "Hunde",
        "Frank" to "Katzen",
        "Luis" to "Mäuse",
        "Sylvia" to "Eulen",
        "Hans" to "Fau",
    )

    //TODO: Schreibe hier deinen Code:

    favouritePetsMap.remove("Frank")
    favouritePetsMap.remove("Hans")

    println(favouritePetsMap)

    var deletionLuis = favouritePetsMap.remove("Luis", "Mäuse")

    println(deletionLuis)

    var deletionFrank = favouritePetsMap.remove("Frank", "Mäuse")

    println(deletionFrank)

    //TODO: Begründe hier die Ausgabe aus Aufgabenteil b):

    //deletionLuis nimmt den Wert true an, da dieser aus der MutableMap gelöscht werden kann.
    //Das Paar "Frank" -> "Mäuse" existiert hingegen garnicht und kann somit auch nicht entfernt werden.
    //Als Folge nimmt deletionFrank den Wert false an.

}