package com.recursion;

public class Factorial2 {

    public static void main(String[] args) {

        int factorial = fact(4);
        System.out.println("Factorials of 4 is: " + factorial);
    }
    static int fact(int n) {

        int output;
        if(n==1) {

            return 1;
        }

        // Recursion: Function calling itself!

        output = fact(n-1)* n;
        return output;
    }
}