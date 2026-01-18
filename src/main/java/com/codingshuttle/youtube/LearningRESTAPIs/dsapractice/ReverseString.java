package com.codingshuttle.youtube.LearningRESTAPIs.dsapractice;

import java.util.Scanner;
public class ReverseString {

    void reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        System.out.println("Reverse string is: "+ sb);
    }
    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        ReverseString obj = new ReverseString();
        obj.reverseString(str);
    }
}

/*
output: ->
Enter the string:
Rohit
Reverse string is: tihoR

 */