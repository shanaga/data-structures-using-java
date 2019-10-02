package com.orange.practice.datastructures.impl;

public class LinkedList {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.append(9);
        linkedList.push(5);
        linkedList.push(8);
        linkedList.append(2);
        linkedList.push(1);
        System.out.println("Created linked list is : ");
        linkedList.printList();
        System.out.println("Head : "  + linkedList.head.data);

        // Insert after a node
        linkedList.insertAfter(linkedList.head,4);
        System.out.println("Created linked list after intermediate insertion : ");
        linkedList.printList();

    }

    public void push(int newData) {
        // Allocate new node & put data in that node
        Node newNode = new Node(newData);

        // Make the next of the new node as the head
        newNode.next = head;

        // Assign newNode to head of the list
        head = newNode;
    }

    public void insertAfter(Node prevNode, int newData) {
        // Check if prevNode is null
        if (prevNode == null) {
            System.out.println("Previous node cannot be null");
            return;
        }
        // Allocate new node and put data in that node
        Node newNode = new Node(newData);

        // Make the next of newNode as the next of new node
        newNode.next = prevNode.next;

        // Make next of prevNode as newNode
        prevNode.next = newNode;
    }

    public void append(int newData) {
        // Allocate new node and put data in it
        Node newNode = new Node(newData);

        if (head == null) {
            head = new Node(newData);
            return;
        }

        // New Node will be the last node so make it null
        newNode.next = null;

        // Traverse till the last node
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        // Change the next of last node
        last.next = newNode;
    }

    public void printList() {
        Node tempNode = head;
        while(tempNode != null) {
            System.out.println(tempNode.data + " ");
            tempNode = tempNode.next;
        }
    }

}
