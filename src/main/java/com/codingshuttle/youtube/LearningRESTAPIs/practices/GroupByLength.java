package com.codingshuttle.youtube.LearningRESTAPIs.practices;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.List;

public class GroupByLength {
    private List<String> list1 = new ArrayList<>();

    GroupByLength(List<String> list1) {
        this.list1 = list1;
    }


    void groupByLength() {

        HashMap<Integer, List<String>> map = new HashMap<>();

        list1.forEach(item1 -> {
            int len = item1.length();

            map.putIfAbsent(len, new ArrayList<>());
            map.get(len).add(item1);
        });

        System.out.println(map);
    }

   public static void main(String[] args) {
       List<String> list1 = new ArrayList<>();
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the size of list: ");
       int n = sc.nextInt();
       sc.nextLine();
       System.out.println("Enter the string one by one: ");
       for(int i = 0; i<n; i++) {
           list1.add(sc.nextLine());
       }

       GroupByLength obj = new GroupByLength(list1);

       obj.groupByLength();
   }
}


/*

output ->

Enter the size of list:
5
Enter the string one by one:
rohit
bat
cat
effg
hellll
{3=[bat, cat], 4=[effg], 5=[rohit], 6=[hellll]}

 */