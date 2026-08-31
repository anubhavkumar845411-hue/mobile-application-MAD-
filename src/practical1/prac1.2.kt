package practical1

fun main() {

    val intValue: Int = 100
    val doubleValue: Double = intValue.toDouble()

    val stringInt: String = "200"
    val convertedInt: Int = stringInt.toInt()

    val stringDouble: String = "25.50"
    val convertedDouble: Double = stringDouble.toDouble()

    println("Integer: $intValue")
    println("Integer to Double: $doubleValue")
    println("String to Integer: $convertedInt")
    println("String to Double: $convertedDouble")
}