package com.uniyaz.hal;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AKARTAL on 6.12.2019.
 */
public class HalApp {

    static List<Stok> stokList = new ArrayList();

    public static void main(String[] args) {

        Karpuz karpuz = new Karpuz();
        karpuz.setId(1);
        karpuz.setGram(6325);
        karpuz.setMiktarTuru(EnumMiktarTuru.ADET);
        karpuz.setFiyat(5);
        System.out.println(karpuz.getUrunAdi());

        Personel personel = new Personel(1, "HÜSEYİN");


        Stok stok = new Stok();
        stok.setPersonel(personel);
        stok.setUrun(karpuz);
        stok.setMiktar(30);
        stokList.add(stok);

        String urunAdi = stok.getUrun().getUrunAdi();
        System.out.println(urunAdi);

        float toplamMaliyet = stok.getToplamMaliyet();
        System.out.println(toplamMaliyet);
        // Hüseyin karpuzdan 10 tane aldı.
        // Şafak karpuzdan 8 tane aldı.
    }
}
