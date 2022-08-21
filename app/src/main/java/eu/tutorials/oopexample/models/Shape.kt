package eu.tutorials.oopexample.models

abstract class Shape {

    abstract fun area() : Double
    abstract fun perimeter() : Double
    fun printShapeName (name : String) {
        println("The name of this shape is $name")
    }
}