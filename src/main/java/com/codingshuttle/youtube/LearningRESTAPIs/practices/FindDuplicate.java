package com.codingshuttle.youtube.LearningRESTAPIs.practices;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

class FindDuplicate {
    private List<Integer> list = new ArrayList<>();

    FindDuplicate(List<Integer> list) {
        this.list = list;
    }

    boolean findDuplicate() {
        int n = list.size();

        Set<Integer> set = new HashSet<>();
        for(int num : list) {
            set.add(num);
        }

        int setSize = set.size();
        if(n != setSize) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the elements in the list: ");
        for(int i=0; i<n; i++) {
            list.add(sc.nextInt());
        }

        FindDuplicate obj = new FindDuplicate(list);
        if(obj.findDuplicate()) {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }


    }

}


/*

output ->

Enter the size of the array:
5
Enter the elements in the list:
1 2 1 3 2
True

 */



