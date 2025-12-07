package Day7.Queue;

import java.util.*;

public class DisplayQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);

        System.out.println("elements in the queue:");
        for (int num : queue) {
            System.out.println(num);
        }

        System.out.println(queue);
    }
}
