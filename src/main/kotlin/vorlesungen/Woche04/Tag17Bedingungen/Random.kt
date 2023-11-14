package vorlesungen.Woche04.Tag17Bedingungen

import kotlin.random.Random

fun getRandomBoolean(): Boolean{
    return listOf(true, false).random()
    // Random.nextBoolean()
}

fun getRandomAge(): Int {
    return (0..90).random()
}

fun getRandomHeight(): Double {
    return Random.nextDouble(1.50, 1.95)
}

fun getRandomTemperature(): Int{
    return (-5..30).random()
}
