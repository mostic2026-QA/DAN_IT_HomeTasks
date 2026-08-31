package java_hw_9.task_2;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Dmytro", "Sokorenko", 43);
        Person person2 = new Person("Yuliia", "Mostova", 34);
        Person person3 = new Person("Ivan", "Savchuk", 16);
        Person person4 = new Person("Dmytro", "Sokorenko", 43);
        Person person5 = new Person("Yuliia", "Mostova", 34);
        Person person6 = new Person("Ivan", "Savchuk", 16);
        Set<Person> personSet = new HashSet<>();
        System.out.println("--Returns true if the collection is empty--");
        System.out.println(personSet.isEmpty());
        System.out.println("--Adding elements to the collection--");
        personSet.add(person1);
        personSet.add(person2);
        personSet.add(person3);
        personSet.add(person4);
        personSet.add(person5);
        personSet.add(person6);
        System.out.println("--Checking the list size--");
        System.out.println(personSet.size());
        System.out.println("--Returns true if the element was in the set and was successfully removed.--");
        System.out.println(personSet.remove(person5));
        System.out.println("--Returns true if the element is in the set.--");
        System.out.println(personSet.contains(person1));
        System.out.println("--Removes all elements from the collection--");
        personSet.clear();
        System.out.println("--Checking the list size--");
        System.out.println(personSet.size());
    }
}
