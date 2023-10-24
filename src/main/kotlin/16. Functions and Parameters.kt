fun main() {
    println("Enter a number: ")
    val number = readLine()?.toIntOrNull() ?: 0
    var sumTotal = 0
    for (i in 1..number) sumTotal += i
    println("The sum of the values from 1 to $number is $sumTotal")
}