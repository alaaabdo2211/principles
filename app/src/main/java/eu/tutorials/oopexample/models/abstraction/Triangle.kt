package eu.tutorials.oopexample.models.abstraction

import eu.tutorials.oopexample.models.abstraction.Shape
import kotlin.math.sqrt

class Triangle(var a: Double, var b: Double, var c: Double) : Shape() {
    override fun area(): Double {
        return sqrt((perimeter() / 2) * (perimeter() / 2 - a) * (perimeter() / 2 - b) * (perimeter() / 2 - c))

    }

    override fun perimeter(): Double {
        return a + b + c
    }
}