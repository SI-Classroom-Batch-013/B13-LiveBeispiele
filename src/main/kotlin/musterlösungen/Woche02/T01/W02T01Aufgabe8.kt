fun main() {
    val cars = mutableListOf("Toyota", "Volkswagen", "Honda", "Honda", "Nissan", "Volkswagen", "Toyota")
    cars.remove("Honda")
    cars.remove("Volkswagen")
    cars.remove("Toyota")
    print(cars)
}
