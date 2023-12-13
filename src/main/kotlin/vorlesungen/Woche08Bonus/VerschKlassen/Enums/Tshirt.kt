package Enums

enum class Marke{
    ADIDAS, NIKE
}

enum class ClothSize{
    XS, S, M, L, XL
}

class Tshirt (val marke: Marke, val groesse: ClothSize) {
}

fun groessenWahl(): ClothSize{
    var size: ClothSize?

    do {
        println("wählen sie ihre Tshirt Größe")
        var eingabe = readln()

        size = when (eingabe) {
            "L", "l", "large", "groß" -> ClothSize.L
            "XS" -> ClothSize.XS
            else -> null
        }
    } while (size == null)

    return size
}

fun main(){
    val shirt1 = Tshirt(Marke.ADIDAS, groessenWahl())

    var gueltigeGroessen: MutableMap<ClothSize, Boolean> = mutableMapOf(
        ClothSize.XS to false,
        ClothSize.S to true,
        ClothSize.M to true,
        ClothSize.L to false,
        ClothSize.XL to false,
    )

    var groessePerMarke: MutableMap<Marke, List<ClothSize>> = mutableMapOf(
        Marke.ADIDAS to listOf(ClothSize.L, ClothSize.XL),
        Marke.NIKE to ClothSize.entries
    )



}
