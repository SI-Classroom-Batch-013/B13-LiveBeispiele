fun main() {
    var foods: MutableList<String> = mutableListOf(
        "Äpfel",
        "Brokkoli",
        "Hühnchen",
        "Reis",
        "Karotten",
        "Erdnüsse",
        "Spinat",
        "Joghurt",
        "Lachs",
        "Haferflocken"
    )
    // Unter diesem Kommentar deinen Code reinschreiben:

    foods[2] = "Bananen"
    foods.add(0, "Kirschen")
    foods.remove("Spinat")
    foods.removeAt(5)
    foods.sort()
    foods.removeFirst()
    foods.removeLast()
    println(foods.contains("Äpfel"))
    val subList = foods.subList(foods.indexOf("Joghurt"), foods.indexOf("Reis"))
    println(subList)
}