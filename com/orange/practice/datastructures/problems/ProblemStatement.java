package com.orange.practice.datastructures.problems;

import java.util.*;

public class ProblemStatement {

    // Input : Sachin Tendulkar, Rahul Dravid, Saurav Ganguly, Shane Warna
    // Output : Saurav GAnguly, Shane WArne, Sachin TEndulkar, Rahul DRavid

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Ravinder Jadeja");
        list.add("MS Dhoni");
        list.add("Virat Kohli");
        list.add("Rohit Sharma");
        sortUsingSecondCharacter(list);
    }

    /*
      Method to sort the list by the second character of the last name
     */
    private static void sortUsingSecondCharacter(List<String> inputList) {
        // Java 8 implementation
        Collections.sort(inputList, (o1, o2) -> {
            String[] split1 = o1.split(" ");
            String[] split2 = o2.split(" ");
            String lastName1 = split1[1];
            String lastName2 = split2[1];
            char c1 = lastName1.charAt(1);
            char c2 = lastName2.charAt(1);

            if (c1 > c2) {
                return 1;
            } else {
                return -1;
            }
        });
        System.out.println(inputList);
    }

}
