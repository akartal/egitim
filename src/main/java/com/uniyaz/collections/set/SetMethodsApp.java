package com.uniyaz.collections.set;

import com.uniyaz.collections.Ogrenci;

import java.util.*;

public class SetMethodsApp {

    public static void main(String[] args) {

        Set<String> stringSet = new HashSet<>();
        stringSet.add("MAHMUT");
        stringSet.add("ŞAFAK");
        stringSet.add("FİRDEVS");
        stringSet.add("ONUR BLD.");
        stringSet.add("FIRAT");
        stringSet.add("ONUR BLD.");

        for (String str : stringSet) {
            System.out.println(str);
        }

        System.out.println("------------------------");

        Set<String> stringSet2 = new LinkedHashSet<>();
        stringSet2.add("MAHMUT");
        stringSet2.add("ŞAFAK");
        stringSet2.add("FİRDEVS");
        stringSet2.add("ONUR BLD.");
        stringSet2.add("FIRAT");
        stringSet2.add("ONUR BLD.");

        for (String str : stringSet2) {
            System.out.println(str);
        }

        List<Integer> intList = new ArrayList();
        intList.add(3);
        intList.add(4);
        intList.add(3);
        intList.add(3);

        Set objectSet = new HashSet();
        objectSet.addAll(intList);
        for (Object object : objectSet) {
            System.out.println(object);
        }


        System.out.println("----------------- TREESET ------------------------");
        Set<String> stringSet3 = new TreeSet();
        stringSet3.add("MAHMUT");
        stringSet3.add("ŞAFAK");
        stringSet3.add("FİRDEVS");
        stringSet3.add("ONUR BLD.");
        stringSet3.add("FIRAT");
        stringSet3.add("ONUR BLD.");

        for (String strTree : stringSet3) {
            System.out.println(strTree);
        }


        System.out.println("----------------- ÖĞRENCİ TREESET ------------------------");
        Set<Ogrenci> ogrenciSet = new TreeSet<>();
        ogrenciSet.add(new Ogrenci(1, "ALİ"));
        ogrenciSet.add(new Ogrenci(2, "DİLARA"));
        ogrenciSet.add(new Ogrenci(3, "MERVE"));
        ogrenciSet.add(new Ogrenci(1, "KAAN"));

        for (Ogrenci ogrenci : ogrenciSet) {
            System.out.println(ogrenci);
        }


        System.out.println("----------------- ÖĞRENCİ HASHSET ------------------------");
        Set<Ogrenci> ogrenciHashSet = new HashSet<>();
        ogrenciHashSet.add(new Ogrenci(1, "ALİ"));
        ogrenciHashSet.add(new Ogrenci(2, "DİLARA"));
        ogrenciHashSet.add(new Ogrenci(3, "MERVE"));
        ogrenciHashSet.add(new Ogrenci(1, "ALİ"));
        for (Ogrenci ogrenci : ogrenciHashSet) {
            System.out.println(ogrenci);
        }

    }
}