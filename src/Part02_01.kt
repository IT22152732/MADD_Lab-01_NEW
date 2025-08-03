abstract class Employee(val name: String, val id: Int) {
    abstract fun displayDetails()
}

class TemporaryStaff(name: String, id: Int, val hourlyRate: Double) : Employee(name, id) {
    override fun displayDetails() {
        println("Temporary Staff - Name: $name, ID: $id, Hourly Rate: $hourlyRate")
    }
}

class PermanentStaff(name: String, id: Int, val salary: Double) : Employee(name, id) {
    override fun displayDetails() {
        println("Permanent Staff - Name: $name, ID: $id, Salary: $salary")
    }
}

fun main() {
    val temp = TemporaryStaff("Alice", 101, 500.0)
    val perm = PermanentStaff("Bob", 102, 90000.0)

    temp.displayDetails()
    perm.displayDetails()
}
