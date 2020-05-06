package com.developers.mvvmsample.utils

import com.developers.mvvmsample.model.MovieResult
import io.reactivex.Observable
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DataManager @Inject constructor(private var apiInterface: ApiInterface) {

    fun searchMovieQuery(key: String, query: String): Observable<MovieResult> {
        return apiInterface.searchMovies(key, query)
    }

}