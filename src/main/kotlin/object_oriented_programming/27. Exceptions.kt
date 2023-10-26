package object_oriented_programming

fun main() {
//    println(divide(4.0, 0.0))
    val division = try {
        divide(5.0, 0.0)
    } catch (e: DivisionByZeroException) {
        "Love"
    }
    println(division)

    print("Please enter a number: ")
    val input = try {
        readLine()?.toInt()
    } catch(e: NumberFormatException) {
        0
    } finally {
        println("The finally block will always be executed.")
    }

    println("You entered: $input")
}

class DivisionByZeroException() : Exception("Math Error: You can't divide with a zero divisor.")

fun divide(a: Double, b: Double): Double {
    if (b == 0.0) throw DivisionByZeroException()
    return a /b
}