package com.uniyaz.sosyalmedya;

/**
 * Created by AKARTAL on 5.12.2019.
 */
public class Twitter extends SocialMediaApp implements Followable, Discovarable {

    private int characterCount;

    public void retweet() {

    }

    @Override
    public void follow() {

    }

    @Override
    public void discover() {

    }

    public int getCharacterCount() {
        return characterCount;
    }

    public void setCharacterCount(int characterCount) {
        this.characterCount = characterCount;
    }

    @Override
    public void post() {

    }
}