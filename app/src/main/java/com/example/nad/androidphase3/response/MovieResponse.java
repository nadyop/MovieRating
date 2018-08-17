package com.example.nad.androidphase3.response;

import com.google.gson.annotations.SerializedName;

public class MovieResponse {

    @SerializedName("poster_path")
    private String posterPath;
    private String title;

    @SerializedName("vote_average")
    private Double rate;

    public String getPosterPath() {
        return posterPath;
    }

    public String getTitle() {
        return title;
    }

    public Double getRate() {
        return rate;
    }
}
