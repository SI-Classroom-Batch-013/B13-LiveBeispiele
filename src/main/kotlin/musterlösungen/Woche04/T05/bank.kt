package musterlösungen.Woche04.T05

//Globale Variable kann in allen Funktionen verwendet werden.
//Konten sind als Map gespeichert (name des Kontos, Geldbetrag auf dem Konto)
//Schreibe die Funktionen, sodass diese die Map bank direkt verändern
var bank: MutableMap<String, Double> = mutableMapOf(
    Pair("Gordon", 100.0),
    Pair("Minh", 50.0),
    Pair("Bassam", 150.0),
    Pair("Luc", 200.0),
    Pair("Eduard", 250.0),
    Pair("Anna", 300.0),
    Pair("Cüneyt", 350.0),
    Pair("Nico", 400.0),
    Pair("Laurenz", 450.0)
)


fun main() {
    //Hier soll die Programmsteuerung implementiert werden. d.H hier sollen nur Funktionen aufgerufen werden.
    println(bank)
    println(betrag("Gordon"))
    kontoHinzufuegen("test", 10.0)
    println(bank)
    kontoLoeschen("test")
    println(bank)
    auszahlen("Gordon", 10.0)
    println(bank)
    einzahlen("Laurenz", 100.0)
    println(bank)
    ueberweisen("Laurenz", "Gordon", 120.0)
    println(bank)

    //Hier sollten Warnungen ausgeben werden
    kontoHinzufuegen("Laurenz", 10.0)
    kontoLoeschen("test2")
}


//TODO schreibe ein Funktion, die den Betrag eines Kontos zurückgibt. Nutze einen Parameter Konto:String um der Funktion zu sagen
// welches Konto zurückgegeben werden soll. Gibt es das Konto in unserer Bank nicht, soll eine Exception geworfen werden!
// Bei dieser Methode ist ein Rückgabewert erwünscht, der Betrag kann auch direkt auf der Konsole ausgeben werden.
fun betrag(konto: String): Double? {
    if (bank.containsKey(konto)) {
        //konto existiert
        return bank[konto]
    } else {
        //konto existiert nicht
        println("Dieses Konto exitiert nicht")
        return null;
    }

}

//TODO schreibe eine Funktion, die neue Konten zur Bank hinzufügen soll. Als Parameter wählen sie einen Namen:String und
// einen beliebigen Geldbetrag:Double
fun kontoHinzufuegen(konto: String, betrag: Double) {
    if (bank.containsKey(konto)) {
        //Konto existiert bereits
        println("Das Konto exitiert bereits! ")
    } else {
        //konto existiert noch nicht
        bank[konto] = betrag
        println("Das konto: $konto wurde erfolgreich hinzugefügt")
    }
}

//TODO schreibe eine Funktion, die bestehende konten entfernt. Nutzt als Parameter den Namen:String.
// Dieser soll aus der Map konten entfernt werden. Gibt es das Konto in der Bank nicht, soll eine Exception geworfen werden.
fun kontoLoeschen(konto: String) {
    if (bank.containsKey(konto)) {
        //Konto existiert bereits
        bank.remove(konto)
        println("Das konto: $konto wurde erfolgreich entfernt")
    } else {
        //konto existiert noch nicht
        println("Das Konto existiert nicht! ")
    }
}

//TODO schreibe eine Funktion die eine Auszahlung am geldautomaten simuliert. Nutze einem Parameter name:String um das richtige Konto auszuwählen
// und einen weiteren für den Geldbetrag, der abgehoben werden soll. Berechnet den neuen Betrag und speichert ihn in der map bank ab. Gibt es das Konto nicht soll eine Exception geworfen werden.
fun auszahlen(konto: String, betrag: Double) {
    if (bank.containsKey(konto)) {
        //Konto exitiert bereits
        if (betrag > 500 && betrag < bank[konto]!!) {
            //Auzahlung nicht möglich
            println("Bitte wählen Sie einen Betrag der kleiner als 500 ist")
        } else {
            //Auzahlung möglich
            bank[konto] = bank[konto]!! - betrag
            println("Die Auzahlung war erfolgreich. Es sind noch ${bank[konto]} € auf dem Konto von $konto")
        }
    } else {
        //konto exitiert noch nicht
        println("Das Konto exitiert nicht! ")
    }
}

//TODO schreibe eine Funktion die eine Einzahlung am geldautomaten simuliert. Nutze einem Parameter name:String um das richtige Konto auszuwählen
// und einen weiteren für den Geldbetrag, der eingezahlt werden soll. Berechnet den neuen Betrag und speichert ihn in der map bank ab. Gibt es das Konto nicht soll eine Exception geworfen werden.
fun einzahlen(konto: String, betrag: Double) {
    if (bank.containsKey(konto)) {
        //Konto exitiert bereits betrag auf bank[konto] addieren
        bank[konto] = bank[konto]!! - betrag
    } else {
        //konto exitiert noch nicht neues Konto erstellen mit betrag
        println("Das Konto existiert nicht! Es wird ein neues Konto angelegt")
        kontoHinzufuegen(konto, betrag)
    }
}

//TODO schreibe eine Funktion, die eine Überweisung simuliert. Als 1. Parameter soll das konto, von dem aus überwiesen wird, verwendet werden.
// als 2. soll das konto, auf das überwiesen wird, genutzt werden und als letzten Parameter den Betrag, der überwiesen werden soll. Berechnet die neuen Beträge
// der beiden Konten und speichert diese wieder in bank ab
fun ueberweisen(konto1: String, konto2: String, betrag: Double) {
    //Prüfung, ob beide Konten existieren
    if (bank.containsKey(konto1) && bank.containsKey(konto2)) {
        //Prüfung ob konto1 genug geld hat
        if (bank[konto1]!! > betrag) {
            //Überweisung
            bank[konto1] = bank[konto1]!! - betrag
            bank[konto2] = bank[konto2]!! + betrag
            println("Die Überweisung war erfolgreich")
        }
    }
}