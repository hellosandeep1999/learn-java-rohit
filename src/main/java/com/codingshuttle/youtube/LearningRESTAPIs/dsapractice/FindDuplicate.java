package com.codingshuttle.youtube.LearningRESTAPIs.dsapractice;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class FindDuplicate {

    void findDuplicate(String str) {
        Map<Character, Integer> mp = new HashMap<>();

        for(char c : str.toCharArray()) {
            mp.put(c,mp.getOrDefault(c,0)+1);
        }

        for(Map.Entry<Character, Integer> it: mp.entrySet()) {
            if(it.getValue()>1) {
                System.out.println("[" + it.getKey() + " -> " + it.getValue() + "]");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        FindDuplicate obj = new FindDuplicate();
        obj.findDuplicate(str);
    }
}

/*
output ->

Enter the string:
Hello this is Rohit jain
[  -> 4]
[h -> 2]
[i -> 4]
[l -> 2]
[o -> 2]
[s -> 2]
[t -> 2]

 */