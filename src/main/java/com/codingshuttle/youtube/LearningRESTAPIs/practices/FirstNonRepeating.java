package com.codingshuttle.youtube.LearningRESTAPIs.practices;

import java.util.Scanner;
import java.util.HashMap;

class FirstNonRepeating {

    char firstNonRepeating(String str) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0)+1 );
        }

        for(char ch : str.toCharArray()) {
            if(map.get(ch) == 1) {
                return ch;
            }
        }

        return '\0';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        FirstNonRepeating obj = new FirstNonRepeating();
        char result = (obj.firstNonRepeating(str));
        if(result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        }
        else {
            System.out.println("No non-repeating characters found.");
        }
    }
}


/*

output ->

Enter the string:
rohit jain rro
The first non-repeating character is: h

 */