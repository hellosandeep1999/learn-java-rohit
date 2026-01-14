package com.codingshuttle.youtube.LearningRESTAPIs.dsapractice;

import java.util.Scanner;

class CountWords {

    int countWords(String str) {
        String[] words = str.trim().split("\\s+");
        int count = words.length;

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out .println("Enter the string: ");
        String str = sc.nextLine();

        CountWords obj = new CountWords();
        System.out.println("Counts of words in string: " + obj.countWords(str));
    }
}


/*
output ->
Enter the string:
this is count word program
Counts of words in string: 5
 */