fun main() {
    val duration: Int = 37

    when  {
        duration >= 48 -> println("50€ Amazon Gutschein")
        duration >= 36 -> println("25€ Amazon Gutschein")
        duration >= 24 -> println("15€ Amazon Gutschein")
        duration >= 12 -> println("5€ Amazon Gutschein")
        else -> println("Kein Prämie")
    }

}