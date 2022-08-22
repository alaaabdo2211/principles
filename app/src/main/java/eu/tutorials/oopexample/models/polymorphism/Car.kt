package eu.tutorials.oopexample.models.polymorphism

import eu.tutorials.oopexample.models.inheritance.Vehicle

//Overriding

class Car : Vehicle() {

init {
    printVehicleInfo()
}

}