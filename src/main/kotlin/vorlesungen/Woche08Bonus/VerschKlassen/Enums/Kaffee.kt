package Enums

enum class Size {
    SMALL, MEDIUM, LARGE
}

class Kaffee (val kunde: String, val size: Size){
}

fun main(){
    var bestellung1 = Kaffee("Martin", Size.LARGE)
    var bestellung2 = Kaffee("Petra", Size.MEDIUM)
    var bestellung3 = Kaffee("Leon", Size.SMALL)
}