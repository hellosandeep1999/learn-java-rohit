package com.codingshuttle.youtube.LearningRESTAPIs.dsapractice;

import java.util.Scanner;


class FindLength {

    int findLength(String str) {
        int count = 0;
        for(char c : str.toCharArray()) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        FindLength obj = new FindLength();
        System.out.println("The length of string is: " + obj.findLength(str));

    }
}

/*
output ->

Enter the string:
Rohit Jain
The length of string is: 10
 */