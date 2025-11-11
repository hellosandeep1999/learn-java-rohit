package com.codingshuttle.youtube.LearningRESTAPIs.practices;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseFruits {

    private final List<String> fruits;

    public ReverseFruits(List<String> fruits) {
        this.fruits = fruits;
    }

    void reverseFruits() {
        if (fruits == null || fruits.isEmpty()) {
            System.out.println("Please enter some fruit names.");
            return;
        }

        System.out.println("Reversed fruit names:");
        for (String fruit : fruits) {
            String tempFruit = new StringBuilder(fruit).reverse().toString();
            System.out.println(tempFruit);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> fruitsList = new ArrayList<>();
        System.out.println("Enter fruits name: ");
        String input = sc.nextLine().trim();
        if (!input.isEmpty()) {
            fruitsList.add(input);
        }

        ReverseFruits obj = new ReverseFruits(fruitsList);
        obj.reverseFruits();
    }
}


/*
output ->

Enter fruits name:
apple, bananaa, mango
Reversed fruit names:
ognam ,aananab ,elppa
*/