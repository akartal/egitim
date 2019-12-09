package com.uniyaz.io;

import java.io.Externalizable;

/**
 * Created by AKARTAL on 9.12.2019.
 */
public class Ilac {

    private int id;
    private String adi;
    private EnumIlacTuru ilacTuru;

    public Ilac(int id, String adi, EnumIlacTuru ilacTuru) {
        this.id = id;
        this.adi = adi;
        this.ilacTuru = ilacTuru;
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

    public EnumIlacTuru getIlacTuru() {
        return ilacTuru;
    }

    public void setIlacTuru(EnumIlacTuru ilacTuru) {
        this.ilacTuru = ilacTuru;
    }
}
