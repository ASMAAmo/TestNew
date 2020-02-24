package cmps.app.com.data;


import java.util.List;

import cmps.app.com.Models.PostModel;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RetrofitInterface {
    // get stages
    @GET("v2/everything/")
    Call<PostModel> getMovieArticles(
            @Query("q") String query,
            @Query("apikey") String apiKey
    );
}

