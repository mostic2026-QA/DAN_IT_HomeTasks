package java_hw_10.task_3;

public class AnimalFactory {
    public Animal createAnimal(String type) {
        if (type == null) {
            return null;
        }

        // Перевіряємо текст. switch-case — це просто зручніший аналог if-else
        switch (type.toLowerCase().trim()) {
            case "dog":
                return new Dog();
            case "cat":
                return new Cat();
            case "bird":
                return new Bird();
            default:
                throw new IllegalArgumentException("Unknown animal type: " + type);
        }
    }
}