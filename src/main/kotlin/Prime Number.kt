fun main() {
    println("Please enter a number:")
    val input = readLine()?.toIntOrNull() ?: 0
    if (input.isPrime()) println("$input is a prime number.")
    else println("$input is not a prime number.")


}

fun Int.isPrime(): Boolean {
    for (n in 2 until this) {
        if (this % n == 0) return false
    }
    return true
}