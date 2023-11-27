fun main() {
    var lieblingsFilme: List<String> =
        listOf("Batman", "Breaking Bad", "Attack on Titan", "Planet der Affen")

    // Verbessere den Fehler, sodass alle Filme der Liste lieblingsFilme ausgegeben werden.

    /* vorher
    repeat(lieblingsFilme){
        println(lieblingsFilme[it])
    }
     */

    // nachher
    repeat(lieblingsFilme.size) {
        println(lieblingsFilme[it])
    }
}