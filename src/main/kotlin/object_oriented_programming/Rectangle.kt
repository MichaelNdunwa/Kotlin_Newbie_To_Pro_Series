package object_oriented_programming

class Rectangle constructor(
    val a: Double,
    val b: Double
) : Shape("Rectangle") {

    constructor(a: Double) : this(a, a) // for same sides.
    constructor(a: Int, b: Int) : this(a.toDouble(), b.toDouble()) // for integers.

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