package com.uniyaz.hal;

/**
 * Created by AKARTAL on 6.12.2019.
 */
public class Stok {

    private Personel personel;
    private Urun urun;
    private int miktar;

    public Personel getPersonel() {
        return personel;
    }

    public void setPersonel(Personel personel) {
        this.personel = personel;
    }

    public Urun getUrun() {
        return urun;
    }

    public void setUrun(Urun urun) {
        this.urun = urun;
    }

    public int getMiktar() {
        return miktar;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    public float getToplamMaliyet() {
        return miktar * urun.getFiyat();
    }
}
