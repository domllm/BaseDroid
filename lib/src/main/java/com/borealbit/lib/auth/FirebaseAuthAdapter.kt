//Add firebase Auth adapter
package com.borealbit.lib.auth

import android.app.Activity
import android.content.Intent
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class FirebaseAuthAdapter(private val activity: Activity) {
    private val auth: FirebaseAuth = Firebase.auth

    fun signInWithGoogle() {
        val googleProvider = GoogleAuthProvider(activity)
        activity.startActivityForResult(googleProvider.getSignInIntent(), GOOGLE_SIGN_IN_REQUEST_CODE)
    }

    fun signOut() {
        auth.signOut()
    }

    fun getCurrentUser(): FirebaseUser? {
        return auth.currentUser
    }

    fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == GOOGLE_SIGN_IN_REQUEST_CODE) {
            val googleProvider = GoogleAuthProvider(activity)
            googleProvider.handleSignInResult(data) { firebaseUser ->
                // Handle the firebase user
            }
        }
    }

    companion object {
        private const val GOOGLE_SIGN_IN_REQUEST_CODE = 9001
    }
}