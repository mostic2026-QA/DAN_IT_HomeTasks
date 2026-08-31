package java_hw_10.task_3;

public interface Animal {
    void speak();
}

class Dog implements Animal {
    @Override
    public void speak() {
        System.out.println("Woof!");
    }
}

class Cat implements Animal {
    @Override
    public void speak() {
        System.out.println("Meow!");
    }
}

class Bird implements Animal {
    @Override
    public void speak() {
        System.out.println("Chirp!");
    }
}