package com.codingshuttle.youtube.LearningRESTAPIs.practices;

import java.util.Scanner;

public class CheckAge {

    void checkAge(int age) {
        if(age < 18) {
            throw new IllegalArgumentException("You are not  eligible for vote.");
        }
        System.out.println("You  are eligible for vote");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        CheckAge obj = new CheckAge();
        try {
            obj.checkAge(age);
        } catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

}


/*
Output ->
Enter your age:
18
You  are eligible

 */