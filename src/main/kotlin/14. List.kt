fun reversedList(list: MutableList<Int>) {
    println("The 5 numbers in reverse order are:")
    for (i in list.reversed()) println(i)
}

fun main() {
    println("Please enter 5 numbers:")
    val fiveNumbers = mutableListOf<Int>()
    for(i in 1..5) {
        val input = readLine()?.toIntOrNull() ?: 0
        fiveNumbers.add(input)
    }

    reversedList(fiveNumbers)
}