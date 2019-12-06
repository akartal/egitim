package com.uniyaz.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * Created by AKARTAL on 6.12.2019.
 */
public class SetApp {

    public static void main(String[] args) {

        HashSet hashSet = new HashSet();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(1);
        hashSet.add(3);

        for (Object nesne : hashSet) {
            System.out.println(nesne);
        }

        System.out.println("------------------------------");

        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(1);
        linkedHashSet.add(2);
        linkedHashSet.add(1);
        linkedHashSet.add(3);

        for (Object object : linkedHashSet) {
            System.out.println(object);
        }

    }
}