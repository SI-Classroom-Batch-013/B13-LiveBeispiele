package VORLESUNG.Woche05.Tag21

fun main() {
    // Liste, über die wir mit Schleifen durchiterieren können
    val colors = mutableListOf("red","green","blue","black")

    whileSchleifeHochzaehlen()
    whileSchleifeRunterZaehlen()

    // Mango in der fruits Liste finden:
    val fruits = mutableListOf("Apples", "Oranges", "Cherries", "Watermelon", "Mango", "Strawberries")
    findMango(fruits)
    println("--------")
    findMango(colors)
    simpleWhile(colors)


}

fun simpleWhile(list: MutableList<String>){
    var i: Int = 0
    while(i < list.size){
        println("${i+1}. Element in der Liste: ${list[i]}")
        i++
    }


}

fun whileSchleifeRunterZaehlen() {
    var i: Int = 10
    println("Wir zählen runter:")
    while (i > 0) {
        println(i)
        i--
    }
}

fun whileSchleifeHochzaehlen() {
    var i: Int = 0
    // nur solange i kleiner als 10 ist: springe in den Schleifenkörper
    while (i < 10) {
        i++ // kommt normalerweise ans ende der schleife, weil davon zB auch listenindex etc abhängig sind
        println("${i}. Schleifendurchlauf!")
    }
    println("Schleife wurde beendet, Code läuft weiter von oben nach unten durch...")
}

fun findMango(fruits: MutableList<String>) {
    var i: Int = 0
    var mangoFound: Boolean = false
    // solange mangoFound false ist und solange wir nicht über den Index von fruits hinaus gehen: in die Schleife springen
    while (!mangoFound && i < fruits.size) {
        // k+1: weil wir bei 0 anfangen zu zählen, da der Index bei fruits auch bei 0 anfängt
        println("${i + 1}. Gefundenes Element: ${fruits[i]}")

        // logik, um die mango zu finden:
        if ("Mango" in fruits[i]) { // gleicher Effekt wie: if ("Mango" == fruits[k])
            println("Mango gefunden! An der Stelle ${i + 1}")
            mangoFound = true
        } else {
            println("Mango noch nicht gefunden, weiter suchen...")
        }
        i++
    }

    if (mangoFound){
        println("Die Liste entha4lt eine Mango...")
    } else {
        println("Es wurde keine Mango in der Liste gefunden...")
    }
}