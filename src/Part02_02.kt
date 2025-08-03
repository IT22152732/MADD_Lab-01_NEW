interface Shape {
    fun setup()
    fun draw()
}

class Circle : Shape {
    override fun setup() {
        println("Setting up Circle")
    }

    override fun draw() {
        println("Drawing a Circle")
    }
}

class Square : Shape {
    override fun setup() {
        println("Setting up Square")
    }

    override fun draw() {
        println("Drawing a Square")
    }
}

fun main() {
    val circle = Circle()
    circle.setup()
    circle.draw()

    val square = Square()
    square.setup()
    square.draw()
}
