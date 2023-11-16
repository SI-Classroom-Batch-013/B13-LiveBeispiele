package musterlösungen.Woche04.T04

import java.lang.Exception

fun main() {
    try {
        println(
            "Bitte geben Sie eine der folgenden Nummern ein um herauszufinden ob sie für unseren Park geeignet ist."
        )
        println(trees.keys)
        treeOutput(readln().toInt())
    } catch (e: Exception) {
        print(e.message)
    }

}

val trees = mapOf<Int, String>(
    1000 to "Eiche",
    1010 to "Buche",
    1020 to "Birke",
    1030 to "Weide",
    1040 to "Ahorn",
    2000 to "Tanne",
    2010 to "Kiefer",
    2020 to "Elbe",
    2030 to "Konifere",
    2040 to "Wachholder"
)

fun getTreeKind(treeNr: Int): String {
    return if ((treeNr % 2000) < 1000) "Nadelbaum"
    else "Laubbaum"
}

fun treeOutput(treeNr: Int) {
    val treeKind = getTreeKind(treeNr)
    if (!trees.keys.contains(treeNr))
        throw Exception("den Baum gibt es nicht - Programm bricht ab")
    print("Der Baum Nr. $treeNr, ${trees.get(treeNr)} ist von der Art $treeKind und somit ")
    if (!isValid(treeKind)) print("nicht ")
    print("für unseren Park geeignet")
}

fun isValid(treeKind: String): Boolean {
    return treeKind == "Nadelbaum"
}