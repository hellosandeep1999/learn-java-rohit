package com.codingshuttle.youtube.LearningRESTAPIs.practices;

import java.util.*;

class CountOfWords {

    void countOfWords(String str) {
        Map<String, Integer> mp = new HashMap<>();

        String[] words = str.split("\\s+");
        for(String word : words) {
            mp.put(word,mp.getOrDefault(word,0)+1);
        }

        for(Map.Entry<String, Integer> entry : mp.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        CountOfWords obj = new CountOfWords();
        obj.countOfWords(str);
    }
}
/*
output ->
Enter the string:
This code is the java code
the -> 1
code -> 2
java -> 1
This -> 1
is -> 1
 */