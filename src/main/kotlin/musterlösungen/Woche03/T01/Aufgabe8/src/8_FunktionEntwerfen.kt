// a)
fun areaRightTriangleA() {
    val a = 4
    val b = 3
    val area = a * b / 2
    println("Die Fläche beträgt: $area")
}

// b)
fun areaRightTriangleB() {
    println("Bitte gib die Seitenlänge A ein: ")
    val a = readln().toDouble()
    println("Bitte gib die Seitenlänge B ein: ")
    val b = readln().toDouble()
    val area = a * b / 2
    println("Die Fläche beträgt: $area")
}

fun main() {
    areaRightTriangleA()
    areaRightTriangleB()
}