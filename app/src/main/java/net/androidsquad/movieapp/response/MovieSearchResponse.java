package net.androidsquad.movieapp.response;

import androidx.annotation.NonNull;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import net.androidsquad.movieapp.models.MovieModel;
import java.util.List;

public class MovieSearchResponse {
    @SerializedName("total_results")
    @Expose()
    private int total_count;

    @SerializedName("results")
    @Expose()
    private List<MovieModel> movies;

    public List<MovieModel> getMovies(){
        return movies;
    }

    @NonNull
    @Override
    public String toString() {
        return "MovieSearchResponse{" +
                "total_count=" + total_count +
                ", movies=" + movies +
                '}';
    }
}
