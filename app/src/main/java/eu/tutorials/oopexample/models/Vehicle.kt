package eu.tutorials.oopexample.models

import android.util.Log
import android.widget.Toast

open class Vehicle {

    private var manufacturer: String? = null
    private var model: String? = null
    private var year: Int = 0

    fun Vehicle(manufacturer: String, model: String, year: Int) {
        this.manufacturer = manufacturer
        this.model = model
        this.year = year
    }


    fun printVehicleInfo() {

        Log.d("This vehicle is a", year.toString() + " " + manufacturer + " " + model)
    }
}