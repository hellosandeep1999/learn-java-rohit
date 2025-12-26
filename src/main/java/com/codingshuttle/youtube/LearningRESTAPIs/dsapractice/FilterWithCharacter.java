package com.codingshuttle.youtube.LearningRESTAPIs.dsapractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FilterWithCharacter {

    private List<String> list1 = new ArrayList<>();

    FilterWithCharacter(List<String> list1) {
        this.list1 = list1;
    }

    void filterWithCharacter(Character filterChar) {

        List<String> filtered = list1.stream().filter(n -> n.charAt(0) == filterChar).collect(Collectors.toList());
        System.out.println("Filtered list: " + filtered);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the list: ");
        int n = sc.nextInt();
        sc.nextLine();
        List<String> list1 = new ArrayList<>();
        System.out.println("Enter the elements in the list: ");
        for(int i = 0; i<n; i++) {
            list1.add(sc.nextLine());
        }
        System.out.println("Enter the character by which you want to filter words: ");
        Character filterChar = sc.nextLine().charAt(0);

        FilterWithCharacter obj = new FilterWithCharacter(list1);
        obj.filterWithCharacter(filterChar);
    }
}
/*
output ->
Enter the size of the list:
5
Enter the elements in the list:
rohit
ronak
tarun
trisha
mohan
Enter the character by which you want to filter words:
r
Filtered list: [rohit, ronak]
 */