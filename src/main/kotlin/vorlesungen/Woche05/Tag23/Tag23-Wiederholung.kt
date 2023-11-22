package VORLESUNG.Woche05.Tag23
fun main(){
    val numbersList = mutableListOf(22,34,808,99,6,4,7)

    // 1. simple for in schleife mit liste an an ints
    for (number in numbersList) { // i in 0 until numbersList.size -> liefert indizes zurück, nicht die elemente
        println(number)
    }
    println()

    println("-----")

    for (i in 0 until numbersList.size){
        numbersList[i] = numbersList[i]*2
        println(numbersList[i])
    }


    println()

    println("-----")

    // 2. simple for schleife mit absteigender range an chars
    for (x in 'z' downTo 'a'){
        print("$x, ")
    }


    println()

    println("-----")

    // 3. größte Zahl in Liste finden
    // variable, die groesste zahl speichert
    var biggestNumber: Int = 0

    // schleife machen, die liste durchläuft
    for (nr in numbersList){
        // vergleichen, ob das aktuelle element groesser ist als das davor groesste element
        if (nr > biggestNumber){
            // aktuelles element als groesste zahl speichern
            biggestNumber = nr
        }
    }
    println("Biggest Number: $biggestNumber")



    println("-----")
    val movies = mutableListOf("Harry Potter", "Der Herr der Ringe", "The Hunger Games")

    // 4. strings modifizieren: an jeden Film eine 2 hängen
    for (i in movies.indices){
        movies[i] = movies[i] + " 2"
        println(movies[i])
    }


    println("-----")

    println(numbersList)
    // 5. jede 2. Zahl in Liste modifizieren
    for (index in 0 until numbersList.size) {
        if (index % 2 == 1) {
            numbersList[index] = numbersList[index] + 1
        }
    }
    println(numbersList)


}
