package com.codingshuttle.youtube.LearningRESTAPIs.dsapractice;

import java.util.Scanner;

class RemoveSpace {

    String removeSpace(String str) {
        return str.replaceAll("\\s+", "");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        RemoveSpace obj = new RemoveSpace();
        System.out.println(obj.removeSpace(str));

    }
}

/*
output ->
Enter the string:
Hello I am Rohit Jain
HelloIamRohitJain
 */