package com.numbers;

public class GreatestCommonDivisor2
{
    public static void main(String[] args)
    {
        int num1 = 55, num2 = 121;

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

        System.out.printf("GCD of given numbers is: %d", num2);
    }
}