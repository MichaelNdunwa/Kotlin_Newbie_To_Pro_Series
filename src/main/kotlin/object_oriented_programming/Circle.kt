package object_oriented_programming

import kotlin.math.*

class Circle constructor(val radius: Double) {
    init {
        println("Circle created with radius = $radius")
        println("Circle are is ${area()}")
        println("Circle perimeter is ${perimeter()}")
    }

    fun area() = radius.pow(2) * PI

    fun perimeter() = 2 * radius * PI
}