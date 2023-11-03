fun main() {
    val bestenListe = listOf("Lisa", "Marko", "Sebastian", "Marie", "Florian", "Henrik", "Lillie", "Martin")

    //- Lese eine Zahl über die Konsole ein
    //- Die Zahl soll als Index für die `bestenListe` gewertet werden. Mithilfe des von dir eingegeben Index bzw. der eingegebenen Zahl soll der dazugehörige Wert von der `bestenListe` auf der Konsole ausgegeben werden
    println("Gib eine Index ein")
    val index: Int = readln().toInt()
    println(bestenListe.get(index))

    // Lese zwei Zahlen über die Konsole ein.
    // Die zwei Zahlen sollen als Indizes gewertet und für Anfang und Ende einer Teilliste der bestenListe stehen. Tipp : <Listenname>.slice() .
    // Die Teilliste soll über einen println() befehl ausgegeben werden.

    println("Gib eine Zahl ein")
    val zahl1: Int = readln().toInt()
    println("Gib eine weitere Zahl ein")
    val zahl2: Int = readln().toInt()
    val sliceListe = bestenListe.slice(zahl1..zahl2)
    println(sliceListe)
}