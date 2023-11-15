fun main() {
    println(trainSoftware(true,true))
    println(trainSoftware(true, false))
    println(trainSoftware(false,true))
    println(trainSoftware(false,false))
}

fun trainSoftware(doorsAreClosed: Boolean, powerAvailable: Boolean): String {

    if(doorsAreClosed && powerAvailable) {
        return "Zug darf losfahren."
    }
    return "Zug muss stehen bleiben."
}