package com.uniyaz.collections.list;

import com.uniyaz.collections.Ogrenci;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListMethodsApp {

    public static void main(String[] args) {

        Ogrenci huseyin = new Ogrenci(1, "HÜSEYİN");
        Ogrenci gaye = new Ogrenci(2, "GAYE");
        Ogrenci cengiz = new Ogrenci(3, "CENGİZ");

        List<Ogrenci> ogrenciList = new ArrayList<>();
        ogrenciList.add(huseyin);
        ogrenciList.add(gaye);
        ogrenciList.add(cengiz);
        listele(ogrenciList);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Öğrenci ID = ");
        int ogrenciId = scanner.nextInt();

        System.out.println("Öğrenci Adı = ");
        scanner.nextLine();
        String ogrenciAdi = scanner.nextLine();

        Ogrenci aranacakOgrenci = new Ogrenci(ogrenciId, ogrenciAdi);
        ara(ogrenciList, aranacakOgrenci);
    }

    private static void listele(List<Ogrenci> ogrenciList) {
        for (Ogrenci ogrenci : ogrenciList) {
            System.out.println(ogrenci.getId() + " " + ogrenci.getAd());
        }

    }

    public static void ara(List<Ogrenci> ogrenciList, Ogrenci aranacakOgrenci) {

        boolean contains = ogrenciList.contains(aranacakOgrenci);
        if (contains) {
            System.out.println(aranacakOgrenci.getAd() + " LİSTEDE VAR");
        } else {
            System.out.println(aranacakOgrenci.getAd() + " LİSTEDE YOK");
        }

        int index = ogrenciList.indexOf(aranacakOgrenci);
        Ogrenci ogrenci = ogrenciList.get(index);
        System.out.println(ogrenci.getAd());
    }
}