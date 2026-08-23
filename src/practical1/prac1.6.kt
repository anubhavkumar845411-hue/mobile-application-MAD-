package practical1

fun arithmeticOperations(a: Double, b: Double) {

    println("Addition: ${a + b}")
    println("Subtraction: ${a - b}")
    println("Multiplication: ${a * b}")

    if (b != 0.0) {
        println("Division: ${a / b}")
    } else {
        println("Division: Cannot divide by zero")
    }
}

fun main() {

    print("Enter first number: ")
    val a = readln().toDouble()

    print("Enter second number: ")
    val b = readln().toDouble()

    arithmeticOperations(a, b)
}