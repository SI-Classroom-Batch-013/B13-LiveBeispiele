package vorlesungen.Woche02

fun main() {
    // Liste anlegen
    val list: List<String> = listOf("A","B","C")

    // Map anlegen
    val map: Map<Int, String> = mapOf(
        1 to "A",
        2 to "B",
        3 to "C"
    )

    // Zugriff auf Listenelement:
    println("Erstes Element in der Liste: ${list[1]}") // hier kommt B raus, B steht am 1. Index (listen zaehlen den index ab 0)

    // Zugriff auf Map-Value: // hier kommt A raus, weil A am Key 1 steht
    println("Erstes Element in der Map: ${map[1]}")
    val keysAsSet: Set<Int> = map.keys
    println(keysAsSet)
    println(map.values)
    println(map.entries)


}