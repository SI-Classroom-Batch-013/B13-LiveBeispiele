package vorlesungen.Woche08Bonus

import java.io.File
import javax.sound.sampled.AudioInputStream
import javax.sound.sampled.AudioSystem
import javax.sound.sampled.Clip
import javax.sound.sampled.FloatControl


fun main() {

    val intro: String = "src/main/kotlin/vorlesungen/Woche08Bonus/audio/intro.wav"
    val magic: String = "src/main/kotlin/vorlesungen/Woche08Bonus/audio/magic.wav"

    playSound(intro)
    // Sound bricht sofort ab, da Programm in der nächsten Zeile schon beendet ist, brauchen heir Thread.sleep. Braucht ihr in eurem spiel nicht, da es ja ziemlich lange weiterläuft
    playSound(magic)
    Thread.sleep(20000)
}

fun playSound(audioPath: String) {
    // Erstelle eine Datei aus dem angegebenen Dateipfad
    val audio: File = File(audioPath)


    // Hier wird die audio in das Audiosystem gepackt
    val audioInput: AudioInputStream = AudioSystem.getAudioInputStream(audio)


    // es wird ein Clip-Objekt erstellt um den Sound abzuspielen
    val clip: Clip = AudioSystem.getClip()


    // clip öffnen, audio laden
    clip.open(audioInput)


    // Starte die Wiedergabe des Sounds
    clip.start()



    // Volume Control:
    // FloatControl steuert Audios (zB Lautstärke)
    // MASTER_GAIN ist eine spezielle Art von FloatControl, die die Lautstärke eines Audio-Clips regelt
    if (clip.isControlSupported(FloatControl.Type.MASTER_GAIN)) {
        val volume: FloatControl = clip.getControl(FloatControl.Type.MASTER_GAIN) as FloatControl
        // weiterer Code zur Steuerung der Lautstärke
        // 0.99 = fast das maximum, spektrum geht von 0 (kein Sound) bis 1 (lautester Sound)
        volume.value = volume.minimum+(0.99f*(volume.maximum-volume.minimum))
    } else {
        println("Master Gain control not supported.")
    }

}

