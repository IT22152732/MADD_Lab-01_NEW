fun whoAmI(input: Any): String {
    return input::class.simpleName ?: "Unknown"
}

fun main() {
    println("Type: " + whoAmI(123))
    println("Type: " + whoAmI("Hello"))
    println("Type: " + whoAmI(true))
    println("Type: " + whoAmI(12.34))
}
