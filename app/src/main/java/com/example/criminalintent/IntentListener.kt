package com.example.criminalintent

import com.example.criminalintent.model.Intent

interface IntentListener {
    fun onIntentClicked(intent: Intent)
}