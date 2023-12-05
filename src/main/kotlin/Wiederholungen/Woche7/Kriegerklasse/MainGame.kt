val GEGNER = Gegner()
val KRIEGER = Krieger()
fun main() {
    println(GEGNER.lebenspunkte)


    while (GEGNER.lebenspunkte >= 1) {
        KRIEGER.waehleAktion()
        println(GEGNER.lebenspunkte)
    }

}