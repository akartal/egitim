package com.uniyaz.polymorphism;

/**
 * Created by AKARTAL on 5.12.2019.
 */
public class Cam extends Agac {

    @Override
    public void fotosentezYapar() {
        System.out.println("ÇAM ağaçları genellikle gündüzleri fotosentez yapar");
    }

    @Override
    public void yaprakDok() {
        System.out.println(getAd() + " ağaçları günlük 5 kilo iğne yaprak döker. Canınız acımasın dikkat edin.");
    }
}
