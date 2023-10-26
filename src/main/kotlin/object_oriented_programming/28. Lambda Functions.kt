package object_oriented_programming

fun shape() {
    val circle1 = Circle(5.0)
    val circle2 = Circle(3.5)
    val triangle1 = Triangle(4.0, 4.0, 4.0)
    val triangle2 = Triangle(3.0, 3.0, 3.0)
    val rectangle1 = Rectangle(6.0)
    val rectangle2 = Rectangle(4.0, 3.0)

    var shapes = listOf(circle1, circle2, triangle1, triangle2, rectangle1, rectangle2)
    shapes = shapes.customFilter { it.perimeter() > 20.0 }.sortedBy { it.perimeter() }
    shapes.forEach { println("${it.name}: Perimeter = ${it.perimeter()}")}
}

fun List<Shape>.customFilter(filterFunction: (Shape) -> (Boolean)): List<Shape> {
    val resultList = mutableListOf<Shape>()
    for (shape in this) {
        if (filterFunction(shape)) {
            resultList.add(shape)
        }
    }
    return resultList
}

fun main() {
    var customTriple = CustomTriple<Int, String, Boolean>(3, "hello", true)
    customTriple.printTypes()

    val numbers = listOf(1..10)
//    val sum = numbers.sum { it % 2 == 1}
//    println("The sum is: $sum")
}


fun List<Int>.sum(sumUp: (Int) -> (Boolean)): Int {
    var total = 0
    this.forEach { if(sumUp(it)) total += it }
    return total
}

