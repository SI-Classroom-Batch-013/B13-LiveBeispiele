package vorlesungen.Woche06.Tag27.School

class Schule(var name: String,
             var adresse: String,
             val klassen: MutableList<Klasse>) {


    fun addKlasse(klasse: Klasse) {
        klassen.add(klasse)
    }
}