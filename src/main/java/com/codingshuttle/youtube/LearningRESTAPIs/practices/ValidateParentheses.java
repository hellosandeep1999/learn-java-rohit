package com.codingshuttle.youtube.LearningRESTAPIs.practices;

import java.util.Scanner;
import java.util.Stack;

class ValidateParentheses {

    boolean validateParentheses(String str) {
        Stack<Character> st = new Stack<>();

        for(char ch : str.toCharArray()) {
            if(ch == '(' || ch == '{' || ch == '[') st.push(ch);

            else if(ch == ')' || ch == '}' || ch == ']') {
                if(st.isEmpty()) return false;

                char top = st.pop();
                if(ch == ')' && top!='(' ||
                        ch == '}' && top!='{' ||
                        ch == ']' && top!='['
                ) return false;
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string of parentheses : ");
        String str = sc.nextLine();

        ValidateParentheses obj = new ValidateParentheses();
        if(obj.validateParentheses(str)) {
            System.out.println("It's a validate parentheses string.");
        }
        else {
            System.out.println("It's not a validate parentheses string.");
        }

    }
}
/*
output ->
Enter the string of parentheses :
([{}])
It's a validate parentheses string.
 */