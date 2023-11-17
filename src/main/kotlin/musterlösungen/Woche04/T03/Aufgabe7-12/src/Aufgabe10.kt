/*
    Schreibe hier deine Antwort rein
    Die Serie The Wire befindet sich nicht in der Liste
    Die Serie Breaking Bad befindet sich in der Liste
    Die Serie The Office befindet sich nicht in der Liste
 */

fun main() {
    elementInListe("The Wire")
    elementInListe("Breaking Bad")
    elementInListe("The Office")
}

fun elementInListe(element: String) {
    val serien: List<String> = listOf(
        "Game of Thrones",
        "How i Met your Mother",
        "Breaking Bad",
        "Stranger Things"
    )
    val serieInListe = serien.contains(element)
            if(serieInListe) {
                println("Die Serie $element befindet sich in der Liste")
            } else {
                println("Die Serie $element befindet sich nicht in der Liste")
            }
}
