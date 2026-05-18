package java_hw_5;

import java.util.Scanner;

public class hw_5_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result = "";
        System.out.println("Please, enter the some word or 'Stop' to finish");
        String someWord = scanner.next();
        while (! someWord.equalsIgnoreCase("Stop")){
            result = result + someWord +" ";
            someWord = scanner.next();}
        System.out.println("Your sentence is: " + result);
    }
}
