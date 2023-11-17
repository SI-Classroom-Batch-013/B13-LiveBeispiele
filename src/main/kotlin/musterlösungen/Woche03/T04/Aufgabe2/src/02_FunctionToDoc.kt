/**
 * Wandelt eine Temperatur von Fahrenheit in Celsius um.
 * @param fahrenheit Die Temperatur in Fahrenheit.
 * @return Die Temperatur in Celsius.
 */
fun convertFahrenheitToCelsius(fahrenheit: Double): Double {
    return (fahrenheit - 32) * 5 / 9
}

/**
 * Entfernt Duplikate aus der gegebenen Liste von Integern.
 * @param intList Die Liste von Integer-Werten.
 * @return Eine neue Liste ohne Duplikate.
 */
fun removeDuplicates(intList: List<Int>): List<Int> {
    return intList.toSet().toList()
}

/**
 * Konkateniert zwei gegebene Listen von Strings.
 * @param list1 Die erste Liste von Strings.
 * @param list2 Die zweite Liste von Strings.
 * @return Die konkatinierte Liste von Strings.
 */
fun concatenateLists(list1: List<String>, list2: List<String>): List<String> {
    return list1 + list2
}

/**
 * Wandelt die gegebene Anzahl von Sekunden in Minuten um.
 * @param seconds Die Anzahl der Sekunden.
 * @return Die Anzahl der Minuten, die den gegebenen Sekunden entsprechen.
 */

fun convertSecondsToMinutes(seconds: Int): Double {
    return seconds / 60.0
}

/**
 * Dreht den gegebenen String um.
 * @param inputString Der Eingabestring, der umgedreht werden soll.
 * @return Der umgedrehte String.
 */
fun reverseString(inputString: String): String {
    return inputString.reversed()
}

/**
 * Entfernt Leerzeichen aus dem gegebenen String.
 * @param inputString Der Eingabestring mit Leerzeichen.
 * @return Der Eingabestring ohne Leerzeichen.
 */
fun removeSpaces(inputString: String): String {
    return inputString.replace(" ", "")
}

fun main() {

}
