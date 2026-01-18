package com.codingshuttle.youtube.LearningRESTAPIs.dsapractice;

import java.util.Scanner;

class ReverseEachWord2 {

    String reverseEachWord(String str) {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for(String word : words) {
            StringBuilder sb = new StringBuilder(word);
            result.append(sb.reverse()).append(" ");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        ReverseEachWord2 obj = new ReverseEachWord2();
        System.out.println(obj.reverseEachWord(str));
    }


}
/*
output ->
Enter the string:
hello world
olleh dlrow
 */