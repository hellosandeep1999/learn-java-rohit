package com.codingshuttle.youtube.LearningRESTAPIs.practices;

import java.util.Scanner;

class ReverseFruits {

    void reverseFruits(String[] fruits) {
        if (fruits.length == 0 || (fruits.length == 1 && fruits[0].trim().isEmpty())) {
            System.out.println("Please enter some fruit names.");
            return;
        }

        System.out.println("Reversed fruits names:");
        for (String fruit : fruits) {
            String tempFruit = new StringBuilder(fruit.trim()).reverse().toString();
            System.out.println(tempFruit);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter fruit names:");
        String fruitsName = sc.nextLine();

        String[] fruits = fruitsName.split(",");
        ReverseFruits obj = new ReverseFruits();
        obj.reverseFruits(fruits);
    }
}

