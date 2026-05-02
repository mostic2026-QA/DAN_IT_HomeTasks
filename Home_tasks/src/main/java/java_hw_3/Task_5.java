package java_hw_3;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String operation = scanner.next();
        int result = operation.equals("+") ? (a + b) :
        operation.equals("-") ? (a - b) :
        operation.equals("/") ? (a / b) :
        operation.equals("*") ? (a * b) :
        operation.equals("%") ? (a % b) : 0;
        System.out.println(result);
    }
}
