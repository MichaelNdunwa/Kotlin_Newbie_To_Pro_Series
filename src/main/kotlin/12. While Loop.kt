import kotlin.math.pow

fun main() {
    println("Enter number 1:")
    val number1 = readLine()?.toIntOrNull() ?: 0

    println("Enter number 2:")
    val number2 = readLine()?.toIntOrNull() ?: 0

    var pow = 0

    var counter = 0
    while (counter < number2) {
        pow += number1
        counter++
    }
    println("$number1 to the power of $number2 is $pow.")
}