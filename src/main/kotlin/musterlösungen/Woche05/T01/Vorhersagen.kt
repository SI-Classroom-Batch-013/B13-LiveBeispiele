fun main() {
    var ergebnis: Int = 0
    var i: Int = 0
    do {
        ergebnis += i
        i++
    } while (i <= 5)
    println(i)
}

/*
in der Variable ergebnis wird mit jedem Schleifendurchlauf der neue Wert von i dazu addiert. (0+1+2+3+4+5)
im Anschluss wird i um 1 inkrementiert. Die Schleife bricht ab, wenn i=6 ist. Da do-while, letzter Durchlauf mit i=5.
geprinted wird 6, da i im letzten Durchlauf noch um 1 erhöht wird.
 */