package Aufgabe05

fun main() {

    val articles: MutableList<String?> = mutableListOf("Ananas","Bier", null, "Kekse", null)

    val noNullArticles: List<String> = articles.filterNotNull()
    println(noNullArticles)



}