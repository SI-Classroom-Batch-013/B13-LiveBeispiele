fun main() {
    var countries: Map<String, String> = mapOf(
        "Albanien" to "Tirana",
        "Andorra" to "Andorra la Vella",
        "Belgien" to "Brüssel",
        "Bosnien und Herzegowina" to "Sarajevo"
    )
    CountryAndCity(countries["Albanien"].toString(), "Albanien")
}

fun CountryAndCity(city: String, country: String) {
    print("$city ist die Hauptstadt von $country ")
}