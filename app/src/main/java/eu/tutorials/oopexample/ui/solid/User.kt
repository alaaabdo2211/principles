package eu.tutorials.oopexample.ui.solid

import android.util.Log


//Single Responsibility principle

data class User(
    var id: Long,
    var name: String,
    var password: String
)

class AuthenticationService(){
    fun signIn(){
        Log.d("Logged in","Logged in")
    }

    fun signOut(){
        Log.d("Sign out","Sign out")

    }
}