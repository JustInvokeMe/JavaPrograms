package com.numbers;

import java.util.Scanner;

public class PositiveOrNegative2
{
    public static void main(String[] args)
    {
        int number;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number you want to check:");

        number = scanner.nextInt();

        scanner.close();

        if (number > 0)
        {
            System.out.println(number + " is a positive number");
        }

        else if (number < 0)
        {
            System.out.println(number + " is negative number");
        }

        else
        {
            System.out.println(number + " is neither positive nor negative");
        }
    }
}