package com.codingshuttle.youtube.LearningRESTAPIs.dsapractice;

import java.util.Arrays;
import java.util.Scanner;

class AnagramString {

    boolean anagramString(String str1, String str2) {
        if(str1.length() != str2.length()) return false;

        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(s2);

        return Arrays.equals(s1,s2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string1: ");
        String str1 = sc.nextLine();
        System.out.println("Enter the string 2: ");
        String str2 = sc.nextLine();

        AnagramString obj = new AnagramString();
        if(obj.anagramString(str1, str2)) {
            System.out.println("Both strings are anagram of each other.");
        }
        else {
            System.out.println("Both strings are not anagram of each other.");
        }
    }
}
/*
output ->
Enter the string1:
hello
Enter the string 2:
leolh
Both strings are anagram of each other.
 */