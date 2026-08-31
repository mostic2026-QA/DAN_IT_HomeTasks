package java_hw_10.task_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", 280);
        Car car2 = new Car("Volvo", 250);
        Car car3 = new Car("Nisan", 200);
        Car car4 = new Car("Lada", 150);
        Car car5 = new Car("Ford", 230);
        List<Car> carlist = new ArrayList<>();
        carlist.add(car1);
        carlist.add(car2);
        carlist.add(car3);
        carlist.add(car4);
        carlist.add(car5);
        java.util.Collections.sort(carlist);
        System.out.println("--- Sorted list (by speed) ---");
        for (Car car : carlist) {
            System.out.println(car);
        }
    }
}