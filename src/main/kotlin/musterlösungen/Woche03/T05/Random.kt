// Diese Funktion erstellt eine zufällige Bewertung
fun randomRating(): Int {
    return (1..5).random()
}

// Diese Funktion erstellt eine zufällige Anzahl (1-10) an Bewertungen
fun generateRatings(): MutableList<Int> {
    val ratings = mutableListOf<Int>()
    repeat((1..10).random()) {
        ratings.add(randomRating())
    }
    return ratings
}

// Task 2
fun generatePrice(): Double {
    val euro = (2..4).random()
    val cent = (0..99).random()
    return euro + cent.toDouble() / 100
}