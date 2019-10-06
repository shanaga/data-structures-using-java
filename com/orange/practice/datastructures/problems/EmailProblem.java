package com.orange.practice.datastructures.problems;

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class EmailProblem {

    static Set<String> namesSet;

    public static void main(String[] args) {
        String names = "Bruce Smith John; Tiffanie Trump Fui; Adam Milne; Ashley Rogerswithmor-echaracters";
        String companyName = "Amazon";
        System.out.println(solution(names, companyName));
    }

    // Method to implement solution using Java 7
    public static String solution(String names, String companyName) {
        String result = "";
        if (!(validateName(names) && validateCompanyName(companyName))) {
            result = "Inputs validation failed";
        } else {
            // Convert populated set to list
            List<String> namesList = convertSetToList();

            String emailAddressWithName;
            char firstNameInitial;
            char middleNameInitial;
            String lastName = "";
            String nameInitials = "";

            // Iterate through the names in the converted list
            for (String fullName : namesList) {
                fullName = fullName.replace("-", "");
                String words[] = fullName.split(" ");
                // After splitting words, iterate through all items in the words array
                for (String word : words) {
                    // Check if the words length is less than 2
                    if (words.length <= 2) {
                        // E..g., Bruce Smith; Tiffanie Trump; Brain Smith; James Walter
                        firstNameInitial = word.toLowerCase().charAt(0);
                        lastName = words[1].toLowerCase();
                        nameInitials = firstNameInitial + "_" + (lastName.length() > 8 ? lastName.substring(0, 8) : lastName) + "@" + companyName.toLowerCase() + ".com";
                        break;
                    } else {
                        // E.g., Bruce Smith John; Tiffanie Trump Fui; Melissa Frank Gui; James Walter Iowa
                        firstNameInitial = word.toLowerCase().charAt(0);
                        middleNameInitial = words[1].toLowerCase().charAt(0);
                        lastName = words[2].toLowerCase();
                        nameInitials = firstNameInitial + "_" + middleNameInitial + "_" + (lastName.length() > 8 ? lastName.substring(0, 8) : lastName) + "@" + companyName.toLowerCase() + ".com";
                        break;
                    }
                }
                emailAddressWithName = fullName + " <" + nameInitials + ">; ";

                // Iterative populate all email addresses with names
                result = result + emailAddressWithName;
            }
        }
        return result;
    }

    // Method to check duplicate words in the input string
    public static Set<String> checkDuplicateWords(String input) {
        if (null == input || input.isEmpty()) {
            return Collections.emptySet();
        }
        Set<String> duplicates = new HashSet<>();
        String[] words = input.split(";");

        namesSet = new HashSet<>();
        for (String word : words) {
            if (!namesSet.add(word.trim())) {
                duplicates.add(word);
            }
        }
        return duplicates;
    }

    // Method to validate valid given name
    public static boolean validateName(String names) {
        if (Pattern.matches("^[a-zA-Z-;\\s]+$", names) && !(checkDuplicateWords(names).size() > 0)) {
            return true;
        }
        return false;
    }

    // Method to valid company name
    public static boolean validateCompanyName(String companyName) {
        if (Pattern.matches("^[a-zA-Z]+$", companyName)) {
            return true;
        }
        return false;
    }

    // Method to convert set to list
    public static List<String> convertSetToList() {
        List<String> namesList = new ArrayList<>(namesSet);
        return namesList;
    }

    // Method to check duplicate email addresses
    public static boolean checkForDuplicateEmailAddress(String plainAddress) {
        int count = 0;
        String emailAddressSplit[] = plainAddress.split(";");
        for (int i = 0; i < emailAddressSplit.length; i++) {
            for (int j = i + 1; j < emailAddressSplit.length; j++) {
                if (emailAddressSplit[i].equals(emailAddressSplit[j])) {
                    count++;
                }
            }
        }
        return false;
    }
}
