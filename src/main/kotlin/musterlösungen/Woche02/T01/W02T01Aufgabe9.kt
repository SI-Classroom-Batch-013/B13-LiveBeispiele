fun main() {
    val cars = mutableListOf("Toyota", "Volkswagen", "BMW", "Mercedes-Benz", "Ford", "Audi", "Nissan", "Honda")
    cars.remove("Volkswagen")
    cars.remove("Mercedes-Benz")
    cars.remove("Audi")
    cars.remove("Honda")
    val results = mutableListOf<String>()
    results.add("Toyota")
    results.add("BMW")
    results.add("Ford")
    results.add("Nissan")
    print(results)
}