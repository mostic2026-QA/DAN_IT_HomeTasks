package java_hw_9_task_3;

import java.util.ArrayDeque;
import java.util.Deque;

public class Dequeue_HW {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        System.out.println("--Adding elements to the head of the list--");
        deque.offerFirst("Toy");
        deque.offerFirst("Car");
        deque.offerFirst("Mushroom");
        System.out.println("--Viewing the first element of the list--");
        System.out.println(deque.peekFirst());
        System.out.println("--Viewing the last element of the list--");
        System.out.println(deque.peekLast());
        System.out.println("--Adding elements to the end of the list--");
        deque.offerLast("Banana");
        deque.offerLast("hat");
        System.out.println("--Check the list size--");
        System.out.println(deque.size());
        System.out.println("--Removing the first element--");
        System.out.println(deque.pollFirst());
        System.out.println("--Removing the last element--");
        System.out.println(deque.pollLast());
        System.out.println("--Viewing the first element of the list--");
        System.out.println(deque.element());
    }
}
