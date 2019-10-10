package com.orange.practice.datastructures.stacks;

public class FixedSizeArrayStack {

    // Length of the array used to implement stack
    protected int capacity;
    // Default array capacity
    public static final int CAPACITY = 3;
    // Array used to implement the stack
    protected int[] stackArr;
    // Index of the top element of the stack in the array
    protected int top = -1;

    public FixedSizeArrayStack() {
        this(CAPACITY);
    }

    // Initialize the stack to use an array of given length
    public FixedSizeArrayStack(int capacity) {
        this.capacity = capacity;
        stackArr = new int[capacity];
    }

    public static void main(String[] args) throws Exception {
        FixedSizeArrayStack stack = new FixedSizeArrayStack(CAPACITY);
        stack.push(4);
        stack.push(6);
        stack.push(2);
        System.out.println("Elements in stack after push : " + stack.toString());
        System.out.println(stack.top());
        stack.pop();
        System.out.println("After pop : " +  stack.toString());
        System.out.println("Stack Size : " + stack.size());
        System.out.println("Is stack empty : " + stack.isEmpty());
        stack.push(6);
        //stack.push(9);
    }

    // Returns the number of elements in the stack
    public int size() {
        return (top + 1);
    }

    public boolean isEmpty() {
        return (top < 0);
    }

    public void push(int data) throws Exception {
        if (size() == capacity) {
            throw new Exception("Stack is full");
        }
        stackArr[++top] = data;
    }

    public int pop() throws Exception {
        int data;
        if (isEmpty()) {
            throw new Exception("Stack is empty");
        }
        data = stackArr[top--];
        return data;
    }

    public int top() throws Exception {
        if(isEmpty()) {
            throw new Exception("Stack is empty, cannot retrieve top");
        }
        return stackArr[top];
    }

    @Override
    public String toString() {
        String s = "[";
        if (size() > 0) {
            s += stackArr[0];
        }
        if (size() > 1) {
            for (int i = 1; i <= size() - 1; i++) {
                s += ", " + stackArr[i];
            }
        }
        return s + "]";
    }

}
