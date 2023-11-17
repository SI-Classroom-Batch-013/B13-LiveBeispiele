fun main() {
    // Square
    val squareA = 3.0

    // Rectangle
    val recA = 2.0
    val recB = 3.0

    // Circle
    val rad = 5.0

    println("Die Fläche eines Quadrates mit der Seitenlänge $squareA beträgt ${squareArea(squareA)}")
    println("Der Umfang eines Quadrates mit der Seitenlänge $squareA beträgt ${squarePerimeter(squareA)}")

    println("Die Fläche eines Rechtecks mit den Seitenlängen $recA und $recB beträgt ${rectangleArea(recA, recB)}")
    println("Der Umfang eines Rechtecks mit den Seitenlängen $recA und $recB beträgt ${rectanglePerimeter(recA, recB)}")

    println("Die Fläche eines Kreises mit dem Radius $rad beträgt ${circleArea(rad)}")
    println("Der Umfang eines Kreises mit dem Radius $rad beträgt ${circlePerimeter(rad)}")

}

fun squareArea(a: Double): Double {
    return a * a
}

fun squarePerimeter(a: Double): Double {
    return 4 * a
}

fun rectangleArea(a: Double, b: Double): Double {
    return a * b
}

fun rectanglePerimeter(a: Double, b: Double): Double {
    return 2 * a + 2 * b
}

fun circleArea(r: Double): Double {
    return 3.1416 * r * r
}

fun circlePerimeter(r: Double): Double {
    return 3.1416 * r * 2
}