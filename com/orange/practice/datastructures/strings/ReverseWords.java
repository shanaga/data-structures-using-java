package com.orange.practice.datastructures.strings;

public class ReverseWords {

    public static void main(String[] args) {
        System.out.println(wordFlipper("this is shantanu agarwal"));
    }

    private static String wordFlipper(String inputString) {
        String[] words = inputString.split(" ");
        String reversedString = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reversedWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                reversedWord = reversedWord + word.charAt(j);
            }
            reversedString += reversedWord + " ";
        }
        return reversedString;
    }
}
