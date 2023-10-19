package vorlesungen


import kotlin.math.*
import kotlin.math.pow


fun main() {


    // Wurzel aus 49 ziehen --> Ergebnis ist 7.0 , denn 7*7 = 49

    println(sqrt(49.0)) // 7.0

    var wurzelNeun: Double = sqrt(9.0) // 3.0
    println(wurzelNeun+10)

    var wurzelSechZehn: Int = sqrt(16.0).toInt() // 4
    sqrt(25.0) // 5
    sqrt(81.0) // 9

    // Wurzel aus 10 ziehen --> Ergebnis ist 10 , denn 10*10 = 100
    println(sqrt(100.0))


    // pow: Potenz. zB 3*3 = 9, waerae als Potenz geschriebeen: 3^2

    println("---Power  / Potenz ---")
    // die Basis (untere Zahl) muss ein Double sein.
    println(3.5.pow(2.0) )// 3.5*3.5 = 12.25
    println(3.0.pow(2) )// 3*3 = 9

    var neunMalNeun: Double = 9.0.pow(2)
    9.0.toInt()
    println("Das Ergebnis von 9*9 ist: $neunMalNeun")

    var zahl: Double = 5.0
    zahl.pow(2)

    // min
    var minNr: Int = min(1,5) // minNr = 1
    var min: Double = min(99.0,4.0)
    println(min)
    println(minNr)

    var intNr: Int = 999
    var sndIntNr: Int = 234

    var min2: Int = min(intNr, sndIntNr)
    println("Die kleinere Zahl zwischen $intNr und $sndIntNr ist $min2")

    // max
    var maxNr: Int = max(intNr,sndIntNr)
    println("Die groessere Zahl zwischen $intNr und $sndIntNr ist $maxNr")


    // length
    var stringExample: String = "Hallo hallo ich bin ein Computer"
    var lengthStringExample: Int = stringExample.length // 32
    println("Der String \"$stringExample\" hat $lengthStringExample Zeichen.")
    println("blablweaif oagihaeogih ".length)

    // equals: gibt true oder false zurueck, je nachdem ob die beiden Elemente gleich sind oder nicht
    var anotherString: String = "Heute ist Donnerstag"
    var resultEquals: Boolean = anotherString.equals(lengthStringExample) // hier kann auch ein Int rein, dann wird geguckt, ob das Int enthalten ist. normalerweise vergleicht man aber Strings
    println(resultEquals)

    println("Heute ist Donnerstag".equals(anotherString))


    // contains: gibt true oder falase zurueck, je nachdem, ob das linke Element das Element in den Klammern enthält

    var containsResult: Boolean = anotherString.contains("ist") // true
    var containsResult3: Boolean = anotherString.contains("IST") // false
    println(containsResult)
    var containsResult2: Boolean = anotherString.contains("Moin") // false
    println(containsResult2)











}