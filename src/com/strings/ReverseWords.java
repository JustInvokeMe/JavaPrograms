package com.strings;

public class ReverseWords {

    public void reverseWordInMyString(String str) {

        /* The split() method of String class splits
         * a string in several strings based on the
         * delimiter passed as an argument to it
         */

        String[] words = str.split(" ");
        StringBuilder reversedString = new StringBuilder();
        for (String word : words) {

            StringBuilder reverseWord = new StringBuilder();
            for (int j = word.length() - 1; j >= 0; j--) {

                /* The charAt() function returns the character
                 * at the given position in a string
                 */

                reverseWord.append(word.charAt(j));
            }
            reversedString.append(reverseWord).append(" ");
        }
        System.out.println(str);
        System.out.println(reversedString);
    }
    public static void main (String[] args) {

        ReverseWords obj = new ReverseWords();
        obj.reverseWordInMyString("Welcome to Habbo");
        obj.reverseWordInMyString("This is an easy Java program");
    }
}