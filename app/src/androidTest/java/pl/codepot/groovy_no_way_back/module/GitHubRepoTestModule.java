package pl.codepot.groovy_no_way_back.module;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import pl.codepot.groovy_no_way_back.MainActivity;
import pl.codepot.groovy_no_way_back.api.repo.GitHubRepoApi;
import pl.codepot.groovy_no_way_back.dto.GitHubRepo;
import pl.codepot.groovy_no_way_back.factory.GitHubRepoFactory;
import rx.Observable;


@Module(
        complete = false,
        injects = MainActivity.class,
        library = true,
        overrides = true
)
@SuppressWarnings("unused")
public final class GitHubRepoTestModule {

    @Provides
    @Singleton
    GitHubRepoApi provideGitHubRepoApi() {
        return new GitHubRepoApi() {
            @Override
            public Observable<GitHubRepo> get(String username, String reponame) {
                return Observable.just(GitHubRepoFactory.newAndroidMaze());
            }
        };
    }
}
