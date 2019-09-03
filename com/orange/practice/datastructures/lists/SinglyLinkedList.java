package com.orange.practice.datastructures.lists;

public class SinglyLinkedList {
    public static void main(String[] args) {
        Node headNode = new Node();
        headNode.value = 2;

        Node nextNode = new Node();
        nextNode.value = 1;
        headNode.next = nextNode;

        Node tempNode;
        // Set initial head value
        tempNode = headNode;
        while (tempNode != null) {
            System.out.println(tempNode.value);
            tempNode = tempNode.next; // Moved with next item in the list
        }

        // Another method to print the list
        while (headNode != null) {
            System.out.println(headNode.value);
            headNode = headNode.next; // Moved with next item in the list
        }
    }
}

class Node {
    int value;
    Node next;
}