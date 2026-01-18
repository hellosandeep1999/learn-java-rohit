package com.codingshuttle.youtube.LearningRESTAPIs.dsapractice;

import java.util.Scanner;

public class IsRotational {

    boolean isRotational(String str1 , String str2) {
        if(str1.length() != str2.length()) return false;

        String str3 = str1 + str1;

        if(str3.contains(str2)) return true;

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String str1 = sc.nextLine();
        System.out.println("Enter the second string: ");
        String str2 = sc.nextLine();

        IsRotational obj = new IsRotational();
        if(obj.isRotational(str1,str2)) {
            System.out.println(str2 + " is rotational of " + str1);
        }
        else{
            System.out.println(str2 + " is not rotational of " + str1);
        }

    }
}

/*
output->
Enter the first string:
abcd
Enter the second string:
cdab
cdab is rotational of abcd
 */
