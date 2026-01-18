package com.codingshuttle.youtube.LearningRESTAPIs.dsapractice;

import java.util.Scanner;

public class CountAndSay {
    String countAndSay(int n) {

        String s = "1";
        if (n == 1) {
            return "11";
        }

        for (int i = 1; i < n; i++) {
            StringBuilder temp = new StringBuilder();
            int count = 1;

            for (int j = 1; j < s.length(); j++) {
                if (s.charAt(j) == s.charAt(j - 1)) {
                    count++;
                } else {
                    temp.append(count).append(s.charAt(j - 1));
                    count = 1;
                }
            }

            temp.append(count).append(s.charAt(s.length() - 1));
            s = temp.toString();
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        CountAndSay obj = new CountAndSay();
        System.out.println(obj.countAndSay(n));
    }

}

/*

output ->
Enter the number:
4
1211
 */

