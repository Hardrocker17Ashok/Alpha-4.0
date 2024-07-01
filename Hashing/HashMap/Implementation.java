package Hashing.HashMap;

import java.util.*;

public class Implementation {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // add
        map.put(1, 100);
        map.put(2, 200);
        map.put(3, 300);
        map.put(4, 400);
        map.put(5, 400);
        map.put(1, 600);
        System.out.println(map);

        // check key available or not
        System.out.println(map.containsKey(1));
        System.out.println(map.containsKey(11));
        // getvalue of map by key
        System.out.println(map.get(1));
        System.out.println(map.get(10));

        // itrator
        for (Map.Entry<Integer, Integer> val : map.entrySet()) {
            System.out.println(val.getKey());
            System.out.println(val.getValue());
        }

        // itrator with different way
        // store all map key in Set
        Set<Integer> s = map.keySet();

        // Itrater
        for (int val : s) {
            System.out.println(val + " " + map.get(val));
        }
    }
}
