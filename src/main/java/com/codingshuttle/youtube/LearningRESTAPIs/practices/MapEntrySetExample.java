package com.codingshuttle.youtube.LearningRESTAPIs.practices;

import java.util.HashMap;
import java.util.Map;

public class MapEntrySetExample {

    public static void main(String[] args) {
        Map<String, Integer> map= new HashMap<>();
        map.put("Rohit", 1);
        map.put("Tarun", 2);
        map.put("Mohit", 3);
        map.put("Sahil", 1);

        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}

/*

output ->

Mohit -> 3
Rohit -> 1
Sahil -> 1
Tarun -> 2

Process finished with exit code 0

 */
