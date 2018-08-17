package com.example.nad.androidphase3.retrofitt;

import com.example.nad.androidphase3.response.ListMovieResponse;
import com.example.nad.androidphase3.response.MovieResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieService {
//    api nya apa aja
    @GET("movie/popular")
    Call<ListMovieResponse<MovieResponse>> findPopularMovies(@Query("api_key") String apiKey);
}
