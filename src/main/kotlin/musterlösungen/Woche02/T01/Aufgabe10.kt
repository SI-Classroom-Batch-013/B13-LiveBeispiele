fun main() {
    val fruits = mutableListOf<String>()
    fruits.add("Melone")
    fruits.add("Zitrone")
    fruits.add("Orange")
    fruits.add("Ananas")
    fruits.add("Banane")
    fruits.remove("Banane")
    fruits.remove("Ananas")
    fruits.remove("Orange")
    print(fruits)
}