package com.abora.domain.repo

import com.abora.domain.entity.CategoryResponse

interface MealsRepo {
    fun getMealsFromRemote():CategoryResponse
}