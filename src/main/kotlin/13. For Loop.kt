fun sumUpNumbers() {
    val numbers = arrayOf(1, 2, 3, 4, 5, 6, 6)
    var sum = 0
    for (i in numbers) sum += i
    println("The sum of the array is $sum")
}

fun averageOfNumbers() {
    val numbers = mutableListOf<Int>()
    println("Enter 5 numbers:")
    repeat(5) {
        numbers.add(readLine()!!.toInt())
    }

    var total = 0
    numbers.forEach { total += it }
    val average = total / 5.0
    println("The average value is $average")
}

fun main() {
//    sumUpNumbers()
    averageOfNumbers()
}