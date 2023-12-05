package vorlesungen.Woche06.Tag28.Bibliothek


class Buch(val titel: String, val autor: Autor, val genre: Genre) {
    fun printInfo() {
        println("Buch $titel, Autor ${autor.name}, Genre ${genre.name}")
    }

    var ausleihbar: Boolean = true
}

