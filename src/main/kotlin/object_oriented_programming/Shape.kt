package object_oriented_programming

abstract class Shape constructor(
    var name: String
) {

    init {
        println("I am the super class!")
    }

    fun changeName(newName: String) {
        name = newName
    }

    abstract fun area(): Double
    abstract fun perimeter(): Double
}