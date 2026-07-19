import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

public class MapExample {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Rahul", 75));
        students.add(new Student(2, "Priya", 58));
        students.add(new Student(3, "Kiran", 90));
        students.add(new Student(4, "Sneha", 45));
        students.add(new Student(5, "Arjun", 68));

        // Extract only the names
        List<String> names = students.stream()
                .map(student -> student.name)
                .collect(Collectors.toList());

        System.out.println("Student Names:");

        for (String name : names) {
            System.out.println(name);
        }
    }
}