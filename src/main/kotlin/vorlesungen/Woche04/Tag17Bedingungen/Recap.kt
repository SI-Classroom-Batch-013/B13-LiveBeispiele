package vorlesungen.Woche04.Tag17Bedingungen

var isRaining: Boolean = getRandomBoolean()
var isSunny: Boolean = getRandomBoolean()

fun main(){

    println("Regnet es heute? $isRaining")
    println("Scheint die Sonne? $isSunny")

    if (isRainbow()){
        println("🌈")
    }


    // In-Operator
    var bool1 = "Apfel" in listOf("Apfel", "Banane", "Kekse")
    println("Bool 1: $bool1")

    var bool2 = "Apfel" in listOf("Schokolade", "Banane", "Kekse")
    println("Bool 2: $bool2")

    var bool3 = listOf("Apfel", "Banane", "Kekse").contains("Apfel")
    println("Bool 3: $bool3")

    val bool4 = "%" in "tejhfdsjafhdsgafga"
    println("Bool 4: $bool4")

    val bool5 = "Hi" in "jdshfjHidjhjafjhasdjf"
    println("Bool 5: $bool5")


    var alter = getRandomAge()
    val bool6 = alter in 1..17
    println("Bool 6: $bool6")


}

fun weekdayAsString(weekday: Int): String{
    return when (weekday){
        1 ->  "Monday"
        2 ->  "Tuesday"
        3 ->  "Wednesday"
        4 ->  "Thursday"
        5 ->  "Friday"
        6 ->  "Saturday"
        7 ->  "Sunday"
        else ->  "not real day"
    }
}

fun isRainbow(): Boolean{
    if (isRaining){
        if (isSunny){
            return true
        }
    }

    return false
}