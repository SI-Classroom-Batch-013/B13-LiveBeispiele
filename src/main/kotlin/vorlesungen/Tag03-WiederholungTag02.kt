package vorlesungen

fun main() {
    // Wiederholung

    // String
    var cityName: String = "Berlin"
    val birthCity: String = "Hamburg"

    println("Das hier ist meine Lieblingsstadt: $cityName")
    println("Hier bin ich geboren: $birthCity")

    // Int

    var age: Int = 30
    println("Mein Alter vor meinem Geburtstag: $age")
    // ein Jahr ist vergangen und das alter hat sich um 1 Jahr erhöht
    age = 31
    println("Mein Alter nach meinem Geburtstag: $age")
    val numberOfMonths: Int = 12

    // Double
    val pi: Double = 3.14
    println("Die Mathematische Konstante pi beträgt $pi")

    // Boolean
    var isWeekend: Boolean = false
    println("Heute is Mittwoch, ist es das Wochenende? -> $isWeekend")

    // jetzt ist Sonntag:
    isWeekend = true
    println("Heute is Sonntag, ist es das Wochenende? -> $isWeekend")

    println("$cityName,\n$birthCity,\n$pi, \n$isWeekend")
    println("-----")
    println(cityName)
    println(birthCity)
    println(pi)
    println(isWeekend)

    print("Hi ")
    print("ich ")
    print("liebe ")
    print("Kotlin")
    println("")
}