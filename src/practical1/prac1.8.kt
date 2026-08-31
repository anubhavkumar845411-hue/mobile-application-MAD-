package practical1

fun main() {

    val numbers = intArrayOf(50, 20, 80, 10, 40)
    println("Original Array: ${numbers.joinToString()}")


    println("\nUsing ranges:")
    for (i in numbers.indices) {
        print("${numbers[i]} ")
    }

    println("\nUsing downTo:")
    for (i in numbers.lastIndex downTo 0) {
        print("${numbers[i]} ")
    }


    println("\nUsing until:")
    for (i in 0 until numbers.size) {
        print("${numbers[i]} ")
    }


    val manualSort = numbers.copyOf()
    for (i in manualSort.indices) {
        for (j in 0 until manualSort.size - i - 1) {

            if (manualSort[j] > manualSort[j + 1]) {
                val temp = manualSort[j]
                manualSort[j] = manualSort[j + 1]
                manualSort[j + 1] = temp
            }
        }
    }

    println("\n\nSorted without built-in function:")
    println(manualSort.joinToString())


    val builtInSort = numbers.copyOf()
    builtInSort.sort()

    println("Sorted using built-in function:")
    println(builtInSort.joinToString())


    val matrix = arrayOf(
        intArrayOf(1, 2),
        intArrayOf(3, 4)
    )

    println("\n2D Array:")
    println(matrix.contentDeepToString())
}