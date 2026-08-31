package practical1.Exercises_KOTLIN_PROGRAMS

open class Product(
    var productName: String,
    var quantity: Int,
    var amountPerQuantity: Double
) {

    constructor() : this("Unknown", 0, 0.0)

    constructor(productName: String, quantity: Int)
            : this(productName, quantity, 0.0)

    open fun displayInformation() {
        println("Product Name: $productName")
        println("Quantity: $quantity")
        println("Amount Per Quantity: $amountPerQuantity")
    }
}

class Laptop : Product {

    var cpuName: String
    var ramSize: Int
    var hddSize: Int


    constructor(
        productName: String,
        quantity: Int,
        amountPerQuantity: Double,
        cpuName: String,
        ramSize: Int,
        hddSize: Int
    ) : super(productName, quantity, amountPerQuantity) {

        this.cpuName = cpuName
        this.ramSize = ramSize
        this.hddSize = hddSize
    }

    constructor() : this(
        "Unknown",
        0,
        0.0,
        "Unknown",
        0,
        0
    )

    constructor(
        productName: String,
        cpuName: String,
        ramSize: Int
    ) : this(
        productName,
        1,
        0.0,
        cpuName,
        ramSize,
        0
    )

    override fun displayInformation() {

        println("Product Name: $productName")
        println("Quantity: $quantity")
        println("Amount Per Quantity: $amountPerQuantity")
        println("CPU: $cpuName")
        println("RAM: ${ramSize} GB")
        println("HDD: ${hddSize} GB")
        println("-------------------------")
    }
}

fun main() {

    val laptops = ArrayList<Laptop>()

    laptops.add(
        Laptop(
            "Dell Inspiron",
            2,
            55000.0,
            "Intel i5",
            8,
            512
        )
    )

    laptops.add(
        Laptop(
            "HP Pavilion",
            3,
            65000.0,
            "Intel i7",
            16,
            1024
        )
    )

    laptops.add(
        Laptop(
            "Lenovo IdeaPad",
            2,
            50000.0,
            "Ryzen 5",
            8,
            512
        )
    )

    laptops.add(
        Laptop(
            "Asus VivoBook",
            1,
            60000.0,
            "Intel i5",
            16,
            512
        )
    )

    laptops.add(
        Laptop(
            "Acer Aspire",
            4,
            45000.0,
            "Ryzen 3",
            8,
            512
        )
    )

    println("===== LAPTOP INFORMATION =====")

    for (laptop in laptops) {
        laptop.displayInformation()
    }
}