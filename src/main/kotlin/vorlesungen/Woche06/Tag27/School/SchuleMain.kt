package vorlesungen.Woche06.Tag27.School

fun main() {
    var schule1: Schule = Schule("Syntax", "Münzstraße", mutableListOf())

    // Klasse 1A
    var klasse1a: Klasse = Klasse()
    klasse1a.name = "1A"
    klasse1a.klassenlehrer = "Marianne Leal"
    schule1.klassen.add(klasse1a)


    var schueler1: Schueler = Schueler(mutableListOf(),"Janis","Meyer","01.01.2001","Ligusterweg 4")




    klasse1a.addSchueler(schueler1)
    //klasse1a.schueler.addAll(mutableListOf(Schueler(), Schueler(), Schueler()))
    println(klasse1a.schueler)
    schueler1.nachname = "Meyer"
    schueler1.vorname = "Janis"
    schueler1.geburtsdatum = "01.01.2001"

    var lastSchueler: Schueler = klasse1a.schueler.last
    lastSchueler.nachname = "Schmidt"
    lastSchueler.vorname = "Anna"

    // Schueler Liste ausdrucken
    klasse1a.schueler.forEach { println(it.vorname) }

    println("Schule ${schule1.name}:")
    //schule1.klassen.forEach { println(it.name) }

    for (klasse in schule1.klassen){
        println(klasse.name)
        for (schueler in klasse.schueler){
            println("${schueler.vorname} ${schueler.nachname}")
            for (fach in schueler.faecher){
                println(fach.name)
                for (pruefung in fach.pruefungen){
                    println(pruefung)
                }
            }
        }

    }















}