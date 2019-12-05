package com.uniyaz.kumanda;

/**
 * Created by AKARTAL on 5.12.2019.
 */
public class Televizyon extends Arac {

    private String adi;

    public void yayiniGostter() {

    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    @Override
    public void hareketGoster() {
        System.out.println("TELEVİZYON AÇILDI");
    }
}
