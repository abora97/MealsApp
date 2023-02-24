package com.abora.data.remote

import com.abora.domain.entity.CategoryResponse
import retrofit2.http.GET


interface  ApiService {

    @GET("categories.php")
   suspend fun getMeals(): CategoryResponse

}