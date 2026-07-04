package java_hw_9.task_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, Person> peopleMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- People Management Program has started ---");
        System.out.println("Available commands: addPerson, getPerson, exit");
        while (true) {
            System.out.print("Enter command: ");
            String command = scanner.nextLine().trim();
            if (command.equalsIgnoreCase("exit")) {
                System.out.println("The program has finished its work. Goodbye!");
                break;
            } else if (command.equals("addPerson")) {
                handleAddPerson(peopleMap, scanner);
            } else if (command.equals("getPerson")) {
                handleGetPerson(peopleMap, scanner);
            } else {
                System.out.println("Error: Unknown operation! Please try again (addPerson, getPerson, exit).");
            }
        }
        scanner.close();
    }
    private static void handleAddPerson(Map<String, Person> map, Scanner scanner) {
        System.out.print("Enter surname: ");
        String surname = scanner.nextLine().trim();
        String key = surname.toUpperCase();
        if (map.containsKey(key)) {
            System.out.print("A person with this surname already exists. Replace data? (yes/no): ");
            String confirmation = scanner.nextLine().trim().toLowerCase();
            if (!confirmation.equals("yes")) {
                System.out.println("Information has not been updated.");
                return;
            }
        }
        System.out.print("Enter name: ");
        String name = scanner.nextLine().trim();
        int age = -1;
        while (true) {
            System.out.print("Enter age: ");
            String ageInput = scanner.nextLine().trim();
            try {
                age = Integer.parseInt(ageInput);
                if (age < 0) {
                    System.out.println("Error: Age cannot be negative!");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Error: Non-numeric value entered. Please try again.");
            }
        }
        Person newPerson = new Person(name, surname, age);
        map.put(key, newPerson);
        System.out.println("Person successfully added to the list!");
    }
    private static void handleGetPerson(Map<String, Person> map, Scanner scanner) {
        if (map.isEmpty()) {
            System.out.println("Message: The list of people is empty.");
            return;
        }
        System.out.print("Enter surname to search: ");
        String surnameToSearch = scanner.nextLine().trim();
        String key = surnameToSearch.toUpperCase();
        if (map.containsKey(key)) {
            System.out.println("Information found: " + map.get(key));
        } else {
            System.out.println("The entered surname is not on the list.");
            System.out.println("List of available surnames: " + map.keySet());
        }
    }
}
