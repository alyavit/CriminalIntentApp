package com.example.criminalintent.usecase

import com.example.criminalintent.IntentRepository
import com.example.criminalintent.data.IntentEntity

class SaveIntentsToDbUseCase(private val repository: IntentRepository) {
    suspend operator fun invoke(intents: List<IntentEntity>) {
        repository.saveIntentsToDb(intents)
    }
}