fun main() {
    var list: List<Int> = listOf(5, 4, 6, 7, 2, 9, 3, 8)
    // Unter diesem Kommentar deinen Code reinschreiben:

    val isEmpty = list.isEmpty()
    val min = list.min()
    val max = list.max()
    val first = list.first()
    val last = list.last()
    val third = list[2]
    val size = list.size

    val info = "Ist die Liste leer? $isEmpty. Die kleinste Zahl der Liste ist $min und die größte Zahl $max. " +
            "Die erste Zahl ist $first und die letzte Zahl ist $last. Die Zahl an der dritten Stelle ist $third " +
            "und die Liste hat insgesamt $size Zahlen."

    println(info)
}