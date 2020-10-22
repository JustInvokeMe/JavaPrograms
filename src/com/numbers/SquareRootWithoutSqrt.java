package com.numbers;

import java.util.Scanner;

public class SquareRootWithoutSqrt {

    public static double squareRoot ( int number ) {

        double temp;

        double sr = number;

        do {

            temp = sr;
            sr = ( temp + ( number / temp )) / 2;
        }

        while ( ( temp - sr ) != 0 );
        return sr;
    }
    public static void main (String[] args) {

        System.out.print( " Enter any number : " );
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        scanner.close();

        System.out.println( " Square root of " + num + " is :" + squareRoot(num));
    }
}