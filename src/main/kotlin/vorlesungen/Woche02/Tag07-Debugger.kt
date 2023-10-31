package vorlesungen.Woche02

fun main() {

    // values/Konstanten: können nicht bearbeitet werden
    val mutable: MutableList<String> = mutableListOf("Apfel", "Banane", "Brokkoli")
    val immutable: List<String> = listOf("Apfel", "Banane", "Brokkoli")
    println(mutable)

    val string: String = "Moin"
    //string = "Tschau"

    mutable.add("Kaffee")
    println(mutable)
    // val: mutable operationen overriden val, allerdings kann nicht eine brand neue referenz reingeschrieben werden:
    //mutable = mutableListOf("neue liste", "neues element")

    // IndexOutOfBoundsException
    println(mutable[mutable.size-1])

    val number1: Int = 5
    val number2: Int = 4

    val sum: Int = number1+number2




}