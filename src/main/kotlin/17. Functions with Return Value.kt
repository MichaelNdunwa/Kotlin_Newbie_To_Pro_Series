fun search(listOfNumbers: List<Int>, searchItem: Int): Int {
    listOfNumbers.forEach {
        if(it == searchItem) return listOfNumbers.indexOf(searchItem)
    }
    return -1
}

fun main() {
    val list = listOf(3, 2, 5, 1, 5, 6, 7)
    println("The list looks like the following: $list")
    println("Search for this number: ")
    val input = readLine()?.toIntOrNull() ?: 0
    val index = search(list,input)
    println("The index of $input is $index")
}