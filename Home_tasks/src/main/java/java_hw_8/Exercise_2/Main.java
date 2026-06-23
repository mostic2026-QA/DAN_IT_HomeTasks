package java_hw_8.Exercise_2;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Student.addStudent(studentList, new Student(100, "Anton", 33, 10));
        Student.addStudent(studentList, new Student(101, "Ivan", 16, 7.9));
        Student.addStudent(studentList, new Student(102, "Sveta", 40, 9));
        Student.addStudent(studentList, new Student(103, "Anya", 28, 8.5));
        Student.addStudent(studentList, new Student(104, "Gela", 35, 2));
        System.out.println("Initial student list:");
        Student.printAllStudents(studentList);
        System.out.println("Searching for student 'Anton':");
        Student found = Student.findStudentByName(studentList, "Anton");
        if (found != null) {
            System.out.println("Found: " + found);
        }
        System.out.println("Removing student with ID 102...");
        Student.removeStudentById(studentList, 102);
        System.out.println("Student list after removal:");
        Student.printAllStudents(studentList);
    }
}