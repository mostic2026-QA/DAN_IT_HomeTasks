package java_hw_5;

import java.util.Scanner;

public class hw_5_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number");
        String number = scanner.next();
        String reverse = "";
        for (int i = number.length() - 1; i >= 0; i--) {
            reverse = reverse + number.charAt(i);
        }
        if (number.equals(reverse)) {
            System.out.println("It is a palindrome!");
        } else {
            System.out.println("It is NOT a palindrome.");
        }
    }
}