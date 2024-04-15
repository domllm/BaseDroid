//Add firebase Auth adapter
package com.borealbit.lib.auth

import android.app.Activity
import android.content.Intent
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.GoogleAuthProvider
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class FirebaseAuthAdapter(private val activity: Activity) {
    private val auth: FirebaseAuth = Firebase.auth

    fun sayHello(){
        println("Hello from FirebaseAuthAdapter")
    }

    companion object {
        private const val GOOGLE_SIGN_IN_REQUEST_CODE = 9001
    }
}