package com.basic;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[ ] arg)
    {
        boolean isVowel=false;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a character : ");
        char ch=scanner.next().charAt(0);
        scanner.close();
        switch (ch) {
            case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> isVowel = true;
        }
        if(isVowel) {
            System.out.println(ch+" is  a Vowel");
        }
        else {
            if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
                System.out.println(ch+" is a Consonant");
            else
                System.out.println("Input is not an alphabet");
        }
    }
}