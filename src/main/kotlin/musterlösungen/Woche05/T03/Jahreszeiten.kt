fun main() {
    val monate: List<String> = listOf(
        "Januar", "Februar", "März", "April", "Mai", "Juni",
        "Juli", "August", "September", "Oktober", "November", "Dezember"
    )

    //Aufgabe b
    println("Aufgabe b")
    for (monat in monate) {
        println("Der $monat ist im ${jahreszeitVon(monat)}")
    }
    println()

    //Aufgabe c
    println("Sommermonate Aufgabe c")
    for (i in 5 .. 7) {
        println("Der " + monate[i] + " ist im " + jahreszeitVon(monate[i]))
    }
    println()

    //Aufgabe d
    println("Alle außer Juni und September")
    for (i in 0 until monate.size) {
        when (monate[i]) {
            "Juni" -> continue
            "September" -> continue
        }
        println("Der " + monate[i] + " ist im " + jahreszeitVon(monate[i]))
    }
    println()

    //Aufgabe e
    println("Jeder zweite Monat ab März")
    for (i in 2 until monate.size step 2) {
        println("Der " + monate[i] + " ist im " + jahreszeitVon(monate[i]))
    }
}


//Aufgabe a
fun jahreszeitVon(monat: String): String {
    var rueckgabeMonat = ""
    rueckgabeMonat = when(monat){
        "Dezember" -> "Winter"
        "Januar" -> "Winter"
        "Februar" -> "Winter"
        "März" -> "Frühling"
        "April" -> "Frühling"
        "Mai" -> "Frühling"
        "Juni" -> "Sommer"
        "Juli" -> "Sommer"
        "August" -> "Sommer"
        "September" -> "Herbst"
        "Oktober" -> "Herbst"
        "November" -> "Herbst"
        else -> "Monat gibt es nicht"
    }

    return rueckgabeMonat

/*    when(monat){
        "Dezember" -> rueckgabeMonat = "Winter"
        "Januar" -> rueckgabeMonat = "Winter"
        "Februar" -> rueckgabeMonat = "Winter"
        "März" -> rueckgabeMonat = "Frühling"
        "April" -> rueckgabeMonat = "Frühling"
        "Mai" -> rueckgabeMonat = "Frühling"
        "Juni" -> rueckgabeMonat = "Sommer"
        "Juli" -> rueckgabeMonat = "Sommer"
        "August" -> rueckgabeMonat = "Sommer"
        "September" -> rueckgabeMonat = "Herbst"
        "Oktober" -> rueckgabeMonat = "Herbst"
        "November" -> rueckgabeMonat = "Herbst"
        else -> rueckgabeMonat = "Monat gibt es nicht"
    }

    return rueckgabeMonat */

/*    if (monat == "Dezember" || monat == "Januar" || monat == "Februar") return "Winter"
    if (monat == "März" || monat == "April" || monat == "Mai") return "Frühling"
    if (monat == "Juni" || monat == "Juli" || monat == "August") return "Sommer"
    if (monat == "September" || monat == "Oktober" || monat == "November") return "Herbst"
    return ""
    */

}