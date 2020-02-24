package cmps.app.com.data;

/**
 * Created by ahmed on 3/7/2018.
 */
import android.app.ProgressDialog;

import java.util.List;

import cmps.app.com.Models.PostModel;
import cmps.app.com.Models.ProjectsModel;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class Constanturl {
    //Web service URL
   // http://zajelme.com/api/v1/test/test.php
    private static Retrofit retrofit = null;
    private static final String BASE_URL = "https://newsapi.org/";
    ProgressDialog mProgressDialog;
    private RetrofitInterface retrofitInterface;
    private static Constanturl instanse;

    public Constanturl(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        retrofitInterface = retrofit.create(RetrofitInterface.class);
    }

    public static Retrofit getRetrofitInstance() {
        if (retrofit == null) {
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
    /*  public static OkHttpClient okHttpClient = new OkHttpClient.Builder()
            .connectTimeout(300, TimeUnit.SECONDS)
            .readTimeout(300, TimeUnit.SECONDS).writeTimeout(100,TimeUnit.SECONDS).build();

    private static Retrofit.Builder builder =
            new Retrofit.Builder().client(okHttpClient)
                    .baseUrl(API_URL)
                    .addConverterFactory(GsonConverterFactory.create());


    public static <S> S createService(Class<S> serviceClass) {
        Retrofit retrofit = builder.client(httpClient.build()).build();
        return retrofit.create(serviceClass);
    }*/

}