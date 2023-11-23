package VORLESUNG.Woche05.Tag24

fun main() {
    val fischSorten: List<String> = listOf("giftiger Kugelfisch", "Hering", "Barsch", "Lachs", "Dose")

    // Fisch Aufgabe mit do while

    fischFangDoWhile(fischSorten)

    println("---")

    // Fisch aufgabe mit for
    fischFangFor(fischSorten)

}

private fun fischFangFor(fischSorten: List<String>) {
    val gefangeneFische: MutableList<String> = mutableListOf()
    for (i in 1..20) {
        var nächsterFisch: String = fischSorten.random()
        if (nächsterFisch == "giftiger Kugelfisch") {
            println("Giftiger Kugelfisch! Den lassen wir wieder frei...")
            continue
        }
        // Dosen Logik
        if (nächsterFisch == "Dose") {
            println("Dose gefangen! Der See ist verschmutzt, wir wollen hier nicht weiter angeln...")
            break
        }

        gefangeneFische.add(nächsterFisch)
        println("$nächsterFisch gefangen!")
    }
    println(gefangeneFische)
}

fun fischFangDoWhile(fischSorten: List<String>) {
    val gefangeneFische: MutableList<String> = mutableListOf()
    do {
        var nächsterFisch: String = fischSorten.random()
        if (nächsterFisch == "giftiger Kugelfisch") {
            println("Giftiger Kugelfisch! Den lassen wir wieder frei...")
            continue
        }
        if (nächsterFisch == "Dose"){
            break
        }
        gefangeneFische.add(nächsterFisch)
        println("$nächsterFisch gefangen!")
    } while (nächsterFisch != "Dose")

    println("Gefangene Fische, bis die Dose kam: $gefangeneFische")
}

