package com.codingshuttle.youtube.LearningRESTAPIs.practices;

import java.util.Scanner;

class ReplaceAllVowels {

    String replaceAllVowels(String str) {
        return str.replaceAll("[AEIOUaeiou]","*");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        ReplaceAllVowels obj = new ReplaceAllVowels();
        System.out.println(obj.replaceAllVowels(str));
    }
}

/*
output ->
Enter the string:
Hello World
H*ll* W*rld
 */