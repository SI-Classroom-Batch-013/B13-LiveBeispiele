package Wiederholungen.Woche04.T03

import kotlin.math.round

val sortiment: Map<String, Double> = mutableMapOf(
    "PlayStation 5" to 699.0,
    "MacBook Pro 2020" to 999.0,
    "PC gebraucht" to 450.5,
    "Samsung Fernseher" to 350.0
)

var einkaufswagen: MutableList<Double> = mutableListOf(
)

var isNewCustomer: Boolean = false

var hasVoucher: Boolean = true

fun main() {


    einkaufswagen.add(sortiment["PlayStation 5"]!!)
    einkaufswagen.add(sortiment["PC gebraucht"]!!)

    discount()
}

fun discount(): Double {
    var totalPrice = einkaufswagen.sum()
    println("Hallo Kunde, dein Einkaufswert ist $totalPrice Ihr Rabatt berechnet sich wie folgt:")

    var newPrice = totalPrice

    when {
        hasVoucher -> newPrice *= 0.8
        isNewCustomer -> newPrice *= 0.5
        (totalPrice in 800.0..1000.0) -> newPrice *= 0.95
        totalPrice in 1000.0..2000.0 -> newPrice *= 0.9
        totalPrice > 2000.0 -> newPrice *= 0.8
    }

    println("Dein neuer Preis ist $newPrice, du hast ${totalPrice - newPrice} gespart" )

//    if (hasVoucher) {
//        newPrice = totalPrice * 0.5
//
//    } else if (isNewCustomer) {
//        newPrice = totalPrice * 0.8
//
//    } else if (totalPrice in 800.0..1000.0) {
//        //Ab 800 eur -> 5% Rabatt
//        newPrice = totalPrice * 0.95
//        println("Du bekommst 5% Rabatt, dein neuer Preis ist $newPrice du hast ${totalPrice - newPrice} gespart")
//    } else if (totalPrice in 1000.0..2000.0) {
//        //Ab 1000 eur -> 10% Rabatt
//        newPrice = totalPrice * 0.9
//        println("Du bekommst 10% Rabatt, dein neur Preis ist $newPrice du hast ${totalPrice - newPrice} gespart")
//    } else if (totalPrice < 2000.0) {
//        //Ab 2000 eur -> 20% Rabatt
//        newPrice = totalPrice * 0.8
//        println("Du bekommst 20% Rabatt, dein neur Preis ist $newPrice du hast ${totalPrice - newPrice} gespart")
//    }

    return newPrice
}


