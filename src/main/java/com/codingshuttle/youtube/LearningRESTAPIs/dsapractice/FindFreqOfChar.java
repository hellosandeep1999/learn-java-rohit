package com.codingshuttle.youtube.LearningRESTAPIs.dsapractice;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

class FindFreqOfChar {

    void findFreqOfChar(String str) {
        Map<Character, Integer> mp = new HashMap<>();
        for(char c : str.toCharArray()) {
            mp.put(c, mp.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character, Integer> m : mp.entrySet()) {
            System.out.println(m.getKey() + " : " + m.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        FindFreqOfChar obj = new FindFreqOfChar();
        obj.findFreqOfChar(str);
    }
}
/*
output ->
Enter the string:
hello
e : 1
h : 1
l : 2
o : 1

 */