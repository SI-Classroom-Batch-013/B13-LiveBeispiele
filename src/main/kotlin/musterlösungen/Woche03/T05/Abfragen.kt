// Task 3a
fun getPrice(movie: String): Double {
    return filmToPrice[movie] ?: 0.0
}

// Task 3b
fun getGenre(movie: String): String {
    return filmToGenre[movie] ?: ""
}

// Task 3c
fun getAverageRating(movie: String): Double {
    val ratings = filmRatings[movie] ?: listOf()
    return ratings.average()
}

// Task 4a
fun getCheapestPrice(): Double {
    val cheapestList = filmToPrice.values.toList()
    val cheapest = cheapestList.min()
    return cheapest
}

// Task 4b
fun getMostExpensiveMovie(): Double {
    val cheapestList = filmToPrice.values.toList()
    val cheapest = cheapestList.max()
    return cheapest
}

// Task 5a
fun getTotalNumberOfMovies(): Int {
    return filmToPrice.size
}

// Task 5b
fun getAveragePriceOfMovies(): Double {
    val totalPrices = filmToPrice.values.sum()
    return totalPrices / getTotalNumberOfMovies()
}

// Task 6
fun moviesSortedByTitle(): List<String> {
    return filmListe.sorted()
}

// Task 7
fun sellMovie() {
    println("Unsere Filme:")
    println(filmListe)
    println("Welchen Film wollen Sie kaufen (geben Sie einen Index ein)?")
    val index = readln().toInt()
    val movieSold = filmListe[index]
    println(movieSold)
    filmListe.remove(movieSold)
    filmRatings.remove(movieSold)
    filmToGenre.remove(movieSold)
    filmToPrice.remove(movieSold)
}