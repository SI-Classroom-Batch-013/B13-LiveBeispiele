var nachnamen = mapOf(
    "Müller" to 256003,
    "Schmidt" to 190584,
    "Schneider" to 115749,
    "Fischer" to 97.658,
    "Weber" to 86.061,
    "Meyer" to 83.586,
    "Wagner" to 79.732,
    "Becker" to 74.009,
)

var vornamen = listOf(
    "Emilia", "Noah",
    "Lina", "Adam",
    "Emma", "Liam",
    "Mila", "Finn",
    "Lia", "Leo",
    "Maria", "Emil",
    "Mia", "Milan",
    "Sophia", "Luca",
    "Ida", "Mohamed",
    "Lea", "Paul"
)

fun nameGenerator() {
    val firstName = vornamen.random()
    val lastName = nachnamen.keys.random()
    println("$firstName $lastName")
}

fun fancyNameGenerator() {
    val firstName = vornamen.random()
    val secondName = vornamen.random()
    val lastName = nachnamen.keys.random()
    println("$firstName-$secondName von $lastName")
}

fun main() {
    repeat(5) {
        nameGenerator()
        fancyNameGenerator()
    }
}