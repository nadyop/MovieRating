package com.example.nad.androidphase3.response;

import java.util.List;

public class ListMovieResponse<T> {
    private List<T> results;

    public List<T> getResults() {
        return results;
    }

    public void setResults(List<T> results) {
        this.results = results;
    }
}
