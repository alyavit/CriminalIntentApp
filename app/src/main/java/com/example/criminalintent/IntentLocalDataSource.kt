package com.example.criminalintent

import com.example.criminalintent.data.IntentDao
import com.example.criminalintent.data.IntentEntity

class IntentLocalDataSource(private val intentDao: IntentDao) {
    suspend fun getIntents(): List<IntentEntity> {
        return intentDao.getAllIntents()
    }

    suspend fun getIntentById(id: Int): IntentEntity{
        return intentDao.getIntentById(id)
    }

    suspend fun saveIntents(intents: List<IntentEntity>) {
        intentDao.insertIntents(intents)
    }

    suspend fun removeIntents(intents: List<IntentEntity>) {
        intentDao.deleteIntents(intents)
    }

    suspend fun updateIntents(intents: List<IntentEntity>){
        intentDao.updateIntents(intents)
    }
}