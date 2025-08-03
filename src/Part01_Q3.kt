fun greetings(name: String, age: Int) {
    println("Hello $name, you are $age years old.")
    if (age >= 18) {
        println("You are eligible for a driving license.")
    } else {
        println("You are NOT eligible for a driving license.")
    }
}

fun main() {
    greetings("Alex", 20)
    greetings("Nina", 16)
}
