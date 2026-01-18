package com.codingshuttle.youtube.LearningRESTAPIs.practices;

import java.util.Scanner;

class RemoveInvalidChar2 {

    String removeInvalidChar(String str) {
        StringBuilder sb = new StringBuilder();

        for(char ch : str.toCharArray()) {
            if(Character.isLetterOrDigit(ch)) {
                sb.append(ch);
            }
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        RemoveInvalidChar2 obj = new RemoveInvalidChar2();
        System.out.println(obj.removeInvalidChar(str));
    }
}
/*
output ->
Enter the string:
he@##llo
hello
 */