package com.codingshuttle.youtube.LearningRESTAPIs.practices;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
class CheckPalindrome {

    private final List<String> List1;
    CheckPalindrome(List<String> List1) {
        this.List1 = List1;
    }

    void IsPalindrome() {
        List<String> List2 = new ArrayList<>();

        for(String s1 : List1) {
            String s2 = s1.toLowerCase();
            String rev = new StringBuilder(s2).reverse().toString();
            if(s2.equals(rev)) {
                List2.add(s1);
            }
        }
        if(List2.isEmpty()) {
            System.out.println("There are no palindrome strings.");
            return;
        }
        System.out.println("Palindrome strings are: ");
        for(String s1 : List2) {
            System.out.println(s1+ " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> List1 = new ArrayList<>();
        System.out.println("Enter the size of the string:");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the elements in this list:");
        for(int i=0; i<n; i++){
            List1.add(sc.nextLine());
        }
        CheckPalindrome obj = new CheckPalindrome(List1);
        obj.IsPalindrome();

    }
}



/*

output ->
Enter the size of the string:
5
Enter the elements in this list:
Rohit
Naman
gfg
aasdfg
rgth
Palindrome strings are:
Naman
gfg


*/