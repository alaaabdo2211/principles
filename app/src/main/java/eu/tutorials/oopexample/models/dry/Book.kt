package eu.tutorials.oopexample.models.dry

import android.util.Log

class Book : Printable {
    override fun print() {
        Log.d("Book ", "Book Class")

    }
}