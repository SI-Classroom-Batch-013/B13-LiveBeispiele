package VORLESUNG.Woche05.Tag22

import kotlin.math.PI

// globale konstante: ALL CAPS
val PIZZAS: List<String> = listOf("Salami", "Mozarella", "Hawaii", "Tonno")

fun main(){
    // Pizza Aufgabe: 100 verschiedene Pizza sorten zufällig ausdrucken. mit
    // repeat
    println("Pizza repeat:")
    pizzaRepeat()
    // while und
    println("Pizza while:")
    pizzaWhile()

    // do while lösen
    pizzaDoWhile()
    println("Pizza do while:")

}

fun pizzaDoWhile() {
    val pizzas: MutableList<String> = mutableListOf()
    // mit do while schleife befuellen
    var i = 1
    do {
        pizzas.add(PIZZAS.random())
        i++
    } while (i<=100)

    println(pizzas)

}

fun pizzaWhile() {
    val pizzas: MutableList<String> = mutableListOf()
    // mit while Schleife befuellen
    var i: Int = 0
    while (i < 100){
        pizzas.add(PIZZAS.random())
        i++
    }
    println(pizzas)
}

fun pizzaRepeat() {
    // liste an 100 zufälligen Pizzen erstellen...
    // 1. leere Liste für die 100 Pizzen anlegen
    val pizzas: MutableList<String> = mutableListOf()
    repeat(100){
        pizzas.add(PIZZAS.random())
    }
    println(pizzas)

}


