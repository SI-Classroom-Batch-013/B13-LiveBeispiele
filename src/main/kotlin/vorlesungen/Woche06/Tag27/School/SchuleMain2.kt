//package vorlesungen.Woche06.Tag27.School
//
//fun main() {
//    val schule = Schule()
//    schule.name = "Mustergrundschule"
//    schule.adresse = "Musterstraße 123"
//
//    val klasse1A = Klasse()
//    klasse1A.name = "1A"
//    klasse1A.klassenlehrer = "Frau Müller"
//
//    val klasse2B = Klasse()
//    klasse2B.name = "2B"
//    klasse2B.klassenlehrer = "Herr Schmidt"
//
//    val schueler1 = Schueler()
//    schueler1.vorname = "Max"
//    schueler1.nachname = "Mustermann"
//    schueler1.geburtsdatum = "01.01.2010"
//    schueler1.adresse = "Musterweg 1"
//
//    val schueler2 = Schueler()
//    schueler2.vorname = "Anna"
//    schueler2.nachname = "Musterfrau"
//    schueler2.geburtsdatum = "02.02.2011"
//    schueler2.adresse = "Musterweg 2"
//
//    val fachMathematik = Fach()
//    fachMathematik.name = "Mathematik"
//    fachMathematik.fachlehrer = "Herr Meier"
//    fachMathematik.raumnummer = "Raum 101"
//
//    val fachEnglisch = Fach()
//    fachEnglisch.name = "Englisch"
//    fachEnglisch.fachlehrer = "Frau Smith"
//    fachEnglisch.raumnummer = "Raum 102"
//
//    schule.addKlasse(klasse1A)
//    schule.addKlasse(klasse2B)
//
//    klasse1A.addSchueler(schueler1)
//    klasse2B.addSchueler(schueler2)
//
//    schueler1.addFach(fachMathematik)
//    schueler2.addFach(fachEnglisch)
//
//    fachMathematik.addPruefung("Mathematik-Prüfung 1")
//    fachEnglisch.addPruefung("Englisch-Prüfung 1")
//
//    println("Schule: ${schule.name}, Adresse: ${schule.adresse}")
//    println("Klassen in der Schule:")
//    for (klasse in schule.klassen) {
//        println("- Klasse: ${klasse.name}, Klassenlehrer: ${klasse.klassenlehrer}")
//        for (schueler in klasse.schueler) {
//            println("  - Schüler: ${schueler.vorname} ${schueler.nachname}, Geburtsdatum: ${schueler.geburtsdatum}")
//            for (fach in schueler.faecher) {
//                println("    - Fach: ${fach.name}, Fachlehrer: ${fach.fachlehrer}, Raum: ${fach.raumnummer}")
//                for (pruefung in fach.pruefungen) {
//                    println("      - Prüfung: $pruefung")
//                }
//            }
//        }
//    }
//}