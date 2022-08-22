package eu.tutorials.oopexample.models.polymorphism

import eu.tutorials.oopexample.models.inheritance.Cars


//Overriding

class BMW : Cars() {

    override val speed = "Bmw speed 250Kmph"
}