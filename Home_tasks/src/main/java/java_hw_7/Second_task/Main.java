package java_hw_7.Second_task;

public class Main {
    public static void main(String[] args) {
        System.out.println("Car");
        Car car = new Car("mitsubishi", 120, 5 );
        car.move();
        car.stop();
        System.out.println("Truck");
        Truck truck = new Truck("Volvo", 70, 30.5);
        truck.move();
        truck.stop();
    }
}
