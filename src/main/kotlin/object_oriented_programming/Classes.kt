package object_oriented_programming

fun main() {
    val rectangle = Rectangle(4.0, 3.2)
    println("Rectangle area is ${rectangle.area()}")
    println("Rectangle perimeter is ${rectangle.perimeter()}")
    println("Is Rectangle a square? ${rectangle.isSquare()}")

    val myCircle = Circle(5.0)
}