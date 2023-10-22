import kotlin.math.*

fun volumeOfSphere(radius: Double) =
    println("The volume of the sphere with the radius $radius is ${0.75 * PI * radius.pow(3)}")

fun main() = volumeOfSphere(5.5)