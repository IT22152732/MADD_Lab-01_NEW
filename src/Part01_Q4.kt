fun main() {
    val names = arrayOf("Alex", "Brian", "Chloe", "Diana", "Ethan")

    for ((index, name) in names.withIndex()) {
        println("Index $index: $name")
    }
}
