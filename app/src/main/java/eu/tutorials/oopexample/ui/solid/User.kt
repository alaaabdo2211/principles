package eu.tutorials.oopexample.ui.solid

import android.util.Log


//Single Responsibility principle

data class User(
    var id: Long,
    var name: String,
    var password: String,
    var age : Long,
    var height: Long,
    var isValid : Boolean
)

class AuthenticationService(){
    fun signIn(){
        Log.d("Logged in","Logged in")
    }

    fun signOut(){
        Log.d("Sign out","Sign out")

    }

    fun authorizeAuthToken(){

    }
//
//    fun authenticateEmail(){
//
//    }
//
//    fun authenticateMobileNumber(){
//
//    }
}