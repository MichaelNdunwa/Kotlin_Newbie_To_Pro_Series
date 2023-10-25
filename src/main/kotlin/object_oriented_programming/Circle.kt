package object_oriented_programming

import kotlin.math.*

class Circle constructor(val radius: Double) : Shape("Circle") {

    companion object {

    }
    init {
        println("$name created with radius = $radius")
        println("$name are is ${area()}")
        println("$name perimeter is ${perimeter()}")
    }

    override fun area() = radius.pow(2) * PI

    override fun perimeter() = 2 * radius * PI
}