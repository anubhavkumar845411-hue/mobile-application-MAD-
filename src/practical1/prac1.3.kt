package practical1

fun main() {

    print("Enter Student Name: ")
    val name = readln()

    print("Enter Enrollment Number: ")
    val enrollmentNo = readln()

    print("Enter Branch: ")
    val branch = readln()

    print("Enter Class: ")
    val studentClass = readln()

    print("Enter Lab Batch: ")
    val labBatch = readln()

    println("\n--- Student Information ---")
    println("Name: $name")
    println("Enrollment No: $enrollmentNo")
    println("Branch: $branch")
    println("Class: $studentClass")
    println("Lab Batch: $labBatch")
}