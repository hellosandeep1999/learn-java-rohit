package com.codingshuttle.youtube.LearningRESTAPIs.practices;

import java.util.Scanner;
import java.util.Arrays;

public class MergeLists {
    void mergeLists(int[] List1, int[] List2) {
        int[] List3 = new int[List1.length + List2.length];
        int k = 0;

        for (int j : List1) {
            List3[k++] = j;
        }

        for (int j : List2) {
            List3[k++] = j;
        }

        System.out.println("Merged List: " + Arrays.toString(List3));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first list: ");
        int n1 = sc.nextInt();
        int[] List1 = new int[n1];
        System.out.println("Enter elements of first list:");
        for (int i = 0; i < n1; i++) {
            List1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second list: ");
        int n2 = sc.nextInt();
        int[] List2 = new int[n2];
        System.out.println("Enter elements of second list:");
        for (int i = 0; i < n2; i++) {
            List2[i] = sc.nextInt();
        }

        MergeLists obj = new MergeLists();
        obj.mergeLists(List1, List2);
    }
}
