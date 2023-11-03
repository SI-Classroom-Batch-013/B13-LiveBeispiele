fun main() {

    // TODO: Unter diesem Kommentar Aufgabe 8a) bearbeiten:

    val speedMap: Map<String, Double> = mapOf(
        "Auto" to 120.5,
        "Flugzeug" to 755.2,
        "Fahrrad" to 22.0,
        "Tretroller" to 15.7,
        "LKW" to 89.9
    )

    val speedKeys = speedMap.keys.toList()
    println(speedKeys)

    val speedValues = speedMap.values.toList()
    println(speedValues)


    // TODO: Unter diesem Kommentar Aufgabe 8b) bearbeiten:
    val maxSpeed = speedValues.max()
    val maxSpeedIndex = speedValues.indexOf(maxSpeed)

    println("Fastest: ${speedKeys[maxSpeedIndex]} - $maxSpeed kM/h")


}