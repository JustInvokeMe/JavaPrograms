package com.other;

import java.util.Scanner;

public class MakeCalculator
{
    public static void main(String[] args)
    {
        double num1, num2;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");

        /* We are using data type double so that user
         * can enter integers as well as floating point
         * value.
         */

        num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");

        num2 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");

        char operator = scanner.next().charAt(0);

        scanner.close();

        double output;

        /* If user enters any other operator or char apart from
         * +, -, * and /, the display an error message to user.
         */

        switch (operator)
        {
            case '+' -> output = num1 + num2;

            case '-' -> output = num1 - num2;

            case '*' -> output = num1 * num2;

            case '/' -> output = num1 / num2;

            default ->
                    {
                        System.out.print("You have entered wrong operator");
                        return;
                    }
        }

        System.out.println(num1 + " " + operator + " " + num2 + " : " + output);
    }
}
