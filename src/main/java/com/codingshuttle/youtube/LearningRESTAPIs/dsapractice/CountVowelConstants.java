package com.codingshuttle.youtube.LearningRESTAPIs.dsapractice;

import java.util.Scanner;

class CountVowelConstants {

    void countVowelConstants(String str) {
        char[] chars = str.toCharArray();
        int vowels = 0;
        int constants = 0;
        for(int i = 0; i<chars.length; i++ ){
            if(chars[i] >= 'a' && chars[i] <= 'z'){
                if(chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'i' || chars[i] == 'o' || chars[i] == 'u') {
                    vowels++;
                } else {
                    constants++;
                }
            }
        }
        System.out.println("Total Vowels are: " + vowels);
        System.out.println("Total constants are: " + constants);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        CountVowelConstants obj = new CountVowelConstants();
        obj.countVowelConstants(str);
    }
}

/*
output ->

Enter the string:
rohit jain
Total Vowels are: 4
Total constants are: 5
 */
