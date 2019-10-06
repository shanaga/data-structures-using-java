package com.orange.practice.datastructures.problems;

import java.util.*;

public class StringProblem {


    public static void main(String[] args) {
        // Initialize players list by adding players
        List<String> players = initializePlayersList();
        // Sort list using last name's second character
        sortListUsingLastNameSecondCharacter(players);
    }

    static List<String> initializePlayersList() {
        List<String> players = new ArrayList<>();
        players.add("Ravinder Jadeja");
        players.add("MS Dhoni");
        players.add("Virat Kohli");
        players.add("Rohit Sharma");
        return players;
    }

    /*
      Method to sort the list by the second character of the last name
     */
    private static void sortListUsingLastNameSecondCharacter(List<String> inputList) {
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
        System.out.println("Sorted List : " + inputList);
    }

}
