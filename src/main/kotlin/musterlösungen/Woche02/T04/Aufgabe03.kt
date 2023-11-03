package Aufgabe03

fun main() {

    val colors: Set<String> = setOf("Rot", "Grün", "Blau","Rot", "Grün", "Blau")

    // Doppelungen werden nicht gezählt
    println(colors)

    val mutableColors: MutableSet<String> = colors.toMutableSet()

    mutableColors.add("Gelb")
    println(mutableColors)
}