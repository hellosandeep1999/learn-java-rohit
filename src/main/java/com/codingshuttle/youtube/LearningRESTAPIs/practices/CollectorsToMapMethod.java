package com.codingshuttle.youtube.LearningRESTAPIs.practices;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CollectorsToMapMethod {

    private List<String> list = new ArrayList<>();

    CollectorsToMapMethod(List<String> list) {
        this.list = list;
    }

    void collectorsToMapMethod() {
        Map<String, Integer> map = list.stream().collect(Collectors.toMap(
                word -> word,
                word -> word.length()
        ));
        System.out.println(map);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the list: ");
        int n = sc.nextInt();
        sc.nextLine();
        List<String> list = new ArrayList<>();
        System.out.println("Enter the words in the list: ");
        for(int i = 0; i<n; i++) {
            list.add(sc.nextLine());
        }

        CollectorsToMapMethod obj = new CollectorsToMapMethod(list);
        obj.collectorsToMapMethod();

    }
}


/*
output ->
Enter the size of the list:
5
Enter the words in the list:
rohit
ronak
tarun
trisha
om
{ronak=5, trisha=6, rohit=5, tarun=5, om=2}
 */