/*
    Schreibe hier deine Antwort rein
    Der Wecker klingelt
    Ich mache mich für den Tag bereit
    Heute nehme ich das Fahrrad
 */

fun main() {
    val uhrzeit: Int = 7
    val arbeitstag: Boolean = true
    val regen: Boolean = false
    if (uhrzeit >= 6) {
        println("Der Wecker klingelt")
                if (!arbeitstag) {
                    println("Ich bleibe einfach liegen")
                } else {
                    println("Ich mache mich für den Tag bereit")
                            if (regen) {
                                println("Ich fahre mit dem Auto")
                            } else {
                                println("Heute nehme ich das Fahrrad")
                            }
                }
    }
}
