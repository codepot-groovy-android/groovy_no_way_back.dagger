package pl.codepot.groovy_no_way_back;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import javax.inject.Inject;

import pl.codepot.groovy_no_way_back.adapter.GitHubAdapter;
import pl.codepot.groovy_no_way_back.api.user.GitHubUserSearchApi;
import pl.codepot.groovy_no_way_back.dagger.Injector;
import pl.codepot.groovy_no_way_back.dto.GitHubSearchResults;
import pl.codepot.groovy_no_way_back.dto.GitHubUser;
import rx.functions.Action1;

public final class ChooseUserActivity extends Activity {

    @Inject
    GitHubUserSearchApi gitHubUserSearchApi;
    GitHubAdapter adapter = new GitHubAdapter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Injector.inject(this, this);
        setContentView(R.layout.choose_user_activity);
        RecyclerView usersListView = (RecyclerView) findViewById(R.id.users_list_view);
        usersListView.setLayoutManager(new LinearLayoutManager(this));
        usersListView.setAdapter(adapter);
    }

    @Override
    protected void onResume() {
        super.onResume();
        gitHubUserSearchApi.get("abc")
                .subscribe(new Action1<GitHubSearchResults<GitHubUser>>() {
                    @Override
                    public void call(GitHubSearchResults<GitHubUser> gitHubSearchResults) {
                        displaySearchResults(gitHubSearchResults);
                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                        handleError(throwable);
                    }
                });
    }

    private void displaySearchResults(GitHubSearchResults<GitHubUser> gitHubSearchResults) {
        for (GitHubUser gitHubUser : gitHubSearchResults.items) {
            adapter.add(gitHubUser);
        }
    }

    private void handleError(Throwable throwable) {

    }
}
