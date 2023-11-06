package VORLESUNG.Woche03.Tag11VoidFunktionen

// calculateAge
fun calculateAge(){
    println("Please enter birth year...")
    // user soll geburtsjahr eingeben
    val birthYear: Int = readln().toInt()
    // daraus soll alter errechnet und ausgegeben werden
    val age: Int = 2023-birthYear
    println("You were born in $birthYear, your age in 2023 is: $age")
}
