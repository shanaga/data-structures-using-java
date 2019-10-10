package com.orange.practice.datastructures.lists;

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
        System.out.println("Head : " + linkedList.head.data);

        // Insert after a node
        linkedList.insertAfter(linkedList.head, 4);
        System.out.println("Created linked list after intermediate insertion : ");
        linkedList.printList();
        System.out.println("********************");

        Node firstNode = linkedList.removeFirstNode();
        System.out.println(firstNode.data);
        System.out.println("********************");

        linkedList.removeLastNode();
        //System.out.println(lastNode.data);
        System.out.println("List after last node removed :");
        linkedList.printList();

    }

    public void printList() {
        Node tempNode = head;
        while (tempNode != null) {
            System.out.println(tempNode.data + " ");
            tempNode = tempNode.next;
        }
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

    public Node removeFirstNode() {
        if (head == null)
            return null;

        // Create a temporary node which will point to the same node as of head.
        Node tempNode = head;

        if (tempNode != null) {
            // Move the head node pointer to the next nod
            head = head.next;
            // Dispose the temporary node
            tempNode.next = null;
        }
        return tempNode;
    }

    public Node removeLastNode() {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return null;
        }

        // Find the second last node or the previous node
        Node secondLastNode = head;
        while (secondLastNode.next.next != null) {
            secondLastNode = secondLastNode.next;
        }

        // Change next of second last node
        secondLastNode.next = null;
        return head;
    }

    // TODO : Program to delete node from middle

}
