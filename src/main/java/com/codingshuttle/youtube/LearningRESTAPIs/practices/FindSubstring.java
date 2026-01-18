package com.codingshuttle.youtube.LearningRESTAPIs.practices;

import java.util.Scanner;

class FindSubstring {

    void findSubstring(String str) {
        for(int i = 0; i<str.length(); i++) {
            for(int j = i+1; j<=str.length(); j++) {
                System.out.println(str.substring(i,j));
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        FindSubstring obj = new FindSubstring();
        obj.findSubstring(str);
    }
}

/*
output ->
Enter the string:
abc
a
ab
abc
b
bc
c
 */