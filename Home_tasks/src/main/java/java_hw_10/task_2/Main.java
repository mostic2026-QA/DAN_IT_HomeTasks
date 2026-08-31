package java_hw_10.task_2;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = Vehicle.getInstance("Bicycle", 60, 500);
        Vehicle vehicle2 = Vehicle.getInstance("Boat", 200, 20000);
        Vehicle vehicle3 = Vehicle.getInstance("Scooter", 150, 10000);
        System.out.println(vehicle1 + " " + System.identityHashCode(vehicle1));
        System.out.println(vehicle2 + " " + System.identityHashCode(vehicle2));
        System.out.println(vehicle3 + " " + System.identityHashCode(vehicle3));
    }
}
