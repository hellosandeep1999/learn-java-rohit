package com.codingshuttle.youtube.LearningRESTAPIs.binarysearch;


// Find the first occurrence of a number in a sorted array.

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class FirstOccurance {

    private List<Integer> list;

    FirstOccurance(List<Integer> list) {
        this.list = list;
        Collections.sort(this.list);
    }

    int firstOccurance(int x) {
        int l = 0, r = list.size()-1;
        int ans = -1;
        while(l<=r) {
            int mid = l+(r-l)/2;
            if(list.get(mid) == x) {
                ans = mid;
                r = mid-1;
            } else if(list.get(mid)>x) {
                r = mid-1;
            } else {
                l = mid+1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the list: ");
        int n = sc.nextInt();
        sc.nextLine();
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter the elements in the list: ");
        for(int i = 0; i<n; i++) {
            list.add(sc.nextInt());
        }
        System.out.println("Enter the element you want to find first occurance: ");
        int x = sc.nextInt();

        FirstOccurance obj = new FirstOccurance(list);

        System.out.println("First occurance of " + x + " is at index: " + obj.firstOccurance(x));
    }
}
