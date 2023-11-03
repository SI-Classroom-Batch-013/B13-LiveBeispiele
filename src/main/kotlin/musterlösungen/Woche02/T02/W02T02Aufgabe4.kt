fun main() {
    val icecreams: MutableList<String> = mutableListOf("Vanille", "Schokolade", "Erdbeere")
    println(icecreams)
    icecreams.addAll(listOf("Zitrone", "Johannisbeere", "Karamell"))
    println(icecreams)
    icecreams.removeLast()
    println(icecreams)
    icecreams.sort()
    println(icecreams)
}