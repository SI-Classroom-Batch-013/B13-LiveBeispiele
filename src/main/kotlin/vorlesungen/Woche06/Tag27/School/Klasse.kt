package vorlesungen.Woche06.Tag27.School
class Klasse {
    var name: String = ""
    var klassenlehrer: String = ""
    val schueler: MutableList<Schueler> = mutableListOf()

    fun addSchueler(schueler: Schueler) {
        this.schueler.add(schueler)
    }
}