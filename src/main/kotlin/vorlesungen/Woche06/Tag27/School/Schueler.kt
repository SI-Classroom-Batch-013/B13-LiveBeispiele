package vorlesungen.Woche06.Tag27.School

class Schueler(val faecher: MutableList<Fach>,
                var vorname: String,
               var nachname: String,
               var geburtsdatum: String,
               var adresse: String) {


    fun addFach(fach: Fach) {
        faecher.add(fach)
    }
}