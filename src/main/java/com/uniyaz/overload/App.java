package com.uniyaz.overload;

/**
 * Created by AKARTAL on 4.12.2019.
 */
public class App {

    public static void main(String[] args) {
        int carpimSonucu = carp(5);
        System.out.println(carpimSonucu);

        int sonuc = carp(5, 3);
        System.out.println(sonuc);
    }

    private static int carp(int sayi) {
        return sayi * sayi;
    }

    private static int carp(int sayi1, int sayi2) {
        return sayi1 * sayi2;
    }

    private static double carp(double sayi) {
        return sayi * sayi;
    }
}