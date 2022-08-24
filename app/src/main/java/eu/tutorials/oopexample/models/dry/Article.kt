package eu.tutorials.oopexample.models.dry

import android.util.Log

class Article : Printable {
    override fun print() {
        Log.d("Article " , "Article Class")
    }
}