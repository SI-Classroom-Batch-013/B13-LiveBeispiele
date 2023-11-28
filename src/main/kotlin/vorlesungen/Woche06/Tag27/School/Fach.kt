package vorlesungen.Woche06.Tag27.School

class Fach {
    var name: String = ""
    var fachlehrer: String = ""
    var raumnummer: String = ""
    val pruefungen: MutableList<String> = mutableListOf()

    fun addPruefung(pruefung: String) {
        pruefungen.add(pruefung)
    }
}