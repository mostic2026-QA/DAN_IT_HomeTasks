package java_hw_10.task_4;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car.Builder()
                .setModel("Porsche 911")
                .setPrice(120000.50)
                .setMaxSpeed(310)
                .setCountOfWheels(4)
                .build();
        System.out.println(myCar);
    }
}