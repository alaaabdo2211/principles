package eu.tutorials.oopexample.models.polymorphism

import eu.tutorials.oopexample.models.inheritance.Vehicle

//Overriding


open class Car : Vehicle() {
    open val speed: String = "Average speed 200Kmph"

    init {
        printVehicleInfo()
    }

}