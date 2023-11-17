/*
    Schreibe hier deine Antwort rein
    Orca wird mit 4 Buchstaben geschrieben
 */

fun main() {
    val tiere: List<String> = listOf("Katze","Giraffe","Orca","Bär")
            when(tiere[2]) {
                "Katze" -> println("Löwe wird mit ${"Löwe".length} Buchstaben geschrieben")
                "Giraffe" -> println("Giraffe wird mit ${"Giraffe".length} Buchstaben geschrieben")
                "Orca" -> println("Orca wird mit ${"Orca".length} Buchstaben geschrieben")
                "Bär" -> println("Bär wird mit ${"Bär".length} Buchstaben geschrieben")

            }
}