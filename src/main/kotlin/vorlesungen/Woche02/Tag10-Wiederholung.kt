package vorlesungen.Woche02

fun main() {

    // WIEDERHOLUNG
    // Listen

    // liste an artists anlegen
    var artistList: List<String> = listOf()

    // mutable kopie erstellen, auf die man schreibend zugreifen kann
    val mutableArtistList: MutableList<String> = artistList.toMutableList()


    // ein paar operationen
    // (Element einlesen und in die Liste speichern)
    println("Bitte gib deinen Lieblings Artist ein:")


    // 1. Eingabe in Variable speichern
    val input: String = readln()

    // 2. letztes Element ersetzen durch Eingabe
    mutableArtistList[mutableArtistList.size-1] = input

    // 3. welches ist jetzt das letzte Element? In einer Variable speichern
    val lastElement: String = mutableArtistList[mutableArtistList.size-1]
    // ODER
    val lastElement2: String = mutableArtistList.last()

    // 4. erstes Element in Variable speichern und gleichzeitig entfernen
    var firstArtist: String = mutableArtistList.removeFirst()


    // 5. liste alphabetisch sortieren, ausgeben
    mutableArtistList.sort()
    println(mutableArtistList)

    // 6. random listenElement speichern
    val random = mutableArtistList.random()
    println(random)



    // NULL
    var firstName: String? = null
    println(firstName)

    firstName!!.length

    // Maps

    // map anlegen: Artists (Strings) mit jeweils mehreren Songs (Liste aus Strings)

    var liste: List<String> = listOf(
        "string1",
        "string2",
        "string3"
    )
    println(liste)

    var bestSong: Map<String,String> = mapOf(
        "Dire Straits" to "Money for Nothing",
        "Helene Fischer" to "Atemlos",
        "Johnny Cash" to "Blue Train",
        "The Police" to "Every Breath You Take",
        "Mister Mister" to "Broken Wings"
    )
    println(bestSong)


    // Kopie der bestSong Map, die veränderbar ist, erstellen
    var mutableBestSong: MutableMap<String, String> = bestSong.toMutableMap()


    // ein paar operationen:
    // Was ist der Value von The Police und den anderen?
    var policeSong: String = bestSong["The Police"]!! // falschen key eingebene wirft NullPointerException
    var johnnySong: String? = bestSong["Johnny Cash"]
    var heleneSong: String = bestSong.getValue("Helene Fischer") // falschen Key eingeben wirft NoSuchElementException
    var direSong: String? = bestSong.get("Johnny Cash")


    // einen artist + song hinzufügen:
    mutableBestSong["Metallica"] = "Nothing Else Matters"
    mutableBestSong.put("Nena", "99 Luftballons")


    // eintrag entfernen, egal welcher value drin steht
    mutableBestSong.remove("Johnny Cash")

    // eintrag nur entfernen, wenn er enthält, was wir im value spezifizieren:
    val removeSuccessful: Boolean = mutableBestSong.remove("The Police","Every Breath You Take")


    // Sonderfall: Konvertierung von Maps zu Listen
    val pairList: List<Pair<String,Int>> = listOf(
        Pair("Eins",1),
        Pair("zwei", 2)
    )
    val pairListToMap: Map<String,Int> = pairList.toMap()
    val pairListMutable = pairList.toMutableList()

    var myMap: Map<String, String> = mapOf(
        "DE" to "+49",
        "AT" to "+43",
        "PT" to "+351"
    )
    val myMapToList:  List<Pair<String, String>> = myMap.toList()
    println("----Neuer Stoff----")
    println(myMapToList) // [(DE, +49), (AT, +43), (PT, +351)]

    // Die resultierende Liste enthält anschließend Pairs, also immer 2 Werte als ein Listenelement
    // auf den ersten oder zweiten Wert eines Pairs können wir dann mit first und second zugreifen
    println(myMapToList[0]) // (DE, +49)
    println(myMapToList[0].first) // DE
    println(myMapToList[0].second) // +49

    val list = listOf(1,2,3,4,5,6) //[1,2,3,4,5,6]
    println(list[0]) // 1
    // val listToMap = list.toMap() // nicht moeglich, kein Pair in der Liste enthalten. geht nur mit Pairs!


    // Eine Liste an Pairs kann auch wieder zu einer Map konvertiert werden
    val mapFromPairList: Map<String,String> = myMapToList.toMap()
    println(mapFromPairList)


    // Zugriff auf Indices von List-Items
    val namesList: List<String> = listOf("Lukas", "Leon", "Lennart")

    val ageList: List<Int?> = listOf(26,22,null)

    // Eine Map aus zwei Listen machen → myNamesList ist der Key und myAgeList der Value
    val nameMap: Map<String,Int?> = namesList.zip(ageList).toMap()
    val mutableNameMap = nameMap.toMutableMap()

    println(nameMap)
    mutableNameMap["Lennart"] = 24
    println(mutableNameMap)
    
    // Verschachtelte Map:
    var discographies: MutableMap<String, List<String>> = mutableMapOf(
        "Taylor Swift" to listOf("1989", "Speak Now", "Folklore", "Midnights"),
        "Lorde" to listOf("Pure Heroine", "Melodrama", "Solar Power"),
        "Biggie Smalls" to listOf("Ready to Die", "Life After Death", "Album3"),
        "Nena" to listOf("99 Luftballons", "Irgendwie, irgendwo, irgendwann", "Nur geträumt")
    )

    // auf eine liste in der map zugreifen und einen wert entfernen/verändern: wir wollen "Speak Now" löschen
        // 1. die liste anhand des keys rausholen, zwischenspeichern
        var taylorSongs: MutableList<String>? = discographies["Taylor Swift"]?.toMutableList()

        // 2. das element aus der liste entfernen
        taylorSongs?.remove("Speak Now")

        // 3. die veränderte Liste in den passenden Value schreiben
        discographies["Taylor Swift"] = taylorSongs!!.toList()


    // SETS

    // bereits erstellte Liste zum Set machen
    println(artistList)
    var mutableArtistSet: MutableSet<String> = artistList.toMutableSet()
    println(mutableArtistSet)

    // auf einen wert per index zugreifen: nur mit .elementAt() möglich
    var secondArtist = mutableArtistSet.elementAt(1)

    // doppelten wert hinzufügen -> Was passiert?
    mutableArtistSet.add("TuPac")
    println(mutableArtistSet)
    mutableArtistSet.add("Biggie Smalls")
    println(mutableArtistSet)
}
