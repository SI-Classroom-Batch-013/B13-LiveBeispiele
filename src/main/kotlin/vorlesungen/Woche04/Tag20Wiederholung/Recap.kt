package D20


fun main(){

    /* TODO:
    Schreibe ein Programm, das den Benutzer nach der aktuellen Temperatur in Grad Celsius fragt.
    Das Programm soll basierend auf der eingegebenen Temperatur eine der folgenden Meldungen ausgeben:

    Wenn die Temperatur unter 0 Grad Celsius liegt: "Es ist sehr kalt. Zieh dich warm an!"
    Wenn die Temperatur zwischen 0 und 15 Grad Celsius liegt: "Es ist kühl. Ein Pullover könnte nützlich sein."
    Wenn die Temperatur zwischen 16 und 25 Grad Celsius liegt: "Das Wetter ist angenehm."
    Wenn die Temperatur über 25 Grad Celsius liegt: "Es ist warm. Genieße die Sonne!"
    Hinweis: Verwende eine Verzweigung, um die Meldungen basierend auf der eingegebenen Temperatur zu generieren.
     */

    println("Was ist die aktuelle Temperatur?")
    val aktuelleTemp = readInt(-40..50)

    when {
         aktuelleTemp < 0 -> {
             println("Es ist sehr kalt. Zieh dich warm an!")
         }
         aktuelleTemp >= 0 && aktuelleTemp <= 15 -> println("Es ist kühl. Ein Pullover könnte nützlich sein.")
         aktuelleTemp in 16..25 -> println("Das Wetter ist angenehm.")
         aktuelleTemp > 25 -> println("Es ist warm. Genieße die Sonne!")
    }

    // könnte man auch mit if-else lösen
    /*
    if (aktuelleTemp < 0)
        println("Es ist sehr kalt. Zieh dich warm an!")
    else if (aktuelleTemp in 0..15)
        println("Es ist kühl. Ein Pullover könnte nützlich sein.")
    */

}

/**
 * Diese Funktion fordert den Benutzer auf, eine ganze Zahl einzugeben, und überprüft, ob die eingegebene Zahl
 * im angegebenen Wertebereich (IntRange) liegt. Falls die Eingabe ungültig ist oder außerhalb des Wertebereichs
 * liegt, wird der Benutzer erneut aufgefordert, eine Eingabe vorzunehmen, bis eine gültige Zahl im Wertebereich
 * eingegeben wird.
 *
 * @param range Ein IntRange-Objekt, das den Wertebereich angibt, in dem die eingegebene Zahl liegen sollte.
 * @return Die gültige ganze Zahl, die vom Benutzer eingegeben wurde und im angegebenen Wertebereich liegt.
 */

fun readInt(range: IntRange): Int{
    println("Geben sie eine Zahl (zw. $range) ein:")
    val eingabe: Int

    try {
        eingabe = readln().toInt()
    } catch (ex: NumberFormatException){
        return readInt(range)
    }


    return if (eingabe in range)
        eingabe
    else {
        println("$eingabe liegt nicht in $range")
        readInt(range)
    }
}
