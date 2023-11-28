package vorlesungen.Woche06.Tag27

// Konstruktor: gleiches Prinzip wie bei Funktoinen, alle im Konstruktor angegebenen Attribute muessen beim Initialisieren auch angegeben werden
class Cat(
    var name: String,
    var color: String,
    // default wert angeben: muss dann im Konstruktor bein Instanziieren nicht dabei sein
    var age: Int = 0) {

    var isSterilized: Boolean = false

}

fun main() {
    var cat1: Cat = Cat("Kitty",  "weiss")
    cat1.name = "Kitty's neuer Name"
    var cat2: Cat = Cat("Alfie","ginger" ,12)
    println(cat2.isSterilized) // false
    cat2.isSterilized = true



    println(cat1.name)
    println(cat2.name)

    var catWithConstructor: Cat = Cat("Betty",  "schwarz", 10)

}