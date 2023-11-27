
fun printAlphabet(from: Char, to: Char) {
    for (char in from .. to) {
        print(char)
        if (char != to)
            print(", ")
    }
}

fun main() {
    printAlphabet('a', 'z')
}