fun List<Int>.product(): Int {
    var totalProduct = 1
    this.forEach { totalProduct *= it}
    return totalProduct
}

fun main() {
    val list = listOf(1 ,2, 3, 4, 5, 6)
    println("The product of $list is ${list.product()}")
}