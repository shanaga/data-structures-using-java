package com.orange.practice.datastructures.lists;

public class DoublyLinkedList {

    Node head;

    class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.append(3);
        doublyLinkedList.push(5);
        doublyLinkedList.push(2);
        doublyLinkedList.append(8);
        doublyLinkedList.printList();
        /*System.out.println("**********Insert after*******");
        doublyLinkedList.insertAfter(doublyLinkedList.head, 1);
        doublyLinkedList.printList();*/
        doublyLinkedList.insertAfter(doublyLinkedList.head.next.next.next.next, 7);
        System.out.println("***********");
        doublyLinkedList.printList();
        System.out.println("###########");
        doublyLinkedList.deleteNode(doublyLinkedList.head, doublyLinkedList.head);

        System.out.println("List 1 after deleting first node: ");
        doublyLinkedList.printList();

        // TODO : Need to check : Not deleting from DoublyLinkedList
        System.out.println("List 2 after deleting first node: ");
        doublyLinkedList.deleteNode(doublyLinkedList.head, doublyLinkedList.head.next.next);
        doublyLinkedList.printList();

    }

    public void printList() {
        Node temp = head;
        if (head == null) {
            System.out.println("DLL is empty");
            return;
        }
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }

    public void push(int newData) {
        Node newNode = new Node(newData);
        // Make next of new node as head and previous as null
        newNode.next = head;
        newNode.prev = null;

        // Change prev of head node to new node
        head.prev = newNode;
        // Move the head to point to the new node
        head = newNode;
    }

    public void append(int newData) {
        Node newNode = new Node(newData);
        // If head node is null, make the new node as the head
        if (head == null) {
            newNode.prev = null;
            head = newNode;
            return;
        }
        Node last = head;
        // Make newNode's next as null
        newNode.next = null;

        while (last.next != null) {
            last = last.next;
        }
        // Change the next of last node
        last.next = newNode;
        // Make last node as previous of new node
        last.prev = last;

    }

    public void insertAfter(Node prevNode, int newData) {
        if (prevNode == null) {
            System.out.println("Previous node is null");
            return;
        }

        Node newNode = new Node(newData);

        // Assign prevNode's next to newNode's next
        newNode.next = prevNode.next;
        // Make the prevNode's next to newNode
        prevNode.next = newNode;
        // Make nextNode's prev to prevNode
        newNode.prev = prevNode;


        /*if(newNode.next != null) {
            newNode.prev.next = newNode;
        }*/
    }

    // TODO: Need to understand in depth
    void deleteNode(Node headRef, Node del) {
        if (headRef == null || del == null) {
            return;
        }

        // If node to be deleted is head node
        if (head == del) {
            head = del.next;
        }

        // Change next only if node to be deleted
        // is NOT the last node
        if (del.next != null) {
            del.next.prev = del.prev;
        }

        // Change prev only if node to be deleted
        // is NOT the first node
        if (del.prev != null) {
            del.prev.next = del.next;
        }

        // Finally, free the memory occupied by del
        return;
    }
}
