package com.uniyaz.override;

/**
 * Created by AKARTAL on 4.12.2019.
 */
public class Keten extends Kumas {

    private String ketenTuru;

    public Keten() {
        System.out.println("TEST KETEN");
    }

    public Keten(String ketenTuru) {
        this.ketenTuru = ketenTuru;
        System.out.println("DIŞARDAN PARAMETRE GEÇİLDİ");
    }

    public Keten(String ketenTuru, boolean kontrol) {
        this(ketenTuru);
    }

    @Override
    public void isle() {
        System.out.println("KETEN İŞLEMLERİ YAPILIR");
    }

    @Override
    public void kes() {
        this.isle();
        System.out.println("KETEN KESME İŞLEMİ YAPILIR");
    }
}