val sentenceList = listOf("Das ", "hier ", "ist ", "ein ", "kleiner ", "Satz.")

fun main() {
    println("loopForEach():")
    loopForEach()
    println()
    println("lambdaForEach():")
    lambdaForEach()
}

fun loopForEach() {
    for (word in sentenceList) {
        print(word)
    }
}

fun lambdaForEach() {
    sentenceList.forEach { print(it) }
}