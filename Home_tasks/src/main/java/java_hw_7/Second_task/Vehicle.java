package java_hw_7.Second_task;

public class Vehicle {
    public String name;
    public int speed;
    public Vehicle(String name, int speed){
        this.name = name;
        this.speed = speed;
    }
    public void move(){
        System.out.println("The vehicle is traveling at a speed of " + speed + " km/h");
    }
    public void stop(){
        System.out.println("The vehicle " + name + " has stoped");
    }
}
