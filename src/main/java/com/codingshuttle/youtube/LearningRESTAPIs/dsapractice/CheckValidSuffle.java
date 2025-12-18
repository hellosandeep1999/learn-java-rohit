package com.codingshuttle.youtube.LearningRESTAPIs.dsapractice;

import java.util.Arrays;
import java.util.Scanner;

public class CheckValidSuffle {

    static boolean isShuffledSubstring(String s1, String s2) {
        int n = s1.length();
        char[] sortedS1 = s1.toCharArray();
        Arrays.sort(sortedS1);

        for (int i = 0; i <= s2.length() - n; i++) {
            char[] temp = s2.substring(i, i + n).toCharArray();
            Arrays.sort(temp);

            if (Arrays.equals(sortedS1, temp))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string1: ");
        String s1 = sc.nextLine();
        System.out.println("Enter the string2: ");
        String s2 = sc.nextLine();

        if(isShuffledSubstring(s1,s2)) System.out.println(s1 + " is valid suffle of " + s2);
        else System.out.println(s1 + " is not valid suffle of " + s2);


    }
}

/*

output ->
Enter the string1:
abc
Enter the string2:
bbbca
abc is valid suffle of bbbca

 */
