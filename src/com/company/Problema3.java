package com.company;

import java.util.Map;
import java.util.TreeMap;

public class Problema3 {
    public static void main(String[] args) {
        Map<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(453, "George");
        treeMap.put(327, "Carina");
        treeMap.put(958, "Iasmina");
        treeMap.put(102, "Sebastatin");
        treeMap.put(856, "Marius");


        String valueA = treeMap.get(453);
        System.out.println("ID of George: " + valueA);


        treeMap.remove(856);


        for (int key : treeMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + treeMap.get(key));
        }
    }
}
