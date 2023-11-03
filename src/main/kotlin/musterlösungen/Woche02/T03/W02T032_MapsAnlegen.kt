fun main() {
    // Hier ist eine Map die eine Person zu (to) einer Telefonnummer mappt (abbildet, zeigt).
    // Der Schlüssel hat dabei den Typ String und der Wert hat den Typ Int.
    val personPhoneExampleMap: Map<String, Int> = mapOf(
        "Ferdinand" to 16520335,
        "Gert" to 35872901,
        "Hilde" to 35489832,
    )

    // TODO: Vervollstaendige die Map
    val phonenumberMap: Map<String, Int> = mapOf(
        "Peter" to 2487503,
        "Bernd" to 3465081,
        "Ludolf" to 3985292
    )

    // TODO: Vervollstaendige die Map
    val eMailMap: Map<String, String> = mapOf(
        "Peter" to "peter123@gmail.com",
        "Sabrina" to "sabi-cool@gmx.de",
        "Tobi" to "titantobi@gamer.net"
    )

    // TODO: Gebe hier alle drei Maps aus
    println(personPhoneExampleMap)
    println(phonenumberMap)
    println(eMailMap)

}