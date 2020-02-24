package cmps.app.com.Ui;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import android.util.Log;

import cmps.app.com.Models.PostModel;
import cmps.app.com.data.Constanturl;
import cmps.app.com.data.RetrofitInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ArticleRepository {
    private static final String TAG = ArticleRepository.class.getSimpleName();
    private RetrofitInterface apiRequest;

    public ArticleRepository() {
        apiRequest = Constanturl.getRetrofitInstance().create(RetrofitInterface.class);
    }

    public LiveData<PostModel> getMovieArticles(String query, String key) {
        final MutableLiveData<PostModel> data = new MutableLiveData<>();
        apiRequest.getMovieArticles(query, key)
                .enqueue(new Callback<PostModel>() {


                    @Override
                    public void onResponse(Call<PostModel> call, Response<PostModel> response) {
                        Log.d(TAG, "onResponse response:: " + response);



                        if (response.body() != null) {
                            data.setValue(response.body());

                            Log.d(TAG, "articles total result:: " + response.body().getTotalResults());
                            Log.d(TAG, "articles size:: " + response.body().getArticles().size());
                            Log.d(TAG, "articles title pos 0:: " + response.body().getArticles().get(0).getTitle());
                        }
                    }

                    @Override
                    public void onFailure(Call<PostModel> call, Throwable t) {
                        data.setValue(null);
                    }
                });
        return data;
    }
}
