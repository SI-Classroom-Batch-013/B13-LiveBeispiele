package vorlesungen.Woche01

fun main() {

    var zehn: String = "10"
    zehn.toInt() // aufruf alleine reicht nicht, muss abgespeichert werden

    println("Ergebnis von Variable zehn + 10: ${zehn + 10}") // zehn bleibt ein String! zehn selber wird nicht verändert, es wird ein Ergebnis ausgespuckt, dass wir in einer Variable abspeichern muessen.

    var x: Int = zehn.toInt()
    println("Ergebnis von Variable x (Int) = 10: $x + 10")
    println("Ergebnis von Variable x (Int) = 10: ${x + 10}")

    var name: String = "Nilou" // Alternative: readln()
    var age: Int = 25
    var beispielString: String = "Hi" + " mein Name ist $name und ich bin " + age + " Jahre alt" // Alternative: "Hi mein Name ist $name und ich bin $age Jahre alt"
    println(beispielString)



}

fun blablabla(){
    var name: String = "Marianne"
    // zehn = "11" geht nicht, zehn ist in blablabla() unbekannt
}
