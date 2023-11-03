fun main() {

    // Schau dir die Beispiele an:
    // Eine Map mit Schlüssel und Werten als Strings.
    // Hier wird eine Person zu (to) einem Geburtstag gemappt.
    val personBirthdayMap: Map<String, String> = mapOf(
        "Frank" to "12.02.1990",
        "Peter" to "01.04.1995",
        "Jürgen" to "20.08.1987",
    )
    println("1. $personBirthdayMap")

    // Wenn wir jetzt wissen wollen, wann Frank Geburtstag hat,
    // müssen wir der map den Schlüssel (Person) geben und die map gibt (get) uns den Wert (Geburtstag) zurück
    val franksBirthday: String? = personBirthdayMap.get("Frank")
    println("2. Franks Geburtstag ist am $franksBirthday")

    // Neben der get() Funktion, kann man auch die Index-Schreibweise mit den eckigen Klammern [] verwenden.
    val franksbirthdayAgain: String? = personBirthdayMap["Frank"]
    println("3. Franks Geburtstag ist auch am $franksbirthdayAgain")

    // Achtung: Eine Map gibt 'Null' zurück, wenn sie den Schlüssel, den du gegeben hast, nicht in der Map finden kann.
    val danielsBirthday: String? = personBirthdayMap["Daniel"]
    println("4. $danielsBirthday")

    // Einen Eintrag in einer Map nennt man Paar, bzw. Schlüssel-Wert-Paar.
    // Bei einer Map kannst du keine Einträge ändern, hinzufügen oder Entfernen,
    // das geht nur bei einer MutableMap.
    val personAgeMap: MutableMap<String, Int> = mutableMapOf(
        "Hans" to 21,
        "Sara" to 45,
        "Lisa" to 33,
    )
    println("5. $personAgeMap")

    // Einträge hinzufügen können wir mit der set() Funktion.
    // Hier fügen wir Herbert mit einem Alter von 50 hinzu.
    personAgeMap.set("Herbert", 50)
    println("6. $personAgeMap")

    // Das geht auch hier mit der Index Schreibweise.
    // Hier fügen wir Elsa mit einem Alter von 27 hinzu.
    personAgeMap["Elsa"] = 27
    println("7. $personAgeMap")

    // Einträge löschen können wir mit der Funktion remove().
    // Hier entfernen wir Hans nur über den Schlüssel.
    personAgeMap.remove("Hans")
    println("8. $personAgeMap")

    // Hier entfernen wir Sara über den Schlüssel und dem Wert.
    var pairWasinMapBol: Boolean = personAgeMap.remove("Sara", 45)
    println("8. $personAgeMap \n War davor das Paar Sara mit Alter 45 in der Map und wurde erfolgreich entfernt? $pairWasinMapBol")

}