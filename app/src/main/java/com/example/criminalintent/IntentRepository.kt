package com.example.criminalintent

import com.example.criminalintent.data.IntentEntity

interface IntentRepository {

    suspend fun getIntentsFromDb(): List<IntentEntity>
    suspend fun getIntentByIdFromDb(id: Int): IntentEntity

    suspend fun saveIntentsToDb(intents: List<IntentEntity>)
    suspend fun updateIntentsInDb(intents: List<IntentEntity>)

    suspend fun removeIntentsFromDb(intents: List<IntentEntity>)
}