package com.codingshuttle.youtube.LearningRESTAPIs.binarysearch;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class PeakElement {

    private List<Integer> list = new ArrayList<>();

    PeakElement(List<Integer> list) {
        this.list = list;
    }

    int peakElement() {
        int low = 0, high = list.size()-1;

        while(low<high) {
            int mid = low+(high-low)/2;

            if(list.get(mid) < list.get(mid+1)) {
                low = mid+1;
            } else {
                high = mid;
            }
        }
        return list.get(low);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the list: ");
        int n = sc.nextInt();
        sc.nextLine();

        List<Integer> list = new ArrayList<>();
        System.out.println("Enter the elements in the list: ");
        for(int i = 0;i<n; i++) {
            list.add(sc.nextInt());
        }

        PeakElement obj = new PeakElement(list);
        System.out.println(obj.peakElement());
    }
}
/*
output ->
Enter the size of the list:
6
Enter the elements in the list:
1 3 20 4 1 10
20
 */