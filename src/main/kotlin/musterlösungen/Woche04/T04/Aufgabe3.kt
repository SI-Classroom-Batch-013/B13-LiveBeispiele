package musterlösungen.Woche04.T04

import java.lang.Exception
import kotlin.math.sqrt

fun main() {
    try {
        println(getPositiveSqrt(4.0))
        println(getPositiveSqrt(-3.0))
    } catch (e: Exception) {
        println(e)
    }
}

fun getPositiveSqrt(number: Double): Double {
    if(number < 0) {
        throw Exception("Number below 0 exception.")
    }
    return sqrt(number)
}