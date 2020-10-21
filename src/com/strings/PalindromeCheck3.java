package com.strings;

import java.util.Scanner;

public class PalindromeCheck3 {

    public static void main(String[] args) {

        StringBuilder reverseString= new StringBuilder();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string to check if it is a palindrome:");
        String inputString = scanner.nextLine();

        int length = inputString.length();

        for ( int i = length - 1 ; i >= 0 ; i-- )
            reverseString.append(inputString.charAt(i));

        if (inputString.equals(reverseString.toString()))
            System.out.println("Input string is a palindrome");
        else
            System.out.println("Input string is not a palindrome.");

    }
}