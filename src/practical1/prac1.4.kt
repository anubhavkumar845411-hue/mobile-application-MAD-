package practical1

fun main() {

    print("Enter a number: ")
    val number = readln().toInt()

    println(
        if (number % 2 == 0)
            "$number is Even"
        else
            "$number is Odd"
    )
}