package java_hw_5;

import java.util.Scanner;

public class hw_5_4 {
    public static void main(String[] args) {
        String [] names = {"Petya", "Masha", "Olena", "Fedya", "Sacha", "Anton Bilyi", "Glib"};
        int [] time = {10, 12, 14, 16, 18, 20};
        String [] places = {"the school", "the shop", "the church", "the gym", "the cinema", "the polyclinic"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, choose name from 0 to 6");
        int who = scanner.nextInt();
        System.out.println("Please, choose time from 0 to 5");
        int when = scanner.nextInt();
        System.out.println("Please, choose place from 0 to 5");
        int where = scanner.nextInt();
        System.out.println(names[who] + " will go to " + places[where] + " at " + time[when] + " o`clock");
    }
}
