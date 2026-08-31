package practical1.Exercises_KOTLIN_PROGRAMS

fun main() {
//Without Third Variable

    var a = 10
    var b = 20

    println("Before Swap: a = $a, b = $b")

    a = a + b
    b = a - b
    a = a - b

    println("After Swap: a = $a, b = $b")

//    With Third Variable
    var c = 10
    var d = 20

    println("Before Swap: a = $c, b = $d")

    val temp = c
    c = d
    d = temp

    println("After Swap: a = $c, b = $d")
}