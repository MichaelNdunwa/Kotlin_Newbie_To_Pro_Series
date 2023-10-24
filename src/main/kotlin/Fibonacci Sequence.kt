fun main() {
    println("Enter a number n > 1: ")
    val n = readLine()!!.toInt()
    val fibonacciSequence = mutableListOf(0, 1)
    for (i in 2 until n) {
        fibonacciSequence.add(fibonacciSequence[i-1] + fibonacciSequence[i-2])
    }
    println(fibonacciSequence)
}