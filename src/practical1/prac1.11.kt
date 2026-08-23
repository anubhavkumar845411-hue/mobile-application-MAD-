package practical1

class Matrix(
    private val rows: Int,
    private val cols: Int,
    private val data: Array<IntArray>
) {

    operator fun plus(other: Matrix): Matrix {

        val result = Array(rows) { IntArray(cols) }

        for (i in 0 until rows) {
            for (j in 0 until cols) {
                result[i][j] = data[i][j] + other.data[i][j]
            }
        }

        return Matrix(rows, cols, result)
    }

    operator fun minus(other: Matrix): Matrix {

        val result = Array(rows) { IntArray(cols) }

        for (i in 0 until rows) {
            for (j in 0 until cols) {
                result[i][j] = data[i][j] - other.data[i][j]
            }
        }

        return Matrix(rows, cols, result)
    }

    operator fun times(other: Matrix): Matrix {

        val result = Array(rows) { IntArray(other.cols) }

        for (i in 0 until rows) {
            for (j in 0 until other.cols) {
                for (k in 0 until cols) {
                    result[i][j] += data[i][k] * other.data[k][j]
                }
            }
        }

        return Matrix(rows, other.cols, result)
    }

    override fun toString(): String {

        return buildString {

            for (row in data) {
                append(row.joinToString(" "))
                append("\n")
            }
        }
    }
}

fun main() {

    val matrix1 = Matrix(
        2,
        2,
        arrayOf(
            intArrayOf(1, 2),
            intArrayOf(3, 4)
        )
    )

    val matrix2 = Matrix(
        2,
        2,
        arrayOf(
            intArrayOf(5, 6),
            intArrayOf(7, 8)
        )
    )

    println("Matrix 1:")
    println(matrix1)

    println("Matrix 2:")
    println(matrix2)

    println("Addition:")
    println(matrix1 + matrix2)

    println("Subtraction:")
    println(matrix1 - matrix2)

    println("Multiplication:")
    println(matrix1 * matrix2)
}