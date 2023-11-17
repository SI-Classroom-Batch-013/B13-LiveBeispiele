fun rentAMovie(): String {
    val movies = listOf("Star Wars", "Shrek", "Toy Story")

    println("Willkommen bei unserem Filmverleih!")
    println("Unsere Filme:")
    println(movies)

    println("Welchen Film möchtest du ausleihen? (Gib den Index ein): ")
    val index = readln().toInt()
    return movies[index]
}

fun throwDice(): Int {
    val diceNumbers = listOf(1, 2, 3, 4, 5, 6)
    return diceNumbers.random()
}

fun main() {
    println("Du hast den Film ${rentAMovie()} ausgeliehen. Viel Spaß damit!")
    println("Würfelzahl: ${throwDice()}")
}