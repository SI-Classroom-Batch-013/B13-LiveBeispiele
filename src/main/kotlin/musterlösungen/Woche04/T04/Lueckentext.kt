package musterlösungen.Woche04.T04// Korrigiere alle _ mit den richtigen Klammern

var einkaufsListe: List<String> = listOf("Nutella", "Spinat", "Spinat")

var sortiment = mutableMapOf<String, Double>(
    "Spinat" to 1.99,
    "Rucola" to 2.29,
    "Eisberg" to 0.79,
    "Nutella" to 3.45,
    "Honig" to 2.21,
)

fun preisAbfrage(produkt: String): Double? {
	if (produkt in sortiment) {
		return sortiment[produkt]
	} else {
		return null
	}
}

fun main() {

	var produkt = einkaufsListe.last()
	var preis = preisAbfrage(produkt) ?: 0.0
	println("2 $produkt kosten ${2 * preis}")
	sortiment["Marmelade"] = 1.40

	var sortierteProduktListe: List<String> = sortiment.keys.sorted()

}
