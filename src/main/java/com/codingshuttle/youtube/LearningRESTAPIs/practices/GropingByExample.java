package com.codingshuttle.youtube.LearningRESTAPIs.practices;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

class GroupingClass {

    private List<Integer> list = new ArrayList<>();
    GroupingClass(List<Integer> list) {
        this.list = list;
    }

    void groupList() {


        Map<String, List<Integer>> grouped = list.stream().collect(Collectors.groupingBy(
                n -> n%2 == 0 ? "Even" : "Odd"
        ));

        System.out.print(grouped);
    }

}
public class GropingByExample {

    public static void main(String[] args) {
        System.out.println("Enter the size of the list: ");
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the elements in the list: ");
        for(int i =0; i<n; i++) {
            list.add(sc.nextInt());
        }

        GroupingClass obj = new GroupingClass(list);
        obj.groupList();
    }
}

/*

output ->

Enter the size of the list:
9
Enter the elements in the list: 1 2 1 4 3 5 6 7 5
{Even=[2, 4, 6], Odd=[1, 1, 3, 5, 7, 5]}
Process finished with exit code 0

 */
