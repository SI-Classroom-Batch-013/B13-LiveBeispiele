// Task 8
fun main() {
    println("Willkommen!")
    println("Unser Sortiment (alphabetisch sortiert): ")
    println(moviesSortedByTitle())
    println(
        "Wir besitzen ${getTotalNumberOfMovies()} Filme und unserer Preisspanne " +
                "liegt bei ${getCheapestPrice()} € bis ${getMostExpensiveMovie()} €"
    )
    println("Durchschnittlich kosten unsere Filme ${getAveragePriceOfMovies()}€")
    println("Wählen Sie einen Film für mehr Informationen (geben Sie den Index ein): ")
    val inputIndex = readln().toInt()
    val movie = moviesSortedByTitle()[inputIndex]
    println(
        "Der Film $movie kostet ${getPrice(movie)}€, " +
                "gehört dem Genre ${getGenre(movie)} an " +
                "und hat eine durchschnittliche Bewertung von ${getAverageRating(movie)}"
    )
    val success = sellMovie()
    println("Film erfolgreich gekauft: $success")
}