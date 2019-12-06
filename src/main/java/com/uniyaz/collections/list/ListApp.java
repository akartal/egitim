package com.uniyaz.collections.list;


import com.uniyaz.collections.Ogrenci;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListApp {

    public static void main(String[] args) {

        int[] dizi = new int[2];
        dizi[0] = 3;
        dizi[1] = 4;

        int[][] diziTanimi = new int[2][3];

        int[] yeniDizi = {1, 3};


        List arrayList = new ArrayList();
        arrayList.add("ASD");
        arrayList.add("DEF");
        arrayList.add("KASJDL");
        arrayList.add("AUT");
        arrayList.add("ERERE");
        ListIterator listIteratorArrayList = arrayList.listIterator();
        while (listIteratorArrayList.hasNext()) {
            System.out.println(listIteratorArrayList.next());
        }



        System.out.println("-----------------------------------------------");


        ArrayList<Ogrenci> ogrenciList = new ArrayList<>();
        ogrenciList.add(new Ogrenci(1, "ASD"));
        ogrenciList.add(new Ogrenci(2, "DEF"));
        ogrenciList.add(new Ogrenci(3, "KLM"));
        ogrenciList.add(new Ogrenci(4, "UYZ"));
        for (int i = 0; i < ogrenciList.size(); i++) {
            Ogrenci ogrenci = ogrenciList.get(i);
            System.out.println(ogrenci);
        }

        System.out.println("-----------------------------------------------");

        LinkedList linkedList = new LinkedList();
        linkedList.add("ASD");
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(4);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(4);

        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
    }
}
