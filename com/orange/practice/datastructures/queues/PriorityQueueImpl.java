package com.orange.practice.datastructures.queues;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueImpl {

    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<String>();
        priorityQueue.add("C++");
        priorityQueue.add("Java");
        priorityQueue.add("Python3");
        priorityQueue.add("COBOL");

        System.out.println("Head value using Peek Function :" + priorityQueue.peek());
        // Printing all elements of the PriorityQueue
        System.out.println("PQ Elements are : ");
        Iterator itr = priorityQueue.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // Removing head element using poll
        priorityQueue.poll();
        System.out.println("New Head after poll : " + priorityQueue.peek());

        System.out.println("*************************");

        Iterator itr2 = priorityQueue.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }

        System.out.println("**************************");
        priorityQueue.remove("Java");
        Iterator itr1 = priorityQueue.iterator();
        while (itr1.hasNext()) {
            System.out.println(itr1.next());
        }
    }

}
