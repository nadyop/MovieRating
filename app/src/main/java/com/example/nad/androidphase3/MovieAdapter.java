package com.example.nad.androidphase3;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.nad.androidphase3.response.MovieResponse;

import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {

    private List<MovieResponse> data;

//  deklarasi
    class MovieViewHolder extends RecyclerView.ViewHolder {

        private TextView textRating;
        private ImageView imagePoster;

        public MovieViewHolder(View itemView) {
            super(itemView);
            textRating = itemView.findViewById(R.id.text_rating);
            imagePoster = itemView.findViewById(R.id.image_poster);
//            imagePoster = itemView.findViewById(R.id.image_poster);
        }
    }

    public MovieAdapter(List<MovieResponse> data) {
        this.data = data;
    }
//  mana ui yg mau di looping
    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list_movie, parent, false);
        return new MovieViewHolder(view);
    }
//  proses looping item
    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {
        MovieResponse item = data.get(position);
//        holder.textRating.setText(item.getRate().toString());
        holder.textRating.setText(String.valueOf(item.getRate()));
//        get image from url. can used glide or picasso
        Glide.with(holder.imagePoster.getContext()).load("http://image.tmdb.org/t/p/w185/" +
                item.getPosterPath()).into(holder.imagePoster);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
