package com.orange.practice.datastructures.strings;

import java.util.Arrays;

public class StringAnagram {

    public static void main(String[] args) {
        System.out.println(anagramChecker("rat", "art"));
        System.out.println(anagramChecker("alert", "alter"));
        System.out.println(anagramChecker("charlie", "shantanu"));
        System.out.println(anagramChecker("slot machines", "cash lost in me"));
    }

    private static boolean anagramChecker(String str1, String str2) {
        boolean result = false;
        char[] characterArrayString1 = str1.toCharArray();
        char[] characterArrayString2 = str2.toCharArray();
        Arrays.sort(characterArrayString1);
        Arrays.sort(characterArrayString2);
        return Arrays.equals(characterArrayString1, characterArrayString2);
    }
}
