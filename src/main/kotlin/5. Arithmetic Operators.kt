fun main() {
    val (x, y , z) = Triple(3, 4, 5)
    println("""
        x: $x
        x + y: ${x + y}
        x + y + z: ${x + y + z}
    """.trimIndent())
}