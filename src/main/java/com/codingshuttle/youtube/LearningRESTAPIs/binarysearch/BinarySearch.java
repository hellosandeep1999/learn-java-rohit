package com.codingshuttle.youtube.LearningRESTAPIs.binarysearch;

// Given a sorted array and a target, return its index or -1.

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

class BinarySearch {

    private List<Integer> list = new ArrayList<>();
    BinarySearch(List<Integer> list) {
        this.list = list;
        Collections.sort(this.list);
    }

    int binarySearch(int x) {
        int l = 0, r = list.size()-1;
        while(l<=r) {
            int mid = l+(r-l)/2;

            if(list.get(mid) == x) return mid;
            else if(list.get(mid)>x) {
                r = mid-1;
            } else {
                l = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the list: ");
        Integer n = sc.nextInt();
        sc.nextLine();
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter the elements in the list: ");
        for(int i = 0;i<n; i++){
            list.add(sc.nextInt());
        }
        System.out.println("Enter the number to find in list: ");
        int x = sc.nextInt();
        BinarySearch obj = new BinarySearch(list);
        System.out.println("Element found at index: " + obj.binarySearch(x));
    }
}
/*
output ->
Enter the size of the list:
9
Enter the elements in the list:
1 2 3 4 5 6 7 8 9
Enter the number to find in list:
4
Element found at index: 3
 */
