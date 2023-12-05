val GEGNER = Gegner()
fun main() {
    println(GEGNER.lebenspunkte)
    var held1 = Krieger()

    while (GEGNER.lebenspunkte >= 1) {
        held1.waehleAktion()
        println(GEGNER.lebenspunkte)
    }

}