package com.numbers;

import java.util.Scanner;

public class PrimeNumber4 {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i;
        int num;

        // Empty String.

        StringBuilder primeNumbers;
        primeNumbers = new StringBuilder();

        System.out.println("Enter the value of n:");
        int n = scanner.nextInt();

        scanner.close();

        for ( i = 1; i <= n; i ++ ) {

            int counter = 0;
            for ( num = i; num >= 1; num -- ) {

                if ( i % num == 0 ) {
                    counter = counter + 1;
                }
            }
            if ( counter == 2) {

                //Appended the Prime number to the String.

                primeNumbers.append(i).append(" ");
            }
        }
        System.out.println("Prime numbers from 1 to n are :");
        System.out.println(primeNumbers);
    }
}