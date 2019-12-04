package com.uniyaz.override;

/**
 * Created by AKARTAL on 4.12.2019.
 */
public class Program {
    public static void main(String[] args) {

        Kumas kumas = new Kumas();
        kumas.isle();

        Keten keten = new Keten();
        keten.isle();

        Deri deri = new Deri();
        deri.isle();


        Keten keten1 = new Keten("KETEN TÜRÜ", false);

    }
}
