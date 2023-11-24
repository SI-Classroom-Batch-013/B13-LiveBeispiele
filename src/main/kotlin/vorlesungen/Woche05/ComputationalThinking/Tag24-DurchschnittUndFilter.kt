package vorlesungen.Woche05.ComputationalThinking

data class Person(var name: String, var age: Int)
fun main() {
    val namesAndAges = listOf(
        Person("Alice", 30),
        Person("Bob", 25),
        Person("Charlie", 40),
        Person("David", 22)
    )
    // Durchschnittsalter aller Leute über zB 30 rausfinden

}
