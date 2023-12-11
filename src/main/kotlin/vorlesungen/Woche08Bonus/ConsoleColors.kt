
val RED = "\u001B[31m"

fun main() {
    val green = "\u001B[32m"
    val yellow = "\u001B[33m"
    val blue = "\u001B[34m"
    val magenta = "\u001B[35m"
    val cyan = "\u001B[36m"
    val bold = "\u001B[1m"
    val underline = "\u001B[4m"
    val backgroundYellow = "\u001B[43m"
    // alle zuvor verwendeten Formatierungen zurücksetzen, ohne bleiben sie auch in den nächsten printlns bestehen bestehen
    val reset = "\u001B[0m"

    // mit ausgelagerter Variable
    println("${RED}Roter ${reset} Text")
    // ohne ausgelagerte Variable
    println("\u001B[34mBlauer Text")
    println("Dieser Text sollte eigentlich wieder weiß sein... ${reset}")
    println("Dieser Text ist wieder weiß...")


    // Nutzung Ansi Escape Codes mit Variablen
    println("${RED}Roter Text${reset}")
    println("${green}Grüner Text${reset}")
    println("${yellow}Gelber Text${reset}")
    println("${blue}Blauer Text${reset}")
    println("${magenta}Magenta Text${reset}")
    println("${cyan}Cyan Text${reset}")

    println("${bold}Fetter Text${reset}")
    println("${underline}Unterstrichener Text${reset}")

    println("${backgroundYellow}Text mit gelbem Hintergrund${reset}")

    // Nutzung Ansi Escape Codes ohne Variable
    println("\u001b[31mRote Farbe $reset")
    println("Hier ist kein roter Code mehr drin...")

    // alle Textfarben mit Schleife ausdrucken

    for (i in 30..97){
        if (i in 38..89) continue
        print("\u001b[${i}m ${"%3d".format(i)} ")
    }

//    for (j in 90..97){
//        print("\u001b[${j}m $j ")
//    }

    // alle Hintergrundfarben mit Schleife ausdrucken

    // %3d.format: Wert von i in einem 3-stelligen, rechts ausgerichteten Format ausdrucken, wenn i weniger als 3 steleln hat
    println()
    for (i in 40..107){
        if (i in 48..99) continue
        print("\u001b[${i}m ${"%3d".format(i)} ")
    }
    println(reset)



    println("""
  ______             __        __                             ______                         __                         
 /      \           /  |      /  |                           /      \                       /  |                        
/${'$'}${'$'}${'$'}${'$'}${'$'}${'$'}  |  ______  ${'$'}${'$'} |  ____${'$'}${'$'} |  ______   _______        /${'$'}${'$'}${'$'}${'$'}${'$'}${'$'}  | __    __  _______   _${'$'}${'$'} |_     ______   __    __ 
${'$'}${'$'} | _${'$'}${'$'}/  /      \ ${'$'}${'$'} | /    ${'$'}${'$'} | /      \ /       \       ${'$'}${'$'} \__${'$'}${'$'}/ /  |  /  |/       \ / ${'$'}${'$'}   |   /      \ /  \  /  |
${'$'}${'$'} |/    |/${'$'}${'$'}${'$'}${'$'}${'$'}${'$'}  |${'$'}${'$'} |/${'$'}${'$'}${'$'}${'$'}${'$'}${'$'}${'$'} |/${'$'}${'$'}${'$'}${'$'}${'$'}${'$'}  |${'$'}${'$'}${'$'}${'$'}${'$'}${'$'}${'$'}  |      ${'$'}${'$'}      \ ${'$'}${'$'} |  ${'$'}${'$'} |${'$'}${'$'}${'$'}${'$'}${'$'}${'$'}${'$'}  |${'$'}${'$'}${'$'}${'$'}${'$'}${'$'}/    ${'$'}${'$'}${'$'}${'$'}${'$'}${'$'}  |${'$'}${'$'}  \/${'$'}${'$'}/ 
${'$'}${'$'} |${'$'}${'$'}${'$'}${'$'} |${'$'}${'$'} |  ${'$'}${'$'} |${'$'}${'$'} |${'$'}${'$'} |  ${'$'}${'$'} |${'$'}${'$'}    ${'$'}${'$'} |${'$'}${'$'} |  ${'$'}${'$'} |       ${'$'}${'$'}${'$'}${'$'}${'$'}${'$'}  |${'$'}${'$'} |  ${'$'}${'$'} |${'$'}${'$'} |  ${'$'}${'$'} |  ${'$'}${'$'} | __  /    ${'$'}${'$'} | ${'$'}${'$'}  ${'$'}${'$'}<  
${'$'}${'$'} \__${'$'}${'$'} |${'$'}${'$'} \__${'$'}${'$'} |${'$'}${'$'} |${'$'}${'$'} \__${'$'}${'$'} |${'$'}${'$'}${'$'}${'$'}${'$'}${'$'}${'$'}${'$'}/ ${'$'}${'$'} |  ${'$'}${'$'} |      /  \__${'$'}${'$'} |${'$'}${'$'} \__${'$'}${'$'} |${'$'}${'$'} |  ${'$'}${'$'} |  ${'$'}${'$'} |/  |/${'$'}${'$'}${'$'}${'$'}${'$'}${'$'}${'$'} | /${'$'}${'$'}${'$'}${'$'}  \ 
${'$'}${'$'}    ${'$'}${'$'}/ ${'$'}${'$'}    ${'$'}${'$'}/ ${'$'}${'$'} |${'$'}${'$'}    ${'$'}${'$'} |${'$'}${'$'}       |${'$'}${'$'} |  ${'$'}${'$'} |      ${'$'}${'$'}    ${'$'}${'$'}/ ${'$'}${'$'}    ${'$'}${'$'} |${'$'}${'$'} |  ${'$'}${'$'} |  ${'$'}${'$'}  ${'$'}${'$'}/ ${'$'}${'$'}    ${'$'}${'$'} |/${'$'}${'$'}/ ${'$'}${'$'}  |
 ${'$'}${'$'}${'$'}${'$'}${'$'}${'$'}/   ${'$'}${'$'}${'$'}${'$'}${'$'}${'$'}/  ${'$'}${'$'}/  ${'$'}${'$'}${'$'}${'$'}${'$'}${'$'}${'$'}/  ${'$'}${'$'}${'$'}${'$'}${'$'}${'$'}${'$'}/ ${'$'}${'$'}/   ${'$'}${'$'}/        ${'$'}${'$'}${'$'}${'$'}${'$'}${'$'}/   ${'$'}${'$'}${'$'}${'$'}${'$'}${'$'}${'$'} |${'$'}${'$'}/   ${'$'}${'$'}/    ${'$'}${'$'}${'$'}${'$'}/   ${'$'}${'$'}${'$'}${'$'}${'$'}${'$'}${'$'}/ ${'$'}${'$'}/   ${'$'}${'$'}/ 
                                                                      /  \__${'$'}${'$'} |                                        
                                                                      ${'$'}${'$'}    ${'$'}${'$'}/                                         
                                                                       ${'$'}${'$'}${'$'}${'$'}${'$'}${'$'}/                                          
    """.trimIndent())











}