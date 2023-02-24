package com.abora.mealzapp.di

import com.abora.data.remote.ApiService
import com.abora.data.repo.MealsRepoImpl
import com.abora.domain.repo.MealsRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepoModule {

    @Provides
    fun provideRepo(apiService: ApiService): MealsRepo {
        return MealsRepoImpl(apiService)
    }

}