package VORLESUNG.Woche05.Tag24

import kotlin.math.min


fun main() {
    // WICHTIGSTE HIGHER ORDER FUNCTIONS / LAMBDAS

    // count mit selbst geschriebener Schleife:
    val text: String = "Das sind zwei as"

    val searchedChar: Char = 'a'
    var counter: Int = 0
    for (letter in text){
        if (letter == searchedChar){
            counter++
        }
    }
    println("Anzahl an a's mit for Schleife: $counter")

    // count:
    val aCounter: Int = text.count{letter: Char ->
        letter == searchedChar
    }
    println("Anzahl an a's mit aCounter und letter Parameter: $aCounter")

    println("---")

    // ideale Lösung mit it, erspart uns Tipparbeit und Kopfzerbrechen über Parameternamen
    val aCount: Int = text.count { it == searchedChar }
    println("Anzahl an a's mit aCount, nur mit automatisch mitgeliefertem it: $counter")


    println("---")
    // filter
    val reviews = listOf(1,2,3,4,5,4,3,4,5,4,3,2,1,2,3)

    val goodReviews: List<Int> = reviews.filter { review ->
        review >= 4
    }

    val goodReviewsIt: List<Int> = reviews.filter { it >= 4 }
    println(goodReviewsIt)

    // zum Vergleich: filter mit Schleife
    val manuelleGoodReviewsList: MutableList<Int> = mutableListOf()
    for (r in reviews){
        if (r >= 4){
            manuelleGoodReviewsList.add(r)
        }
    }
    println(manuelleGoodReviewsList)



    println("---")
    // sortedBy: sortiert entweder aufsteigend (mit it.eigenschaft: nach einer Eigenschaft (wie length)
    val fruits = listOf("Melone", "Apfel", "Birne","Kirsche", "Orange", "Kiwi")

        // einfach nur it: wird aufsteigend sortiert (abc, numerisch)
        val sortedFruits: List<String> = fruits.sortedBy { it } // { fruit -> fruit }
        println(sortedFruits)
        val sortedWithNormalFunc: List<String> = fruits.sorted()
        println(sortedFruits)


        // it.length: wird nach der Länge sortiert (kürzeste Frucht zuerst)
        val sortedByLength: List<String> = fruits.sortedBy { it.length }
        println(sortedByLength)

        // sortedBy mit zahlen
        val allReviewsSorted = reviews.sortedBy { it }
        println(allReviewsSorted)


    println("---")

    // sortedByDescending: descend = absteigen, sortiert absteigend
    val sortedDescFruits = fruits.sortedByDescending { it }
    println(sortedDescFruits)


    // forEach: geht jedes Element durch und wir können darauf zugreifen und zB drucken. nicht bearbeiten! das geht nur mit map
    fruits.forEach {
        println(it)
        // it += " ist eine Frucht" nicht erlaubt, dafür brauchen wir map
    }

    // nur für jede 2. Frucht: wir muessen die Liste mit jeder 2. Frucht vorher vorbereiten, dann auf diese gefilterte Liste forEach anwenden.
    val everySndFruit: MutableList<String> = mutableListOf()
    for (index in fruits.indices){
        if (index % 2 == 0){
            everySndFruit.add(fruits[index])
        }
    }

    everySndFruit.forEach{println(it)}


    println("---")


    // map: führt Operation in den { } für jedes Element aus. damit können wir Elemente bearbeiten

    val modifiedFruts: List<String> = fruits.map { it + " ist eine Frucht" }
    modifiedFruts.forEach{ println(it) }

    // map mit Zahlen
    val doubledReviews: List<Int> = reviews.map { it * 2 }
    println(doubledReviews)


    println("---")
    // minBy: sucht kleinstes Element raus
    val smallesFruit: String = fruits.minBy { it.length } // Kiwi
    println(smallesFruit)


    println("---")
    // maxBy: sucht größte Frucht nach Länge raus
    val largestFruit: String = fruits.maxBy { it.length } // Kirsche
    println(largestFruit)

    println("---")
    // any: true oder false: gibt es irgendein ein Element, das die Bedingung erfüllt? (Zahl gerade)
    val isCoconutInFruits: Boolean = fruits.any{ it == "Kokosnuss" } // false
    println("Gibt es eine Kokosnuss? -> $isCoconutInFruits")
    val isKiwiInFruits: Boolean = fruits.any{ it == "Kiwi" }
    println("Gibt es eine Kiwi? -> $isKiwiInFruits")


    println("---")
    // all: true oder false: erfüllen ALLE Elemente in der Liste die Bedingung? (durch 2 teilbar)
    val areAllReviewsEven: Boolean = reviews.all { it % 2 == 0 } // false
    println(areAllReviewsEven)

    val evenNumbers: List<Int> = listOf(2,4,6)
    val numbersEven: Boolean = evenNumbers.all { it % 2 == 0 } // true

    println("---")



    // mehrere Lambdas in Kombination benutzen: gerade zahlen rausfiltern, erhöhen
    val evenNumbersTimesTwo: List<Int> = reviews.filter { it % 2 == 0 }.map { it*2 }
    println(evenNumbersTimesTwo)


    // nur woerter die länger als 5 sind
    // alphabetisch sortieren
    // alle in ALL CAPS schreiben
    val specialFruits: List<String> = fruits.filter { it.length > 5 }.sortedBy { it }.map { it.uppercase() }
    println(specialFruits)

}