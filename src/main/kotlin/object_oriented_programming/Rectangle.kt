package object_oriented_programming

import kotlin.random.Random

class Rectangle constructor(
    val a: Double,
    val b: Double
) : Shape("Rectangle") {

    constructor(a: Double) : this(a, a) // for same sides.
    constructor(a: Int, b: Int) : this(a.toDouble(), b.toDouble()) // for integers.

    companion object {
        private val randomSide = Random.nextDouble(1.0, 7.0)
        fun randomRectangle(): Rectangle = Rectangle(randomSide)
    }

    init {
        println("$name created with a = $a and b = $b")
        println("Rectangle area is ${area()}")
        println("Rectangle perimeter is ${perimeter()}")
        println("Is Rectangle a square? ${isSquare()}")
    }

    override fun area() = a * b
    override fun perimeter() = 2 * a + 2 * b
    fun isSquare() = a == b
}