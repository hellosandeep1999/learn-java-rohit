package com.codingshuttle.youtube.LearningRESTAPIs.practices;

import java.util.Scanner;

class RemoveInvalidChar1 {

    String removeInvalidChar(String str) {
        return str.replaceAll("[^a-zA-Z0-9]", "");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        RemoveInvalidChar1 obj = new RemoveInvalidChar1();
        System.out.println(obj.removeInvalidChar(str));
    }
}
/*
output ->
Enter the string:
he@##llo
hello
 */