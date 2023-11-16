fun main() {
    var monat: Int = readln().toInt()

    when (monat) {
        1 -> print("Januar")
        2 -> print("Februar")
        3 -> print("März")
        4 -> print("April")
        5 -> print("Mai")
        6 -> print("Juni")
        7 -> print("Juli")
        8 -> print("August")
        9 -> print("September")
        10 -> print("Oktober")
        11 -> print("November")
        12 -> print("Dezember")
        else -> print("Error!!!")

    }
}