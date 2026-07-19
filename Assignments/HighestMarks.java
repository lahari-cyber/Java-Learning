import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student {
    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
}

public class HighestMarks {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Rahul", 75));
        students.add(new Student(2, "Priya", 58));
        students.add(new Student(3, "Kiran", 90));
        students.add(new Student(4, "Sneha", 45));
        students.add(new Student(5, "Arjun", 68));

        Student topStudent = students.stream()
                .max(Comparator.comparingInt(student -> student.marks))
                .orElse(null);

        System.out.println("Student with Highest Marks:");
        System.out.println("ID: " + topStudent.id);
        System.out.println("Name: " + topStudent.name);
        System.out.println("Marks: " + topStudent.marks);
    }
}