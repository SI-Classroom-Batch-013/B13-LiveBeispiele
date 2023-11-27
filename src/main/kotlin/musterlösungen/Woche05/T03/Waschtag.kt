fun main() {
    val shirts = mutableListOf(
        "rot", "blau", "rot", "blau", "blau", "rot", "rot", "blau", "blau",
        "blau", "rot", "blau", "rot", "blau", "blau", "rot", "rot", "blau"
    )

    val redShirts: MutableList<String> = mutableListOf()
    val blueShirts: MutableList<String> = mutableListOf()

    for (shirt in shirts) {
        when (shirt) {
            "rot" -> redShirts.add(shirt)
            "blau" -> blueShirts.add(shirt)
        }
    }
}