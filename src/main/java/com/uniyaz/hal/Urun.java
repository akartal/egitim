package com.uniyaz.hal;

/**
 * Created by AKARTAL on 6.12.2019.
 */
public abstract class Urun {

    private int id;
    private float fiyat;
    private EnumMiktarTuru miktarTuru;

    public abstract String getUrunAdi();

    @Override
    public boolean equals(Object o) {
        Urun urun = (Urun) o;
        return this.id == urun.getId();
    }

    @Override
    public int hashCode() {
        return this.id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getFiyat() {
        return fiyat;
    }

    public void setFiyat(float fiyat) {
        this.fiyat = fiyat;
    }

    public EnumMiktarTuru getMiktarTuru() {
        return miktarTuru;
    }

    public void setMiktarTuru(EnumMiktarTuru miktarTuru) {
        this.miktarTuru = miktarTuru;
    }
}