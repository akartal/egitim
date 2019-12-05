package com.uniyaz.polymorphism;

/**
 * Created by AKARTAL on 5.12.2019.
 */
public abstract class Bitki {

    private String ad;

    public void buyur() {
        System.out.println("STANDART BÜYÜME İŞLEMİ");
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }
}