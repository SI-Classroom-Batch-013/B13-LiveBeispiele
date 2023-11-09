package vorlesungen.Woche03.Tag14DocComments

fun main() {
    randomNumberV1()
    randomGreetingV1()
    randomMap()
    println("-------------------------------------------------------")

    randomNumberV2(25, 75)
    randomGreetingV2("ciao")
    printInfo("Michael", "Jordan", 60)
    println("-------------------------------------------------------")

    val randomNumber = randomNumberV3(1000, 2000)
    println("Meine zufällige Zahl ist: $randomNumber")
    // Alternativ: println("Meine zufällige Zahl ist: ${randomNumberV3(1000, 2000)}")
    val randomGreeting = randomGreetingV3("Servus")
    println("Meine Begrüßung ist: $randomGreeting")
    println("-------------------------------------------------------")
    myFunc(readln())

}

// 3 Funktionen ohne Rückgabewert und ohne Parameter

// randomNumberV1
fun randomNumberV1() {
    val randomNumber: Int = (1..1000).random()
    println("Meine zufällige Zahl ist: $randomNumber")
}

// randomGreetingV1
fun randomGreetingV1() {
    val randomGreeting: String = listOf<String>("Hi", "Hallo", "Bonjour", "Moin", "Hola").random()
    println("Meine zufällige Begrüßung ist: $randomGreeting")
}

fun randomMap() {
    var trommelPreis: Map<String, Int> = mapOf(
        "Sneardrum" to 200,
        "Tom-Tom" to 150
    )
    println("Unsere random map ist: $trommelPreis")
}


// 3 Funktionen ohne Rückgabewert und MIT Parameter

// randomNumberV2
fun randomNumberV2(min: Int, max: Int) {
    println("Meine zufällige Zahl ist: ${(min..max).random()}")
}

// randomGreetingV2
fun randomGreetingV2(greeting: String) {
    println("Meine Begrüßung ist: $greeting")
}

fun printInfo(firstName: String, secondName: String, age: Int) {
    println("Mein Name ist $firstName $secondName und ich bin $age Jahre alt.")
}


// 3 Funktionen MIT Rückgabewert und MIT Parameter

// randomNumberV3
fun randomNumberV3(min: Int, max: Int): Int {
    return (min..max).random()
}

// randomGreetingV3
fun randomGreetingV3(greeting: String): String {
    return greeting
}

fun myFunc(someString: String) {
    println("Das kommt von der readln() : $someString")
}