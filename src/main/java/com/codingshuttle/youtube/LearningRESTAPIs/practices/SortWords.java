package com.codingshuttle.youtube.LearningRESTAPIs.practices;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class SortWords {

    private final List<String> List1;
    SortWords(List<String> List1) {
        this.List1 = List1;
    }

    void sortWords() {
        List1.sort((a, b) -> Integer.compare(a.length(), b.length()));

        System.out.println("List in sorted order: ");
        List1.forEach(s1 ->{
            System.out.println(s1+ "\n");
        });
    }

    public static void main(String[] args) {
        List<String> List1 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of list:");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the strings: ");
        for(int i=0; i<n; i++) {
            List1.add(sc.nextLine());
        }

        SortWords obj = new SortWords(List1);
        obj.sortWords();

    }
}

/*

output ->

Enter the size of list:
4
Enter the strings:
rohit
ff
ert
df
List in sorted order:
ff

df

ert

rohit

 */
