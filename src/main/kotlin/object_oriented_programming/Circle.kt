package object_oriented_programming

import kotlin.math.*
import kotlin.random.Random

class Circle constructor(val radius: Double) : Shape("Circle") {

    companion object {
        fun randomCircle(): Circle {
            val radius = Random.nextDouble(1.0, 4.0)
            return Circle(radius)
        }
    }
    init {
        if (radius < 0.0) throw NegativeNumberFormatException()
        println("$name created with radius = $radius")
        println("$name are is ${area()}")
        println("$name perimeter is ${perimeter()}")
    }

    override fun area() = radius.pow(2) * PI

    override fun perimeter() = 2 * radius * PI
}

class NegativeNumberFormatException() : Exception("You can't enter a negative radius try again.")

fun main() {
    Circle(-4.0)
}