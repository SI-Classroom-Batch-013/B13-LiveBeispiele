fun main() {
    val names: MutableList<String> = mutableListOf("Jim", "Pam", "Oscar", "Pam", "Dwight")
    // Unter diesem Kommentar deinen Code reinschreiben:

    val lastPam: Int = names.lastIndexOf("Pam")
    val newPam: List<String> = names.slice(0.. lastPam)
}