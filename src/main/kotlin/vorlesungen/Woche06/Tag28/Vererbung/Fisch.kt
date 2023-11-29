package vorlesungen.Woche06.Tag28.Vererbung

open class Fisch(name: String) : Animal(name,false,true) {

    init {
        println("Fisch namens $name initialisiert...")
    }

    override fun essen(){
        println("Der Fisch $name frisst... gluck gluck gluck")
    }

    init {
        println("Hai $name initialisiert...")
    }


}

class Hai(name:String): Fisch(name){
    override fun essen() {
        println("Der Hai frisst einen Fisch.")
    }
}

