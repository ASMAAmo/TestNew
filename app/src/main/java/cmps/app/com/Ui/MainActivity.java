package cmps.app.com.Ui;

import androidx.lifecycle.Observer;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import androidx.lifecycle.ViewModelProviders;
import cmps.app.com.Adapter.PostsAdapter;
import cmps.app.com.Models.Article;
import cmps.app.com.Models.PostModel;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    private RecyclerView my_recycler_view;
    private LinearLayoutManager layoutManager;
    private PostsAdapter adapter;
    private ArrayList<Article> articleArrayList = new ArrayList<>();
    ProjectsViewmodel projectsViewmodel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialization();
        //
       projectsViewmodel.getArticleResponseLiveData().observe(this, new Observer<PostModel>() {
           @Override
           public void onChanged(@Nullable PostModel postModel) {
               List<Article> articles = postModel.getArticles();
               articleArrayList.addAll(articles);
               adapter.notifyDataSetChanged();

           }
       });

    }

    private void initialization() {
        my_recycler_view = (RecyclerView) findViewById(R.id.my_recycler_view);

        // use a linear layout manager
        layoutManager = new LinearLayoutManager(MainActivity.this);
        my_recycler_view.setLayoutManager(layoutManager);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        my_recycler_view.setHasFixedSize(true);

        // adapter
        adapter = new PostsAdapter(MainActivity.this, articleArrayList);
        my_recycler_view.setAdapter(adapter);

        // View Model
        projectsViewmodel = ViewModelProviders.of(this).get(ProjectsViewmodel.class);
    }

}
