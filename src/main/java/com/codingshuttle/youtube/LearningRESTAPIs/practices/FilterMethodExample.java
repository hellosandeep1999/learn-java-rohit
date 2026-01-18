package com.codingshuttle.youtube.LearningRESTAPIs.practices;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class FilterMethod {
    private List<Integer> list = new ArrayList<>();
    FilterMethod(List<Integer> list) {
        this.list = list;
    }

    void findEven() {
        List<Integer> evenNumber = list.stream().filter(n -> n%2 == 0).toList();

        System.out.println("Even numbers list: " + evenNumber);
    }
}

public class FilterMethodExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the list: ");
        int n = sc.nextInt();
        sc.nextLine();
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter the elements in the list: ");
        for(int i=0; i<n; i++) {
            list.add(sc.nextInt());
        }

        FilterMethod obj = new FilterMethod(list);
        obj.findEven();
    }
}


/*


output ->

Enter the size of the list:
9
Enter the elements in the list:
1 2 1 4 3 5 6 7 5
Even numbers list: [2, 4, 6]

Process finished with exit code 0
 */