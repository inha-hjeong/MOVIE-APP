package com.farhan.tanvir.data.repository.dataSource
import com.farhan.tanvir.domain.model.Movie
import kotlinx.coroutines.flow.Flow

interface MovieLocalDataSource {
    fun getMoviesFromDB(movieId : Int): Flow<Movie>
}