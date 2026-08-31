package java_hw_7.First_task;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bird");
        Bird bird = new Bird();
        bird.eat();
        bird.sleep();
        bird.fly();
        System.out.println("Dog");
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.bark();
        System.out.println("Fish");
        Fish fish = new Fish();
        fish.sleep();
        fish.eat();
        fish.swim();

    }
}
