package com.abora.domain.repo

import com.abora.domain.entity.CategoryResponse

interface MealsRepo {
    suspend fun getMealsFromRemote():CategoryResponse
}