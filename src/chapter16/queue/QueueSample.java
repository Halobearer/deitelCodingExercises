package chapter16.queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueSample {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);

        queue.poll();

        System.out.println(queue.peek());


        System.out.println(queue);

        System.out.println(queue.poll());

        System.out.println(queue.peek());

        System.out.println(queue);

    }
}
