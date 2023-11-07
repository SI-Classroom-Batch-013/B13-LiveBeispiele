
fun main(){

    // Variablen/Konstanten, die man nicht nutzt, werden oft mit _ markiert
    val _euro = dollarToEuro()


    // man kann sie auch einfach weglassen
    val _celcius = fahrenheitToCelsius()
    fahrenheitToCelsius()

    val _meter = imperialToMetric()

}

fun dollarToEuro(): Double{
    // 1 $ = 0.94 €
    // 1 € = 1 / 0.94 $
    println("Geben sie den Betrag in $ ein:")
    var dollar = readln().toDouble()
    var euro = 1 / 0.94 * dollar

    println("$dollar$ sind $euro€\n")
    println("%.2f $ sind %.2f €\n".format(dollar, euro))

    println(euro)
    return euro
}


fun fahrenheitToCelsius(): Int {
    // °C = [(°F-32)×5]/9
//    println("Geben sie jetzt die Temperatur in °F ein:")
    val fahrenheit = temperaturSensor()
    val celsius = (fahrenheit-32) * 5 / 9

    println("$fahrenheit°F sind $celsius°C\n")
//    println("%d°F sind %d°C\n".format(fahrenheit, celsius))
    // %d um Integer Zahlen einzusetzen
    return celsius
}

fun temperaturSensor(): Int{
    return (40..120).random()
}


fun imperialToMetric(): Double{
    // 1 foot = 12 Inches
    // 1 inch = 2.54 cm

    println("Geben sie zuerst die Feet ein, bestätigen sie mit Enter, dann die Inches:")
    var feet = readln().toInt()
    var inch = readln().toInt()

    var cm = (feet * 12 + inch) * 2.54
    var m = cm / 100

//    println("$feet'$inch'' sind ${m}m\n")
    println("%d'%d'' sind %.2f\n".format(feet, inch, m))
    return m
}

// TODO: Challenge
fun euroToDollar(): Double{
    return 0.0 // TODO: richtigen Return-wert einsetzen
}