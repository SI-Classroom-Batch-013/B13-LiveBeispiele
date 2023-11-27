fun main() {
    var filme1: List<String> = listOf(
        "Batman",
        "Frankenstein",
        "Jurassic Park",
        "Grand Budapest Hotel",
        "Harry Potter"
    )
    var filme2: List<String> = listOf(
        "Batman",
        "Frankenstein",
        "Jurassic Park",
        "Matrix",
        "Harry Potter"
    )
    var filme3: List<String> = listOf(
        "Batman",
        "Frankenstein",
        "Jurassic Park",
        "Django",
        "Harry Potter"
    )

    doMatrix(filme1)
    doMatrix(filme2)
    doMatrix(filme3)
}

fun doMatrix(list: List<String>) {
    var i = 0
    do {
        if (list[i] == "Matrix") {
            println("Ja, der Film Matrix ist in der Liste enthalten,")
            println("Der Film befindet sich an der Stelle ${list.indexOf(list[i])}")
        }
        i++
    } while (i < list.size)
}