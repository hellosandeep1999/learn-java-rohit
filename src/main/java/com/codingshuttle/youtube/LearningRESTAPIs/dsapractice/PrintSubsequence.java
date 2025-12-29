package com.codingshuttle.youtube.LearningRESTAPIs.dsapractice;

import java.util.Scanner;

public class PrintSubsequence {
    void printSubsequence(String str ,int idx, String newStr) {
        if(idx == str.length()) {
            if(!newStr.isEmpty()) {
                System.out.println(newStr);
            }
            return;
        }

        printSubsequence(str, idx+1, newStr+str.charAt(idx));
        printSubsequence(str,idx+1, newStr);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        PrintSubsequence obj = new PrintSubsequence();
        obj.printSubsequence(str,0,"");
    }
}

/*
output ->
Enter the string:
abcd
abcd
abc
abd
ab
acd
ac
ad
a
bcd
bc
bd
b
cd
c
d

Process finished with exit code 0

 */