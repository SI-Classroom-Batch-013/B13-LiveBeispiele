package Aufgabe01

fun main() {
   val fruits: List<String> = listOf("Apfel","Birne","Kirsche")

    val mutableFruits = fruits.toMutableList()

    val kirscheDeleted: Boolean = mutableFruits.remove("Kirsche")

    println("""
        Mutable Liste nach dem Löschen: $mutableFruits
        Kirsche löschen erfolgreich: $kirscheDeleted
    """.trimIndent())


}