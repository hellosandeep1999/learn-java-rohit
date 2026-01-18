package com.codingshuttle.youtube.LearningRESTAPIs.dsapractice;

import java.util.Scanner;

class ToUpperCase {

    String toUpperCase(String str) {
        char[] chars = str.toCharArray();

        for(int i = 0; i<chars.length; i++) {
            if(chars[i] >= 'a' && chars[i] <= 'z') {
                chars[i] = (char) (chars[i]-32);
            }
        }
        String result = new String(chars);
        return result;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sting to convert in upper case: ");
        String str = sc.nextLine();

        ToUpperCase obj = new ToUpperCase();
        System.out.println("String in upper case: " + obj.toUpperCase(str));
    }
}

/*
output ->

Enter the sting to convert in upper case:
rohit jain
String in upper case: ROHIT JAIN
 */
