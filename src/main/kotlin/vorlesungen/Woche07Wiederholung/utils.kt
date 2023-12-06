package vorlesungen.Woche07Wiederholung

import kotlin.math.roundToInt

// utils: für Funktionen, die im gesamten Projekt überall immer mal wieder gebraucht werden

fun roundDouble(nr: Double): Double {
    // 1. Schritt: Zahl * 100 nehmen, zum Int machen
    var nrRounded = (nr*100).roundToInt() // 12.395804697 ==> 1239
    return nrRounded/100.0 // 1239 wird zur 12.39 bzw zur 12.40
}

fun roundDoubleWStrgFormat(nr: Double): Double {
    return String.format("%.2f",nr).replace(",",".").toDouble()
}

fun main() {
    var zahl: Double = 12.395804697 // hieraus eine 12.39 machen. Wie?
    println(zahl)
    println(roundDouble(zahl))
    println(roundDoubleWStrgFormat(zahl))

    // Rechnen mit Prozenten
    // "Gegner's Attacke zieht 30% von meinen HP ab"
    var hp = 100
    var damage = (hp/100)*30 // hp*0.3 ist das gleiche
    hp = hp-damage
    println(hp)

    // in einem Schritt:
    hp*0.7 // ich weiss, der damage sind 30% --> kann also einfach ausrechnen, wie viel 70% von meinen hp sind.
    // hp um 20% prozent erhoehen
    hp*1.2
}


// Game Loop programmieren: Spiel läuft so lange, bis ein Team keine HP mehr hat
// while (!gameOver) (gameOver ist true, wenn aus einem team alle tot sind)
// spielrunde soll laufen


// Was muss jede Runde alles passieren/ausgeprinted werden?
// print Runde 1/2/3/x!
// print alle helden in meinem team und ihre aktionen --> ueber liste der helden iterieren
// print alle gegner --> ueber liste der gegner iterieren

// schleife, bis alle helden angegriffen haben:
// print: "1./2./3. held soll angreifen, welche attacke?"
// readln: attacke anwaehlen (am besten mit zahlen also toInt
// attacke ausfuehren: held greift gegner an, zieht hp ab
// schoene printlns, die bescheid sagen, was los ist

// gegner rächt sich
// --> zufaellige attacke
// zufaellieger held wird getroffen (spaeter: der held mit den wenigsten/meisten hp?)

// schoenes println, wie der status von allen ist

// schauen, ob ein team tot ist, wenn ja gameOver auf true und das spiel beendet sich.