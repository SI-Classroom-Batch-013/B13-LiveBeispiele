package VORLESUNG.Woche05.Tag22
fun main(){
    // Ranges sind nicht das gleiche wie listen, ein paar Beispiele
    // Würfel
    val wuerfel: IntRange = 1..6
    // so wird eine Range ausgegeben
    println(wuerfel)

    // im Gegensatz zu einer Liste:
    println(wuerfel.toList())

    // auf Ranges ist random aufrufbar:
    println("Wuerfel rollt...")
    println(wuerfel.random())

    // abc
    val abc: CharRange = 'a'..'z'
    println(abc)
    println(abc.toList())


    // Ranges mit step werden zu Progressions
    // step = jede x. Zahl reinnehmen
    var numbers = 1..100 step 10
    println(numbers)
    println(numbers.toList())

    // DOWNTO: rückwärts
    var range: IntProgression = 10 downTo 1 step 2
    println(range)
    println(range.toList())

    // UNTIL: Exklusive der letzten Zahl
    var untilRange = 1 until 10
    println(untilRange.toList())






    var doubleRange = 1.0 .. 100.0
    println(doubleRange)
    // println(doubleRange.toList()) doubleRange kann nicht zur Liste werden, da nicht entschieden werden kann/dargestellt werden kann die unendlichen Nachkommastellen


}
