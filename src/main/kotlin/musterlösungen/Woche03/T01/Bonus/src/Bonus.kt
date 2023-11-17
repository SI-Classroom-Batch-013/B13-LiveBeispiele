val list1 = listOf("Mond", "Sonne", "Sterne", "Wolken", "Nacht")
val list2 = listOf("sanft", "glänzend", "zauberhaft", "leuchtend", "still")
val list3 = listOf("träumt", "tanzt", "verweilt", "glitzert", "fliegt")
val list4 = listOf("im Dunkeln", "im Wind", "im Zauber", "im Schweigen", "im Glanz")

fun generatePoesie() {
    val line1 = "${list1.random()}, ${list1.random()} und ${list1.random()}\n"
    val line2 = "sind ${list2.random()}, ${list2.random()} und ${list2.random()}\n"
    val line3 = "Der Mensch ${list3.random()} und ${list3.random()}\n"
    val line4 = list4.random()
    println(line1 + line2 + line3 + line4)
}

fun main() {
    generatePoesie()
}