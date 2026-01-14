package com.codingshuttle.youtube.LearningRESTAPIs.practices;

import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Collections;

class SortByFreq {
    private final String str;
    private final HashMap<Character, Integer> map = new HashMap<>();

    SortByFreq(String str) {
        this.str = str;
    }












    void sortByFreq() {

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }


        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());


        Collections.sort(list, (a, b) -> b.getValue() - a.getValue());


        for (Map.Entry<Character, Integer> entry : list) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        SortByFreq obj = new SortByFreq(str);
        obj.sortByFreq();
    }
}



/*

output ->

Enter the string: banana
a: 3
n: 2
b: 1
 */

