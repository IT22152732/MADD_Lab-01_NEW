fun whoAmI(value: Any): String {
    return value::class.simpleName ?: "Unknown"
}

fun main() {
    println("Type of 10: ${whoAmI(10)}")
    println("Type of 10.5: ${whoAmI(10.5)}")
    println("Type of \"Hello\": ${whoAmI("Hello")}")
    println("Type of true: ${whoAmI(true)}")
}
