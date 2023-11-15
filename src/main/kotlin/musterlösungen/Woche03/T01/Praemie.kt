fun main() {
    var months = readln().toInt()
    var year = months / 12

    when {
        year > 5 -> println("Kann nicht sein")
        year == 5 -> println("50€ Amazon Gutschein Prämie")
        year >= 4 -> println("35€ Amazon Gutschein Prämie")
        year >= 3 -> println("25€ Amazon Gutschein Prämie")
        year >= 2 -> println("15€ Amazon Gutschein Prämie")
        year >= 1 -> println("5€ Amazon Gutschein Prämie")
        else -> println("Keine Belohnung")
    }
}