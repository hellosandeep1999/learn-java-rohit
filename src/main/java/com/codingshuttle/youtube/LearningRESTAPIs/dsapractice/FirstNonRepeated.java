package com.codingshuttle.youtube.LearningRESTAPIs.dsapractice;

import java.util.Scanner;

class FirstNonRepeated {
    //aabbcdd
    char firstNonRepeated(String str) {
        int count = 1;
        char[] chars = str.toCharArray();
        for(int i =0; i<chars.length-1; i++) {
            if(chars[i] == chars[i+1]) {
                count++;
            } else {
                if(count == 1) {
                    return (char) chars[i];
                } else{
                    count = 1;
                }
            }
        }
        if(count == 1) {
            return chars[chars.length-1];
        }
        return '\0';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        FirstNonRepeated obj = new FirstNonRepeated();
        char result = obj.firstNonRepeated(str);
        if(result != '\0') {
            System.out.println("First Non repeated character is: " + result);
        }
        else {
            System.out.println("No Repeated character found.");
        }
    }
}

/*
output ->

Enter the string:
aabbcdd
First Non repeated character is: c
 */