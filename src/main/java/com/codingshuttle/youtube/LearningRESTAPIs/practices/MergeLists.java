package com.codingshuttle.youtube.LearningRESTAPIs.practices;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
class MergeLists {

    private final List<Integer> List1;
    private final List<Integer> List2;

    public MergeLists(List<Integer> List1, List<Integer> List2) {
        this.List1 = List1;
        this.List2 = List2;
    }

    void mergeLists() {
        List1.addAll(List2);

        System.out.println("Merged List: ");
        for(int i : List1) {
            System.out.print(i+ " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> List1 = new ArrayList<>();
        List<Integer> List2 = new ArrayList<>();

        System.out.println("Enter the size of the first list: ");
        int n1 = sc.nextInt();
        System.out.println("Enter the size of the second list: ");
        int n2 = sc.nextInt();

        System.out.println("Enter elements in first list: ");
        for(int i = 0; i< n1; i++) {
            List1.add(sc.nextInt());
        }
        System.out.println("Enter elements in second list: ");
        for(int i = 0 ; i< n2; i++) {
            List2.add(sc.nextInt());
        }


        MergeLists obj = new MergeLists(List1,List2);
        obj.mergeLists();
    }
}


/*

output ->

Enter the size of the first list:
5
Enter the size of the second list:
5
Enter elements in first list:
1 2 3 4 5
Enter elements in second list:
6 7 8 9 5
Merged List:
1 2 3 4 5 6 7 8 9 5


 */