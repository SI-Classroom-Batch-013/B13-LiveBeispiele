fun addOneAndTwo(): Int {
    val one = 1
    val two = 2
    return one + two
}

fun euroToDollar(): Double {
    println("Gib den Betrag in € ein: ")
    val euro = readln().toDouble()
    return euro * 1.08
}

fun greetUser(): String {
    return "Hallo!"
}

fun getHelloWorldList(): List<String> {
    return listOf("Hallo", "Welt", "!")
}

fun getClaimsMap(): Map<String, Boolean> {
    return mapOf(
        "Lernen wir die Sprache Französisch?" to false,
        "Lernen wir die Sprache Kotlin?" to true
    )
}

fun noReturn() {
    println("Ich habe keinen Rückgabewert")
}

fun main() {
    println("Eins plus Zwei: ${addOneAndTwo()}")
    println("Das entspricht ${euroToDollar()}$")
    println(greetUser())
    println(getHelloWorldList())
    println(getClaimsMap())
    noReturn()
}