package practical1

class Car(
    val type: String,
    val model: String,
    val price: Double,
    val owner: String,
    val milesDriven: Double
) {

    fun getCarInformation() {
        println("Type: $type")
        println("Model: $model")
        println("Owner: $owner")
        println("Miles Driven: $milesDriven")
    }

    fun getOriginalPrice(): Double {
        return price
    }

    fun getCurrentPrice(): Double {
        val depreciation = milesDriven * 0.05
        return price - depreciation
    }

    fun displayCarInformation() {

        println("\n--- Car Information ---")
        getCarInformation()
        println("Original Price: ${getOriginalPrice()}")
        println("Current Price: ${getCurrentPrice()}")
    }
}

fun main() {

    val car = Car(
        "SUV",
        "Toyota Fortuner",
        4000000.0,
        "Anubhav",
        50000.0
    )

    car.displayCarInformation()
}