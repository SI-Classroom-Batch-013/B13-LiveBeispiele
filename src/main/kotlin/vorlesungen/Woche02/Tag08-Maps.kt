package vorlesungen.Woche02


fun main(){
// Map anlegen

    // zur Erinnerung: List anlegen
    var list: List<String> = listOf(
        "a",
        "b",
        "c"
    )
    println("Das erste Element in der Liste ist ${list[0]}")
    println("Das erste Element in der Liste ist ${list.get(0)}")

    // generelle formel: var mapName: Map<Key-Datentyp, Value-Datentyp> = mapOf(key1 to value1, key2 to value2, etc)
    val articles: Map<String,Double> = mapOf(
        "Banane" to 1.49,
        "Erdebeeren" to 2.99,
        "Zahnpasta" to 2.49,
        "Milch" to 1.49
    )
    val mutableArticles: MutableMap<String,Double> = articles.toMutableMap()
    println(mutableArticles)
    println("Der Preis einer Banane ist: ${mutableArticles["Banane"]}")
    println("Der Preis einer Banane ist: ${mutableArticles.get("Banane")}")


// wichtige lesende Map Operationen (lesend, auf Maps und MutableMaps anwendbar, Äquivalent zu vielen Listenoperationen)

    // size
    println(articles.size)


    // isEmpty
    println(articles.isEmpty())


    // contains: will den Key, nicht den Value. sagt uns, ob der Key enthalten ist oder nicht, gibt true zurück wenn ja, false wenn nein
    println(articles.contains("Milch"))

    // containsKey()
    println(articles.containsKey("Milch"))

    // containsValue() : hiermit können wir direkt die Values durchsuchen
    println(articles.containsValue(1.49))

    // get(key)  (äquivalent zu articles[key]) -> gibt den value des keys zurück
    println("Der Preis einer Banane ist: ${articles.get("Banane")}")
    println("Der Preis einer Banane ist: ${articles["Banane"]}")


    // .keys  gibt alle keys als SET zurück (keine Doppelungen)
    println(articles.keys)

    // .values  gibt alle values als LISTE zurück
    println(articles.values)

    // .entries gibt alle einträge zurück
    println(articles.entries)



// wichtige schreibende Map Operationen (NUR auf MutableMaps möglich)


    // put(key, value) fügt ein neues Key Value Paar hinzu (oder überschreibt den Value eines Existierenden Keys, wenn der übergebene Key damit übereinstimmt)
    // bereits vorhandenen Wert ueberschreiben
    mutableArticles["Banane"] = 2.49
    println(mutableArticles)
    mutableArticles.put("Banane",20.49)
    println(mutableArticles)

    // neuen Wert hinzufuegen: neuen Key mit Wert schreiben, wird ans Ende gehängt
    mutableArticles["Orange"] = 0.99
    println(mutableArticles)
    mutableArticles.put("Wassermelone", 5.99)
    println(mutableArticles)


    // remove mit Key-Übergabe: Entfernt Value und Key, gibt den gelöschten Value (nicht Key) zurück
    var removedEntry: Double? = mutableArticles.remove("Tee")
    println("Tee entfernt, was stand für ein Wert drin? -> $removedEntry")

    var removedOrange: Double? = mutableArticles.remove("Orange")
    println("Orange entfernt, was stand für ein Wert drin? -> $removedOrange")


    // remove mit key UND value übergabe: der value muss genau zum key passen, sonst wird false zurückgegeben und nichts gelöscht
    var removeWassermelone: Boolean = mutableArticles.remove("Wassermelone",0.99)
    println("Wassermelone erfolgreich entfernt? -> $removeWassermelone")
    var removeWassermelone2: Boolean = mutableArticles.remove("Wassermelone",5.99)
    println("Wassermelone erfolgreich entfernt? -> $removeWassermelone2")
    println(articles)


    // clear() löscht alle elemente aus der map
    mutableArticles.clear()
    println(mutableArticles)

    // mit [] neue elemente hinzufügen: wenn der key nicht existiert, wird er mit dem value neu hinzugefügt
    mutableArticles["Kekse"] = 1.99
    mutableArticles["Bier"] = 3.99
    mutableArticles["Käse"] = 0.99
    mutableArticles.put("Tofu",4.99)
    println(mutableArticles)


    // mit [] den Value bestehender Keys verändern / value eines bereits vorhandenen Elements überschreiben:
    mutableArticles["Kekse"] = 3.99
    println(mutableArticles)


    // Nullability bei Maps: mit Datentyp angabe, sonst automatisch
    var bierPreis: Double? = mutableArticles["Bier"]
    println(bierPreis)
    var joghurtPreis: Double? = mutableArticles["Joghurt"]
    println(joghurtPreis)


    // Komplexere Map, die je einen Key auf eine Liste an Values mappt:

    var taylorSongList: MutableList<String> = mutableListOf("Blank Space", "Anti-Hero", "Karma")

    var music: MutableMap<String,MutableList<String>> = mutableMapOf(
        "Taylor Swift" to taylorSongList,
        "Lorde" to mutableListOf("Ribs", "Royals", "Solar Power"),
        "Die Ärzte" to mutableListOf("Schrei nach Liebe", "Hurra", "1/2 Lovesong")
    )

    println(music)
    println(music.keys)
    println(music.values)




    // Operationen an Listen in Maps
    // Element hinzufügen: Junge an Die Arzte hinzufuegen
    music["Die Ärzte"]?.add("Junge")
    println(music)

    // Element an bestimmten index hinzufuegen
    music["Lorde"]?.add(0,"Mood Ring")
    println(music)


    // Element entfernen
    music["Lorde"]?.remove("Royals")
    println(music)

    // neuen Key und Value in die Map einfügen
    // gleiches Prinzip wie hier:  mutableArticles["Orange"] = 0.99
    music["Adele"] = mutableListOf("Hello", "Rolling in the Deep")


    // Key und dessen Value entfernen
    music.remove("Die Ärzte")
    println(music)

    // Existiert ein bestimmter Key?
    // analog zu: articles.containsKey("Milch")
    val metallicaExists: Boolean = music.containsKey("Metallica") // false


    // existiert ein bestimmes Element in den Values eines Keys?
    // existiert der song Blank Space in der Taylor Entry?
    var blankExists: Boolean? = music["Taylor Swift"]?.contains("Blank Space")
    println("Ist Blank Space bei Taylor enthalten? -> $blankExists")

}