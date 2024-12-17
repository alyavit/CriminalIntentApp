package com.example.criminalintent.usecase

import com.example.criminalintent.IntentRepository
import com.example.criminalintent.data.IntentEntity

class GetIntentsFromDbUseCase(private val repository: IntentRepository) {
    suspend operator fun invoke(): List<IntentEntity> {
        return repository.getIntentsFromDb()
    }
}