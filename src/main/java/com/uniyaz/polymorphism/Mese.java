package com.uniyaz.polymorphism;

/**
 * Created by AKARTAL on 5.12.2019.
 */
public class Mese extends Agac {

    @Override
    public void fotosentezYapar() {
        System.out.println("MEŞE ağaçları sadece geceleri fotosentez yapar.");
    }

    @Override
    public void yaprakDok() {
        System.out.println(getAd() + " ağaçları günlük 50 kilo yaprak döker");
    }
}