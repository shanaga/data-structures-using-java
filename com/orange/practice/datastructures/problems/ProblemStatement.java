package com.orange.practice.datastructures.problems;

import java.util.*;

public class ProblemStatement {

    // Input : Sachin Tendulkar, Rahul Dravid, Saurav Ganguly, Shane Warna
    // Output : Sorted based on Second character in the string

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Sachin Tendulkar");
        list.add("Rahul Dravid");
        list.add("Saurav Ganguly");
        list.add("Shane Warne");
        sortUsingFirstCharacter(list);
    }


    private static void sortUsingFirstCharacter(List<String> inputList) {
        // Java 7 implementation
        /*Collections.sort(inputList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String[] split1 = o1.split(" ");
                String[] split2 = o2.split(" ");
                String lastName1 = split1[1];
                String lastName2 = split2[1];

                if (lastName1.compareTo(lastName2) > 0) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        System.out.println(inputList);*/


        // Java 8 implementation
        Collections.sort(inputList, (o1, o2) -> {
            String[] split1 = o1.split(" ");
            String[] split2 = o2.split(" ");
            String lastName1 = split1[1];
            String lastName2 = split2[1];

            if (lastName1.compareTo(lastName2) > 0) {
                return 1;
            } else {
                return -1;
            }
        });
        System.out.println(inputList);
    }

}
