package com.uniyaz.collections;

/**
 * Created by AKARTAL on 6.12.2019.
 */
public class Ogrenci implements Comparable {

    private int id;
    private String ad;

    public Ogrenci(int id, String ad) {
        this.id = id;
        this.ad = ad;
    }

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

    @Override
    public String toString() {
        return id + " " + ad + " TEST UYGULAMASI";
    }

    @Override
    public boolean equals(Object o) {
        Ogrenci parametreGirilenOgrenci = (Ogrenci) o;
        return this.id == parametreGirilenOgrenci.getId();
    }

    @Override
    public int compareTo(Object o) {
        Ogrenci parametreOlarakGelenOgrenci = (Ogrenci) o;
        int parametreOlarakGelenOgrenciId = parametreOlarakGelenOgrenci.getId();
        int varOlanSinifinId = this.getId();
        if (parametreOlarakGelenOgrenciId < varOlanSinifinId) return 1;
        else if (parametreOlarakGelenOgrenciId > varOlanSinifinId) return -1;
        else return 0;
    }

    @Override
    public int hashCode() {
        return id;
    }
}