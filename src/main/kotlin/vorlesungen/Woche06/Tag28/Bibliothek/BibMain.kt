package vorlesungen.Woche06.Tag28.Bibliothek

fun main() {
    val bibliothek = Bibliothek()

    val autor1 = Autor("Jane Austen", 1775)
    val autor2 = Autor("George Orwell", 1903)

    val genre1 = Genre("Roman")
    val genre2 = Genre("Science Fiction")

    val buch1 = Buch("Stolz und Vorurteil", autor1, genre1)
    val buch2 = Buch("1984", autor2, genre2)

    bibliothek.autorHinzufügen(autor1)
    bibliothek.autorHinzufügen(autor2)

    bibliothek.genreHinzufügen(genre1)
    bibliothek.genreHinzufügen(genre2)

    bibliothek.buchHinzufügen(buch1)
    bibliothek.buchHinzufügen(buch2)

    autor1.buchSchreiben("Sinn und Sinnlichkeit",genre1,bibliothek)

    // Beispiel: Bücher von einem bestimmten Autor ausgeben
    println("Bücher von ${autor1.name}:")
    for (buch in autor1.bücher) {
        println("- ${buch.titel}")
    }

    // Beispiel: Bücher eines bestimmten Genres ausgeben
    println("Bücher im Genre '${genre2.name}':")
    for (buch in genre2.bücher) {
        println("- ${buch.titel}")
    }

    // Beispiel: alle Bücher der Bibliothek ausgeben
    for (buch in bibliothek.bücher){
        buch.printInfo()
    }
}
