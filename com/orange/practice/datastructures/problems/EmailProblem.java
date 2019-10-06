package com.orange.practice.datastructures.problems;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public class EmailProblem {

    public static void main(String[] args) {
        String names = "John Doe; Peter Parker; Mary Jane Watson-Parker; James Doe; John Elvis Doe; Jane Doe; Penny Parker";
        //String names = "James Doe; Peter Parker; Mary Jane Watson-Parker; James Doe; John Elvis Doe; Jane Doe; Penny Parker";
        String companyName = "Amazon";

        if (validateName(names) && validateCompanyName(companyName)) {
            System.out.println("Proceed with solution");
            solution(names, companyName);
        } else {
            System.out.println("Goto hell");
        }
    }

    public static String solution(String names, String companyName) {
        return null;
    }

    public static Set<String> checkDuplicateWords(String input) {
        if (null == input || input.isEmpty()) {
            return Collections.emptySet();
        }
        Set<String> duplicates = new HashSet<>();
        String[] words = input.split(";");

        Set<String> finalSet = new HashSet<>();
        for (String word : words) {
            if (!finalSet.add(word.trim())) {
                duplicates.add(word);
            }
        }
        System.out.println("Number of Duplicates found : " + duplicates.size());
        return duplicates;

    }


    // Regex pattern to valid given name
    public static boolean validateName(String names) {
        if (Pattern.matches("^[a-zA-Z-;\\s]+$", names) && !(checkDuplicateWords(names).size() > 0)) {
            System.out.println("Given names validated successfully");
            return true;
        }
        return false;
    }

    // Regex pattern to valid company name
    public static boolean validateCompanyName(String companyName) {
        if (Pattern.matches("^[a-zA-Z]+$", companyName)) {
            System.out.println("Given company name matched successfully");
            return true;
        }
        return false;
    }
}
