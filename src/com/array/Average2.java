package com.array;

import java.util.Scanner;

public class Average2 {

    public static void main(String[] args) {

        System.out.println("How many numbers you want to enter?");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        /* Declaring array of n elements, the value
         * of n is provided by the user
         */

        double[] arr = new double[n];
        double total = 0;

        for (int i=0; i<arr.length; i++) {

            System.out.print("Enter Element No."+(i+1)+": ");
            arr[i] = scanner.nextDouble();
        }
        scanner.close();
        for (double v : arr) {

            total = total + v;
        }
        double average = total / arr.length;
        System.out.format("The average is: %.3f", average);
    }
}
