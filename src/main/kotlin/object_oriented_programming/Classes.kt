package object_oriented_programming

fun main() {
//    Rectangle.randomRectangle()
    val a = 3.0; val b = 4.0; val c = 5.0; val d = 2.5; val height = 2.0
    val parallelogram = object : Shape("Parallelogram", a, b, height) {
        init {
            println("$name created with a = $a, b = $b and height = $height")
            println("$name area is ${area()}")
            println("$name perimeter is ${perimeter()}")
        }

        override fun area(): Double = a * height

        override fun perimeter(): Double = 2 * a + 2 * b

        fun isRectangle(): Boolean = height == b
    }
    println("Is the parallelogram a rectangle? ${parallelogram.isRectangle()}")

    // Trapezium:
    val trapezium = object : Shape("Trapezium", a, b, c, d, height) {

        init {
            println("$name created with a = $a, b = $b, c = $c, d = $d and height = $height")
            println("$name area is ${area()}")
            println("$name perimeter is ${perimeter()}")
        }

        override fun area(): Double = (a + c) * height / 2.0
        override fun perimeter(): Double = a + b + c + d

        fun isRectangle(): Boolean = a == c && b == d
    }
    println("Is the trapezium a rectangle? ${trapezium.isRectangle()}")
}