package com.codingshuttle.youtube.LearningRESTAPIs.practices;

import java.util.Scanner;

public class CheckIsBlankString {

    boolean checkIsBlankString(String str) {
        return str.isBlank();   // directly return the result
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        CheckIsBlankString obj = new CheckIsBlankString();

        if(obj.checkIsBlankString(str)) {
            System.out.println("String is blank");
        } else {
            System.out.println("String is not blank");
        }
    }
}


/*
output ->
Enter the string:
rohit
String is not blank

 */