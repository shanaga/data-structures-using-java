package com.orange.practice.datastructures.strings;

public class HammingDistance {

    public static void main(String[] args) {
        System.out.println(calculateHammingDistance("ACTTGACCGGG", "GATCCGGTACA"));
    }

    private static int calculateHammingDistance(String str1, String str2) {
        int count = 0;
        if (str1.length() == str2.length()) {
            count = 0;
            for (char ch = '\0'; ch < str1.length(); ch++) {
                if (str1.charAt(ch) != str2.charAt(ch)) {
                    count++;
                }
            }
            return count;
        }
        return 0;
    }
}
