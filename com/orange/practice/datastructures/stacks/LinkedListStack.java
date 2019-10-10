package com.orange.practice.datastructures.stacks;

public class LinkedListStack {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private int length;
    public Node top;

    public LinkedListStack() {
        length = 0;
        top = null;
    }

    public boolean isEmpty() {
        return (length == 0);
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        length++;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("List is empty, nothing to pop");
        }
        int result = top.data;
        top = top.next;
        length--;
        return result;
    }

    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("List is empty, nothing to pop");
        }
        return top.data;
    }

    public String toString() {
        String result = "";
        Node current = top;
        while(current != null) {
            result = result + current.data + "\n";
            current = current.next;
        }
        return result;
    }

    public static void main(String[] args) throws Exception {
        LinkedListStack stack = new LinkedListStack();
        stack.push(5);
        stack.push(6);
        stack.push(9);
        System.out.println("Current contents of stack : ");
        System.out.println(stack.toString());
        System.out.println("Popped item : " + stack.pop());
        System.out.println(stack.toString());
        System.out.println("PeeK item : " + stack.peek());
    }
}
