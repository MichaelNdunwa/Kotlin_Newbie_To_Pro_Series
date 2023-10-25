package object_oriented_programming

fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val reversedList = mutableListOf<Int>()

    list.reversed().forEach { reversedList.add(it) }

    
}