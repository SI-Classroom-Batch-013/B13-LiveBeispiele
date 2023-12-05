package VORLESUNG.W06.d01

import vorlesungen.Woche06.Tag26.Dog
import vorlesungen.Woche06.Tag26.House
import vorlesungen.Woche06.Tag26.Person

// Main, in der wir alle Klassen instanziieren (= konkrete Objekte erstellen) und benutzen
fun main(){

    // konkrete Instanz/Objekt
    var person1: Person = Person()
    println("Unsere Person ist: $person1")
    // Punktnotation: Zugriff auf Attribute der Instanz
    println(person1.age)
    println(person1.name)
    person1.greeting()

    // Eddie will einen neuen Namen und ist ein Jahr älter geworden. Wie modellieren wir das bzw wie setzen wir das um?
    person1.birthday() // Funktion, die Geburtstag um 1 Jahr erhöht
    person1.name = "Ed"
    person1.greeting()

    // auf Eddies Hund zugreifen:
    println("Eddies 1. Hund heißt: ${person1.dogs[0].name}")
    println("Das Lieblingsspielzeug von Eddies Hund ist: ${person1.dogs[0].favoriteToy.bezeichner}")

    person1.printDogs()

    var person2: Person = Person()
    person2.name = "Jennifer"
    println("---Funktion Greeting---")
    person1.greetPerson(person2)
    person1.greetString("Marlon")


    var dog1: Dog = Dog()
    println("Unser hier in der main erstellte Hund heißt ${dog1.name} ")
    println("Unser Hund hat die Farbe ${dog1.color} ")

    var number: Int = 10
    number = 11

    // Haus mit bewohnern modellieren
    var haus: House = House()

//    haus.bewohner.add(person1)
//    haus.bewohner.add(person2)

    haus.bewohner.addAll(listOf(person1,person2))
    println(haus.bewohner)

    // ginge auch, wenn bewohner nicht val wäre:
    // haus.bewohner = mutableListOf(person1,person2)

    println("Bewohner unseres Hauses:")
    haus.printBewohner()
    println(haus.adresse)

    var personWithoutDogs: Person = Person()
    personWithoutDogs.dogs.clear()







}