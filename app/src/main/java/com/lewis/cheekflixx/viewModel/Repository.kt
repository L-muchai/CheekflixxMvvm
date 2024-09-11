package com.lewis.cheekflixx.viewModel

import com.lewis.cheekflixx.models.Details
import com.lewis.cheekflixx.models.MoviesList
import com.lewis.cheekflixx.utils.RetrofitInstance
import retrofit2.Response

class Repository {
    suspend fun getMovieList(page:Int): Response<MoviesList>{
        return RetrofitInstance.api.getMovies(page)
    }
    suspend fun getDetailsById(id:Int): Response<Details>{
        return RetrofitInstance.api.getDetailsById(id = id)
    }
}