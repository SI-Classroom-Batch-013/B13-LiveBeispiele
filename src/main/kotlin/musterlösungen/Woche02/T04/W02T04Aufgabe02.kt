package Aufgabe02

fun main() {

    val capitals: Map<String,String> = mapOf("Türkei" to "Istanbul")

    val mutableCapitals: MutableMap<String,String> = capitals.toMutableMap()

    mutableCapitals.put("Italien","Rom")
    mutableCapitals.put("Portugal","Lissabon")

    mutableCapitals.putAll(mutableMapOf(
        "Deutschland" to "Berlin",
        "Frankreich" to "Paris",
        "Spanien" to "Madrid"
    ))

    mutableCapitals["Türkei"] = "Ankara"
    println(mutableCapitals)

}