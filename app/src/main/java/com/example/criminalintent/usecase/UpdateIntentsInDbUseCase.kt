package com.example.criminalintent.usecase

import com.example.criminalintent.IntentRepository
import com.example.criminalintent.data.IntentEntity

class UpdateIntentsInDbUseCase(private val repository: IntentRepository) {
    suspend operator fun invoke(intents: List<IntentEntity>) {
        repository.updateIntentsInDb(intents)
    }
}