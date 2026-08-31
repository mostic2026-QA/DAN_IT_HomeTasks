package java_hw_7.Second_task;

public class Truck extends Vehicle{
    double loadCapacity;
    public Truck(String name, int speed, double loadCapacity){
        super(name, speed);
        this.loadCapacity = loadCapacity;
    }
    @Override
    public void move(){
        System.out.println("The vehicle " + name + " with a load capacity of " + loadCapacity + " is traveling at a speed of " + speed + " km/h");
    }
}
