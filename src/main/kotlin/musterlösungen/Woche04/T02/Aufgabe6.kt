fun main() {
    println("Größe: 180, Alter: 20, regnet nicht ${canIRide(180, 20, false)}")
    println("Größe: 150, Alter: 20, regnet nicht ${canIRide(150, 20, false)}")
    println("Größe: 180, Alter: 15, regnet nicht ${canIRide(180, 15, false)}")
    println("Größe: 150, Alter: 15, regnet nicht ${canIRide(150, 15, false)}")
    println("Größe: 150, Alter: 15, es regnet ${canIRide(150, 15, true)}")
    println("Größe: 180, Alter: 20, es regnet ${canIRide(180, 20, true)}")
    println("Größe: 180, Alter: 20, es regnet ${canIRide(182, 32, true)}")
}

fun canIRide(size: Int, age: Int, isRaining: Boolean): Boolean {
    return (size >= 170 || age >= 18) && !isRaining
}