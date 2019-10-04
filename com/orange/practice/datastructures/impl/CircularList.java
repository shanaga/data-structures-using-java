package com.orange.practice.datastructures.impl;

public class CircularList {

    Node head;
    Node tail;

    class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
        }

    }

    public static void main(String[] args) {
        CircularList circularList = new CircularList();
        circularList.add(50);
        circularList.add(60);
        circularList.add(20);
        circularList.display();

    }

    public void add(int newData) {
        Node newNode = new Node(newData);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("No elements in the list");
        } else {
            System.out.println("Elements in the Circular List are : ");
            do {
                // Prints each node by incrementing pointer
                System.out.print(" " + current.data);
                current = current.next;
            } while (current != head);
            System.out.println();

           /*System.out.println("Nodes in the circular list are: ");
            while(current != head) {
                System.out.println(current.data);
                current = current.next;
            }
            System.out.println();*/
        }
    }
}
