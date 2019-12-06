package com.uniyaz.collections.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by AKARTAL on 6.12.2019.
 */
public class MapApp {

    public static void main(String[] args) {

        Map map = new HashMap();
        map.put(1, "ASD");
        map.put(2, "DEF");
        map.put(1, "TUY");
        for (Object key : map.keySet()) {
            Object value = map.get(key);
            System.out.println("Key = " + key + " Value = " + value);
        }
    }
}