fun main() {
    val simpleExpression = 3 > 4 || 4 > 3 && 4 <= 4  //true

    val bool = true; val x = 9; val y = 3; val z = 9
    val hardExpression = !(x != z) && bool || z > (x + y) && (!bool || y < z) //true

}