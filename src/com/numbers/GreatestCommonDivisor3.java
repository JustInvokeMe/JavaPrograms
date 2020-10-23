package com.numbers;

import java.util.Scanner;

public class GreatestCommonDivisor3
{
    public static void main(String[] args)
    {
        int num1, num2;

        // Reading the input numbers.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number:");

        num1 = scanner.nextInt();

        System.out.print("Enter second number:");

        num2 = scanner.nextInt();

        // Closing the scanner to avoid memory leaks.

        scanner.close();

        while (num1 != num2)
        {
            if (num1 > num2)
            {
                num1 = num1 - num2;
            }

            else
            {
                num2 = num2 - num1;
            }
        }

        // Displaying the result.

        System.out.printf("GCD of given numbers is: %d", num2);
    }
}