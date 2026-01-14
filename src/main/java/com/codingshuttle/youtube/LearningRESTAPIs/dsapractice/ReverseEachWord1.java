package com.codingshuttle.youtube.LearningRESTAPIs.dsapractice;

import java.util.Scanner;

class reverseEachWord1 {

    String reverseEachWord(String str) {
        String[] words = str.split(" ");
        String result = "";
        for(String word : words) {
            String reverseString = "";
            for(int i = word.length()-1; i>=0; i--) {
                reverseString += word.charAt(i);
            }
            result += reverseString + " ";
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        reverseEachWord1 obj = new reverseEachWord1();
        System.out.println(obj.reverseEachWord(str));
    }


}
/*
output ->
Enter the string:
hello world
olleh dlrow
 */