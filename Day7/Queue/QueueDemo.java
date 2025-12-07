package Day7.Queue;

import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Adding elements to the queue
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println("Queue after adding elements: " + queue);

        // Removing one element (removes from front)
        queue.remove();
        System.out.println("After removing one element: " + queue);

        // Display the front element , doesn't delete just peeks the element ie to see 
        System.out.println("Front element: " + queue.peek());

        // Display the entire queue
        System.out.println("Final queue: " + queue);
    }
}
