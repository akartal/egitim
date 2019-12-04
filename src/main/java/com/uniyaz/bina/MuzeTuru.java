package com.uniyaz.bina;

/**
 * Created by AKARTAL on 4.12.2019.
 */
public class MuzeTuru {

    private int id;
    private String ad;
    private EnumMuzeUstTuru muzeUstTuru;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public EnumMuzeUstTuru getMuzeUstTuru() {
        return muzeUstTuru;
    }

    public void setMuzeUstTuru(EnumMuzeUstTuru muzeUstTuru) {
        this.muzeUstTuru = muzeUstTuru;
    }
}