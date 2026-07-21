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

public class FilterExample {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Rahul", 75));
        students.add(new Student(2, "Priya", 58));
        students.add(new Student(3, "Kiran", 90));
        students.add(new Student(4, "Sneha", 45));
        students.add(new Student(5, "Arjun", 68));

        // Filter students whose marks are greater than 60
        List<Student> result = students.stream()
                .filter(student -> student.marks > 60)
                .collect(Collectors.toList());

        System.out.println("Students with marks greater than 60:");

        for (Student s : result) {
            System.out.println(s.id + " " + s.name + " " + s.marks);
        }
    }
} 
/*
Create Student class
        ↓
Create empty List
        ↓
Add 5 Student objects
        ↓
Convert List → Stream
        ↓
Filter (marks > 60)
        ↓
Collect filtered students into a new List
        ↓
Print the filtered students */