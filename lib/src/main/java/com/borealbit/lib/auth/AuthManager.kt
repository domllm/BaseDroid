package com.borealbit.lib.auth

import android.app.Activity
import android.content.Intent
import com.google.firebase.auth.FirebaseAuth

class AuthManager(private val activity: Activity) {
    private val auth: FirebaseAuth = FirebaseAuth.getInstance()

    companion object {
        private const val GOOGLE_SIGN_IN_REQUEST_CODE = 9001
    }
}