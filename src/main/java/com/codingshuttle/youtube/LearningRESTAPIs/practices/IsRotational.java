package com.codingshuttle.youtube.LearningRESTAPIs.practices;

import java.util.Scanner;

class IsRotational {

    boolean isRotational(String str1, String str2) {
        if(str1.length() != str2.length()) {
            return false;
        }
        String temp = str1+str1;
        if(temp.contains(str2)) return true;

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string1: ");
        String str1 = sc.nextLine();
        System.out.println("Enter the string2: ");
        String str2 = sc.nextLine();

        IsRotational obj = new IsRotational();
        if(obj.isRotational(str1,str2)) {
            System.out.println("Yes both strings are rotational of each other.");
        } else {
            System.out.println("No both strings are not rotational of each other.");
        }
    }
}
/*
output ->
Enter the string1:
acd
Enter the string2:
cda
Yes both strings are rotational of each other.
 */