class Krieger: Held("Garrot", 300) {
    var schaden: Int = 100

    override fun waehleAktion() {
        super.waehleAktion()
        var input: Int = 0
        do {
            println("1 -> Donnerschlag(100 Schaden)")
            println("2 -> Selbstheilung(+50 Leben)")
            println("3 -> Donnerschlag vorbereiten(Schaden x 1.5)")
            try {
                input = readln().toInt()
            } catch(e: Exception) {
                println("Gebe 1,2 oder 3 ein...")
            }
        } while (input !in 1..3)

        when(input) {
            1 -> donnerSchlag(GEGNER)
            2 -> selbstHeilung()
            3 -> schadenErhöhen()
        }
    }

    fun donnerSchlag(gegner: Gegner) {
        gegner.lebenspunkte -= schaden
        println("$name wirkt Donnerschlag")
    }

    fun selbstHeilung() {
        lebenspunkte += 50
        println("$name wirkt Selbstheilung")
    }

    fun schadenErhöhen() {
        schaden = schaden * 150 / 100
        println("$name wirkt Schadenserhöhung")
    }


}