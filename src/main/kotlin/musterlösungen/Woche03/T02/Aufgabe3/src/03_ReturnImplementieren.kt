fun tenTimes(): Double {
    println("Gib eine Zahl ein")
    val numberInput = readln().toDouble()
    println("Die Zahl wird verzehnfacht...")
    return numberInput * 10
}

fun dreifacherWert(): Int {
    val twelve: Int = 12
    return twelve * 3
}

fun main() {
    println("Die Zahl mal Zehn: ${tenTimes()}")
    println("Drei mal Zwölf ist: ${dreifacherWert()}")
}