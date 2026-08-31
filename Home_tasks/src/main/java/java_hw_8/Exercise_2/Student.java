package java_hw_8.Exercise_2;
import java.util.List;
public class Student {
    private int id;
    private String name;
    private int age;
    private double gpa;
    public Student(int id, String name, int age, double gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gpa=" + gpa +
                '}';
    }
    public static List<Student> addStudent(List<Student> students, Student student) {
        students.add(student);
        return students;
    }
    public static List<Student> removeStudentById(List<Student> students, int id) {
        boolean removed = students.removeIf(student -> student.getId() == id);
        if (!removed) {
            System.out.println("Student with ID " + id + " not found.");
        }
        return students;
    }
    public static Student findStudentByName(List<Student> students, String name) {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                return student;
            }
        }
        System.out.println("Student with name '" + name + "' was not found.");
        return null;
    }
    public static void printAllStudents(List<Student> students) {
        System.out.println("--- Student List ---");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
