package com.abora.data.repo

import com.abora.data.remote.ApiService
import com.abora.domain.entity.CategoryResponse
import com.abora.domain.repo.MealsRepo

class MealsRepoImpl(private val apiService: ApiService) : MealsRepo {

    override suspend fun getMealsFromRemote(): CategoryResponse = apiService.getMeals()

}