package com.codingshuttle.youtube.LearningRESTAPIs.practices;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FilterByChar {

    private List<String> list1 = new ArrayList<>();

    FilterByChar(List<String> list1) {
        this.list1 = list1;
    }

    void filterByChar() {
        Map<Character, List<String>> grouped = list1.stream().collect(Collectors.groupingBy(
           n -> n.charAt(0)
        ));

        System.out.println(grouped);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the the list: ");
        int n = sc.nextInt();
        sc.nextLine();
        List<String> list1 = new ArrayList<>();
        System.out.println("Enter the words in the list: ");
        for(int i = 0; i<n; i++) {
            list1.add(sc.nextLine());
        }

        FilterByChar obj = new FilterByChar(list1);
        obj.filterByChar();
    }
}


/*
output ->

Enter the size of the the list:
5
Enter the words in the list:
rohit
ronak
tarun
trisha
mohan
{r=[rohit, ronak], t=[tarun, trisha], m=[mohan]}
 */