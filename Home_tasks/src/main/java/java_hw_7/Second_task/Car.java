package java_hw_7.Second_task;

public class Car extends Vehicle {
    int passengersCapasity;
    public Car(String name, int speed, int passengersCapasity){
        super(name, speed);
        this.passengersCapasity = passengersCapasity;
    }
        @Override
        public void move(){
            System.out.println("The vehicle " + name + " is traveling at a speed of " + speed + " km/h with " + passengersCapasity + " passengers on board");
        }
}
