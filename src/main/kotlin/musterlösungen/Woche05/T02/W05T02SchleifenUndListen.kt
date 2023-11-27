fun main() {
    val satz: List<String> = listOf("Tag ", "schöner ", "sehr ", "ein ", "ist ", "Heute ")

    for (i in satz.size - 1 downTo 0) {
        print(satz[i])
    }

    println()

    for (i in satz.size - 2 downTo 0 step 2) {
        print(satz[i])
    }

    println()

    for (i in satz.size - 1 downTo 3) {
        print(satz[i])
    }

}