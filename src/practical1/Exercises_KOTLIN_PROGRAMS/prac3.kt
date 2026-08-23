package practical1.Exercises_KOTLIN_PROGRAMS

open class Person(
    var firstName: String,
    var lastName: String,
    var age: Int
) {

    constructor() : this("Unknown", "Unknown", 0)

    constructor(firstName: String, lastName: String)
            : this(firstName, lastName, 0)

    open fun displayInformation() {
        println("First Name: $firstName")
        println("Last Name: $lastName")
        println("Age: $age")
    }
}

class Student : Person {

    var enrollmentNo: String
    var branch: String
    var studentClass: String
    var labBatch: String

    // Primary constructor
    constructor(
        firstName: String,
        lastName: String,
        age: Int,
        enrollmentNo: String,
        branch: String,
        studentClass: String,
        labBatch: String
    ) : super(firstName, lastName, age) {

        this.enrollmentNo = enrollmentNo
        this.branch = branch
        this.studentClass = studentClass
        this.labBatch = labBatch
    }

    // Secondary constructor
    constructor() : this(
        "Unknown",
        "Unknown",
        0,
        "Unknown",
        "Unknown",
        "Unknown",
        "Unknown"
    )

    constructor(
        firstName: String,
        lastName: String,
        age: Int,
        enrollmentNo: String
    ) : this(
        firstName,
        lastName,
        age,
        enrollmentNo,
        "Unknown",
        "Unknown",
        "Unknown"
    )

    override fun displayInformation() {

        println("First Name: $firstName")
        println("Last Name: $lastName")
        println("Age: $age")
        println("Enrollment No: $enrollmentNo")
        println("Branch: $branch")
        println("Class: $studentClass")
        println("Lab Batch: $labBatch")
        println("-------------------------")
    }
}

fun main() {

    val students = ArrayList<Student>()

    students.add(
        Student(
            "Anubhav",
            "Kumar",
            20,
            "23CE001",
            "CE",
            "5CE1",
            "A"
        )
    )

    students.add(
        Student(
            "Rahul",
            "Patel",
            21,
            "23CE002",
            "CE",
            "5CE1",
            "A"
        )
    )

    students.add(
        Student(
            "Amit",
            "Shah",
            20,
            "23CE003",
            "IT",
            "5IT1",
            "B"
        )
    )

    students.add(
        Student(
            "Priya",
            "Patel",
            21,
            "23CE004",
            "CSE",
            "5CSE1",
            "A"
        )
    )

    students.add(
        Student(
            "Neha",
            "Sharma",
            20,
            "23CE005",
            "CSE",
            "5CSE1",
            "B"
        )
    )

    println("===== STUDENT INFORMATION =====")

    for (student in students) {
        student.displayInformation()
    }
}