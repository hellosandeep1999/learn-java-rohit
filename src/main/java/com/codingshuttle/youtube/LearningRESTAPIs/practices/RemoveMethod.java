package com.codingshuttle.youtube.LearningRESTAPIs.practices;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveMethod {

    private List<String> list1 = new ArrayList<>();

    RemoveMethod(List<String> list1) {
        this.list1 = list1;
    }

    void removeMethod(String removeString) {
        if(list1.contains(removeString)) {
            list1.remove(removeString);
            System.out.println("List after remove: "+ list1);
        } else {
            System.out.println("Not found.");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the list: ");
        int n = sc.nextInt();
        sc.nextLine();
        List<String> list1 = new ArrayList<>();
        System.out.println("Enter the words in the list: ");
        for(int i = 0; i<n; i++) {
            list1.add(sc.nextLine());
        }
        System.out.println("Enter the word you want to remove from this list: ");
        String removeString = sc.nextLine();

        RemoveMethod obj = new RemoveMethod(list1);
        obj.removeMethod(removeString);
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
mohan
Enter the word you want to remove from this list:
ronak
List after remove: [rohit, tarun, trisha, mohan]
 */