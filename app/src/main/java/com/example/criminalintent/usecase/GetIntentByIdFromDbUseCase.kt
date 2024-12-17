package com.example.criminalintent.usecase

import com.example.criminalintent.IntentRepository
import com.example.criminalintent.data.IntentEntity

class GetIntentByIdFromDbUseCase(private val repository: IntentRepository) {
    suspend operator fun invoke(id: Int): IntentEntity {
        return repository.getIntentByIdFromDb(id)
    }
}