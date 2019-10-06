package com.orange.practice.datastructures.problems;

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class EmailProblem {

    static Set<String> namesSet;

    public static void main(String[] args) {
        String names = "Bruce Smith; Tiffanie Trump; Brain Smith; James Walter";
        //String names = "Bruce Smith John; Tiffanie Trump Fui; Melissa Frank Gui; James Walter Iowa";
        // Actual //String names = "John Doe; Peter Parker; Mary Jane Watson-Parker; James Doe; John Elvis Doe; Jane Doe; Penny Parker";
        //String names = "James Doe; Peter Parker; Mary Jane Watson-Parker; James Doe; John Elvis Doe; Jane Doe; Penny Parker";
        String companyName = "Amazon";
        String emailAddresses = solution(names, companyName);
        System.out.println("EmailAddresses : " + emailAddresses);
    }

    public static String solution(String names, String companyName) {
        String result = "";
        if (!(validateName(names) && validateCompanyName(companyName))) {
            result = "Validation failed";
        } else {
            System.out.println("Input validated, proceed with solution");
            List<String> namesList = convertSetToList();
            System.out.println("NamesList : " + namesList.size());

            String emailAddressWithName;
            String plainEmailAddress;
            char firstNameInitial = '\\';
            char middleNameInitial;
            String lastName = "";
            String firstNameInitialWithLastName = "";
            for (String fullName : namesList) {
                // Replace any hyphen from names
                fullName = fullName.replace("-", "");
                String words[] = fullName.split(" ");
                //if (words.length <= 2) {
                for (String word : words) {
                    firstNameInitial = word.toLowerCase().charAt(0);
                    System.out.println("firstNameInitial : " + firstNameInitial);
                    lastName = words[1].toLowerCase();
                    System.out.println("lastName : " + lastName);
                    System.out.println("***");
                    break;
                }
                plainEmailAddress = firstNameInitial + "_" + lastName + "@" + companyName.toLowerCase() + ".com";
                //checkForDuplicateEmailAddress(plainEmailAddress);
                emailAddressWithName = fullName + " <" + firstNameInitial + "_" + lastName + "@" + companyName.toLowerCase() + ".com" + ">; ";
                result = result + emailAddressWithName;
            }
        }

        return result;
    }

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
        System.out.println("Count Value : " + count);
        return false;
    }


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
        System.out.println("Number of Duplicates found : " + duplicates.size());
        return duplicates;
    }


    // Method to validate valid given name
    public static boolean validateName(String names) {
        if (Pattern.matches("^[a-zA-Z-;\\s]+$", names) && !(checkDuplicateWords(names).size() > 0)) {
            System.out.println("Given names validated successfully");
            return true;
        }
        return false;
    }

    // Method to valid company name
    public static boolean validateCompanyName(String companyName) {
        if (Pattern.matches("^[a-zA-Z]+$", companyName)) {
            System.out.println("Given company name matched successfully");
            return true;
        }
        return false;
    }

    // Method to convert set to list
    public static List<String> convertSetToList() {
        List<String> namesList = new ArrayList<>(namesSet);

        System.out.println("Created ArrayList is");
        for (String x : namesList) {
            System.out.println(x);
        }
        return namesList;
    }
}
