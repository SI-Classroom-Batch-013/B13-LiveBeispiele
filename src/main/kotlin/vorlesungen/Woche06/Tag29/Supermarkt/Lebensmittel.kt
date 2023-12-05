package vorlesungen.Woche06.Tag29.Supermarkt

open class Lebensmittel(val name: String, protected var preis: Double, open val isVegan: Boolean = true) {
//    fun getPreis() : Double {
//        return this.preis
//    }

    private fun printInternalInfo(){
        println("---Geheime Informationen---")
        println("Preis: $preis")
    }

    open fun printInfo(){
        printInternalInfo()
        println("---Öffentliche Informationen---")
        println("$name ist lecker.")
    }

    override fun toString(): String {
        return """
            Name: $name
            Preis: $preis
            Vegan: $isVegan
        """.trimIndent()
    }



}


fun main() {
    var brot = Lebensmittel("Brot", 1.99)
    var lachs = Lebensmittel("Lachs", 5.99, false)

    // protected Preis rausschälen: getter Methode
    // brot.preis // geht nicht, ist protected
    //brot.getPreis()
    // brot.printInternalInfo() // geht nicht, ist private
    brot.printInfo()


}