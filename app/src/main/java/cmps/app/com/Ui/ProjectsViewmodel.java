package cmps.app.com.Ui;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.annotation.NonNull;

import androidx.lifecycle.ViewModel;
import cmps.app.com.Models.PostModel;

public class ProjectsViewmodel extends AndroidViewModel {
    private ArticleRepository articleRepository;
    private LiveData<PostModel> articleResponseLiveData;
    public ProjectsViewmodel(@NonNull Application application) {
        super(application);

        articleRepository = new ArticleRepository();
        this.articleResponseLiveData = articleRepository.getMovieArticles("movies", "84a7decf3110498ea372bd16dd0601e8");
    }

    public LiveData<PostModel> getArticleResponseLiveData() {
        return articleResponseLiveData;
    }

}
