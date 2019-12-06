package com.uniyaz.hal;

/**
 * Created by AKARTAL on 6.12.2019.
 */
public class Karpuz extends Meyve {

    // bir karpuzun ağırlığı düşünüldü.
    private int gram;

    public int getGram() {
        return gram;
    }

    public void setGram(int gram) {
        this.gram = gram;
    }

    @Override
    public String getUrunAdi() {
        return "Karpuz";
    }
}
