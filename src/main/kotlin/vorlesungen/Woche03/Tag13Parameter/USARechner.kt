package Parameter


fun main(){
    // Anhand von Argumenten wird die richtige Funktion gewählt
    var preisVonColaInDollar = 2.5
    val preisVonColaInEuro = dollarToEuro(preisVonColaInDollar)

    var preisPizzaInDollar = 10.99
    var preisPizzaInEuro = dollarToEuro(preisPizzaInDollar, 0.9)

    // Man kann auch die Parameter dazu schreiben
    //          somit kann man sogar die Reihenfolge ändern
    var preisBeerInDollar = 4.99
    var preisBeerInEuro = dollarToEuro(
        wechselKurs = 0.94,
        betrag = preisBeerInDollar
    )

    // CHALLENGE: Diese Temperaturen in Celsius umwandeln
    val tempNYCinF = 51
    val tempDALLASinF = 86
    val tempLAinF = 75

    // TODO: Parameter für Fahrenheit To Celcius hinzufügen
    val tempNYCinC: Int = fahrenheitToCelsius(tempNYCinF)
    val tempDALLASinC: Int = fahrenheitToCelsius(tempDALLASinF)
    val tempLAinC: Int = fahrenheitToCelsius(tempLAinF)

    println("In NYC sind aktuell $tempNYCinC°C")
    println("In DALLAS sind aktuell $tempDALLASinC°C")
    println("In LA sind aktuell $tempLAinC°C")


    println("Geben sie die aktuelle Temperatur in Ottawa ein: (in °F)")
    var tempOTTinF = readln().toInt()
    var tempOTTinC = fahrenheitToCelsius(tempOTTinF)

    println("In Ottawa sind aktuell $tempOTTinC°C")


}

// 1 $ = 0.94 €
// 1 € = 1 / 0.94 $ = 1€ = 1.07 $
fun dollarToEuro(betrag: Double): Double{
    return 0.94 * betrag
}

fun euroToDollar(betrag: Double): Double{
    return (1 / 0.94) * betrag
}

// Funktionen können gleich heißen, solange sich die Parameter unterscheiden
//     dafür sind die DATENTYPEN entscheidend
fun dollarToEuro(betrag: String): Double{
    return 0.94 * betrag.toDouble()
}

// Parameter immer in Camelcase
fun dollarToEuro(betrag: Double, wechselKurs: Double = 0.94): Double{

    return wechselKurs * betrag
}


// TODO: Parameter einfügen!
fun fahrenheitToCelsius(fahrenheit: Int): Int {
    // °C = [(°F-32)×5]/9
    val celsius = (fahrenheit-32) * 5 / 9
    return celsius
}

// TODO: Parameter einfügen
fun imperialToMetric(): Double{
    // 1 foot = 12 Inches
    // 1 inch = 2.54 cm

    println("Geben sie zuerst die Feet ein, bestätigen sie mit Enter, dann die Inches:")
    var feet = readln().toInt()
    var inch = readln().toInt()

    var cm = (feet * 12 + inch) * 2.54
    var m = cm / 100

    return m
}