package VORLESUNG.W06.d05.Konzert

class Konzert {
    private val instrumentList: MutableList<MusikInstrument> = mutableListOf()

    fun addInstrument(instrument: MusikInstrument) {
        instrumentList.add(instrument)
    }

    fun removeInstrument(instrument: MusikInstrument) {
        instrumentList.remove(instrument)
    }

    fun startConcert() {
        println("Das Konzert beginnt!")
        for (instrument in instrumentList) {
            instrument.play()
        }
        println("Das Konzert ist in vollem Gange!")
    }

    fun endConcert() {
        println("Das Konzert geht dem Ende zu...")
        println("${instrumentList.random().name} spielt den letzten Ton...")
        println("Das Konzert ist vorbei.")
    }

    fun playSolo(instrument: MusikInstrument) {
        println("Solo für ${instrument.name} beginnt:")
        instrument.play()
    }

    fun playEnsemble() {
        println("Ensemble-Spiel beginnt:")
        //instrumentList.shuffle()
        for (instrument in instrumentList) {
            instrument.play()
        }
        println("Ensemble-Spiel endet.")
    }

    fun getInstrumentList(): List<MusikInstrument> {
        return instrumentList.toList()
    }

    fun playStreichInstrumente() {
        val streichInstrumenteList: MutableList<StreichInstrument> = mutableListOf()

        for (instrument in instrumentList) {
            if (instrument is StreichInstrument) {
                streichInstrumenteList.add(instrument)
            }
        }

        if (streichInstrumenteList.isNotEmpty()) {
            println("Streichinstrumente spielen zusammen:")
            for (streichInstrument in streichInstrumenteList) {
                streichInstrument.play()
            }
        } else {
            println("Keine Streichinstrumente im Konzert vorhanden.")
        }
    }
}

