package java_hw_10.task_1;

public class Car implements Comparable<Car> {
    private String name;
    private int speed;

    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int price) {
        this.speed = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + speed +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        return this.speed - o.speed;
    }
}
