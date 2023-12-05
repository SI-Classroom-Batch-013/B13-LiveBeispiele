val filterNamesList = listOf(
    "abdulrahman", "alexander", "angelo",
    "artem", "caglayan", "christopher",
    "emre", "frederic", "manolito",
    "mike", "oliver", "sebastian",
    "steven", "timur", "vinzenz",
    "stephan", "katharina", "marcel"
)

fun main() {
    println("loopFilter():")
    loopFilter()
    println("lambdaFilter():")
    lambdaFilter()
}

fun loopFilter() {
    var loopList = mutableListOf<String>()
    for (name in filterNamesList) {
        if ("o" in name || "i" in name) {
            loopList.add(name)
        }
    }
    println(loopList)
}

fun lambdaFilter() {
    println(filterNamesList.filter { "o" in it || "i" in it })
}