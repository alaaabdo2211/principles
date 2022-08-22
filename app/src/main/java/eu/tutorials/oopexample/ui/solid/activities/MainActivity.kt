package eu.tutorials.oopexample.ui.solid.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import eu.tutorials.oopexample.R
import eu.tutorials.oopexample.models.abstraction.Triangle
import eu.tutorials.oopexample.models.abstraction.Circle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        main()
    }

    private fun main() {
        val circle = Circle(5.0)
        circle.printShapeName("Circle")
        val triangle = Triangle(2.0, 3.0, 4.0)
        triangle.printShapeName("Triangle")
    }
}