package com.orange.practice.datastructures.stacks;

public class DynamicArrayStack {

    // Length of the array used to implement stack
    protected int capacity;
    // Default array capacity
    public static final int CAPACITY = 3;
    // Array used to implement the stack
    protected int[] array;
    // Index of the top element of the stack in the array
    protected int top = -1;

    public DynamicArrayStack(int capacity) {
        this.capacity = capacity;
        array = new int[capacity];
    }

    public DynamicArrayStack() {
        this(CAPACITY);
    }

    public static void main(String[] args) throws Exception {
        // System.out.println(minCapacity);
        // System.out.println(Math.pow(2, 15));
        DynamicArrayStack stack = new DynamicArrayStack(16);
        stack.push(1);
        stack.push(5);
        System.out.println(stack.size());
        stack.expand();
    }

    public int size() {
        return (top + 1);
    }

    public boolean isEmpty() {
        return (top < 0);
    }

    public void push(int item) throws Exception {
        if (size() == capacity) {
            throw new Exception("Stack is full");
        }
        array[++top] = item;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty");
        }
        return array[top--];
    }

    private void expand() {
        int length = size();
        System.out.println("Length : " + length);
        //int newStack[] = new int[length << 1];
        int newStack[] = new int[(int) Math.pow(2, length)];
        System.out.println("Size of newStack : " + newStack.length);
        System.arraycopy(array,0,newStack,0,length);
        array = newStack;
    }


}
