package java_hw_5_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the total capacity of the warehouse:");
        int totalCapacity = scanner.nextInt();
        Warehouse myWarehouse = new Warehouse(totalCapacity);
        while (myWarehouse.getWeight() > 0) {
            System.out.println("Enter the weight of metal to deliver:");
            int inputWeight = scanner.nextInt();
            myWarehouse.acceptMetal(inputWeight);
        }
        System.out.println("The warehouse is full! Program finished.");
    }
}