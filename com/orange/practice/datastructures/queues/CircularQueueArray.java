package com.orange.practice.datastructures.queues;

public class CircularQueueArray {

    private int[] array;
    private int size, front, rear;
    private static final int CAPACITY = 16;

    public CircularQueueArray() {
        array = new int[CAPACITY];
        size = 0;
        front = 0;
        rear = 0;
    }

    public CircularQueueArray(int cap) {
        array = new int[cap];
        size = 0;
        front = 0;
        rear = 0;
    }


}
