package java_hw_5;

import java.util.Scanner;

public class hw_5_5 {
    public static void main(String[] args) {
        int [] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 20);
        }
//        System.out.println(java.util.Arrays.toString(numbers));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Can you guess the number?");
        int number = scanner.nextInt();
        if (number == numbers[0]){
            System.out.println("You won!!");
        } else if (number == numbers[1]) {
            System.out.println("You won!!");
        } else if (number == numbers[2]) {
            System.out.println("You won!!");
        } else if (number == numbers[3]) {
            System.out.println("You won!!");
        } else if (number == numbers[4]) {
            System.out.println("You won!!");
        } else if (number == numbers[5]) {
            System.out.println("You won!!");
        } else if (number == numbers[6]) {
            System.out.println("You won!!");
        } else if (number == numbers[7]) {
            System.out.println("You won!!");
        } else if (number == numbers[8]) {
            System.out.println("You won!!");
        } else if (number == numbers[9]) {
            System.out.println("You won!!");
        } else {
            System.out.println("You lose!");
        }
    }
}
