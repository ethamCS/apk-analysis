package com.health.openworkout.core.datatypes;

import androidx.annotation.Keep;
import d.a.b.v.c;
@Keep
/* loaded from: classes.dex */
public class GitHubFile {
    @c("download_url")
    private String downloadURL;
    @c("git_url")
    private String gitURL;
    @c("html_url")
    private String htmlURL;
    @c("name")
    private String name;
    @c("path")
    private String path;
    @c("sha")
    private String sha;
    @c("size")
    private long size;
    @c("type")
    private String type;
    @c("url")
    private String url;

    public String getDownloadURL() {
        return this.downloadURL;
    }

    public String getGitURL() {
        return this.gitURL;
    }

    public String getHtmlURL() {
        return this.htmlURL;
    }

    public String getName() {
        return this.name;
    }

    public String getPath() {
        return this.path;
    }

    public String getSha() {
        return this.sha;
    }

    public long getSize() {
        return this.size;
    }

    public String getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
    }

    public void setDownloadURL(String str) {
        this.downloadURL = str;
    }

    public void setGitURL(String str) {
        this.gitURL = str;
    }

    public void setHtmlURL(String str) {
        this.htmlURL = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setSha(String str) {
        this.sha = str;
    }

    public void setSize(long j) {
        this.size = j;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
