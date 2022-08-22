package eu.tutorials.oopexample.ui.solid


//Open-Closed Principle

interface Shape {

    fun getArea(): Double

}

class Rectangle : Shape {
    var length: Double = 0.0
    var height: Double = 0.0


    override fun getArea(): Double {
        return (length * height)
    }

}

class Circle : Shape {
    var radius: Double = 0.0

    override fun getArea(): Double {
        return (radius * radius * Math.PI)
    }

}

class AreaFactory {
    fun calculateArea(shapes: ArrayList<Shape>): Double {
        var area: Double = 0.0
        for (shape in shapes) {
            area += shape.getArea()
        }

        return area
    }
}