package pl.codepot.groovy_no_way_back.dto;

import com.google.gson.annotations.SerializedName;

public final class GitHubRepo {
    public long id;
    public String name;
    public String full_name;
    public GitHubUser owner;
    @SerializedName("private")
    public boolean isPrivate;
    public String htmlUrl;
    public String description;
    public boolean fork;
    public String url;
    public String forksUrl;
    public String keysUrl;
    public String collaboratorsUrl;
    public String teamsUrl;
    public String hooksUrl;
    public String issue_eventsUrl;
    public String eventsUrl;
    public String assigneesUrl;
    public String branchesUrl;
    public String tagsUrl;
    public String blobsUrl;
    public String gitTagsUrl;
    public String gitRefsUrl;
    public String treesUrl;
    public String statusesUrl;
    public String languagesUrl;
    public String stargazersUrl;
    public String contributorsUrl;
    public String subscribersUrl;
    public String subscriptionUrl;
    public String commitsUrl;
    public String gitCommitsUrl;
    public String commentsUrl;
    public String issueCommentUrl;
    public String contentsUrl;
    public String compareUrl;
    public String mergesUrl;
    public String archiveUrl;
    public String downloadsUrl;
    public String issuesUrl;
    public String pullsUrl;
    public String milestonesUrl;
    public String notificationsUrl;
    public String labelsUrl;
    public String releasesUrl;
    public String created_at;
    public String updated_at;
    public String pushed_at;
    public String gitUrl;
    public String sshUrl;
    public String cloneUrl;
    public String svnUrl;
    public String homepage;
    public int size;
    public int stargazersCount;
    public int watchersCount;
    public String language;
    public boolean has_issues;
    public boolean has_downloads;
    public boolean has_wiki;
    public boolean has_pages;
    public int forksCount;
    public String mirrorUrl;
    public int openIssuesCount;
    public int forks;
    public int openIssues;
    public int watchers;
    public String default_branch;
    public int networkCount;
    public int subscribersCount;
}
