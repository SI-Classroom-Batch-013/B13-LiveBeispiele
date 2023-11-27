package vorlesungen.Woche06.Tag26

// Blaupause/Bauplan
class Person {

    // Attribute (= Variablen)
    // Daten/Atrribute: Default Initialisierung, das bedeutet: jede Instanz wird genau diese Eigenschaften haben, es sei denn, wir überschreiben sie in der main()
    var name: String = "Eddie"
    var age: Int = 18
    var dogs: MutableList<Dog> = mutableListOf(Dog(),Dog())

    // Verhalten/Methoden  ( = Funktionen): können mit dem Punktoperator auf einer Instanz aufgerufen werden
    fun greeting(){
        println("Hi, mein Name ist $name und ich bin $age Jahre alt!")
    }

    fun birthday() {
        age++
    }

    fun greetPerson(person: Person){
        println("Hallo, ${person.name}")
        println("Dein Hund heißt also ${person.dogs[0].name}")
    }

    fun greetString(name: String){
        println("Hallo, $name!")
        // this: dieses, von dieser Klasse
        println("Ich heiße ${this.name}")
    }

    fun printDogs(){
        dogs.forEach{ print("${it.name}, ") }
        println()

        // for (dog in dogs) println(dog.name)
    }

}

