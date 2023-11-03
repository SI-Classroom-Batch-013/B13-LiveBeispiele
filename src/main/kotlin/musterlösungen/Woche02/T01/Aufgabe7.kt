fun main() {
    val sweets: MutableList<String> = mutableListOf("Eis", "Schokolade", "Kaugummi", "Gummibärchen")
    sweets.add("Limonade")
    sweets.add("Makronen")
    sweets.remove("Kaugummi")
    print(sweets)
}
