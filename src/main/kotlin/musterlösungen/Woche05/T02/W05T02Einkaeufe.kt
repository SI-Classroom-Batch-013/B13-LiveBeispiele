
fun main() {
    val shoppingList: MutableList<String> = mutableListOf(
        "Reis", "Tofu", "Brokkoli", "Nudeln", "Apfelsaft",
        "Zitronen", "Eis", "Erdbeeren", "Torte"
    )

    for (i in 0 until shoppingList.size) {
        val j = i + 1
        shoppingList[i] = j.toString() + ". " + shoppingList[i]
    }

    println(shoppingList)
}