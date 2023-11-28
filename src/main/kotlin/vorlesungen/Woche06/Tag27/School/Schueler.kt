package vorlesungen.Woche06.Tag27.School

class Schueler {
    var vorname: String = ""
    var nachname: String = ""
    var geburtsdatum: String = ""
    var adresse: String = ""
    val faecher = mutableListOf<Fach>()

    fun addFach(fach: Fach) {
        faecher.add(fach)
    }
}