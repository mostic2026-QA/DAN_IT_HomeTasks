package java_hw_9_task_3;


import java.util.LinkedList;
import java.util.Queue;

public class Queue_HW<S> {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        System.out.println("--Shows the first element. peek will return null if the list is empty.--");
        System.out.println(queue.peek());
        System.out.println("--Adding elements to the list--");
        queue.offer("Bottle of milk");
        queue.offer("Loaf of bread");
        queue.offer("Bar of chocolate");
        queue.offer("Bottle of beer");
        System.out.println("--Viewing elements without removing--");
        System.out.println(queue.element());
        System.out.println("--Check the list size--");
        System.out.println(queue.size());
        System.out.println("--Removing the first element from the list--");
        System.out.println(queue.remove());
        System.out.println("--poll will return null if the list is empty.--");
        System.out.println(queue.poll());
    }
}
