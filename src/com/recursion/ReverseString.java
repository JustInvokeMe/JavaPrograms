package com.recursion;

public class ReverseString {
    
    public static void main(String[] args) {
        
        String str = "Welcome to Habbo";
        String reversed = reverseString(str);
        System.out.println("The reversed string is: " +reversed);
        
    }

    private static String reverseString(String str) {

        if (str.isEmpty())
        return str;

        // Calling Function Recursively.

        return  reverseString(str.substring(1)) + str.charAt(0);
    }
}