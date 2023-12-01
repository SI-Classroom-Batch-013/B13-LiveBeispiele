package VORLESUNG.W06.d05.Konzert

fun main(){

    var konzert: Konzert = Konzert()
    konzert.addInstrument(BlasInstrument("Trompete"))
    konzert.addInstrument(StreichInstrument("Violine","sanfte Noten"))
    konzert.addInstrument(TastenInstrument("Klavier","die Tonleiter rauf und runter"))
    konzert.addInstrument(SchlagInstrument("Trommel","bam! bam! bam!"))
    konzert.addInstrument(StreichInstrument("Cello","tiefe sanfte Noten"))
    konzert.addInstrument(BlasInstrument("Saxophon","tuut tuut"))
    konzert.addInstrument(HolzBlasInstrument("Flöte"))
    konzert.addInstrument(BlechBlasInstrument("Posaune"))

    var instrumente = konzert.getInstrumentList()
    println("--Alle Instrumente in unserer Big Band:--")
    instrumente.forEach { println(it.name) }
    konzert.startConcert()
    konzert.playEnsemble()
    konzert.playStreichInstrumente()
    konzert.playSolo(konzert.getInstrumentList().last())
    konzert.endConcert()
}