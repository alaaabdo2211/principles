package eu.tutorials.oopexample.models.abstraction

import eu.tutorials.oopexample.models.abstraction.Shape

class Circle(var radius : Double) : Shape() {
    private val pi = 3.14

    override fun area(): Double {
            return radius * radius * pi
    }

    override fun perimeter(): Double {
        return 2 * radius * pi
    }
}