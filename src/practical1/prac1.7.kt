package practical1

fun factorial(n: Int): Long {

    if (n <= 1)
        return 1

    return n * factorial(n - 1)
}

fun main() {

    print("Enter a number: ")
    val number = readln().toInt()

    println("Factorial of $number = ${factorial(number)}")
}