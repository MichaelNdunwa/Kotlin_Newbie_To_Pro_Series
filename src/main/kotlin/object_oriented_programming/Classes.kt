package object_oriented_programming

fun maxArea(shape1: Shape, shape2: Shape): Double {
    val areaShape1 = shape1.area()
    val areaShape2 = shape2.area()
    return if(areaShape1 > areaShape2) areaShape1 else areaShape2
}

fun maxArea(shape1: Shape, shape2: Shape, shape3: Shape): Double {
    val maxAreaTwo = maxArea(shape1, shape2)
    val areaShape3 = shape3.area()
    return if(maxAreaTwo > areaShape3) maxAreaTwo else areaShape3
}

fun main() {
    val areaOfTwoShapes = maxArea(Rectangle(4.0), Rectangle(5.0))
    val areaOfThreeShapes = maxArea(Rectangle(4.0), Rectangle(5.0), Rectangle(6.0))

    println(areaOfTwoShapes)
    println(areaOfThreeShapes)
}