package com.numbers;

public class PrimeNumber3 {

    public static void main(String[] args) {

        int i;
        int num;

        StringBuilder primeNumbers = new StringBuilder();

        for ( i = 1; i <= 100; i++ ) {

            int counter = 0;
            for ( num = i; num >= 1; num -- ) {

                if ( i % num == 0 ) {

                    counter = counter + 1;
                }
            }

            if ( counter == 2 ) {

                // Appended the Prime number to the String.

                primeNumbers.append(i).append(" ");
            }
        }
        System.out.println("Prime numbers from 1 to 100 are :");
        System.out.println(primeNumbers);
    }
}