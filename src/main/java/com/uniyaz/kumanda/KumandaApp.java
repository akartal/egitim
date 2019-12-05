package com.uniyaz.kumanda;

/**
 * Created by AKARTAL on 5.12.2019.
 */
public class KumandaApp {

    public static void main(String[] args) {
        Kumanda kumanda = new Kumanda();

        Televizyon televizyon = new Televizyon();
        televizyon.setAdi("TELE1");

        KumandaliAraba kumandaliAraba = new KumandaliAraba();
        kumanda.kontrolEt(televizyon);
        kumanda.kontrolEt(kumandaliAraba);
    }
}
