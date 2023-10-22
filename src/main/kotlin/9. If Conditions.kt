fun palindrome(stringLiteral: String) {
    if (stringLiteral.reversed() == stringLiteral) println("The string $stringLiteral is a Palindrome.")
    else println("The string $stringLiteral is not a Palindrome.")
}

fun main() {
    palindrome("22")
}