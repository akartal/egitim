package com.uniyaz;

/**
 * Created by AKARTAL on 4.12.2019.
 */
public class Malzeme {

    private int id;
    private EnumMalzemeTuru malzemeTuru;
    private byte agirlik;
    private String uretimYeri;
    private String firma;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public EnumMalzemeTuru getMalzemeTuru() {
        return malzemeTuru;
    }

    public void setMalzemeTuru(EnumMalzemeTuru malzemeTuru) {
        this.malzemeTuru = malzemeTuru;
    }

    public byte getAgirlik() {
        return agirlik;
    }

    public void setAgirlik(byte agirlik) {
        this.agirlik = agirlik;
    }

    public String getUretimYeri() {
        if (uretimYeri.equals("")) {
            return "DÜNYA";
        }
        return uretimYeri;
    }

    public void setUretimYeri(String uretimYeri) {
        this.uretimYeri = uretimYeri;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }
}
