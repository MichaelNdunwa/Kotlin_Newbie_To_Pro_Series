fun alternatingSum(vararg numbers: Int): Int {
    var altSum = numbers[0]
    var toggle = true
    for (n in 1 until numbers.size) {
        if (toggle) {
            altSum -= numbers[n]
        } else {
            altSum += numbers[n]
        }
        toggle = !toggle
    }
    return altSum
}

fun main() {
    val sum = alternatingSum(3, 4, 5, 2, 1, 2, 3)
    println("The alternating sum is $sum")
}