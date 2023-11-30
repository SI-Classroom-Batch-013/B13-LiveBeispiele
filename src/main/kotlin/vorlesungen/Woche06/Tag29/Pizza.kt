package vorlesungen.Woche06.Tag29

open class Pizza(private var name: String, val ingredients: MutableList<Ingredient>, var price: Double = 5.0) {

    init {
        println("InitialisierungsLogik: Preis der ingredients anrechnen...")
        for (ingredient in ingredients) println("${ingredient.name}: ${ingredient.cost}")
        calculatePrice()
        println("Gesamtpreis Pizza $name: ${this.price}")
    }
    fun calculatePrice() {
        // den preis jeder zutat an den Preis ranrechnen
        // durch liste an zutaten iterieren
        // den preis jeder zutat an den gesamtpreis anrechnen
        ingredients.forEach { price += it.cost }

        // Alternative: for Schleife
//        for (ingredient in ingredients){
//            price += ingredient.cost
//        }
    }

    // Schnittstelle zum Zugriff auf privates Attribut name:
    fun getName(): String {
        return this.name
    }

    fun setName(newName: String) {
        this.name = newName
    }

    // protected Methode: nicht von aussen (zb in der main) aufrufbar, aber werden vererbt.
    protected open fun protectedMethode(){
        println("Hallo ich bin eine protected Methode, das heisst, ich bin nicht von der Main aus aufrufbar, aber ich werde vererbt.")
    }

    // private Methode: nicht von aussen (zb in der main) aufrufbar, werden NICHT vererbt!
    private fun privateMethode(){
        println("Hallo ich bin eine protected Methode, das heisst, ich bin nicht von der Main aus aufrufbar, aber ich werde vererbt.")
    }


}

class SpecialPizza(name: String, ingredients: MutableList<Ingredient>, special: String) : Pizza(name,ingredients) {

    // protectedMethode wurde vererbt, kann weiter benutzt werden
    override fun protectedMethode(){
        println("Protected Methode wurde vererbt und ueberschrieben im Special")
    }

    // privateMethode wurde nicht vererbt, kann dementsprechend auch nicht hier benutzt/overriden werden
//    override private fun privateMethode(){
//
//    }

}
fun main() {
    var thunfisch = Ingredient("Thunfisch", 1.99)
    var zwiebel = Ingredient("Zwiebel", 0.99)
    var mozarella = Ingredient("Mozarella", 1.49)
    var olive = Ingredient("Olive",2.49)

    val pizza = Pizza("Tonno", mutableListOf(thunfisch,zwiebel,mozarella,olive))
    val mozarellaPizza = Pizza("Mozarella", mutableListOf(mozarella))

    val hawaii = Pizza("Hawaii", mutableListOf(
        Ingredient("Ananas",0.99),
        Ingredient("Schinken", 2.99),
    )
    )

    var thunfischPreis = thunfisch.cost
    var ananasPreis = hawaii.ingredients[0].cost

    // extra getName Schnittstelle benutzen, um den Namen rauszuschälen
    pizza.getName()
    //pizza.name = "x" // nicht erlaubt, name ist private. brauchen getter und setter.
    pizza.setName("Negroni")
    //pizza.protectedMethode()
    //pizza.privateMethode()

    var specialPizza = SpecialPizza("Spezial", mutableListOf(thunfisch,zwiebel), "super special Sauce")
    //specialPizza.protectedMethode()
    //specialPizza.privateMethode()





}