fun main() {
    println("Please enter your age:")
    val age = readLine()?.toInt()

    if (age != null) {
        when(age) {
            in 0..18 -> println("You're not an adult yet.")
            in 18..65 -> println("You're an adult.")
            else -> println("You're really really old.")
        }
    }
}