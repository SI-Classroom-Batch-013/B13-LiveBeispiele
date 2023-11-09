package vorlesungen.Woche03.Tag14DocComments

/**
 * Eine Map, die Produkte und ihre Preise speichert.
 *
 * Diese Map enthält verschiedene Produkte als Schlüssel und deren
 * zugehörige Preise und Anzahl als Wertpaare.
 *
 * Beispiel für ein Eintragspaar:
 * "Barilla Tomatensauce" -> Pair(Preis: 1.99, Anzahl: 3)
 *
 * @see Pair
 */
val produkteMitPreisen: MutableMap<String, Pair<Double, Int>> = mutableMapOf(
    "Nudeln, 500g" to Pair(1.29, zufallsZahl()),
    "Reis, 1kg" to Pair(1.79, zufallsZahl()),
    "Milch, 1L" to Pair(0.89, zufallsZahl()),
    "Eier, 10 Stück" to Pair(1.99, zufallsZahl()),
    "Butter, 250g" to Pair(1.79, zufallsZahl()),
    "Käse, 200g" to Pair(2.49, zufallsZahl()),
    "Joghurt, 500g" to Pair(0.99, zufallsZahl()),
    "Brötchen, 6 Stück" to Pair(1.49, zufallsZahl()),
    "Brot, 500g" to Pair(2.29, zufallsZahl()),
    "Gemüsebrühe, 200g" to Pair(0.79, zufallsZahl()),
    // ... Platz für mehr Produkte
    "Schokolade, 100g" to Pair(1.19, zufallsZahl())
)

val warenkorb = mutableListOf<String>()


fun main(){

    // TODO: die Produkte um ein Produkt erweitern
    produkteMitPreisen["Maoam Kaugummi"] =  Pair(1.5, zufallsZahl(1, 5))


    // Fügt ein Zufallsprodukt zum Warenkorb hinzu
    val zufallsProduct: String = produkteMitPreisen.keys.random()
    warenkorb.add(zufallsProduct)

    // TODO: Was kostet das Produkt?

    println("Das zufällige Produkt ist: $zufallsProduct und kostet ${preisAbfrage(zufallsProduct)}")
    preisAbfrage("Maoam Kaugummi")
//    preisAbfrage("Maoam Ballaballa")


    // Fügt noch 3 Produkte hinzu
    warenkorb.add(produkteMitPreisen.keys.random())
    warenkorb.add(produkteMitPreisen.keys.random())
    warenkorb.add(produkteMitPreisen.keys.random())

    // TODO: Den Gesamtpreis des Warenkorbs berechnen
    println("Der Warenkorb:\n$warenkorb")
    val gesamtPreis = gesamtPreisBerechnen(warenkorb)
    println("Gesamtpreis: $gesamtPreis")


    // TODO: Den Warenkorb wieder leeren
    warenkorbLeeren()
    println("Kontrolle ob der Warenkorb leer ist: ")
    println(warenkorb.isEmpty())

}

/**
 * Leert den Warenkorb.
 *
 * Diese Funktion löscht alle Produkte aus dem Warenkorb, indem sie die
 * [MutableList.clear]-Methode auf dem Warenkorb aufruft. Nachdem die Funktion ausgeführt wurde,
 * ist der Warenkorb leer und enthält keine Produkte mehr.
 *
 */
fun warenkorbLeeren(){
    warenkorb.clear()
}

/**
 * Gibt den Preis für ein bestimmtes Produkt zurück.
 *
 * Diese Funktion ruft den Preis für das angegebene Produkt ab. Falls das Produkt
 * nicht in der Liste vorhanden ist, wird eine IllegalArgumentException ausgelöst,
 * um anzuzeigen, dass das Produkt ungültig ist.
 *
 * @param product Der Name des abzufragenden Produkts.
 * @return Der Preis des Produkts.
 * @throws IllegalArgumentException Wenn das angegebene Produkt nicht existiert.
 */
fun preisAbfrage(product: String): Double {
    return produkteMitPreisen[product]?.first ?: throw IllegalArgumentException("Ungültiges Produkt")
}


/**
 * Berechnet den Gesamtpreis aller Produkte im Warenkorb.
 *
 * Diese Funktion ermittelt den Gesamtpreis aller Produkte, die sich im Warenkorb
 * befinden. Hierbei wird die Funktion [preisAbfrage] verwendet, um die Preise der
 * einzelnen Produkte abzurufen. Falls ein Produkt im Warenkorb nicht existiert,
 * wird eine IllegalArgumentException ausgelöst.
 *
 * @param warenkorb Eine Liste von Produktbezeichnungen im Warenkorb.
 * @return Der Gesamtpreis aller Produkte im Warenkorb.
 * @throws IllegalArgumentException Wenn eines der Produkte im Warenkorb nicht existiert.
 * @see preisAbfrage
 */
fun gesamtPreisBerechnen(warenkorb: List<String>): Double {
    return warenkorb.sumOf { preisAbfrage(it) }
}

/**
 * Generiert eine zufällige ganze Zahl innerhalb des angegebenen Bereichs.
 *
 * @param min Die untere Grenze des Bereichs (Standardmäßig 0).
 * @param max Die obere Grenze des Bereichs (Standardmäßig 10).
 * @return Eine zufällige ganze Zahl im angegebenen Bereich.
 */
fun zufallsZahl(min: Int = 0, max: Int = 10): Int{
    return (min..max).random()
}