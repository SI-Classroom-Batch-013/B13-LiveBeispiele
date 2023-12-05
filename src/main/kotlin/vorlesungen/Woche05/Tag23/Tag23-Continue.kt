package VORLESUNG.Woche05.Tag23

val DRINKS = mutableMapOf<String, Boolean>(
    "Wein" to true,
    "Bier" to true,
    "Saft" to false,
    "Gift" to true,
    "Milch" to false,
    "Schnaps" to true,
    "Wasser" to false
)
fun main() {

    val animals: List<String> = listOf("Tiger", "Löwe", "Gepard", "Tiger", "Maus", "Leopard", "Tiger")
    // continue beispiel: tiere drucken, die keine tiger sind

    for (animal in animals){
        if (animal == "Tiger"){
            continue
        } else {
            println("$animal gefunden.")
        }
    }

    for ((drink,alcohol) in DRINKS){

        if (drink == "Gift") {
            println("Gift gefunden! Abbrechen")
            break
        }
        if (!alcohol){
            continue
        } else{
            println("$drink ist alkoholisch ($alcohol)")
        }

    }



}


