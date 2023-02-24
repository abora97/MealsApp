package com.abora.mealzapp.di

import com.abora.domain.repo.MealsRepo
import com.abora.domain.usecase.GetMeals
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object UserCaseModule {

    @Provides
    fun provideUseCase(mealsRepo: MealsRepo):GetMeals{
        return GetMeals(mealsRepo)
    }
}