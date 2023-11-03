fun main() {
    val movies: MutableList<String> = mutableListOf(
        "Star Wars",
        "Hockeyschläger",
        "Herr der Ringe",
        "Deadpool",
        "Tastatur",
        "The Wolf of Wall Street",
        "Fluch der Karibik"
    )
    // Unter diesem Kommentar deinen Code reinschreiben:

    movies.removeAt(1)
    movies.add(1, "Iron Man")
    movies.removeAt(4)
    movies.add(4, "James Bond")

    println(movies)
}