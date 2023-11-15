package vorlesungen.Woche04.Tag18TryCatch

// Ein Auto besteht aus Modell, Preis, Reichweite (in km/l)
val auto1: Triple<String, Double, Double> = Triple("VW Golf", 2000.0, 6.0 )
val auto2 = Triple("Ford Focus", 1800.0, 5.5)
val auto3 = Triple("Toyota Corolla", 2200.0, 7.2)
val auto4 = Triple("VW Passat", 2500.0, 5.8)
val auto5 = Triple("Honda Civic", 1900.0, 6.5)


fun main(){
    // Marke
    val wunschMarke = "VW"
    val autosMitWunschMarke = filterByMarke(wunschMarke)
    println("Die Autos mit der gewünschten Marke sind: ")
    println(autosMitWunschMarke)

    // Preis
    val maxPreis = 2000.0
    val autosMitWunschPreis = filterByPreis(maxPreis)
    println("Die Autos mit dem gewünschten Preis sind: ")
    println(autosMitWunschPreis)

    // Reichweite
    val minReichweite = 6.0
    val autosMitWunschReichweite = filterByReichweite(minReichweite)
    println("Die Autos mit dem gewünschten Reichweite sind: ")
    println(autosMitWunschReichweite)
}

fun filterByMarke(marke: String): List<Triple<String, Double, Double>>{
    val autos = mutableListOf<Triple<String, Double, Double>>()

    if (marke in auto1.first){  // warum nicht: marke == auto1.first ??
        autos.add(auto1)
    }

    if (marke in auto2.first)
        autos.add(auto2)

    if (marke in auto3.first)
        autos.add(auto3)

    if (marke in auto4.first)
        autos.add(auto4)

    if (marke in auto5.first)
        autos.add(auto5)

    return autos
}

fun filterByPreis(preis: Double): List<Triple<String, Double, Double>>{
    val autos = mutableListOf<Triple<String, Double, Double>>()

    if (preis >= auto1.second){
        autos.add(auto1)
    }

    if (preis >= auto2.second)
        autos.add(auto2)

    if (preis >= auto3.second)
        autos.add(auto3)

    if (preis >= auto4.second)
        autos.add(auto4)

    if (preis >= auto5.second)
        autos.add(auto5)

    return autos
}

fun filterByReichweite(reichweite: Double): List<Triple<String, Double, Double>>{
    val autos = mutableListOf<Triple<String, Double, Double>>()

    if (reichweite <= auto1.third){
        autos.add(auto1)
    }

    if (reichweite <= auto2.third)
        autos.add(auto2)

    if (reichweite <= auto3.third)
        autos.add(auto3)

    if (reichweite <= auto4.third)
        autos.add(auto4)

    if (reichweite <= auto5.third)
        autos.add(auto5)

    return autos
}


// TODO: Challenge
// Tipp: set Operationen: https://kotlinlang.org/docs/set-operations.html
fun alleFilter(marke: String, preis: Double, reichweite: Double){

}