package java_hw_10.task_3;

public class Main {
    public static void main(String[] args) {
        AnimalFactory factory = new AnimalFactory();
        Animal myDog = factory.createAnimal("dog");
        Animal myCat = factory.createAnimal("cat");
        Animal myBird = factory.createAnimal("bird");
        System.out.print("Dog says: ");
        myDog.speak();
        System.out.print("Cat says: ");
        myCat.speak();
        System.out.print("Bird says: ");
        myBird.speak();
    }
}