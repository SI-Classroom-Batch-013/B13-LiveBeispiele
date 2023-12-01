package VORLESUNG.W06.d05.Fahrzeuge

class Fahrzeigverleih {

    private var alleFahrzeuge: MutableList<Fahrzeug> = mutableListOf()
    private var alleLandFahrzeuge: MutableList<LandFahrzeug> = mutableListOf()
    private var alleWasserFahrzeuge: MutableList<WasserFahrzeug> = mutableListOf()

    init {
        alleFahrzeuge.addAll(
            mutableListOf(
                Fahrzeug("BMW"),
                WasserFahrzeug("Schiff",90,800.0),
                WasserFahrzeug("Segelboot"),
                LandFahrzeug("Buggy"),
                LandFahrzeug("Bus"),
                Zweirad("motorrad"),
                Zweirad("Fahrrad"),
                Zweirad("Roller"),
                Yacht("Spirit of the Sun"),
                Yacht("Sea Lion",99,450.0),

                )
        )
        println("---Alle Fahrzeuge:---")
        alleFahrzeuge.forEach { println(it.bezeichner) }

        println("---Alle Wasserfahrzeuge:---")
        for (fahrzeug in alleFahrzeuge){
            if (fahrzeug is WasserFahrzeug){
                alleWasserFahrzeuge.add(fahrzeug)
            }
        }
        printFahrzeuge(alleWasserFahrzeuge)

        println("---Alle Landfahrzeuge:---")
        for (fahrzeug in alleFahrzeuge){
            if (fahrzeug is LandFahrzeug){
                alleLandFahrzeuge.add(fahrzeug)
            }
        }
        printFahrzeuge(alleLandFahrzeuge)
    }

    fun addFahrzeug(fahrzeug: Fahrzeug){
        alleFahrzeuge.add(fahrzeug)
        if (fahrzeug is WasserFahrzeug) alleWasserFahrzeuge.add(fahrzeug)
        else if (fahrzeug is LandFahrzeug) alleLandFahrzeuge.add(fahrzeug)
    }

    fun removeFahrzeug(fahrzeug: Fahrzeug){
        alleFahrzeuge.remove(fahrzeug)
        if (fahrzeug is WasserFahrzeug) alleWasserFahrzeuge.remove(fahrzeug)
        else if (fahrzeug is LandFahrzeug) alleLandFahrzeuge.remove(fahrzeug)
    }

    fun vermieten(fahrzeug: Fahrzeug){
        println("${fahrzeug.bezeichner} wird ausgeliehen.")
        fahrzeug.istVermietet = true
    }

    fun zurueckBringen(fahrzeug: Fahrzeug){
        println("${fahrzeug.bezeichner} wird zurückgegeben.")
        fahrzeug.istVermietet = false
    }

    fun getVerfuegbareFahrzeuge(fahrzeuge: MutableList<Fahrzeug>): MutableList<Fahrzeug>{
        return alleFahrzeuge.filter { !it.istVermietet }.toMutableList()
    }

    fun getVermieteteFahrzeuge(fahrzeuge: MutableList<Fahrzeug>): MutableList<Fahrzeug>{
        return alleFahrzeuge.filter { it.istVermietet }.toMutableList()
    }

    fun printFahrzeugDetails(fahrzeug: Fahrzeug){
        fahrzeug.printDetails()
    }

    fun getAlleFahrzeuge(): MutableList<Fahrzeug> {
        return alleFahrzeuge
    }

    fun printFahrzeuge(fahrzeuge: MutableList<out Fahrzeug>){
        fahrzeuge.forEach { println(it.bezeichner) }
    }

}


fun main(){
    var verleih = Fahrzeigverleih()
    var alleFahrzeuge = verleih.getAlleFahrzeuge()

    var bmw = verleih.getAlleFahrzeuge()[0]
    verleih.vermieten(bmw)
    bmw.istVermietet // true


    verleih.getVerfuegbareFahrzeuge(alleFahrzeuge)
    verleih.getVermieteteFahrzeuge(alleFahrzeuge)
    verleih.printFahrzeugDetails(bmw)
    verleih.removeFahrzeug(alleFahrzeuge.last())





}