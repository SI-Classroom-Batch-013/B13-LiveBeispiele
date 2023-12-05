package vorlesungen.Woche06.Tag28.Bibliothek

class Bibliothek {
    val bücher = mutableListOf<Buch>()
    val autoren = mutableListOf<Autor>()
    val genres = mutableListOf<Genre>()

    fun buchHinzufügen(buch: Buch) {
        bücher.add(buch)
    }

    fun autorHinzufügen(autor: Autor) {
        autoren.add(autor)
    }

    fun genreHinzufügen(genre: Genre) {
        genres.add(genre)
    }
}
