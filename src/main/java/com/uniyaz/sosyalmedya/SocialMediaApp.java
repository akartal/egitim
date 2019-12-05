package com.uniyaz.sosyalmedya;

import java.util.Date;

public abstract class SocialMediaApp {

    private User user;
    private byte[] logo;
    private String appName;
    private Date releaseDate;
    private String url;
    private char hashtag;

    public abstract void post();

    public void get() {

    }

    public void login(String username, String password) {
        if(username == "A" && password == "B") {
            user = new User();
            user.setEmail("asd@b.com");
        }
    }

    public User getUser() {
        return user;
    }

    public byte[] getLogo() {
        return logo;
    }

    public void setLogo(byte[] logo) {
        this.logo = logo;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public char getHashtag() {
        return hashtag;
    }

    public void setHashtag(char hashtag) {
        this.hashtag = hashtag;
    }
}