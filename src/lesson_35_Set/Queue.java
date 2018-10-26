package lesson_35_Set;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class Queue {
    public static void main(String[] args) {
        PriorityQueue<String> newQueue = new PriorityQueue<>();
        newQueue.add("Igor");
        newQueue.add("Nazar");
        newQueue.add("Geralt");
        newQueue.add("Mecheny");

        System.out.println(newQueue.peek());

    }


}

