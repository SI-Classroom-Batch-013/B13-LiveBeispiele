package vorlesungen.Woche01

import kotlin.math.min
import kotlin.math.max
import kotlin.math.pow

fun main() {
    var x: Double = 9.0


    // x = "hi" geht nicht, anderer Datentyp

    // println() Nutzung: druckt in die Konsole aus
    println(x)
    println("Hallo wie geht's")
    println(10)


    // readln() Nutzung: nimmt Daten, die man in die Konsole eingibt, ins Programm, indem wir sie in eine Variable speichern
    println("Bitte gib dein Alter ein...")
    var alter: String = readln()
    println("Ok, ein Alter ist $alter Jahre.")


    var diesisteinlangervariablenname = 0
    var diesIstEinLangerVariablenName = 1

    // Tag 3

    val zahl: Int = 3
    println("Vorm Konvertieren: $zahl")
    var konvZahl: Double = zahl.toDouble()
    println("Nach dem Konvertieren: $zahl")
    println("Nach dem Konvertieren: $konvZahl")
    // Zahl selbst wird nicht verändert, es wird nur ein Ergebnis ausgespuckt, das noch selber in eine Variable gespeichert werden muss.



    // Wurzel ziehen: Mini Programm schreiben, in der User eine Zahl eingibt und daraus die Wurzel gezogen wird
//    println("Bitte gib ein Zahl ein, deren Wurzel du ziehen willst...")
//    // 1. Schritt variable fuer user input
//    var input: String = readln()
//
//            // Option 1
//            var inputConv: Double = input.toDouble()
//            var resultOp1: Double = sqrt(inputConv)
//
//            // Option 2
//            var resultOp2: Double = sqrt(input.toDouble())
//
//            // Option 3
//            println("Bitte gib ein Zahl ein, deren Wurzel du ziehen willst...")
//            var inputOp3: Double = readln().toDouble()
//            var resultOp3: Double = sqrt(inputOp3)
//
//            // Option 4
//            println("Bitte gib ein Zahl ein, deren Wurzel du ziehen willst...")
//            var resultOp4: Double = readln().toDouble()
//            resultOp4 = sqrt(resultOp4)


    // Potenz

    var base: Double = 9.0
    var potenz: Double = 2.0
    var resultPow: Double = base.pow(potenz)

    var eightPow2: Double = 8.0.pow(2)

    // min -> gibt den kleineren von 2 Werten zurueck
    var zahl1: Int = 5
    var zahl2: Int = 10
    var minimum: Int = min(zahl1,zahl2)
    println(minimum)
    // geht auch mit Double
    println(min(9.0,100.0))


    // max -> gibt den groesseren von 2 Werten zurueck
    println(max(100,9))
    // geht auch mit Double
    println(max(19.0,55.5))


    // STRING OPERATIONEN
    var string1: String = "Es sind endlich Ferien!"
    var string2: String = "endlich Ferien!"
    var string3: String = "ENDLICH FERIEN!"

    // length
    var lengthStr1: Int = string1.length
    println(lengthStr1)
    var lengthStr2: Int = string2.length
    var lengthStr3: Int = string3.length

    // Laenge aller Strings zusammen ausrechnen
    var lengthAllStrings: Int = lengthStr1 + lengthStr2 + lengthStr3
    println("Länge aller Strings zusammengerechnet (also $lengthStr1+$lengthStr2+$lengthStr3) ergibt: $lengthAllStrings")

    // contains
    var s1containsS2: Boolean = string1.contains(string2) // true
    println("Ist $string2 in $string1 enthalten? -> $s1containsS2")
    var s1containsS3: Boolean = string1.contains(string3) // false
    println("Ist $string3 in $string1 enthalten? -> $s1containsS3")

    // equals
    var s2EqualsS3: Boolean = string2.equals(string3)
    println("Ist $string2 = $string3 -> $s2EqualsS3")

    var equals = "blablabla".equals("blablabla")
    println("Ist blablabla = blablabla -> $equals")




}