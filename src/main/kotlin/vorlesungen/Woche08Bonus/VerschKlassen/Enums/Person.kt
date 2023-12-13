package Enums

enum class Farbe {
    BLAU, GRUEN, BRAUN
}


class Person(var name: String, var augenFarbe: Farbe) {}

fun main(){
    var personA = Person("Gordon", Farbe.BLAU )
    var personB = Person("Zufall", Farbe.values().random())
}