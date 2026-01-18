package com.codingshuttle.youtube.LearningRESTAPIs.practices;

import java.util.Scanner;

class ContainsOnlyDigits {

    boolean containsOnlyDigits(String str) {
        return str.matches("\\d+");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        ContainsOnlyDigits obj = new ContainsOnlyDigits();
        if(obj.containsOnlyDigits(str)) {
            System.out.println("Yes, " + str + " contains only digits.");
        } else {
            System.out.println("No, " + str + " doesn't contains only digits.");
        }
    }
}
/*
output ->
Enter the string:
12323
Yes, 12323 contains only digits.
 */
