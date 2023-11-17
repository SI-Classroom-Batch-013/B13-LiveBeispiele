fun getAreaCircle(): Double {
    println("Gib den Radius des Kreises ein: ")
    val r = readln().toDouble()
    return Math.PI * r * r
}

fun main() {
    val areaCircle = getAreaCircle()
    println("Der Flächeninhalt des Kreises beträgt: $areaCircle")
}