package com.codingshuttle.youtube.LearningRESTAPIs.dsapractice;

import java.util.Scanner;

class RemoveDuplicate {

    void removeDuplicate(String str) {
        String result = "";
        for(char ch : str.toCharArray()) {
            if(!result.contains(String.valueOf(ch))) {
                result += ch;
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        RemoveDuplicate obj = new RemoveDuplicate();
        obj.removeDuplicate(str);
    }
}
/*
output ->
Enter the string:
rohit jain
rohit jan
 */