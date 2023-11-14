package vorlesungen.Woche04.Tag17Bedingungen

fun main(){
    // == Operator
    println("\n\t== Operator")

    var bool1 = "hallo" == "Hallo"
    println(""""hallo" == "Hallo" = $bool1""")

    bool1 = "Hallo" == "Hallo"
    println(""""Hallo" == "Hallo" = $bool1""")

    bool1 = "Hallo " == "Hallo"
    println(""""Hallo " == "Hallo" = $bool1""")

    bool1 = "4.0" == "4"
    println(""""4.0" == "4" = $bool1""")

//    bool1 = 4 == 4.0    // nicht möglich Int und Double zu vergleichen
    println("4 == 4.0 = FEHLER!")

    bool1 = 4.toDouble() == 4.0
    println("4.toDouble() == 4.0 = $bool1")

    bool1 = Pair("Apfel", 0.25) == Pair("Apfel", 0.25)
    println("Pair(\"Apfel\", 0.25) == Pair(\"Apfel\", 0.25) = $bool1")

    // bool1 = Pair("Apfel", 0.25) == Pair(0.25, "Apfel")   // Nicht möglich! Datentypen
    println("Pair(\"Apfel\", 0.25) == Pair(0.25, \"Apfel\") = FEHLER!")


    bool1 = listOf("Apfel","Banane") == listOf("Apfel", "Banane")
    println("""listOf("Apfel","Banane") == listOf("Apfel", "Banane") = $bool1""")

    bool1 = listOf("Apfel","Banane") == listOf("Banane", "Apfel")
    println("""listOf("Apfel","Banane") == listOf("Banane", "Apfel") = $bool1""")

    bool1 = listOf("Apfel","Banane") == mutableListOf("Apfel", "Banane")
    println("""listOf("Apfel","Banane") == mutableListOf("Apfel", "Banane") = $bool1""")

    bool1 = listOf("Apfel", "Banane") == setOf("Apfel", "Banane")

    // Vergleichs Operatoren
    println("\n\t Vergleichs Operator")

    var bool2 = "Apfel" < "Banane"
    println(""""Apfel" < "Banane" = $bool2""")


    // Großbuchstaben kommen vor Kleinbuchstaben in Alphabetischer reinfolge
    bool2 = "apfel" < "Banane"
    println(""""apfel" < "Banane" = $bool2""")

    bool2 = "Hallo" < "hallo"
    println(""""Hallo" < "hallo" = $bool2""")

    bool2 = 4 < 4.0
    println("""4 < 4.0 = $bool2""")

}