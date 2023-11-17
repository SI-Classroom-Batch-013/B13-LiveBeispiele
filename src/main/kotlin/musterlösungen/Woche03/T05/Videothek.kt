// Die FilmListe hat alle unsere Filme
val filmListe = mutableListOf<String>(
    "The Dark Knight",
    "Indiana Jones",
    "Die Hard",
    "The Shawshank Redemption",
    "Schindler's List",
    "The Godfather",
    "Star Wars",
    "The Matrix",
    "The Lord of the Rings",
    "Harry Potter Teil 1"
)

// Die Preisliste speichert den Preis zu jedem Filmtitel
val filmToPrice = mutableMapOf<String, Double>(
    "The Dark Knight" to generatePrice(),
    "Indiana Jones" to generatePrice(),
    "Die Hard" to generatePrice(),
    "The Shawshank Redemption" to generatePrice(),
    "Schindler's List" to generatePrice(),
    "The Godfather" to generatePrice(),
    "Star Wars" to generatePrice(),
    "The Matrix" to generatePrice(),
    "The Lord of the Rings" to generatePrice(),
    "Harry Potter Teil 1" to generatePrice()
)

// Diese Map speichert das Genre zu jedem Filmtitel
val filmToGenre = mutableMapOf(
    "The Dark Knight" to "Action/Adventure",
    "Indiana Jones" to "Action/Adventure",
    "Die Hard" to "Action/Adventure",
    "The Shawshank Redemption" to "Drama",
    "Schindler's List" to "Drama",
    "The Godfather" to "Drama",
    "Star Wars" to "Science Fiction/Fantasy",
    "The Matrix" to "Science Fiction/Fantasy",
    "The Lord of the Rings" to "Science Fiction/Fantasy",
    "Harry Potter Teil 1" to "Fantasy"
)

// Diese Map speichert Bewertungen zu jedem Film
val filmRatings = mutableMapOf<String, MutableList<Int>>(
    "The Dark Knight" to generateRatings(),
    "Indiana Jones" to generateRatings(),
    "Die Hard" to generateRatings(),
    "The Shawshank Redemption" to generateRatings(),
    "Schindler's List" to generateRatings(),
    "The Godfather" to generateRatings(),
    "Star Wars" to generateRatings(),
    "The Matrix" to generateRatings(),
    "The Lord of the Rings" to generateRatings(),
    "Harry Potter Teil 1" to generateRatings()
)