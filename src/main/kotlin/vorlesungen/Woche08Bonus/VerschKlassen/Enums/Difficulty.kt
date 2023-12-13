package VORLESUNG.Woche08.Enums

import vorlesungen.Woche07Wiederholung.Beutel



enum class Difficulty {
    // jeder Enum-Eintrag kann seine eigene Logik haben
    EASY {
        override fun getDifficultyMultiplier(): Double {
            return 0.5
        }

        override fun getDescription(): String {
            return "Leicht"
        }
        fun doSomething(){
            println("Jedes Element kann auch eine neue, von den anderen unabhängige Funktion haben")
        }
    },
    MEDIUM {
        override fun getDifficultyMultiplier(): Double {
            return 1.0
        }

        override fun getDescription(): String {
            return "Mittel"
        }
    },
    HARD {
        override fun getDifficultyMultiplier(): Double {
            return 1.5
        }

        override fun getDescription(): String {
            return "Schwer"
        }
        // ; nach Enum-Einträgen verlangt
    };

    // abstrakte Funktionen: keine Implementierung, dienen als Vertragsvereinbarungen, die von den einzelnen Enum-Werten erfüllt werden müssen. Wenn einer der Enum-Werte diese beiden funktionen nicht implementiert, gibt es einen Compile-Fehler
    abstract fun getDifficultyMultiplier(): Double
    abstract fun getDescription(): String
}

fun main() {
    val selectedDifficulty = Difficulty.MEDIUM

    println("Du hast die Schwierigkeitsstufe ${selectedDifficulty.getDescription()} ausgewählt.")
    val multiplier = selectedDifficulty.getDifficultyMultiplier()
    println("Der Schwierigkeitsmultiplikator beträgt $multiplier")
}
