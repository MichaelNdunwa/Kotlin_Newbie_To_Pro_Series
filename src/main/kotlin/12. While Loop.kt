import kotlin.math.pow

fun main() {
    println("Enter number 1:")
    val number1 = readLine()!!.toInt()

    println("Enter number 2:")
    val number2 = readLine()!!.toInt()

    println("$number1 to the power of $number2 is ${number1.toDouble().pow(number2)}")
}