package com.uniyaz.oop;

/**
 * Created by AKARTAL on 4.12.2019.
 */
public class PersonelMaas {

    private final int maasCarpani = 1000;
    private float maas;
    private int calistigiYilSayisi;

    public float getMaas() {
        return (calistigiYilSayisi * maasCarpani) + maas;
    }

    public void setMaas(float maas) {
        this.maas = maas;
    }

    public int getCalistigiYilSayisi() {
        return calistigiYilSayisi;
    }

    public void setCalistigiYilSayisi(int calistigiYilSayisi) {
        this.calistigiYilSayisi = calistigiYilSayisi;
    }
}