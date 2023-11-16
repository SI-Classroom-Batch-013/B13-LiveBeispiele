fun main(){
    /* TODO:
        Listen Indizierung
           - muss ein Integer sein
           - Indices fangen immer bei 0 an!
           - Aufpassen mit IndexOutOfBoundsException
     */
    val einkaufswagen =  mutableListOf("Spagetti", "Hähnchenbrust", "Zitrone", "Creme Fraiche")
    // Mit Index abfragen
    einkaufswagen[0]      // Spagetti
//    einkaufswagen[-2]      // fehler!



    // Mit Index verändern
    einkaufswagen[3] = "Sahne"

    // Neuen Artikel hinzufügen
//    einkaufswagen[4] = "Parmesan" // fehler!
    einkaufswagen.add("Parmesan")

    // Dreitausch
    var alterWert = einkaufswagen[3]
    einkaufswagen[3] = einkaufswagen[0]
    einkaufswagen[0] = alterWert

    // Vorsicht mit IndexOutOfBoundsException!
    //einkaufswagen[-1]
    //einkaufswagen[5]

    /* TODO:
          Map Indizierung
            - Indizierung via Key (=Schlüssel) -> Datentypen beachten
            - Aufpassen mit null
     */
    val artikelListe = mutableMapOf<String, Double>(
        "Creme Fraiche" to 1.99,
        "Hähnchenbrust" to 3.45,
        "Sahne" to 0.67,
        "Spagetti" to 0.99,
        "Zitrone" to 0.34
    )

    // Werte abfragen: Vorsicht mit Null
    val sahnePreis: Double? = artikelListe["Sahne"]     // 0.67 als Double?
    val spagettiPreis: Double? = artikelListe["spageti"]  // null
    var zitronePreis: Double = artikelListe["Zitrone"]!!    // 0.34

    // Vorsicht: NullPointerException
//    zitronePreis = artikelListe["zitrone"] !! // NullPointerException
//    zitronePreis = artikelListe["zitrone"] ?: -1.0

    if ("zitrone" in artikelListe.keys) {
        zitronePreis = artikelListe["zitrone"]!!
    }

    // Werte hinzufügen bzw verändern
    artikelListe["Parmesan"] = 4.20
    artikelListe["Sahne"] = 0.8             // Existierende Schlüssel werden überschrieben
    artikelListe["Pfeffer"] = 1.99


    // Vorsicht: bei Sets gibts es keine []
    var namensSet = setOf<String>("Tobi", "Max", "Sandra", "Tobi")

//    namensSet[0]
    namensSet.elementAt(0)
    namensSet.toList()[0]


    /* TODO:
            String Indizierung:
                Integer Indices ähnlich wie Listen
     */
    var zeichen: Char = 'a'
    zeichen = ','
    zeichen = '$'
    zeichen = '\n'
    zeichen = ' '

//    val vorname2: List<Char> = listOf('M', 'a', 'x')
    val vorname: String = "Max"                 // Escaped Strings
    val nachname: String = "Musterfrau"

    val brief: String = """
        Lieber $vorname,
        
        ich vermisse dich so sehr...
        hdsajfhjshdf    
    """.trimIndent()     // Raw Strings

    var brief2: String = "Lieber $vorname," +
            "ich vermisse dich so sehr..."

    println("Brief 1: \n$brief\n")
    println("Brief 2: \n$brief2")
    // Werte abfragen
    var erstesZeichen: Char = vorname[0]  // 'M'
    vorname[1]  // 'a'
//    vorname[5]  // String Index Out Of Bounds Exception

    // Vorsicht: Strings sind nicht mutable (=veränderbar)
//     nachname[1] = 'a'

    // Lösung: kotlin.text.StringBuilder
    val nachName: StringBuilder = StringBuilder("Musterfrau")
    nachName[1] = 'a'
    println(nachName) // Masterfrau
    // man kann von und zu StringBuilder konvertieren
    StringBuilder(vorname)
    nachName.toString()

    // TODO: Bei Sets aufpassen
    var artikelIDs = mutableSetOf(
        "11", "123","12388", "981","46"
    )
    // Werte abfragen
//    println(artikelIDs[2])
    println(artikelIDs.elementAt(2))

    // Wert verändern
//    artikelIDs[1] = "452"
    // Stattdessen alten Wert löschen, und neuen hinzufügen
    artikelIDs.add("452")
    artikelIDs.remove("123")


}