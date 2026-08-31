package practical1

fun main() {

    val numbers = arrayListOf(10, 50, 20, 80, 30, 90, 40)

    var maximum = numbers[0]

    for (number in numbers) {
        if (number > maximum) {
            maximum = number
        }
    }

    println("ArrayList: $numbers")
    println("Maximum Number: $maximum")
}