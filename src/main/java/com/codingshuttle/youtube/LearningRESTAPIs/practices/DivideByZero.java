package com.codingshuttle.youtube.LearningRESTAPIs.practices;

import java.util.Scanner;

class DivideByZero {

    int divideByZero(int a, int b) throws ArithmeticException {
        if(b == 0) {
            throw new ArithmeticException("Value of B cannot be zero.");
        }
        return a/b;
    }

    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of A: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of B: ");
        int b = sc.nextInt();

        DivideByZero obj = new DivideByZero();
        try {
            System.out.println("The result is: " + obj.divideByZero(a,b));
        } catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

}

/*
Output ->

Enter the value of A:
15
Enter the value of B:
3
The result is: 5

 */