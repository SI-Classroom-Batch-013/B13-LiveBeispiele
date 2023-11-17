
/**
 * Berechnet das Quadrat einer gegebenen Zahl.
 * 
 * @param x Die Zahl, deren Quadrat berechnet werden soll.
 * @return Das Quadrat der Zahl.
 */
fun calculateSquare(x: Int): Int {
    return x * x
}

/**
 * Berechnet den Kubik einer gegebenen Zahl.
 *
 * @param x Die Zahl, deren Kubik berechnet werden soll.
 * @return Der Kubik der Zahl.
 */

fun calculateCube(x: Double): Double {
    return x * x * x
}

/**
 * Zählt, wie oft ein bestimmter Buchstabe in einem String vorkommt.
 *
 * @param input Der Eingabestring, in dem die Buchstaben gezählt werden sollen.
 * @param letter Der Buchstabe, dessen Vorkommen gezählt werden soll.
 * @return Die Anzahl der Vorkommen des Buchstabens im String.
 */
fun countLetterOccurrences(input: String, letter: Char): Int {

    return input.length - input.replace(letter.toString(), "").length
}

/**
 * Gibt einen Substrings aus einem Eingabestring aus.
 * Der Substring beginnt an einer Anfangsposition im Eingabestring und geht bis zu einer Endposition.
 *
 * @param inputString Der Eingabestring, aus dem der Substring extrahiert werden soll.
 * @param startIndex Die Anfangsposition des Substrings.
 * @param endIndex Die Endposition des Substrings.
 * @return Der extrahierte Substring.
*/
fun extractSubstring(inputString: String, startIndex: Int, endIndex: Int): String {

    return inputString.substring(startIndex, endIndex)
}

/**
 * Ersetzt Umlaute in einem String durch ihre Nicht-Umlaut-Formen.
 *
 * @param input Der Eingabestring, in dem die Umlaute ersetzt werden sollen.
 * @return Der String mit ersetzen Umlauten.
 */

fun replaceUmlauts(input: String): String {

    return input
        .replace("ä", "ae")
        .replace("ö", "oe")
        .replace("ü", "ue")
        .replace("Ä", "Ae")
        .replace("Ö", "Oe")
        .replace("Ü", "Ue")

}

/**
 * Fügt den gegebenen String zur Liste hinzu.
 * @param stringList Die Liste von Strings.
 * @param newString Der String, der zur Liste hinzugefügt werden soll.
 * @return Die aktualisierte Liste von Strings.
 */
fun addStringToList(stringList: MutableList<String>, newString: String): List<String> {
    stringList.add(newString)
    return stringList
}

fun main() {

}