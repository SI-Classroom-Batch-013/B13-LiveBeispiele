fun main() {
    try {
        buyItem()
    } catch (e: java.lang.Exception) {
        println("Ein Fehler ist aufgetreten:")
        println(e)
        println("Dieses Produkt ist leider nicht mehr verfügbar.")
    }

}

fun buyItem() {
    val isInStock = false

    if (isInStock) {
        // buying item
    } else {
        // exception
        throw Exception("item not in stock exception")
    }
}