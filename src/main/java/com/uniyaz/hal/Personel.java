package com.uniyaz.hal;

/**
 * Created by AKARTAL on 6.12.2019.
 */
public class Personel {

    private int id;
    private String adi;

    public Personel(int id, String adi) {
        this.id = id;
        this.adi = adi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Personel personel = (Personel) o;

        return id == personel.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
