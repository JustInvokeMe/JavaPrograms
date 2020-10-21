package com.strings;

import java.util.Stack;
import java.util.Scanner;

public class PalindromeCheck {

    public static void main (String[] args) {

        System.out.print("Enter any string:");
        Scanner in=new Scanner(System.in);
        String inputString = in.nextLine();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < inputString.length(); i++) {
            stack.push(inputString.charAt(i));
        }

        StringBuilder reverseString = new StringBuilder();

        while (!stack.isEmpty()) {
            reverseString.append(stack.pop());
        }

        if (inputString.equals(reverseString.toString()))
            System.out.println("The input String is a palindrome.");
        else
            System.out.println("The input String is not a palindrome.");

    }
}