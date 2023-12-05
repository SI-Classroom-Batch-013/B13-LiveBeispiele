fun main() {
    var fruits: List<String> = listOf("Strawberry", "Apple", "Banana", "Lemon")

    var i = 0
    do {
        println(fruits[i])
        i++
    } while (i < fruits.size)
}