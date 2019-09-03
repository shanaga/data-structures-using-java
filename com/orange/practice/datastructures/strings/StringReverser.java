package com.orange.practice.datastructures.strings;

public class StringReverser {

    public static void main(String[] args) {
        System.out.println(stringReverser("rat"));
        System.out.println(stringReverser("system"));
        System.out.println(stringReverser("nitin"));
        System.out.println(stringReverser("shantanu"));
    }

    private static String stringReverser(String oldString) {
        String newString = "";
        for (int i = 0; i < oldString.length(); i++) {
            newString += oldString.charAt(oldString.length() - 1 - i);
        }
        return newString;
    }
}


/*
rat - length - 3
0 1 2, max loop till 3*/
