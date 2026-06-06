package java_hw_3;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your program (IntelliJ IDEA, Git, Java)");
        String program = scanner.nextLine();
        System.out.println("Please, enter your OS (Linux, MacOS, Windows)");
        String os = scanner.nextLine();
        switch (program) {
            case "IntelliJ IDEA":
                switch (os) {
                    case "Linux":
                        System.out.println("https://www.jetbrains.com/idea/download/?section=linux");
                        break;
                    case "MacOS":
                        System.out.println("https://www.jetbrains.com/idea/download/?section=mac");
                        break;
                    case "Windows":
                        System.out.println("https://www.jetbrains.com/idea/download/?section=windows");
                        break;
                    default:
                        System.out.println("This OS doesn't exist");}
                break;
            case "Git":
                switch (os) {
                    case "Linux":
                        System.out.println("https://git-scm.com/install/linux");
                        break;
                    case "MacOS":
                        System.out.println("https://git-scm.com/install/mac");
                        break;
                    case "Windows":
                        System.out.println("https://git-scm.com/install/windows");
                        break;
                    default:
                        System.out.println("This OS doesn't exist");
                }
                break;
            case "Java":
                switch (os) {
                    case "Linux":
                        System.out.println("https://www.java.com/en/download/");
                        break;
                    case "MacOS":
                        System.out.println("https://www.java.com/en/download/");
                        break;
                    case "Windows":
                        System.out.println("https://www.java.com/en/download/");
                        break;
                    default:
                        System.out.println("This OS doesn't exist");}
                break;
            default:
                System.out.println("This program doesn't exist");}
    }
}