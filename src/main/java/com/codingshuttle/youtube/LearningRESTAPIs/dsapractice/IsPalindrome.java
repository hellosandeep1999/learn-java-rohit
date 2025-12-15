package com.codingshuttle.youtube.LearningRESTAPIs.dsapractice;

import java.util.Scanner;
public class IsPalindrome {

    boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        int s = 0, e = sb.length()-1;
        while(s<e) {
            if(sb.charAt(s)!= sb.charAt(e)) return false;

            s++;
            e--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Enter the srting: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        IsPalindrome obj = new IsPalindrome();
        if(obj.isPalindrome(str)) {
            System.out.println("Yes " + str + " is a palindrome string.");
        }
        else {
            System.out.println("No" + str + " is not a palindrome string.");
        }

    }
}

/*
ouput ->
Enter the srting:
naman
Yes naman is a palindrome string.
 */
