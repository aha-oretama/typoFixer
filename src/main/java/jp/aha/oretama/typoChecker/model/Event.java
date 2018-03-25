package jp.aha.oretama.typoChecker.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author aha-oretama
 */

//{
//  "action": "opened",
//  "number": 1,
//  "pull_request": {
//    "url": "https://api.github.com/repos/baxterthehacker/public-repo/pulls/1",
//    "id": 34778301,
//    "html_url": "https://github.com/baxterthehacker/public-repo/pull/1",
//    "diff_url": "https://github.com/baxterthehacker/public-repo/pull/1.diff",
//    "patch_url": "https://github.com/baxterthehacker/public-repo/pull/1.patch",
//    "issue_url": "https://api.github.com/repos/baxterthehacker/public-repo/issues/1",
//    "number": 1,
//    "state": "open",
//    "locked": false,
//    "title": "Update the README with new information",
//    "user": {
//      "login": "baxterthehacker",
//      "id": 6752317,
//      "avatar_url": "https://avatars.githubusercontent.com/u/6752317?v=3",
//      "gravatar_id": "",
//      "url": "https://api.github.com/users/baxterthehacker",
//      "html_url": "https://github.com/baxterthehacker",
//      "followers_url": "https://api.github.com/users/baxterthehacker/followers",
//      "following_url": "https://api.github.com/users/baxterthehacker/following{/other_user}",
//      "gists_url": "https://api.github.com/users/baxterthehacker/gists{/gist_id}",
//      "starred_url": "https://api.github.com/users/baxterthehacker/starred{/owner}{/repo}",
//      "subscriptions_url": "https://api.github.com/users/baxterthehacker/subscriptions",
//      "organizations_url": "https://api.github.com/users/baxterthehacker/orgs",
//      "repos_url": "https://api.github.com/users/baxterthehacker/repos",
//      "events_url": "https://api.github.com/users/baxterthehacker/events{/privacy}",
//      "received_events_url": "https://api.github.com/users/baxterthehacker/received_events",
//      "type": "User",
//      "site_admin": false
//    },
//    "body": "This is a pretty simple change that we need to pull into master.",
//    "created_at": "2015-05-05T23:40:27Z",
//    "updated_at": "2015-05-05T23:40:27Z",
//    "closed_at": null,
//    "merged_at": null,
//    "merge_commit_sha": null,
//    "assignee": null,
//    "milestone": null,
//    "commits_url": "https://api.github.com/repos/baxterthehacker/public-repo/pulls/1/commits",
//    "review_comments_url": "https://api.github.com/repos/baxterthehacker/public-repo/pulls/1/comments",
//    "review_comment_url": "https://api.github.com/repos/baxterthehacker/public-repo/pulls/comments{/number}",
//    "comments_url": "https://api.github.com/repos/baxterthehacker/public-repo/issues/1/comments",
//    "statuses_url": "https://api.github.com/repos/baxterthehacker/public-repo/statuses/0d1a26e67d8f5eaf1f6ba5c57fc3c7d91ac0fd1c",
//    "head": {
//      "label": "baxterthehacker:changes",
//      "ref": "changes",
//      "sha": "0d1a26e67d8f5eaf1f6ba5c57fc3c7d91ac0fd1c",
//      "user": {
//        "login": "baxterthehacker",
//        "id": 6752317,
//        "avatar_url": "https://avatars.githubusercontent.com/u/6752317?v=3",
//        "gravatar_id": "",
//        "url": "https://api.github.com/users/baxterthehacker",
//        "html_url": "https://github.com/baxterthehacker",
//        "followers_url": "https://api.github.com/users/baxterthehacker/followers",
//        "following_url": "https://api.github.com/users/baxterthehacker/following{/other_user}",
//        "gists_url": "https://api.github.com/users/baxterthehacker/gists{/gist_id}",
//        "starred_url": "https://api.github.com/users/baxterthehacker/starred{/owner}{/repo}",
//        "subscriptions_url": "https://api.github.com/users/baxterthehacker/subscriptions",
//        "organizations_url": "https://api.github.com/users/baxterthehacker/orgs",
//        "repos_url": "https://api.github.com/users/baxterthehacker/repos",
//        "events_url": "https://api.github.com/users/baxterthehacker/events{/privacy}",
//        "received_events_url": "https://api.github.com/users/baxterthehacker/received_events",
//        "type": "User",
//        "site_admin": false
//      },
//      "repo": {
//        "id": 35129377,
//        "name": "public-repo",
//        "full_name": "baxterthehacker/public-repo",
//        "owner": {
//          "login": "baxterthehacker",
//          "id": 6752317,
//          "avatar_url": "https://avatars.githubusercontent.com/u/6752317?v=3",
//          "gravatar_id": "",
//          "url": "https://api.github.com/users/baxterthehacker",
//          "html_url": "https://github.com/baxterthehacker",
//          "followers_url": "https://api.github.com/users/baxterthehacker/followers",
//          "following_url": "https://api.github.com/users/baxterthehacker/following{/other_user}",
//          "gists_url": "https://api.github.com/users/baxterthehacker/gists{/gist_id}",
//          "starred_url": "https://api.github.com/users/baxterthehacker/starred{/owner}{/repo}",
//          "subscriptions_url": "https://api.github.com/users/baxterthehacker/subscriptions",
//          "organizations_url": "https://api.github.com/users/baxterthehacker/orgs",
//          "repos_url": "https://api.github.com/users/baxterthehacker/repos",
//          "events_url": "https://api.github.com/users/baxterthehacker/events{/privacy}",
//          "received_events_url": "https://api.github.com/users/baxterthehacker/received_events",
//          "type": "User",
//          "site_admin": false
//        },
//        "private": false,
//        "html_url": "https://github.com/baxterthehacker/public-repo",
//        "description": "",
//        "fork": false,
//        "url": "https://api.github.com/repos/baxterthehacker/public-repo",
//        "forks_url": "https://api.github.com/repos/baxterthehacker/public-repo/forks",
//        "keys_url": "https://api.github.com/repos/baxterthehacker/public-repo/keys{/key_id}",
//        "collaborators_url": "https://api.github.com/repos/baxterthehacker/public-repo/collaborators{/collaborator}",
//        "teams_url": "https://api.github.com/repos/baxterthehacker/public-repo/teams",
//        "hooks_url": "https://api.github.com/repos/baxterthehacker/public-repo/hooks",
//        "issue_events_url": "https://api.github.com/repos/baxterthehacker/public-repo/issues/events{/number}",
//        "events_url": "https://api.github.com/repos/baxterthehacker/public-repo/events",
//        "assignees_url": "https://api.github.com/repos/baxterthehacker/public-repo/assignees{/user}",
//        "branches_url": "https://api.github.com/repos/baxterthehacker/public-repo/branches{/branch}",
//        "tags_url": "https://api.github.com/repos/baxterthehacker/public-repo/tags",
//        "blobs_url": "https://api.github.com/repos/baxterthehacker/public-repo/git/blobs{/sha}",
//        "git_tags_url": "https://api.github.com/repos/baxterthehacker/public-repo/git/tags{/sha}",
//        "git_refs_url": "https://api.github.com/repos/baxterthehacker/public-repo/git/refs{/sha}",
//        "trees_url": "https://api.github.com/repos/baxterthehacker/public-repo/git/trees{/sha}",
//        "statuses_url": "https://api.github.com/repos/baxterthehacker/public-repo/statuses/{sha}",
//        "languages_url": "https://api.github.com/repos/baxterthehacker/public-repo/languages",
//        "stargazers_url": "https://api.github.com/repos/baxterthehacker/public-repo/stargazers",
//        "contributors_url": "https://api.github.com/repos/baxterthehacker/public-repo/contributors",
//        "subscribers_url": "https://api.github.com/repos/baxterthehacker/public-repo/subscribers",
//        "subscription_url": "https://api.github.com/repos/baxterthehacker/public-repo/subscription",
//        "commits_url": "https://api.github.com/repos/baxterthehacker/public-repo/commits{/sha}",
//        "git_commits_url": "https://api.github.com/repos/baxterthehacker/public-repo/git/commits{/sha}",
//        "comments_url": "https://api.github.com/repos/baxterthehacker/public-repo/comments{/number}",
//        "issue_comment_url": "https://api.github.com/repos/baxterthehacker/public-repo/issues/comments{/number}",
//        "contents_url": "https://api.github.com/repos/baxterthehacker/public-repo/contents/{+path}",
//        "compare_url": "https://api.github.com/repos/baxterthehacker/public-repo/compare/{base}...{head}",
//        "merges_url": "https://api.github.com/repos/baxterthehacker/public-repo/merges",
//        "archive_url": "https://api.github.com/repos/baxterthehacker/public-repo/{archive_format}{/ref}",
//        "downloads_url": "https://api.github.com/repos/baxterthehacker/public-repo/downloads",
//        "issues_url": "https://api.github.com/repos/baxterthehacker/public-repo/issues{/number}",
//        "pulls_url": "https://api.github.com/repos/baxterthehacker/public-repo/pulls{/number}",
//        "milestones_url": "https://api.github.com/repos/baxterthehacker/public-repo/milestones{/number}",
//        "notifications_url": "https://api.github.com/repos/baxterthehacker/public-repo/notifications{?since,all,participating}",
//        "labels_url": "https://api.github.com/repos/baxterthehacker/public-repo/labels{/name}",
//        "releases_url": "https://api.github.com/repos/baxterthehacker/public-repo/releases{/id}",
//        "created_at": "2015-05-05T23:40:12Z",
//        "updated_at": "2015-05-05T23:40:12Z",
//        "pushed_at": "2015-05-05T23:40:26Z",
//        "git_url": "git://github.com/baxterthehacker/public-repo.git",
//        "ssh_url": "git@github.com:baxterthehacker/public-repo.git",
//        "clone_url": "https://github.com/baxterthehacker/public-repo.git",
//        "svn_url": "https://github.com/baxterthehacker/public-repo",
//        "homepage": null,
//        "size": 0,
//        "stargazers_count": 0,
//        "watchers_count": 0,
//        "language": null,
//        "has_issues": true,
//        "has_downloads": true,
//        "has_wiki": true,
//        "has_pages": true,
//        "forks_count": 0,
//        "mirror_url": null,
//        "open_issues_count": 1,
//        "forks": 0,
//        "open_issues": 1,
//        "watchers": 0,
//        "default_branch": "master"
//      }
//    },
//    "base": {
//      "label": "baxterthehacker:master",
//      "ref": "master",
//      "sha": "9049f1265b7d61be4a8904a9a27120d2064dab3b",
//      "user": {
//        "login": "baxterthehacker",
//        "id": 6752317,
//        "avatar_url": "https://avatars.githubusercontent.com/u/6752317?v=3",
//        "gravatar_id": "",
//        "url": "https://api.github.com/users/baxterthehacker",
//        "html_url": "https://github.com/baxterthehacker",
//        "followers_url": "https://api.github.com/users/baxterthehacker/followers",
//        "following_url": "https://api.github.com/users/baxterthehacker/following{/other_user}",
//        "gists_url": "https://api.github.com/users/baxterthehacker/gists{/gist_id}",
//        "starred_url": "https://api.github.com/users/baxterthehacker/starred{/owner}{/repo}",
//        "subscriptions_url": "https://api.github.com/users/baxterthehacker/subscriptions",
//        "organizations_url": "https://api.github.com/users/baxterthehacker/orgs",
//        "repos_url": "https://api.github.com/users/baxterthehacker/repos",
//        "events_url": "https://api.github.com/users/baxterthehacker/events{/privacy}",
//        "received_events_url": "https://api.github.com/users/baxterthehacker/received_events",
//        "type": "User",
//        "site_admin": false
//      },
//      "repo": {
//        "id": 35129377,
//        "name": "public-repo",
//        "full_name": "baxterthehacker/public-repo",
//        "owner": {
//          "login": "baxterthehacker",
//          "id": 6752317,
//          "avatar_url": "https://avatars.githubusercontent.com/u/6752317?v=3",
//          "gravatar_id": "",
//          "url": "https://api.github.com/users/baxterthehacker",
//          "html_url": "https://github.com/baxterthehacker",
//          "followers_url": "https://api.github.com/users/baxterthehacker/followers",
//          "following_url": "https://api.github.com/users/baxterthehacker/following{/other_user}",
//          "gists_url": "https://api.github.com/users/baxterthehacker/gists{/gist_id}",
//          "starred_url": "https://api.github.com/users/baxterthehacker/starred{/owner}{/repo}",
//          "subscriptions_url": "https://api.github.com/users/baxterthehacker/subscriptions",
//          "organizations_url": "https://api.github.com/users/baxterthehacker/orgs",
//          "repos_url": "https://api.github.com/users/baxterthehacker/repos",
//          "events_url": "https://api.github.com/users/baxterthehacker/events{/privacy}",
//          "received_events_url": "https://api.github.com/users/baxterthehacker/received_events",
//          "type": "User",
//          "site_admin": false
//        },
//        "private": false,
//        "html_url": "https://github.com/baxterthehacker/public-repo",
//        "description": "",
//        "fork": false,
//        "url": "https://api.github.com/repos/baxterthehacker/public-repo",
//        "forks_url": "https://api.github.com/repos/baxterthehacker/public-repo/forks",
//        "keys_url": "https://api.github.com/repos/baxterthehacker/public-repo/keys{/key_id}",
//        "collaborators_url": "https://api.github.com/repos/baxterthehacker/public-repo/collaborators{/collaborator}",
//        "teams_url": "https://api.github.com/repos/baxterthehacker/public-repo/teams",
//        "hooks_url": "https://api.github.com/repos/baxterthehacker/public-repo/hooks",
//        "issue_events_url": "https://api.github.com/repos/baxterthehacker/public-repo/issues/events{/number}",
//        "events_url": "https://api.github.com/repos/baxterthehacker/public-repo/events",
//        "assignees_url": "https://api.github.com/repos/baxterthehacker/public-repo/assignees{/user}",
//        "branches_url": "https://api.github.com/repos/baxterthehacker/public-repo/branches{/branch}",
//        "tags_url": "https://api.github.com/repos/baxterthehacker/public-repo/tags",
//        "blobs_url": "https://api.github.com/repos/baxterthehacker/public-repo/git/blobs{/sha}",
//        "git_tags_url": "https://api.github.com/repos/baxterthehacker/public-repo/git/tags{/sha}",
//        "git_refs_url": "https://api.github.com/repos/baxterthehacker/public-repo/git/refs{/sha}",
//        "trees_url": "https://api.github.com/repos/baxterthehacker/public-repo/git/trees{/sha}",
//        "statuses_url": "https://api.github.com/repos/baxterthehacker/public-repo/statuses/{sha}",
//        "languages_url": "https://api.github.com/repos/baxterthehacker/public-repo/languages",
//        "stargazers_url": "https://api.github.com/repos/baxterthehacker/public-repo/stargazers",
//        "contributors_url": "https://api.github.com/repos/baxterthehacker/public-repo/contributors",
//        "subscribers_url": "https://api.github.com/repos/baxterthehacker/public-repo/subscribers",
//        "subscription_url": "https://api.github.com/repos/baxterthehacker/public-repo/subscription",
//        "commits_url": "https://api.github.com/repos/baxterthehacker/public-repo/commits{/sha}",
//        "git_commits_url": "https://api.github.com/repos/baxterthehacker/public-repo/git/commits{/sha}",
//        "comments_url": "https://api.github.com/repos/baxterthehacker/public-repo/comments{/number}",
//        "issue_comment_url": "https://api.github.com/repos/baxterthehacker/public-repo/issues/comments{/number}",
//        "contents_url": "https://api.github.com/repos/baxterthehacker/public-repo/contents/{+path}",
//        "compare_url": "https://api.github.com/repos/baxterthehacker/public-repo/compare/{base}...{head}",
//        "merges_url": "https://api.github.com/repos/baxterthehacker/public-repo/merges",
//        "archive_url": "https://api.github.com/repos/baxterthehacker/public-repo/{archive_format}{/ref}",
//        "downloads_url": "https://api.github.com/repos/baxterthehacker/public-repo/downloads",
//        "issues_url": "https://api.github.com/repos/baxterthehacker/public-repo/issues{/number}",
//        "pulls_url": "https://api.github.com/repos/baxterthehacker/public-repo/pulls{/number}",
//        "milestones_url": "https://api.github.com/repos/baxterthehacker/public-repo/milestones{/number}",
//        "notifications_url": "https://api.github.com/repos/baxterthehacker/public-repo/notifications{?since,all,participating}",
//        "labels_url": "https://api.github.com/repos/baxterthehacker/public-repo/labels{/name}",
//        "releases_url": "https://api.github.com/repos/baxterthehacker/public-repo/releases{/id}",
//        "created_at": "2015-05-05T23:40:12Z",
//        "updated_at": "2015-05-05T23:40:12Z",
//        "pushed_at": "2015-05-05T23:40:26Z",
//        "git_url": "git://github.com/baxterthehacker/public-repo.git",
//        "ssh_url": "git@github.com:baxterthehacker/public-repo.git",
//        "clone_url": "https://github.com/baxterthehacker/public-repo.git",
//        "svn_url": "https://github.com/baxterthehacker/public-repo",
//        "homepage": null,
//        "size": 0,
//        "stargazers_count": 0,
//        "watchers_count": 0,
//        "language": null,
//        "has_issues": true,
//        "has_downloads": true,
//        "has_wiki": true,
//        "has_pages": true,
//        "forks_count": 0,
//        "mirror_url": null,
//        "open_issues_count": 1,
//        "forks": 0,
//        "open_issues": 1,
//        "watchers": 0,
//        "default_branch": "master"
//      }
//    },
//    "_links": {
//      "self": {
//        "href": "https://api.github.com/repos/baxterthehacker/public-repo/pulls/1"
//      },
//      "html": {
//        "href": "https://github.com/baxterthehacker/public-repo/pull/1"
//      },
//      "issue": {
//        "href": "https://api.github.com/repos/baxterthehacker/public-repo/issues/1"
//      },
//      "comments": {
//        "href": "https://api.github.com/repos/baxterthehacker/public-repo/issues/1/comments"
//      },
//      "review_comments": {
//        "href": "https://api.github.com/repos/baxterthehacker/public-repo/pulls/1/comments"
//      },
//      "review_comment": {
//        "href": "https://api.github.com/repos/baxterthehacker/public-repo/pulls/comments{/number}"
//      },
//      "commits": {
//        "href": "https://api.github.com/repos/baxterthehacker/public-repo/pulls/1/commits"
//      },
//      "statuses": {
//        "href": "https://api.github.com/repos/baxterthehacker/public-repo/statuses/0d1a26e67d8f5eaf1f6ba5c57fc3c7d91ac0fd1c"
//      }
//    },
//    "merged": false,
//    "mergeable": null,
//    "mergeable_state": "unknown",
//    "merged_by": null,
//    "comments": 0,
//    "review_comments": 0,
//    "commits": 1,
//    "additions": 1,
//    "deletions": 1,
//    "changed_files": 1
//  },
//  "repository": {
//    "id": 35129377,
//    "name": "public-repo",
//    "full_name": "baxterthehacker/public-repo",
//    "owner": {
//      "login": "baxterthehacker",
//      "id": 6752317,
//      "avatar_url": "https://avatars.githubusercontent.com/u/6752317?v=3",
//      "gravatar_id": "",
//      "url": "https://api.github.com/users/baxterthehacker",
//      "html_url": "https://github.com/baxterthehacker",
//      "followers_url": "https://api.github.com/users/baxterthehacker/followers",
//      "following_url": "https://api.github.com/users/baxterthehacker/following{/other_user}",
//      "gists_url": "https://api.github.com/users/baxterthehacker/gists{/gist_id}",
//      "starred_url": "https://api.github.com/users/baxterthehacker/starred{/owner}{/repo}",
//      "subscriptions_url": "https://api.github.com/users/baxterthehacker/subscriptions",
//      "organizations_url": "https://api.github.com/users/baxterthehacker/orgs",
//      "repos_url": "https://api.github.com/users/baxterthehacker/repos",
//      "events_url": "https://api.github.com/users/baxterthehacker/events{/privacy}",
//      "received_events_url": "https://api.github.com/users/baxterthehacker/received_events",
//      "type": "User",
//      "site_admin": false
//    },
//    "private": false,
//    "html_url": "https://github.com/baxterthehacker/public-repo",
//    "description": "",
//    "fork": false,
//    "url": "https://api.github.com/repos/baxterthehacker/public-repo",
//    "forks_url": "https://api.github.com/repos/baxterthehacker/public-repo/forks",
//    "keys_url": "https://api.github.com/repos/baxterthehacker/public-repo/keys{/key_id}",
//    "collaborators_url": "https://api.github.com/repos/baxterthehacker/public-repo/collaborators{/collaborator}",
//    "teams_url": "https://api.github.com/repos/baxterthehacker/public-repo/teams",
//    "hooks_url": "https://api.github.com/repos/baxterthehacker/public-repo/hooks",
//    "issue_events_url": "https://api.github.com/repos/baxterthehacker/public-repo/issues/events{/number}",
//    "events_url": "https://api.github.com/repos/baxterthehacker/public-repo/events",
//    "assignees_url": "https://api.github.com/repos/baxterthehacker/public-repo/assignees{/user}",
//    "branches_url": "https://api.github.com/repos/baxterthehacker/public-repo/branches{/branch}",
//    "tags_url": "https://api.github.com/repos/baxterthehacker/public-repo/tags",
//    "blobs_url": "https://api.github.com/repos/baxterthehacker/public-repo/git/blobs{/sha}",
//    "git_tags_url": "https://api.github.com/repos/baxterthehacker/public-repo/git/tags{/sha}",
//    "git_refs_url": "https://api.github.com/repos/baxterthehacker/public-repo/git/refs{/sha}",
//    "trees_url": "https://api.github.com/repos/baxterthehacker/public-repo/git/trees{/sha}",
//    "statuses_url": "https://api.github.com/repos/baxterthehacker/public-repo/statuses/{sha}",
//    "languages_url": "https://api.github.com/repos/baxterthehacker/public-repo/languages",
//    "stargazers_url": "https://api.github.com/repos/baxterthehacker/public-repo/stargazers",
//    "contributors_url": "https://api.github.com/repos/baxterthehacker/public-repo/contributors",
//    "subscribers_url": "https://api.github.com/repos/baxterthehacker/public-repo/subscribers",
//    "subscription_url": "https://api.github.com/repos/baxterthehacker/public-repo/subscription",
//    "commits_url": "https://api.github.com/repos/baxterthehacker/public-repo/commits{/sha}",
//    "git_commits_url": "https://api.github.com/repos/baxterthehacker/public-repo/git/commits{/sha}",
//    "comments_url": "https://api.github.com/repos/baxterthehacker/public-repo/comments{/number}",
//    "issue_comment_url": "https://api.github.com/repos/baxterthehacker/public-repo/issues/comments{/number}",
//    "contents_url": "https://api.github.com/repos/baxterthehacker/public-repo/contents/{+path}",
//    "compare_url": "https://api.github.com/repos/baxterthehacker/public-repo/compare/{base}...{head}",
//    "merges_url": "https://api.github.com/repos/baxterthehacker/public-repo/merges",
//    "archive_url": "https://api.github.com/repos/baxterthehacker/public-repo/{archive_format}{/ref}",
//    "downloads_url": "https://api.github.com/repos/baxterthehacker/public-repo/downloads",
//    "issues_url": "https://api.github.com/repos/baxterthehacker/public-repo/issues{/number}",
//    "pulls_url": "https://api.github.com/repos/baxterthehacker/public-repo/pulls{/number}",
//    "milestones_url": "https://api.github.com/repos/baxterthehacker/public-repo/milestones{/number}",
//    "notifications_url": "https://api.github.com/repos/baxterthehacker/public-repo/notifications{?since,all,participating}",
//    "labels_url": "https://api.github.com/repos/baxterthehacker/public-repo/labels{/name}",
//    "releases_url": "https://api.github.com/repos/baxterthehacker/public-repo/releases{/id}",
//    "created_at": "2015-05-05T23:40:12Z",
//    "updated_at": "2015-05-05T23:40:12Z",
//    "pushed_at": "2015-05-05T23:40:26Z",
//    "git_url": "git://github.com/baxterthehacker/public-repo.git",
//    "ssh_url": "git@github.com:baxterthehacker/public-repo.git",
//    "clone_url": "https://github.com/baxterthehacker/public-repo.git",
//    "svn_url": "https://github.com/baxterthehacker/public-repo",
//    "homepage": null,
//    "size": 0,
//    "stargazers_count": 0,
//    "watchers_count": 0,
//    "language": null,
//    "has_issues": true,
//    "has_downloads": true,
//    "has_wiki": true,
//    "has_pages": true,
//    "forks_count": 0,
//    "mirror_url": null,
//    "open_issues_count": 1,
//    "forks": 0,
//    "open_issues": 1,
//    "watchers": 0,
//    "default_branch": "master"
//  },
//  "sender": {
//    "login": "baxterthehacker",
//    "id": 6752317,
//    "avatar_url": "https://avatars.githubusercontent.com/u/6752317?v=3",
//    "gravatar_id": "",
//    "url": "https://api.github.com/users/baxterthehacker",
//    "html_url": "https://github.com/baxterthehacker",
//    "followers_url": "https://api.github.com/users/baxterthehacker/followers",
//    "following_url": "https://api.github.com/users/baxterthehacker/following{/other_user}",
//    "gists_url": "https://api.github.com/users/baxterthehacker/gists{/gist_id}",
//    "starred_url": "https://api.github.com/users/baxterthehacker/starred{/owner}{/repo}",
//    "subscriptions_url": "https://api.github.com/users/baxterthehacker/subscriptions",
//    "organizations_url": "https://api.github.com/users/baxterthehacker/orgs",
//    "repos_url": "https://api.github.com/users/baxterthehacker/repos",
//    "events_url": "https://api.github.com/users/baxterthehacker/events{/privacy}",
//    "received_events_url": "https://api.github.com/users/baxterthehacker/received_events",
//    "type": "User",
//    "site_admin": false
//  },
//  "installation": {
//    "id": 234
//  }
//}
@Data
public class Event {
    private String action;
    private int number;
    @JsonProperty("pull_request")
    private PullRequest pullRequest;
    private Installation installation;

    @Data
    public static class PullRequest {
        private String url;
        @JsonProperty("diff_url")
        private String diffUrl;
        @JsonProperty("review_comments_url")
        private String reviewCommentsUrl;
        private Base base;
        private Head head;
    }

    // Branch to which pull request merges.
    @Data
    public static class Base {
        private Repo repo;
    }

    // PullRequest's branch.
    @Data
    public static class Head {
        private String sha;
        private Repo repo;
        private String ref;
    }

    @Data
    public static class Repo {
        @JsonProperty("git_url")
        private String gitUrl;
        @JsonProperty("contents_url")
        private String contentsUrl;
        private String name;
        private Owner owner;
    }

    @Data
    public static class Owner {
        private String login;
    }

    @Data
    public static class Installation {
        private String id;
    }
}