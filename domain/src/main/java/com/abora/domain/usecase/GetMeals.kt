package com.abora.domain.usecase

import com.abora.domain.repo.MealsRepo

class GetMeals(private val mealsRepo: MealsRepo) {
    suspend operator fun invoke() = mealsRepo.getMealsFromRemote()
}

// GetMeals() : call directly because fun is operator fun