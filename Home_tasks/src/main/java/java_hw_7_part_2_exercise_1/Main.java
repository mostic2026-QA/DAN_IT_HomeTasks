package java_hw_7_part_2_exercise_1;

public class Main {
    public static void main(String[] args) {
        Figure square = new Square(8.0);
        Figure triangle = new Triangle(6.0, 4.0, 6.0, 5.0, 5.0);
        Figure circle = new Circle(10.0);
        System.out.println("=== GEOMETRIC FIGURES CALCULATION ===");
        System.out.println();
        System.out.println("Figure information: " + square.toString());
        System.out.println("Square area: " + square.getArea());
        System.out.println("Square perimeter: " + square.getPerimeter());
        System.out.println("____________________________________________");
        System.out.println("Figure information: " + triangle.toString());
        System.out.println("Triangle area: " + triangle.getArea());
        System.out.println("Triangle perimeter: " + triangle.getPerimeter());
        System.out.println("____________________________________________");
        System.out.println("Figure information: " + circle.toString());
        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Circle perimeter (circumference): " + circle.getPerimeter());
        System.out.println("____________________________________________");
    }
}
